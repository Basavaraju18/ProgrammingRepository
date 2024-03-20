package com.mrk.innoapps;

	
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public final class Hasmap {

	    public static void main(String[] args) {
	        Map<String, Integer> hashMap = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1. Add Element");
	            System.out.println("2. Display Elements");
	            System.out.println("3. Remove Element");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter key: ");
	                    String key = scanner.nextLine();
	                    System.out.print("Enter value: ");
	                    int value = scanner.nextInt();
	                    hashMap.put(key, value);
	                    System.out.println("Element added successfully!");
	                    break;
	                case 2:
	                    System.out.println("HashMap Elements:");
	                    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	                        System.out.println(entry.getKey() + ": " + entry.getValue());
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter key to remove: ");
	                    String keyToRemove = scanner.nextLine();
	                    if (hashMap.containsKey(keyToRemove)) {
	                        hashMap.remove(keyToRemove);
	                        System.out.println("Element removed successfully!");
	                    } else {
	                        System.out.println("Key not found in the HashMap.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting program. Goodbye!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }
	}
