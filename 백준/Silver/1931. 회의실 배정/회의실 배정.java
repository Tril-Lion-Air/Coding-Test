import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int schedules[][] = new int[n][2];
		
		for (int i=0; i<n; i++) {
			int begin_time = sc.nextInt();
			int finish_time = sc.nextInt();
//			System.out.println(begin_time + " " + finish_time);
			
			schedules[i][0] = begin_time;
			schedules[i][1] = finish_time;
//			System.out.println(Arrays.toString(schedules[i]));
		}
		
		Arrays.sort(schedules, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
		
//		for (int[] schedule : schedules) {
//			System.out.println(Arrays.toString(schedule));
//		}
		int time = 0;
		int count = 0;
		for (int[] schedule : schedules) {
			if(time <= schedule[0]) { 
				time = schedule[1];
				count++;
			}
		}
		System.out.println(count);
			
	}

}
