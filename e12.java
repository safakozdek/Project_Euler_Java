
public class e12 {

	public static void main(String[] args) {
		int a = 0;
		boolean check = true;
		int count = 1;
		while(check){
			a+= count;
			if(NumofDiv(a)>500){
				check = false;
				System.out.println(a);
			}
			count++;
		}
	}
	
	public static int NumofDiv(int a){
		int counter = 2; // for 1 and a
		for(int i = 2; i<=Math.sqrt(a); i++ ){
			if(a%i==0){
				counter++;
				if(a/i!=i){
					counter++;
				}
			}
		}
		return counter;
	}
}
	
	
