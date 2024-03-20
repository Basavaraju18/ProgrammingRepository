package com.globus;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class PrisonEscape{

	static class Point {

		int x;
		int y;
		int i;

		Point() {
		}

		Point(int x, int y, int i) {

			this.x = x;
			this.y = y;
			this.i = i;
		}
	}
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		int L = scanner.nextInt();
		int W = scanner.nextInt();
		int n = scanner.nextInt();

		int r = 100;
		int d = 2 * r;

		Set<Point> points = new HashSet<Point>();

		List<List<Integer>> G = new ArrayList<>(n + 2);

		for (int i = 0; i < n + 2; i++) {

			G.add(new ArrayList<>());
		}
		Point P = new Point();

		for (int i = 1; i <= n; i++) {

			P.x = scanner.nextInt();
			P.y = scanner.nextInt();
			P.i = -1;

			Point Q = new Point(P.x - d, P.y - d,P.i);

			Point R = new Point(P.x + d, P.y + d,P.i);

			Iterator<Point> iterator = points.iterator();

			while (iterator.hasNext()) {

				Point j = iterator.next();

				if (Math.pow(P.x - j.x, 2) + Math.pow(P.y - j.y, 2) <= Math.pow(d, 2)) {
					G.get(i).add(j.i);
					G.get(j.i).add(i);
				}
			}
			if (P.y - r <= 0) {

				G.get(i).add(0);

				G.get(0).add(i);
			}
			if (P.y + r <= W) {

				G.get(i).add(n + 1);

				G.get(n + 1).add(i);
			}
			points.add(new Point(P.x, P.y, i));
		}
		int[] visited = new int[n + 2];

		for (int i = 0; i < n + 2; i++) {
			visited[i] = 0;
		}

		Deque<Integer> q = new LinkedList<>();
		q.add(0);
		while (!q.isEmpty()) {
			int v = q.poll();
			if (visited[v] == 1) {
				continue;
			}
			visited[v] = 1;
			if (v == n + 1) {
				System.out.println(1);
				return;
			}
			for (int i : G.get(v)) {
				q.add(i);
			}
		}
		System.out.println(0);
	}
}