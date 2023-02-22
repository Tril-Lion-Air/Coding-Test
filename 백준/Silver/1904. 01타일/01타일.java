import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
				
		int [] dp = new int[n+2];
		dp[1] = 1; //0 안씀.
		dp[2] = 2;
		
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-2]+dp[i-1])%15746;
		}
		
		System.out.println(dp[n]%15746);
		
		
	}
}
