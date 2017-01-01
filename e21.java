import java.util.Scanner;

public class e21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("This program evaluates the sum of all the amicable numbers up to X. Give me the X: ");
		int a = in.nextInt();
		in.close();
		int sum1 = 0;
		for (int i = 1; i <= a;i++){
			for (int j = i+1 ; j <= a; j++){
				if(sumDiv(i)==j && sumDiv(j)==i){
					sum1 += i+j;
				}
			}
		}
		System.out.println(sum1);
	}
	
	public static int sumDiv(int a){
		int sum =1;
		for (int counter=2; counter<= Math.floor(Math.sqrt(a));counter++){
			if(a%counter==0){
				sum+= counter;
				if(counter != a/counter)
				sum+= a/counter;
		    }
		}
		return sum;
		
	}

}
