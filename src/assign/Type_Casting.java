package assign;

public class Type_Casting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/*what is type casting?
       Ans: Type casting is when you assign a value of one data type to another type.*/
		
		/* int ln= 1234_2343_22376; - This in invalid because of int data type can't accept the long values*/
		
		/*	byte b2 = 128;
		System.out.println(b2);
		what is the output?
		Ans: this is invalid input because the 128 is int type this will show an error*/
	     /*valid ans is:*/	
		byte b = (byte)128;
		System.out.println(b);
		
	 /* byte b1 = (byte)b1;
		System.out.println(b1);
	    what is the output?
	    Ans: this also invalid inputs because of we can not initialize b1 */

		/*byte b1 = (byte)(b1*3);
		System.out.println(b1);
		what is the output?
		Ans: This is also invalid input we can not initialize b1*/
		

	}

}
