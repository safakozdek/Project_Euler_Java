import java.util.Scanner;
public class e10 {
	
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("I will calculate sum of the prime numbers up to X. Give me your X value!");
		long a= console.nextLong();
		long startTime = System.nanoTime();
		long sum =0;
		for(int i=1; a>=i;i++){
			int b=PrimeCheck(i);
			if (b==1)
				sum=sum+i;
		}
		System.out.println(sum);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time in nanoseconds is: "+totalTime);
		console.close();
		
	}
	public static int PrimeCheck(long a){    // Checks if a number prime or not. If number is prime, returns 1.
		long testUpTo = (long) Math.floor(Math.sqrt(a));
		if (a==1)
			return 0;
		if (a==2)
			return 1;
		if(a%2==0){
			return 0;		
		}
		for(int i=3;i<=testUpTo;i+=2){
			if (a%i==0){	
				return 0;
			}
		}
		return 1;	
		
			
				
			
		
		
	}

}