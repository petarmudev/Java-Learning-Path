package L10_Exercise_InterfacesAndAbstraction.Task05_Тelephony.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();
        for (String url : urls) {
            if (hasNumbers(url)) {
                builder.append("Invalid URL!").append("\n");
            } else {
                builder.append(String.format("Browsing: %s!%n", url));
            }
        }
        return builder.toString();
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        for (String phoneNumber : numbers) {
            if (hasLetters(phoneNumber)) {
                builder.append("Invalid number!").append("\n");
            } else {
                builder.append(String.format("Calling... %s%n", phoneNumber));
            }
        }
        return builder.toString();
    }

    private boolean hasNumbers(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
