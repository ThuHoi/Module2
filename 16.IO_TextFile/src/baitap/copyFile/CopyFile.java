package baitap.copyFile;

import java.io.*;
import java.util.ArrayList;

public class CopyFile {
    ArrayList<String> list = new ArrayList<>();

    public void readFile() {

        try {
            File file = new File("copy1.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();

        } catch (Exception e) {
            System.err.println("Lỗi");
        }

    }

    public void writeFile() {
        File file = new File("copy2.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String x : list) {
                bufferedWriter.write(x);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
