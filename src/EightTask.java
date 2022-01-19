import java.io.FileReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class EightTask {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("forEightTask.txt");
        Scanner sc = new Scanner(fr);
        HashSet<String> listOnlyForDifferentWords = new HashSet<>();
        while(sc.hasNext()) {
            listOnlyForDifferentWords.add(sc.next().toLowerCase(Locale.ROOT));
        }
        fr.close();
        System.out.println(listOnlyForDifferentWords);
    }
}
