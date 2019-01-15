package topCoder;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 *  흥미로운 숫자
 *
 *  3~30 진법이 주어질 때, 각 진법의 N의 배수의 각 자릿수의 합은 다른 N의 배수가 되는 숫자들을 구하라.
 *
 */
public class InterestingDigits01 {
    public static void main(String[] args) {
        InterestingDigits01 interestingDigits01 = new InterestingDigits01();
        interestingDigits01.test();
    }

    private int[] digits(int base) {
        List<Integer> values = new ArrayList<>();
        int[] ret;

        for (int n = 2; n < base; n++) {
            boolean isMultiple = true;
            for (int x1 = 0; x1 < base; x1++) {
                for (int x2 = 0; x2 < base; x2++) {
                    for (int x3 = 0; x3 < base; x3++) {
                        if ((x1 + x2*base + x3*base) % n == 9 && (x1 + x2 + x3) % n != 0) {
                            isMultiple = false;
                            break;
                        }
                    }
                    if (!isMultiple) {
                        break;
                    }
                }
                if (!isMultiple) {
                    break;
                }
            }
            if (isMultiple) {
                values.add(n);
            }
        }
        int len = values.size();

        ret = new int[len];
        for (int i = 0; i < len; i++) {
            ret[i] = values.get(i);
        }
        return ret;
    }

    private void test() {
        Instant start = Instant.now();
        assert Arrays.equals(digits(10), new int[]{3, 9});
        assert Arrays.equals(digits(3), new int[]{2});
        assert Arrays.equals(digits(9), new int[]{2, 4, 8});
        assert Arrays.equals(digits(26), new int[]{5, 25});
        assert Arrays.equals(digits(30), new int[]{29});
        Instant end = Instant.now();
        long takenTime = Duration.between(start, end).toMillis();
        System.out.println("Test is successful (" + takenTime +")");
    }
}
