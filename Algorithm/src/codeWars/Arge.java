package codeWars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * In a small town the population is p0 = 1000 at the beginning of a year.
 * The population regularly increases by 2 percent per year and 
 * moreover 50 new inhabitants per year come to live in the town. 
 * 
 * How many years does the town need to see its population greater or 
 * equal to p = 1200 inhabitants?
 * 
 * Examples:
 *	nb_year(1500, 5, 100, 5000) -> 15
 *	nb_year(1500000, 2.5, 10000, 2000000) -> 10
 * 
 * Note: 
 * Don't forget to convert the percent parameter 
 * as a percentage in the body of your function: 
 * if the parameter percent is 2 you have to convert it to 0.02.
 * 
 * @author 이민규
 * @date 2016-11-04
 * @ref https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java
 */
public class Arge {
	public static int nbYear(int p0, double percent, int aug, int p) {
		int ret = 0;
		int population = p0;
		do {
			population = (int) Math.floor((population + (population * (percent/(double)100)) + aug));
			ret++;
		}while(population < p);
				
		return ret;
    }
	
	@Test
    public void test() {
		System.out.println("Fixed Tests: nbYear");
		assertEquals(Arge.nbYear(1000, 2, 50, 1200),3);
		assertEquals(Arge.nbYear(1500, 5, 100, 5000),15);
		assertEquals(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
		assertEquals(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
