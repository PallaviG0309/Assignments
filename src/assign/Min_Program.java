package assign;

public class Min_Program {

	public static void main(String[] args) {
		    int seconds = 86399;
		    int Sec= seconds % 60;
	        int Hr_m = seconds / 60;
	        int Min = Hr_m % 60;
	        int	Hr = Hr_m / 60;
	       System.out.print( Hr + "Hour  " + Min + "Minute  " + Sec +  "second");

	}

}
