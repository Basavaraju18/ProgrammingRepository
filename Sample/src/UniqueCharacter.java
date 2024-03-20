import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // Input
        System.out.println("Enter the String");
        String s1 = ip.nextLine();
        char[] c = s1.toCharArray();
        String rs = "";
        int count=0;

        // Check for unique characters
        for (int i = 0; i < c.length; i++) {
            boolean isUnique = true;

            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    // If a matching character is found, set isUnique to false and break
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, append it to the result string
            if (isUnique) {
                rs = rs + c[i];
            	count++;
            }
        }

        // Output
        System.out.println("Unique characters: "+rs+  "  total "  + count);
    }
}
