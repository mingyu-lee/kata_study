package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find All Duplicates in an Array
 * 
 * Given an array of integers, 1 <= a[i] <= n (n = size of array),
 * some elements appear <b>twice</b> and others appear <b>once</b>.
 * 
 * Find all the elements that appear twice in this array.
 * 
 * Could you do it without extra space and in O(n) runtime?
 * 
 * Example:
 * 	Input:
 * 	[4, 3, 2, 7, 8, 2, 3, 1]
 *  Output:
 *  [2, 3]
 * 
 * @author 이민규(MinGyu Lee)
 * @date 2016-10-27
 * @ref https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class FindDuplicatesInArray {
		
	 public List<Integer> findDuplicates(int[] nums) {
		 List<Integer> res = new ArrayList<>();
		 Map<Integer, Integer> numberMap = new HashMap<>();
		 for (int i = 0; i < nums.length; i++) {
			 numberMap.put(nums[i], i);
		 }
		 for (int i = 0; i < nums.length; i++) {
			 if(numberMap.containsKey(nums[i]) && numberMap.get(nums[i]) != i) {
				 res.add(nums[i]);
			 }
		 }
		 if(res.size() > 0)
			 return res;
		 else throw new IllegalArgumentException("No duplicated number");
	 }
}

/* Best Solution
public List<Integer> findDuplicates(int[] nums) {
	 List<Integer> res = new ArrayList<>();
	 for (int i = 0; i < nums.length; ++i) {
		 int index = Math.abs(nums[i])-1;
		 if(nums[index] < 0)
			 res.add(Math.abs(index+1));
		 nums[index] = -nums[index];
	 }
	 return res;  
  
*/
