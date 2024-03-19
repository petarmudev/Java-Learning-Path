package L14_Exercise_Solid_Feb2022.appenders;

import L14_Exercise_Solid_Feb2022.layouts.Layout;
import L14_Exercise_Solid_Feb2022.loggers.MessageLogger;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        counter++;
        System.out.println(getLayout().format(timeStamp, logLevel, message));
    }
}
