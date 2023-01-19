import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			intArr.add(sc.nextInt());
		}
		
		Collections.sort(intArr);
		
		for (int i=0; i<n; i++) {
			System.out.println(intArr.get(i));
		}
	}

}
