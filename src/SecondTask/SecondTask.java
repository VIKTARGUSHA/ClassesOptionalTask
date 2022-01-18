package SecondTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class SecondTask {

    private void printAr(ArrayList<Integer> ar){
      ar.forEach(i -> System.out.print(String.valueOf(i)));
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int figure = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int x;
        while (figure != 0) {
            st.push(x = figure%10);
            figure = figure/10;
        }
        while (!st.isEmpty()){
            ar.add(st.pop());
        }
        Collections.reverse(ar);
        System.out.println((ar));
        SecondTask secondTask = new SecondTask();
        secondTask.printAr(ar);
    }
}