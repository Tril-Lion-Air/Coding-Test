import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		
		int sum = 0;
		for (int i=0; i<5; i++) {
			int temp = sc.nextInt();
			intArr.add(temp);
			sum += temp;
		}
		
		Collections.sort(intArr);
		System.out.println(sum/5);
		System.out.println(intArr.get(2));

			
	}

}
