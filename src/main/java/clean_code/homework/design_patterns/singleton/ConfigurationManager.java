package clean_code.homework.design_patterns.singleton;

public class ConfigurationManager {
    private String dataBaseURL;
    private String userName;
    private String password;
    private String filesFolder;
    private String loggingLevel;
    private String logFilePathway;
    private static ConfigurationManager configurationManager;

    public ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
}