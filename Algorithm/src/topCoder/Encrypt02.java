package topCoder;

import java.util.Arrays;

/**
 * 암호화
 *
 * 최소값에 + 1
 * 정렬 알고리즘 사용
 */
public class Encrypt02 {

    public long encrypt(int[] numbers) {
        long ans = 1;

        Arrays.sort(numbers);
        numbers[0]++;

        for (int i = 0; i < numbers.length; i++) {
            ans *= numbers[i];
        }

        return ans;

    }

}
