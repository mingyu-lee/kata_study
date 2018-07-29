package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Problem
 * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이 때, 회원들을 나이가 증가하는 순으로,
 * 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
 *
 * Input
 * 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
 *
 * 둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며,
 * 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다.
 * 입력은 가입한 순서로 주어진다.
 *
 * Output
 * 첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로
 * 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
 *
 * https://www.acmicpc.net/problem/10814
 */
public class OrderAge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfMember = Integer.parseInt(br.readLine());
        String[][] inputs = new String[numberOfMember][3];

        for (int i = 0; i < numberOfMember; i++) {
            String[] temp = br.readLine().split(" ");
            inputs[i][0] = temp[0];
            inputs[i][1] = temp[1];
            inputs[i][2] = String.valueOf(i);
        }

        Arrays.sort(inputs, (x, y) -> {
           if (x[0] == y[0]) {
               return Integer.compare(Integer.parseInt(x[2]), Integer.parseInt(y[2]));
           }
            return Integer.compare(Integer.parseInt(x[0]), Integer.parseInt(y[0]));
        });

        for (int i = 0; i < numberOfMember; i++) {
            System.out.println(inputs[i][0] + " " + inputs[i][1]);
        }
    }
}
