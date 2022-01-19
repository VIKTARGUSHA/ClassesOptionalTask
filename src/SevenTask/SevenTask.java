package SevenTask;

import java.util.Scanner;
import java.util.Stack;

public class SevenTask {
    public static String bracketsCheck(Character[] charList) {
        if(charList.length == 0){
            throw new IllegalArgumentException();
        }
        Stack<Character> accuratness = new Stack<>();
        for (char c : charList) {
            if (c == '(' || c == '{' || c == '[') {
                accuratness.push(c);
            }
            if (c == ')') {
                if (accuratness.isEmpty() || accuratness.pop() != '(') {
                    return "  ) false";
                }
            }
                if (c == ']') {
                    if (accuratness.isEmpty() || accuratness.pop() != '[')  {
                        return "  ] false";
                    }
                }
                    if (c == '}') {
                       if (accuratness.isEmpty() || accuratness.pop() != '{') {
                            return "  }false";
                        }
            }
        }
        return "False number Breckits";
    }
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        String bracketsList = sc.nextLine();
        Character[] charList = new Character[bracketsList.length()];
        for (int i = 0; i < bracketsList.length(); i++) {
            charList[i] = bracketsList.charAt(i);
        }
        for (char c : charList) {
            System.out.print(c);
        }
        System.out.println(bracketsCheck(charList));
    }
}