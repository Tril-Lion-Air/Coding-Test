import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
				
		int[] fibonacci = new int[1000001];
		fibonacci[1] = 1; //0 안씀.
		fibonacci[2] = 2;
		
		
		for(int i=3; i<=n; i++) {
			fibonacci[i] = (fibonacci[i-2]+fibonacci[i-1])%15746;
		}
		
		System.out.println(fibonacci[n]%15746);
		
		
	}
}