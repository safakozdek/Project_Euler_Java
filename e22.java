import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class e22 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("name.txt"));
		long sum = 0;
		String s = "";
		s += input.next();
		input.close();
		String ar[] = s.split(",");
		Arrays.sort(ar);
		for(int j = 0; j<ar.length;j++){
			String s2 = ar[j];
			for(int i = 0; i<s2.length();i++){
				if(s2.charAt(i) != 34){
				sum += (s2.charAt(i)-'A'+1)*(j+1);
				}
			}
		}	
		System.out.println(sum);
	}
}
