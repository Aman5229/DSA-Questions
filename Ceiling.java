// FIND THE CEILING OF A NUMBER IN  SORTED ARRAY
class Ceiling
{
	public static void main(String args[])
	{
		int []arr={2,3,5,9,14,16,18,45,88,90,96,99};
		int target=17;
		System.out.println(Search(arr, target));
	}
	static int Search(int arr[], int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return arr[mid];
			}
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else if(arr[mid]<target)
			{
				start=mid+1;
			}
		}
		
		return arr[end];
	}
}
