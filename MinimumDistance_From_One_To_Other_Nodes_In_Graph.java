/*
Function to calculate minimum distance from one node to all other nodes in graph
*/
int n;
int[][] dist = new int[n + 1][n + 1];
HashMap<Integer,ArrayList<Integer>> graph;

private void bfs(int u){
    for(int i = 1; i <= n; i++) dist[u][i] = (int)1e7; // initialise with max distance
    dist[u][u] = 1;
    Queue<Integer> que = new ArrayDeque<>();
    que.offer(u);
    while(!que.isEmpty()){
        int v = que.poll();
        for(int next : graph.get(v)){
            if(dist[u][next] > dist[u][v] + 1){
                dist[u][next] = dist[u][v] + 1;
                que.push(next);
            }
        }
    }
} 
