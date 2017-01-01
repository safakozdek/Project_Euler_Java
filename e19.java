
public class e19 {

	public static void main(String[] args) {
		//mod7 will be used for days of the week.
		int ar[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int counter=0;
		int leapweek=0;
		for(int i = 1; i<=1200;i++){
			if(i%48 == 38) // in 4 years(48 month) -- starting from Jan 1901. 36+2 ;)
				ar[i%12] +=1;
			if((ar[i%12] + leapweek)%7 == 6) // The month should end with Saturday to start with Sunday.
				counter++;
			leapweek = (ar[i%12] + leapweek)%7;
			if(i%48 == 38) // getting it back to 28.
				ar[i%12] -=1;
		}
		System.out.println(counter);
	}
}
