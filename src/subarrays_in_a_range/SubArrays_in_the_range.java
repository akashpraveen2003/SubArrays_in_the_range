package subarrays_in_a_range;

import java.util.Scanner;
/*
Given an array A of length N, return the subarray from B to C.
*/

public class SubArrays_in_the_range {
	private static void find_SubArrays_in_the_Range(int[] array, int left, int right) {
		for(int i=left;i<=right;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int array_size=scanner.nextInt();
		int array[]=new int[array_size];
		for(int i=0;i<array_size;i++)
		{
			array[i]=scanner.nextInt();
		}
		int left=scanner.nextInt();
		int right=scanner.nextInt();
		find_SubArrays_in_the_Range(array,left,right);
	}
}
/*
Input
A = [4, 3, 2, 6]
B = 1
C = 3

Output
[3, 2, 6]

Input
A = [4, 2, 2]
B = 0
C = 1

Output
[4, 2]
*/
