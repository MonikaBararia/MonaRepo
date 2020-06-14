/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
Please explain your thought process.*/

package com.practice.interviewquestions;

import java.util.Arrays;

public class ArrayOfIntegers {
	
	public static void main(String[] args) {
	int array[]= {2, 7, 11, 15};
	//int array[]= {11, 15, 2, 7};
	int target = 9;
	int start = 0;
	int end = array.length;
	
	if (end > 0) 
	{
		for (int i=start; i<end; i++)
		{
			for (int j=i+1; j<end; j++)
			{
				if (array[i] + array[j] == target)
				{
					System.out.println("[" + i + ", " + j + "]");
                    System.out.println(Arrays.toString(array));
					System.out.println(array[i] + array[j]);
					return;
				}
			}
		}
	}
}
}

//With outer for loop we will get one number and inner forloop we will get all the numbers and compare with that one number of the outer loop.