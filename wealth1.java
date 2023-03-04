//https://leetcode.com/problems/richest-customer-wealth/
class wealth1
{
	public static void main(String args[])
	{
		int arr[][]={{1,4,2},{5,7,9},{4,2,8,9},{5,1,8}};
		int wealth=0;
		
		for(int column=0;column<arr.length;column++)
		{
			int sum=0;
			for(int row=0;row<arr[column].length;row++)
			{
				sum+=arr[column][row];
			}
			if(sum>wealth)
				wealth=sum;
		}
		System.out.println(wealth);
	}
}
