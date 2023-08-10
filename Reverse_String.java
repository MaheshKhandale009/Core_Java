package Array_Character;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		//Intializing String
		String str="Mahesh";
		//Intializing As a Null String
		String rev="";
		//String Convert in char
		char []c=str.toCharArray();//'m''a''h''e''s''h'
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
			
		}
		System.out.println("Given String Is :"+str+"---> Reverse String is :"+rev);


	}

}
