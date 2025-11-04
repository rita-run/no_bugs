package clean_code.practice.design_patterns.singleton;

public class DatabaseConfig {
    public String config = "Default Config";
    //a single copy of the DatabaseConfig
    private static DatabaseConfig databaseConfig;

    private DatabaseConfig() {}

    //creation of a single copy of DatabaseConfig
    public static DatabaseConfig getInstance() {
        if(databaseConfig == null) {
            databaseConfig = new DatabaseConfig();
        }
        return databaseConfig;
    }

    public void displayConfig() {
        System.out.println(config);
    }
}