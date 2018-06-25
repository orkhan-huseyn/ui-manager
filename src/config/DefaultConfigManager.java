package config;

public class DefaultConfigManager implements ConfigManager {

    private String filePath;

    public DefaultConfigManager(String filePath) {
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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
