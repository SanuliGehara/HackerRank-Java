import java.io.*;
import java.util.*;

public class StringFile {

        public static void intro() {

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String: ");
            String A=sc.next();
            System.out.print("Enter another String: ");
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            System.out.println(A.length() + B.length());

            if (A.charAt(0) > B.charAt(0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        }
}
