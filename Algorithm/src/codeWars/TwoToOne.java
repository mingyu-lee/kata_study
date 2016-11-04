package codeWars;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * Take 2 strings s1 and s2 including only letters from a to z. 
 * Return a new sorted string, the longest possible, 
 * containing distinct letters,
 *  - each taken only once - coming from s1 or s2.
 * 
 * @author 이민규(MinGyu Lee)
 * @date 2016-11-02
 * @ref https://www.codewars.com/kata/two-to-one/java 
 */
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

/*
Best Practice

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}

review
1. This works since 1.8 because IntStream
2. CharSequence (chars())
	- https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html#chars--
3. Read Java API documentation and study of diverse methods.	

*/