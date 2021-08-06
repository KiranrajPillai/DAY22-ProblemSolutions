
import java.util.Scanner;

public class AddressBook {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] addressbooks = new String[100][8];

        addressbooks[0][0] = "First Name";
        addressbooks[0][1] = "last Name";
        addressbooks[0][2] = "Mobile Number";
        addressbooks[0][3] = "Address";
        addressbooks[0][4] = "City";
        addressbooks[0][5] = "Zip";
        addressbooks[0][6] = "County";
        addressbooks[0][7] = "Email-ID";


        addressbooks[1][0] = "Kiranraj";
        addressbooks[1][1] = "Pillai";
        addressbooks[1][2] = "9167685010";
        addressbooks[1][3] = "Sakinaka, Andheri";
        addressbooks[1][4] = "Mumbai";
        addressbooks[1][5] = "400072";
        addressbooks[1][6] = "India";
        addressbooks[1][7] = "kiranrajpillai1997@gmail.com";

        addressbooks[2][0] = "Virat";
        addressbooks[2][1] = "Kohli";
        addressbooks[2][2] = "9004174132";
        addressbooks[2][3] = "Gurgoan, Worli";
        addressbooks[2][4] = "Mumbai";
        addressbooks[2][5] = "400050";
        addressbooks[2][6] = "India";
        addressbooks[2][7] = "viratkohli18@gmail.com";

        System.out.print("Welcome to my Address book!");

        {
            System.out.println("\n" + addressbooks[1][0] +
                    "\n" + addressbooks[1][1] + "\n" + addressbooks[1][2] +
                    "\n" + addressbooks[1][3] +
                    "\n" + addressbooks[1][4] + "\n" + addressbooks[1][5] + "\n" + addressbooks[1][6] + "\n" + addressbooks[1][7]);

        }
        {
            System.out.println("\n" + addressbooks[2][0] +
                    "\n" + addressbooks[2][1] + "\n" + addressbooks[2][2] +
                    "\n" + addressbooks[2][3] +
                    "\n" + addressbooks[2][4] + "\n" + addressbooks[2][5] + "\n" + addressbooks[2][6] + "\n" + addressbooks[2][7]);

        }
    }
    
}