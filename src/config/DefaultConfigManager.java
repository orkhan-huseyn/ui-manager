package config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class DefaultConfigManager implements ConfigManager {

    private String filePath;
    private Stack<String> lines;

    public DefaultConfigManager(String filePath) {
        this.filePath = filePath;
        lines = new Stack<>();
        try {
            readFile();
        } catch (Exception ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
    }

    public String nextItem() {
        return lines.pop();
    }

    public boolean hasMoreItems() {
        return !lines.empty();
    }

    public void readFile() throws IOException {

        String line = null;

        FileReader fileReader = new FileReader(this.filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            this.lines.push(line);
        }
    }
}
