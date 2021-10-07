import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Problem:
 * Given N courses, labeled from 0 to N-1. Also given M pairs(X,Y) of prerequisites,
 * where Y course must be finished before X.
 * We need to tell if it is possible to finish all the courses.
 *
 * Approach: Topological Sorting, Cycle Detection
 * Let's try to think of prerequisites pairs as a edge between two nodes in a graph.
 * Now this problem becomes simple, we just need to find out if there is any cycle in a graph or not.
 * If there is no cycle, then we can finish all the courses otherwise the answer is no.
 */
public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // this is to keep track of visited nodes
        boolean[] vis = new boolean[numCourses];

        // initialize adjacent graph
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        // set default ans to true
        // and we will only set it to false if and only if there is a cycle in the graph
        boolean ans = true;

        // this is use to keep track of visited nodes in the current chain
        // Note: this is different from vis array
        Set<Integer> currentVisNodes = new HashSet<>();
        for(int i = 0; i < numCourses; i++) {
            // if we haven't visited this node, then let's try to find if there is a cycle or not
            if(!vis[i]) {
                ans &= dfs(graph, i, vis, currentVisNodes);
                currentVisNodes.clear();
            }
        }

        return ans;
    }

    private static boolean dfs(List<List<Integer>> graph, int currentNode, boolean[] vis, Set<Integer> currentVisNodes) {
        // set currentNode to visited
        vis[currentNode] = true;
        boolean possible = true;

        // add this node to current chain
        currentVisNodes.add(currentNode);
        for(Integer nextNode: graph.get(currentNode)) {

            // if we have found a node which we have already visited in the current chain then there is a loop
            if(currentVisNodes.contains(nextNode)) {
                possible = false;
                break;
            } else {
                // otherwise if we haven't visited next node then let's keep doing dfs recursively
                if(!vis[nextNode]) {
                    possible &= dfs(graph, nextNode, vis, currentVisNodes);
                }
            }

        }
        // in the end after exploring all the adjacent nodes of this node, remove the current node from the chain
        currentVisNodes.remove(Integer.valueOf(currentNode));
        return possible;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        int n = line[0];
        int m = line[1];

        int[][] prerequisites = new int[m][2];
        for(int i = 0; i < m; i++) {
            line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
            prerequisites[i][0] = line[0];
            prerequisites[i][1] = line[1];
        }

        System.out.println(canFinish(n, prerequisites));
    }
}
