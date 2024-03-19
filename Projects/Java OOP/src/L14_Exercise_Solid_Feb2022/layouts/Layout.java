package L14_Exercise_Solid_Feb2022.layouts;

import L14_Exercise_Solid_Feb2022.loggers.MessageLogger;

public interface Layout {
    String format(String timeStamp, MessageLogger.LogLevel logLevel, String message);
}
