import java.util.Scanner;

public class e34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long sum = 0;
		
		for(int i=10; a >= i; i++){
			if(digFac(i))
				sum+= i;
		}
		in.close();
		System.out.println(sum);
		

	}
	public static int factorial(int a){
		if(a==0){
			return 1;
		}
		if(a==1){
			return 1;
		}
		return a * factorial(a-1);
	}
	public static boolean digFac(int a){
		
		int b = a;
		int sum= 0;
		while(a>0){
			int c = a%10;
			sum += factorial(c);
			a=a/10;
				
		}
		if(b==sum){
			return true;
				
		}
		return false;
	}

}
