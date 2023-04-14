package assign;

public class TwoDigitCode {

	public static void main(String[] args)
	{
		int a=25;
		int b= 5;
        
        System.out.printf("Sum="+(a+b));
        System.out.printf("\nDiff="+( a - b));
        System.out.printf("\nProduct="+(a * b));
        System.out.printf("\nAverage="+ (double) (a + b) / 2);
        System.out.printf("\nDistance="+(a - b));
        if(a>b) {
       	 System.out.println("\nMax value is ="+a);
       	 
        }
                      
        if(a>b) {
       	 System.out.println("Min value is ="+b);
       	 
        }
	}

	
}
