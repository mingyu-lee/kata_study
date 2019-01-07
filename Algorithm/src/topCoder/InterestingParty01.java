package topCoder;

/**
 * 즐거운 파티
 *
 * 각 친구들이 2가지 주제에 대해서만 관심이 있고 다른 주제로 이야기하는 것을 싫어한다.
 * 각 친구 i의 2가지 주제는 first[i], second[i]라고 표현한다.
 * 주어진 배열에서 최대 몇명이 즐겁게 파티를 즐 길 수 있을까?
 */
public class InterestingParty01 {
    public int getMaxCountForInterstingParty(String[] first, String[] second) {
        int ans = 0;

        for (int i = 0; i < first.length; i++) {
            int f = 0;
            int s = 0;
            for (int j = 0; j < second.length; j++) {
                if (first[i].equals(first[j])) f++;
                if (first[i].equals(second[j])) f++;
                if (second[i].equals(first[j])) s++;
                if (second[i].equals(second[j])) s++;
            }
            ans = Math.max(f, ans);
            ans = Math.max(s, ans);
        }

        return ans;
    }

}
