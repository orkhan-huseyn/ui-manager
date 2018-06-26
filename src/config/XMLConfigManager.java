package config;

public class XMLConfigManager implements ConfigManager {

    private String filePath;

    public XMLConfigManager(String filePath) {
        this.filePath = filePath;
    }

    public String nextItem() {
        return null;
    }

    public boolean hasMoreItems() {
        return false;
    }
}
