package assign;

public class SwaValues {

	public static void main(String[] args) 
	{
		int i = 10;
	    int j = 7;
	    
/*     Swap using 3rd variable k
       int k;
        k=i;
        i=j;
        j=k;*/
	    /* swap without using 3rd variable*/
	    i = i + j ;// 10 +7 = i value is 17
	    j = i - j ;// (i=17) -(j=10) = 7
	    i = i -j; // 17 - 7 = 10
	    System.out.println(i);
	    System.out.println(j);

	    // Expected Result , i = 7  and j = 10    
	}

}
