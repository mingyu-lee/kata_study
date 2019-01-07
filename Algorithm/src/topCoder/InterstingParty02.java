package topCoder;

import java.util.HashMap;
import java.util.Map;

/**
 * 즐거운 파티 연관배열 사용
 */
public class InterstingParty02 {
    public int getMaxCountInterstingParty(String[] first, String[] second) {
        int ans = 0;
        Map<String, Integer> relateMap = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            relateMap.put(first[i], 0);
            relateMap.put(second[i], 0);
        }

        for (int i = 0; i < first.length; i++) {
            relateMap.put(first[i], relateMap.get(first[i])+1);
            relateMap.put(second[i], relateMap.get(second[i])+1);
        }

        for (String key : relateMap.keySet()) {
            ans = Math.max(ans, relateMap.get(key));
        }

        return ans;
    }
}
