package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A/B를 계산하시오.
 * 
 * 첫째 줄에 A/B를 소수점 9자리 이상 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
 * 
 * @author 이민규
 * @date 2016-11-10
 * @ref https://www.acmicpc.net/problem/1008
 */
public class Division {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
		StringBuffer ret = new StringBuffer(String.valueOf(a/b));
		int remainderLen = 0;
		do {
			remainderLen = ret.substring(ret.indexOf(".")).length();
			ret.append("0");
		}
		while(remainderLen < 9);
		System.out.println(ret.toString());
	}
}