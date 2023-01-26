import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<>();
		
		Queue<Integer> cards = new LinkedList<>();
		
		for (int i=1; i<=n; i++) {
			cards.offer(i);
		}
		
		while(cards.size()>1) {
			answer.add(cards.poll());
			cards.offer(cards.poll());
		}
		
		for (int ans: answer) {
			System.out.print(ans);
			System.out.print(" ");
		}
		System.out.print(cards.peek());
	}
	

}
