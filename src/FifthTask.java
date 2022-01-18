import java.util.*;
public class FifthTask {
    public static void main(String[] args) {
        ArrayList<Integer> listFigures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        listFigures.add((int) (-30 + Math.random() * 60));
        }
        System.out.println(listFigures);
        Collections.sort(listFigures);
        System.out.println(listFigures);
        Collections.reverse(listFigures);
        System.out.println(listFigures);
    }
}