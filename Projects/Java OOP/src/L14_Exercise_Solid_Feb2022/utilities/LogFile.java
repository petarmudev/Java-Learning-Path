package L14_Exercise_Solid_Feb2022.utilities;

public class LogFile implements File{
    private StringBuilder inMemoryContent;

    public LogFile() {
        this.inMemoryContent = new StringBuilder();
    }

    @Override
    public void write(String line) {
        inMemoryContent.append(line).append(System.lineSeparator());
    }

    @Override
    public int size() {
        return this.inMemoryContent
                .chars()
                .filter(Character::isAlphabetic)
                .sum();
    }
}
