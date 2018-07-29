package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 좌표 정렬
 *
 * Problem
 * 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 *
 * Input
 * 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 *
 * Output
 * 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 *
 * https://www.acmicpc.net/problem/11650
 */
public class OrderCoordinate {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfInput = Integer.parseInt(br.readLine().trim());
        int[][] coordinate = new int [numberOfInput][2];

        for (int i = 0; i < numberOfInput; i++) {
            String[] str = br.readLine().split(" ");
            coordinate[i][0] = Integer.parseInt(str[0]);
            coordinate[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(coordinate, (x, y) -> {
            if (x[0] == y[0]) {
                return Integer.compare(x[1], y[1]);
            }
            return Integer.compare(x[0], y[0]);
        });

        for (int i = 0; i < numberOfInput; i++) {
            System.out.println(coordinate[i][0] + " " + coordinate[i][1]);
        }

    }
}
