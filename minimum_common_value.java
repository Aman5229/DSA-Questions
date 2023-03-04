//https://leetcode.com/problems/minimum-common-value/
class minimum_common_value
{
	public static void main(String args[])
	{
		int [] arr={1,2,8,12,32,34,43,52,57,62,64,67,71,71,79,81,86,91,93,94};
		int [] brr={9,11,12,14,19,25,29,31,38,39,41,42,58,63,66,70,71,73,91,91};
		System.out.println(search(arr,brr));
	}
	static int search(int arr[], int brr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int start=0;
			int end=brr.length-1;
			int target=arr[i];
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(brr[mid]==target)
				{
					return brr[mid];
				}
				else if(brr[mid]>target)
				{
					end=mid-1;
				}
				else if(brr[mid]<target)
				{
					start=mid+1;
				}
			}
		}
		return -1;
	}
}