import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        
        //Find and print the sum of three integers entered by the user
        
         Scanner sn = new Scanner(System.in);
         int x = 0;
         
         x += sn.nextInt();
         x += sn.nextInt();
         x += sn.nextInt();
         
         sn.close();
         System.out.println(x);
        //Remember to close the Scanner
        
    }
}
