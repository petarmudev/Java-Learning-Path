package L14_Exercise_Solid_Feb2022.loggers;

import L14_Exercise_Solid_Feb2022.appenders.Appender;
import L14_Exercise_Solid_Feb2022.appenders.FileAppender;

import java.util.Map;

public class MessageLogger implements Logger {
    public enum LogLevel {
        INFO,
        WARNING,
        ERROR,
        CRITICAL,
        FATAL
    }

    private Map<Appender, LogLevel> appendersWithLevel;

    public MessageLogger(Map<Appender, LogLevel> appendersWithLevel) {
        this.appendersWithLevel = appendersWithLevel;
    }

    @Override
    public void logInfo(String timeStamp, String message) {
        logToAll(timeStamp, LogLevel.INFO, message);
    }

    @Override
    public void logWarning(String timeStamp, String message) {
        logToAll(timeStamp, LogLevel.WARNING, message);
    }

    @Override
    public void logError(String timeStamp, String message) {
        logToAll(timeStamp, LogLevel.ERROR, message);
    }

    @Override
    public void logCritical(String timeStamp, String message) {
        logToAll(timeStamp, LogLevel.CRITICAL, message);
    }

    @Override
    public void logFatal(String timeStamp, String message) {
        logToAll(timeStamp, LogLevel.FATAL, message);
    }

    private void logToAll(String timeStamp, LogLevel logLevel, String message) {
        for (var entry : appendersWithLevel.entrySet()) {
            Appender appender = entry.getKey();
            LogLevel appenderLevel = entry.getValue();
            if (appenderLevel.ordinal() <= logLevel.ordinal()) {
                appender.append(timeStamp, logLevel, message);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Logger info");
        for (var entry : appendersWithLevel.entrySet()) {
            Appender appender = entry.getKey();
            LogLevel logLevel = entry.getValue();
            out.append(String.format("%nAppender type: %s, Layout type: %s, ",
                            appender.getClass().getSimpleName(),
                            appender.getLayout().getClass().getSimpleName()))
                    .append(String.format("Report level: %s, ", logLevel.toString()))
                    .append(String.format("Messages appended: %d", appender.getMessagesCount()));
            if (appender instanceof FileAppender) {
                out.append(String.format(", File size: %d", ((FileAppender) appender).getFile().size()));
            }
        }
        out.append(System.lineSeparator());
        return out.toString().trim();
    }
}
