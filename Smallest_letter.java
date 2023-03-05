//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Smallest_letter
{
	public static void main(String args[])
	{
		char ch[]={'a','b','c','d','e','g','j','l','o','q'};
		char target='h';
			System.out.println(search(ch,target));
	}
	
	static char search(char ch[], char target)
	{ 
		int start=0;
		int end=ch.length-1;
		while(start<=end)
		{
			int mid= start+(end-start)/2;
		System.out.println(mid);
			
		
			 if(target<ch[mid])
			{
				end=mid-1;
			}
			  else
			{
				start=mid+1;

			}
		}
		return ch[start % ch.length] ;
	}
}
	
