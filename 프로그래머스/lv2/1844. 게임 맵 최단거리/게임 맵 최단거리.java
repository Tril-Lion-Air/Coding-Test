import java.util.*;

class Solution {
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    
    
    public int solution(int[][] maps) {
        int answer = 0;
        int rows = maps.length; //n, y, 세로
        int cols = maps[0].length;// m, x, 가로
        int[][] visited = new int[rows][cols];
        
        bfs(maps,visited);
        
        answer = visited[rows-1][cols-1];
        if (answer == 0) answer = -1;
        
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited) {
        int rows = maps.length; //n, y, 세로
        int cols = maps[0].length;// m, x, 가로
        Queue<int[]> onMyWay = new LinkedList<>();
        
        onMyWay.offer(new int[]{0,0});
        visited[0][0] = 1;
        
        while(!onMyWay.isEmpty()){
        
            int[] currentPosition = onMyWay.poll();
            int cx = currentPosition[0];
            int cy = currentPosition[1];
            
            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx<0 || nx>=cols || ny<0 || ny>=rows) continue;
                if (maps[ny][nx] == 1 && visited[ny][nx] == 0) {
                    visited[ny][nx] = visited[cy][cx] + 1;
                    onMyWay.offer(new int[]{nx,ny});
                }
                
            }
        }
        
    }
}