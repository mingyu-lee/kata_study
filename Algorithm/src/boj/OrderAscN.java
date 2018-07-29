package boj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 수 정렬하기
 *
 * Problem
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * Input
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 *
 * Output
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 * https://www.acmicpc.net/problem/2750
 */
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
