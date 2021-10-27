package midterm;

public class Problem2 {

    public static void main(String[] args) {
        Printer p1;
        // refers to the only object of Database
        p1= Printer.getInstance();
        p1.getConnection();

        Printer p2= Printer.getInstance();
        p2.getConnection();

        Printer p3= Printer.getInstance();
        p3.getConnection();

        /**
         *
         * Through singleton instance.
         * We can only get one instance of one object
         * It means that  p1. p2 .p3 have the same memory address
         *
         */
        System.out.println((p1==p2)&&(p3==p2));
    }
}
