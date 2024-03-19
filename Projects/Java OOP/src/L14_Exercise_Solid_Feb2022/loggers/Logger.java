package L14_Exercise_Solid_Feb2022.loggers;

public interface Logger {
    void logInfo(String timeStamp, String message);

    void logWarning(String timeStamp, String message);

    void logError(String timeStamp, String message);

    void logCritical(String timeStamp, String message);

    void logFatal(String timeStamp, String message);
}
