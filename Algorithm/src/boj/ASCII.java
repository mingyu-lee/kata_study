package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 아스키 코드
 *
 * Problem
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 *
 * Input
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 *
 * Output
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 *
 * https://www.acmicpc.net/problem/11654
 */
public class ASCII {
    public static void main(String[] args) throws IOException {
        System.out.println((int)new BufferedReader(new InputStreamReader(System.in)).readLine().charAt(0));
    }
}
