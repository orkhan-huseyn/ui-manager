package config;

public class XMLConfigManager implements ConfigManager {

    private String filePath;

    public XMLConfigManager(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String nextItem() {
        return null;
    }

    @Override
    public boolean hasMoreItems() {
        return false;
    }
}
