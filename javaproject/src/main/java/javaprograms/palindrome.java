package javaprograms;

public class palindrome {

	public static void main(String[] args)
	{
		
		int a=121,sum=0,r;
		while(a>0)
		{
			r=a%10;
			a=a/10;
			sum=sum*10+r;
			
			
		}
		System.out.println(sum);

	}

}
