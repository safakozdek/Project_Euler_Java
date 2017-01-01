import java.util.Scanner;

public class e14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program prints the number that produces longest Collatz chain.\nUp to which number you would like to check ?");
		long check = in.nextLong();
		long start = System.currentTimeMillis();
		int counter1 = 0;
		int counterF=  0;
		long num1 = 0; 
		long numF = 0;
		for(long i = 1; i<=check; i++){
			num1=i;
			counter1=0;
			boolean w = true;
			while(w){
				while(i%2==0){
					i=i/2;
					counter1++;	
				}
				while(i%2==1 && i!=1){
					i=3*i+1;
				}
				if(i==1){
					w = false;
					i=num1;
					if(counter1>counterF){
						numF = num1;
						counterF = counter1;
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Your Number: "+ numF + "\nRuntime in millis: " + (end-start));
		in.close();	
	}
}
