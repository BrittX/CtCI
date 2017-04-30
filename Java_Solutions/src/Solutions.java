import java.util.*;

/**
 * Created by Brittany on 4/29/2017.
 */

public class Solutions {
    /*
    Function to check if two strings are one edit away from each other
     */
    private boolean oneAway(String s1, String s2) {
        int differences = 0;
        if(Math.abs(s1.length() -s2.length()) > 1) return false;
        if (s1.length() == s2.length()) {
            for(int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    differences++;
                    if (differences > 1) return false;
                }
            }
        }
        //Check if we need to insert a character
        if(s1.length()+1 == s2.length()) {
            for(int i = 0; i < s1.length(); i++) {
                //Check if we can find that particular letter in s2
                if(s2.indexOf(s1.charAt(i)) == -1) {
                    return false;
                }
            }
        }
        //Check if we need to remove a character
        if(s1.length()-1 == s2.length()) {
            for(int i = 0; i < s1.length(); i++) {
                //make sure there's only one change between s1 and s2
                if(s1.indexOf(s2.charAt(i)) == -1) return false;
            }
        }
        return true;
    }

    /*
    Function to see if characters in a given string are unique
     */
    private boolean isUnique(String s1) {
        List<Character> seen = new ArrayList<Character>();
        for(int i = 0; i < s1.length(); i++) {
            if(seen.contains(s1.charAt(i))) return false;
            else seen.add(s1.charAt(i));
        }
        return true;
    }

    /*
    Function to check if one is a permutation of the other
     */
    private boolean isPermutation(String s1, String s2) {
        //Check if strings are of same length or one is bigger than other
        if (s1.length() != s2.length()) return false;



        return true;
        
    }

    /*
    Function to return a zeroed out matrix
     */
    private int[][] zeroMatrix(int[][] testM) {
        boolean[] rows = new boolean[testM.length];
        boolean[] cols = new boolean[testM[0].length];

        //loop through searching for zeroes
        for(int i = 0; i < testM.length; i++) {
            for(int j = 0; j < testM[0].length; j++) {
                if(testM[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        //Have rows/cols that need to be zeroed out
        for(int i = 0; i < testM.length; i++) {
            if(rows[i]) { //that particular row needs to get zeroed
                for (int j = 0; j < testM[0].length; j++) { //zero out everything in that row/col
                    testM[i][j] = 0;
                }
            }
        }
        for(int j = 0; j > testM[0].length; j++) {
            if (cols[j]) { //that particular col needs to be zeroed
                for (int k = 0; k < testM[0].length; k++) {
                    testM[k][j] = 0; //zero out everything in that row/col
                }
            }
        }
        return testM;
    }


    public static void main(String[] args) {
        String check = "Please enter a string to check";
        boolean quit = false;
        Solutions s = new Solutions();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my solutions for CtCI Chapter 1");
        while(!quit) {
            System.out.println("Please choose from the following menu options:");
            System.out.println("1. Is Unique" +
                    "\n2. Check Permutation" +
                    "\n3. URLify" +
                    "\n4. Palindrome Permutation" +
                    "\n5. One Away" +
                    "\n6. String Compression" +
                    "\n7. Rotate Matrix" +
                    "\n8. Zero Matrix" +
                    "\n9. String Rotation");
            System.out.print("\n>>> ");
            int option = scan.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Lets see if the string is unique");
                    System.out.println(check);
                    String str = scan.next();
                    boolean ans1 = s.isUnique(str);
                    System.out.println(ans1);
                    break;
                case 2:
                    System.out.println("Do we have a permutation?");
                    System.out.println(check);
                    String str1 = scan.next();
                    System.out.println("Now enter another one to check");
                    String str2 = scan.next();
                    break;
                case 5:
                    System.out.println("Are the two strings one away from each other?");
                    System.out.println(check);
                    String one1 = scan.next();
                    String one2 = scan.next();
                    boolean ans = s.oneAway(one1, one2);
                    System.out.println(ans);
                case 8:
                    System.out.println("Lets zero out a matrix");
                    System.out.println("Choose the size of the array");
            }
        }

    }
}
