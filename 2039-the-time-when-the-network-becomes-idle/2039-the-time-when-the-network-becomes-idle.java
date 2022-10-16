class Solution {
    public int networkBecomesIdle(int[][] edges, int[] patience) {
        int n = patience.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        visited[0] = 0;
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            while(size-->0){
                int node = queue.remove();
                for(int next: adj.get(node)){
                    if(visited[next] == -1){
                        queue.offer(next);
                        visited[next] = 2 * level;
                    }
                }
            }
        }
        int res = 0;
        for(int i = 1; i < visited.length; i++){
            int dist = visited[i];
            int val = dist + dist - (dist % patience[i]);
            if(dist % patience[i] == 0) val -= patience[i];
            res = Integer.max(res, val);
        }
        return res + 1;
    }
}