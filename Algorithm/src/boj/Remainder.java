package boj;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
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