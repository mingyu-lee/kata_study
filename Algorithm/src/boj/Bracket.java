package boj;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

    private static final String OPEN_BRACKET = "(";
    private static final String CLOSE_BRACKET = ")";
    private static final String OPEN_SQUARE_BRACKET = "[";
    private static final String CLOSE_SQUARE_BRACKET = "]";
    private static final String BRACKET_VALUE = "2";
    private static final String SQUARE_BRACKET_VALUE = "3";

    public static void main(String[] args) {
        new Bracket().solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split("");
        Stack<String> stringStack = new Stack<>();
        int length = inputArray.length;
        int valueChk = 0;
        int ret = 0;

        for (int i = 0; i < length; i++) {
            if (valueChk == -1) {
                System.out.println(0);
                return;
            }

            if (OPEN_BRACKET.equals(inputArray[i]) || OPEN_SQUARE_BRACKET.equals(inputArray[i])) {
                stringStack.push(inputArray[i]);
            } else {
                if (stringStack.isEmpty()) {
                    System.out.println(0);
                    return;
                }

                if (CLOSE_BRACKET.equals(inputArray[i])) {
                    if (OPEN_BRACKET.equals(stringStack.peek())) {
                        stringStack.pop();
                        stringStack.push(BRACKET_VALUE);
                    } else {
                        valueChk = loopInStack(stringStack, OPEN_SQUARE_BRACKET, OPEN_BRACKET, Integer.parseInt(BRACKET_VALUE));
                    }
                } else {
                    if (OPEN_SQUARE_BRACKET.equals(stringStack.peek())) {
                        stringStack.pop();
                        stringStack.push(SQUARE_BRACKET_VALUE);
                    } else {
                        valueChk = loopInStack(stringStack, OPEN_BRACKET, OPEN_SQUARE_BRACKET, Integer.parseInt(SQUARE_BRACKET_VALUE));
                    }
                }
            }
        }

        while (!stringStack.isEmpty()) {
            String peekValue = stringStack.peek();
            if (OPEN_BRACKET.equals(peekValue) || OPEN_SQUARE_BRACKET.equals(peekValue)
                    ||  CLOSE_BRACKET.equals(peekValue) || CLOSE_SQUARE_BRACKET.equals(peekValue)) {
                System.out.println(0);
                return;
            }
            ret += Integer.parseInt(stringStack.pop());
        }

        System.out.println(ret);
    }

    private static int loopInStack(Stack<String> stack, String s1, String s2, int value) {
        int result = 0;

        while (!stack.isEmpty()) {
            String top = stack.peek();
            if (s1.equals(top)) {
                return -1;
            } else if (s2.equals(top)) {
                stack.pop();
                result *= value;
                stack.push(String.valueOf(result));
                break;
            } else {
                result += Integer.parseInt(stack.pop());
            }
        }

        return result;
    }

}
