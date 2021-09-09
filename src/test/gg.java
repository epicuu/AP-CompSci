package test;
import java.util.Scanner;
public class gg {
	public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter any integer number: ");
        num = sc.nextInt();
        sc.close();
        /*to store maximum 32 digits of a number*/
        String hexVal="";
        int dig;    // to store digits
        while(num > 0){
            dig= num%16;
            switch(dig)
            {
                case 15:
                    hexVal+="F"; break;
                case 14:
                    hexVal+="E"; break;
                case 13:
                    hexVal+="D"; break;
                case 12:
                    hexVal+="C"; break;
                case 11:
                    hexVal+="B"; break;
                case 10:
                    hexVal+="A"; break;
                default:
                    hexVal+=Integer.toString(dig);          
            }
            num = num/16;
        }
     
            System.out.print(hexVal);
	}
}
