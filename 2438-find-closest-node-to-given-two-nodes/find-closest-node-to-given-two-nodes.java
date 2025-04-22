class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {

        return nearest_meeting(edges.length, edges, node1, node2);
        
    }



    public static int nearest_meeting(int n, int[] edges, int c1, int c2) {
    int[] dis1 = minimumDistance(n, edges, c1);
    int[] dis2 = minimumDistance(n, edges, c2);
    int ans = -1;
    int minMaxDistance = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
        if (dis1[i] == Integer.MAX_VALUE || dis2[i] == Integer.MAX_VALUE) {
            continue;
        }
        int maxDistance = Math.max(dis1[i], dis2[i]);
        if (maxDistance < minMaxDistance) {
            minMaxDistance = maxDistance;
            ans = i;
        } else if (maxDistance == minMaxDistance && i < ans) {
            ans = i;
        }
    }
    return ans;
}


    public static int[] minimumDistance(int n, int[] edges, int c) {
        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        q.add(c);
        dis[c] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            int dest = edges[node];
            if (dest != -1 && dis[dest] > dis[node] + 1) {
                dis[dest] = dis[node] + 1;
                q.add(dest);
            }
        }
        return dis;
    }
}