package L14_Exercise_Solid_Feb2022.loggers;

import L14_Exercise_Solid_Feb2022.utilities.File;

public class LogFile implements File {
    //todo Fix this file, because I have erased it's methods by mistake!!!
    private StringBuilder inMemoryContent;
    @Override
    public void write(String line) {
        inMemoryContent
                .append(line)
                .append(System.lineSeparator());
    }

    @Override
    public int size() {
        return  this.inMemoryContent
                .chars()
                .filter(Character::isLetter)
                .sum();
    }
}
