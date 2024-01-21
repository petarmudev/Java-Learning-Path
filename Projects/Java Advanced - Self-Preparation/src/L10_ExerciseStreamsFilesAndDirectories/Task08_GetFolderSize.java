package L10_ExerciseStreamsFilesAndDirectories;

import java.io.File;


public class Task08_GetFolderSize {
    public static void main(String[] args) {

        String folderPath = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        //Обхождаме всички фаилове в папката и сумираме размера на фаила
        File folder = new File(folderPath);

        File[] allFiles = folder.listFiles(); //листва само файловете, без директориите!(дори и да има папки в същата папка ги игнорира).

        int folderSize = 0;
        for (File file : allFiles) {
            folderSize += file.length();
        }
        System.out.println("Folder size: " + folderSize);
    }
}
