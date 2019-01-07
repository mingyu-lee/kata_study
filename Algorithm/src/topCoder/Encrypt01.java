package topCoder;

/**
 * TSA 암호
 *
 * 입력 리스트에서 1개의 값을 선택하고 1 증가
 * 리스트 내부의 모든 숫자 곱이 가장 커야함
 *
 *  1) 전체 탐색
 *  2) 최소값에 + 1을 해야 전체 값들의 곱의 크기가 최대 => 정렬 이용
 */
public class Encrypt01 {

    public static void main(String[] args) {
        Encrypt01 encrypt01 = new Encrypt01();
        System.out.println(encrypt01.encrypt(new int[]{1,3,2,1,1,3}));
    }

    public long encrypt(int[] numbers) {
        long maxMultiple = 0;

        for (int i = 0; i < numbers.length; i++) {
            int tmpMultiple = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    tmpMultiple *= (numbers[j] + 1);
                } else {
                    tmpMultiple *= numbers[j];
                }
            }

            maxMultiple = Math.max(maxMultiple, tmpMultiple);

        }

        return maxMultiple;
    }

}
