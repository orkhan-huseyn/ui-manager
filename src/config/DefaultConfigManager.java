package config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class DefaultConfigManager implements ConfigManager {

    private String filePath;
    private Stack<LineItem> lines;

    public DefaultConfigManager(String filePath) {
        this.filePath = filePath;
        lines = new Stack<>();
        try {
            readFile();
        } catch (Exception ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
    }

    // pop and return last element
    public LineItem nextItem() {
        return lines.pop();
    }

    // go ahead if stack is not empty
    public boolean hasMoreItems() {
        return !lines.empty();
    }

    // reads lines from config file and adds it to stack
    private void readFile() throws IOException {

        String line = null;

        FileReader fileReader = new FileReader(this.filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {

            // split out the line by comma to get node name, coordinates and string value
            String[] arr = line.split(",");

            // string to integer conversion, remove white spaces and colons
            int x_coord = Integer.parseInt(arr[2].split(":")[1].replaceAll("\\s+",""));
            int y_coord = Integer.parseInt(arr[3].split(":")[1].replaceAll("\\s+",""));

            // add new line item to the stack
            this.lines.push(new LineItem(arr[0], x_coord, y_coord, arr[1]));
        }

        // close the reader of course :)
        bufferedReader.close();
    }
}
