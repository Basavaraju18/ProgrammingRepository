package com.globussoft;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRoad {
	
	
    static class Road {
        int destination;
        int preferredValue;

        public Road(int destination, int preferredValue) {
            this.destination = destination;
            this.preferredValue = preferredValue;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int st = scanner.nextInt();
            int en = scanner.nextInt();

            ArrayList<Road>[] roads = new ArrayList[N];
            for (int i = 0; i < N; i++) {
                roads[i] = new ArrayList<>();
            }

            for (int i = 0; i < N - 1; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                int c = scanner.nextInt();
                roads[u].add(new Road(v, c));
                roads[v].add(new Road(u, c));
            }

            double[] expectedRoads = new double[N];
            dfs(st - 1, -1, roads, expectedRoads, 0, 1.0);

            System.out.printf("%.5f\n", expectedRoads[en - 1]);
        }
    }

    private static void dfs(int node, int parent, ArrayList<Road>[] roads, double[] expectedRoads, double currentProb, double totalProb) {
        expectedRoads[node] = currentProb;
        double totalPreferredValue = 0;

        for (Road road : roads[node]) {
            if (road.destination != parent) {
                totalPreferredValue += road.preferredValue;
            }
        }

        for (Road road : roads[node]) {
            if (road.destination != parent) {
                double probability = road.preferredValue / totalPreferredValue * totalProb;
                dfs(road.destination, node, roads, expectedRoads, currentProb + probability, probability);
            }
        }
    }
}
