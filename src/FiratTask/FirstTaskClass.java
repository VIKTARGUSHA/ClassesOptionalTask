package FiratTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FirstTaskClass {

        public static void main(String[] args) throws Exception {
            FileReader fr = new FileReader("optionTask.txt");
            Scanner sc = new Scanner(fr);
            ArrayList<String> listString = new ArrayList<>();
            while (sc.hasNext()) {
                listString.add(sc.nextLine());
            }
            listString.forEach(s -> System.out.println(s));
            fr.close();
            Collections.reverse(listString);
            System.out.println();
            listString.forEach(s -> System.out.println(s));
            FileWriter fw = new FileWriter("FileWriter");
            listString.forEach(s -> {
                try {
                    fw.write("\n" +s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fw.close();
        }
    }

