// Victor Pacheco, Tri 2, Period 3
package test;
// importing scanner
import java.util.Scanner;
public class NumberSystemConversion {
    public static void main(String[] args) {
    	// init scanner object
        Scanner sc = new Scanner(System.in);
        
    	// init vars
    	int dec, binVal;
        String bin = "";
        
        // prompt user for decimal (dec)
        System.out.print("Enter decimal: ");
        dec = sc.nextInt();
        sc.close();
        // performing calculations for binary number (bin)
        while(dec > 0) {
            binVal = dec % 2;
            bin = binVal + bin;
            dec = dec / 2;
        }
        
        // printing binary number (bin) to user
        System.out.println("Binary number:" + bin);
    }
}