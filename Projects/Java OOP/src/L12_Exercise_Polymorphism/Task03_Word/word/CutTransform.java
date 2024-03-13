package L12_Exercise_Polymorphism.Task03_Word.word;

public class CutTransform implements TextTransform {
    private StringBuilder lastCut = new StringBuilder();

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            // No effect if range is empty
            return;
        }
        lastCut = new StringBuilder();
        lastCut.append(text.substring(startIndex, endIndex));
        text.delete(startIndex, endIndex);
    }

    public StringBuilder getLastCut() {
        return this.lastCut;
    }
}