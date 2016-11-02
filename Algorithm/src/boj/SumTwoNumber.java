package boj;
import java.util.*;

public class SumTwoNumber {
    
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("정수 A를 입력하세요 (A > 0) > ");
            a = scanner.nextInt();    
            if (a<=0) {
                System.out.println("A는 0보다 커야합니다. 다시 입력해주세요.");
            }
        } while(a <= 0);
        
        do {
        	System.out.print("정수 B를 입력하세요 (B < 10) > ");
            b = scanner.nextInt();
            if (b>=10) {
                System.out.println("B는 10보다 작아야합니다. 다시 입력해주세요 > ");
            }
        } while(b >= 10);
        
        System.out.println(a+b);
        
    }
}