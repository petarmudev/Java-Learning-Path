package L14_Exercise_Solid_Feb2022.layouts;

import L14_Exercise_Solid_Feb2022.loggers.MessageLogger;

public class XmlLayout implements  Layout{
    @Override
    public String format(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        return String.format("<log>%n" +
                                "   <date>%s</date>%n" +
                                "   <level>%s</level>%n" +
                                "   <message>%s</message>%n" +
                                "</log>", timeStamp, logLevel, message);
    }
}
