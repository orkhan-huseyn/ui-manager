package config;

public class DefaultConfigManager implements ConfigManager {

    @Override
    public String nextItem() {
        return null;
    }

    @Override
    public boolean hasMoreItems() {
        return false;
    }
}
