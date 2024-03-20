package com.globus;

import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

public class PackageInstallation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> dependencies = new HashMap<>();
        Set<String> installed = new HashSet<>();

        while (scanner.hasNext()) {
            String packageName = scanner.next();
            if (packageName.equals("0")) {
                break;
            }

            List<String> dependencyList = new ArrayList<>();

            String dependency = scanner.next();
            while (!dependency.equals("0")) {
                dependencyList.add(dependency);
                dependency = scanner.next();
            }

            dependencies.put(packageName, dependencyList);
        }

        for (String packageName : dependencies.keySet()) {
            if (!installed.contains(packageName)) {
                installPackage(packageName, dependencies, installed);
            }
        }

        int maxInstalled = installed.size();
        System.out.println(maxInstalled);

        scanner.close();
    }

    private static void installPackage(String packageName, Map<String, List<String>> dependencies, Set<String> installed) {
        if (!dependencies.containsKey(packageName)) {
            installed.add(packageName);
            return;
        }

        for (String dependency : dependencies.get(packageName)) {
            if (!installed.contains(dependency)) {
                installPackage(dependency, dependencies, installed);
            }
        }

        installed.add(packageName);
    }
}
