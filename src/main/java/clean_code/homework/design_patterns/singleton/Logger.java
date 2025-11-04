package clean_code.homework.design_patterns.singleton;

public class Logger {
    private String log;
    private String errorLog;
    private String notification;
    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }
}