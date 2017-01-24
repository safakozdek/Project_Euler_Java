
public class e23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 28123;
		boolean[] abundantNum = new boolean[max+1]; // leaving blank space for index 0.
		int divisorSum , sum =0;
		for(int i = 1; i<=max;i++){
			sum+=i;
			divisorSum=0;
			for(int j = 1; j<i;j++){
				if(i%j==0){
					divisorSum+=j;
				}
			}
			if(divisorSum > i){
				abundantNum[i]=true;
			}
		}
		int AbundantSum=0;
		for(int i = 1;i<=max;i++){
			for(int j=1; j<=i;j++){ 
				if(abundantNum[j] && abundantNum[i-j]){
					AbundantSum += i;
					break;
				}
			}
		}
		System.out.println(sum - AbundantSum); // all sum - abundantSum == non abundant sum! ;)

	}

}
