package codeWars;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TwoToOne {
	
	public static String longest(String s1, String s2) {
		
		StringBuffer ret = new StringBuffer();
		
		String concatStr = s1+s2;
		char[] charArr = concatStr.toCharArray();
		
		LinkedList<Character> strArr = new LinkedList<Character>();
		
		for (int idx=0; idx < charArr.length; idx++) {
			strArr.add(charArr[idx]);
		}
		
		int listSize = strArr.size();
		
		for (int idx = 0; idx < listSize; idx++) {
			Character em = strArr.pop();
			if(strArr.contains(em)) continue;
			strArr.addLast(em);
		}
		
		Collections.sort((List<Character>) strArr);
		
		for (int idx = 0; idx < strArr.size(); idx++) {
			ret.append(strArr.get(idx));
		}
		
		return ret.toString();
		
	}
	
	@Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
	
}
