package com.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PackageInstallation {
    static Map<String, Set<String>> packages = new HashMap<>();
    static Set<String> installed = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        
        // Read input and build the package dependency graph
        while (!(line = scanner.nextLine()).equals("0")) {
            String[] tokens = line.split(" ");
            String packageName = tokens[0];
            Set<String> dependencies = new HashSet<>();
            for (int i = 1; i < tokens.length - 1; i++) {
                dependencies.add(tokens[i]);
            }
            packages.put(packageName, dependencies);
        }
        
        // Perform DFS to calculate the maximum number of packages that can be installed
        for (String packageName : packages.keySet()) {
            if (!installed.contains(packageName)) {
                dfs(packageName);
            }
        }
        
        // Output the maximum number of packages that can be installed
        System.out.println(installed.size());
    }

    static void dfs(String packageName) {
        if (installed.contains(packageName)) {
            return;
        }

        boolean canInstall = true;
        for (String dependency : packages.get(packageName)) {
            if (!installed.contains(dependency)) {
                canInstall = false;
                dfs(dependency);
            }
        }

        if (canInstall) {
            installed.add(packageName);
        }
    }
}
