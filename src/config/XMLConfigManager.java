package config;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Stack;

public class XMLConfigManager implements ConfigManager {

    private String filePath;
    private Stack<LineItem> lines;

    public XMLConfigManager(String filePath) {
        this.filePath = filePath;
        lines = new Stack<>();
        try {
            readFile();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Error reading XML file: " + ex.getMessage());
        }
    }

    public LineItem nextItem() {
        return this.lines.pop();
    }

    public boolean hasMoreItems() {
        return !this.lines.empty();
    }

    private void readFile() throws Exception {

        File xml = new File(this.filePath);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(xml);

        //optional, but recommended
        //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
        doc.getDocumentElement().normalize();

        // get node list under root
        NodeList childNodes = doc.getDocumentElement().getChildNodes();

        // iterate thorugh node list
        for (int i = 0; i < childNodes.getLength(); i++) {

            Node node = childNodes.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {

                Element element = (Element) node;

                this.lines.push(
                        new LineItem(
                                node.getNodeName(),
                                Integer.parseInt(element.getAttribute("X")),
                                Integer.parseInt(element.getAttribute("Y")),
                                element.getAttribute("value")
                        )
                );

            }

        }

    }
}
