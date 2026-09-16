public class Time{ 
	public static void main(String[] args)	{
	double second = 1;
	double minute = 0;
	double hour = 13;
	
	System.out.print("number of seconds since midnight: ");
	System.out.println(second + hour *3600 + minute*60);
	System.out.print("number of seconds remaining in the day:");
	System.out.println(86400-(second + hour *3600 + minute*60));
	System.out.print("percentage of the day that has passed:");
	System.out.print(((second + hour *3600 + minute*60)/86400) *100);
	}
}

	
