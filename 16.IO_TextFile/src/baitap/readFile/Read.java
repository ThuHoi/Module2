package baitap.readFile;

import java.io.*;

import java.util.ArrayList;

public class Read {
    ArrayList<Country> list = new ArrayList<>();

    public void readFile() {
        File file = new File("country1.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                String arr[] = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String code = arr[1];
                String name = arr[2];
                list.add(new Country(id, code, name));
                line = bufferedReader.readLine();

            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Country x: list) {
            System.out.println(x);
        }

    }
}
