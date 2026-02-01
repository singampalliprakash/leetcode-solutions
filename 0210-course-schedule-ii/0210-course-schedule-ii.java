class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

       
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            int course = p[0];
            int prereq = p[1];
            adj.get(prereq).add(course); // edge b → a
            indegree[course]++;
        }

        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }

        int[] order = new int[numCourses];
        int index = 0;

        
        while (!q.isEmpty()) {
            int curr = q.poll();
            order[index++] = curr;

            for (int nei : adj.get(curr)) {
                indegree[nei]--;
                if (indegree[nei] == 0)
                    q.offer(nei);
            }
        }

        
        if (index != numCourses)
            return new int[0];

        return order;
    }
}
