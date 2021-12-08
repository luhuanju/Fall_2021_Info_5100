package homework6;

import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birthday year\n");
        while (!sc.hasNextInt()) {
            System.out.print("Please input year using format yyyy\n");
            System.out.print("i.e.  1992 2003 ect.\n");
            sc.next();
        }
        while(sc.hasNextInt()){
            int age = sc.nextInt();
            if (2021-age<16){
                throw new Exception("The age of the applicant is   "+(2021-age)+"    which is too early to apply for a driving license");
            }
        }
    }
}
