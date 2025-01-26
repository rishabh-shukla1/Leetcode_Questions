class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      


    List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <numCourses; i++) {

            adj.add(new ArrayList<>());
        }

       int indegre[]=new int[numCourses];


        for (int i = 0; i <prerequisites.length; i++) {

            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);

            indegre[prerequisites[i][1]]++;

        }


        Queue<Integer> q=new LinkedList<>();


        for(int i=0;i<indegre.length;i++)
        {
            if(indegre[i]==0)
            {
                q.add(i);
            }
        }


        while(!q.isEmpty())
        {
            int node=q.poll();

            for(int i=0;i<adj.get(node).size();i++)

            {

                indegre[adj.get(node).get(i)]--;

                if( indegre[adj.get(node).get(i)]==0)
                {
                    q.add(adj.get(node).get(i));
                }
            }

        }


        for(int i=0;i<indegre.length;i++)
        {
            if(indegre[i]>0)
            {
                return false;
            }
        }

        return true;
        
    }
}