package SixTask;

import java.io.FileReader;
import java.util.*;

public class SixTask  {
    public static void main (String[] args) throws Exception {
        FileReader fr = new FileReader("optionTask.txt");
        Scanner sc = new Scanner(fr);
        ArrayList <String> ar = new ArrayList<>();
        while (sc.hasNext()){
        ar.add(sc.nextLine());
        }
        Collections.sort(ar, Comparator.comparing(String::length));
        System.out.println(ar);
    }
}
