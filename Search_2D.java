import java.util.Scanner;
import java.util.Arrays;
class Search_2D
{
	public static void main(String args[])
	{
		int arr[][]={
			{10,23,46,71,54},
			{12,43,46,74,44},
			{27,31,94,37,14},
			{20,53,13,77,84,43,77,999}};
		Scanner input=new Scanner(System.in);
		int target=input.nextInt();
		int ans[]=search2(arr,target);
		System.out.println(search1(arr,target));
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] search2(int arr[][], int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
				return new int []{i,j};
			}
		}
		return new int[]{-1,-1};
	}
	static boolean search1(int arr[][], int target)
	{
		for(int i[] : arr)
		{
			for(int j:i)
			{
				if(j==target)
					return true; 
			}
		}
		
		return false;
	}
}