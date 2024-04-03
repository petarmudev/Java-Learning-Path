package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.io;


import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    public void writeLine(String text) {
        System.out.println(text);
    }
}
