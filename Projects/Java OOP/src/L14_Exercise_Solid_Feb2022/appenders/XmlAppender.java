package L14_Exercise_Solid_Feb2022.appenders;

import L14_Exercise_Solid_Feb2022.layouts.Layout;
import L14_Exercise_Solid_Feb2022.loggers.MessageLogger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class XmlAppender extends BaseAppender{
    public XmlAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        try {

            File file = new File("logs.xml");

            if (!file.exists()) {
                file.createNewFile();
            }

            Files.writeString(Path.of("logs.xml"),
                    getLayout().format(timeStamp, logLevel, message), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
