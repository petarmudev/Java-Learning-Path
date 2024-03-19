package L14_Exercise_Solid_Feb2022.layouts;

import L14_Exercise_Solid_Feb2022.loggers.MessageLogger;

public class SimpleLayout implements Layout {
    @Override
    public String format(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        return String.format("%s - %s - %s", timeStamp, logLevel, message);
    }
}
