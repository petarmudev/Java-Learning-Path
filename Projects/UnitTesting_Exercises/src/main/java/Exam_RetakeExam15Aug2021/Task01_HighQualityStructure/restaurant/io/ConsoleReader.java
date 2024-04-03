package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.io;

import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.io.interfaces.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader  implements InputReader {
    private BufferedReader reader;

    public ConsoleReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readLine() throws IOException {
        return this.reader.readLine();
    }
}
