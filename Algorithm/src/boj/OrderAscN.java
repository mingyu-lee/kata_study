package boj;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAscN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[numberOfInput];

        for (int i = 0; i < numberOfInput; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }

    }
}
