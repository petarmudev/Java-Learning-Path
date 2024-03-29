package L14_Exercise_Solid_Feb2022.appenders;

import L14_Exercise_Solid_Feb2022.layouts.Layout;

public abstract class BaseAppender implements Appender {
    private Layout layout;
    protected int counter;

    protected BaseAppender(Layout layout) {
        this.layout = layout;
    }

    @Override
    public Layout getLayout() {
        return layout;
    }

    @Override
    public int getMessagesCount() {
        return counter;
    }
}
