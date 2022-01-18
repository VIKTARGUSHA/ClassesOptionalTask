package FourthTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("optionTask.txt");
        Scanner sc = new Scanner(fr);
        ArrayList<String> listStringOfPoem = new ArrayList<>();
        while (sc.hasNext()){
            listStringOfPoem.add(sc.nextLine());
        }
        Collections.sort(listStringOfPoem, Comparator.comparing(String::length));
        fr.close();
        System.out.println(listStringOfPoem);
    }
}
