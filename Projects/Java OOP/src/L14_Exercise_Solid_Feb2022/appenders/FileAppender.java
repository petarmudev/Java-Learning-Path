package L14_Exercise_Solid_Feb2022.appenders;

import L14_Exercise_Solid_Feb2022.layouts.Layout;
import L14_Exercise_Solid_Feb2022.loggers.MessageLogger;
import L14_Exercise_Solid_Feb2022.utilities.File;

public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout, File file) {
        super(layout);
        this.file = file;
    }

    @Override
    public void append(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        counter++;
        file.write(getLayout().format(timeStamp, logLevel, message));
    }
    public File getFile() {
        return file;
    }
}
