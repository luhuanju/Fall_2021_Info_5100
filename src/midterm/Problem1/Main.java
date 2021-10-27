package midterm.Problem1;

public class Main {
    public static void main(String[] args) {

        //Test case for Fiction;
        //This is for Title name;
        Fiction fiction=new Fiction("Fiction Anna", 10, "2020");
        System.out.println(fiction.description());
        fiction.setBorrowDate(2);
        fiction.setReturnDate(5);
        System.out.println(fiction.isAvailable(4));
        System.out.println(fiction.isAvailable(6));

        //Test case for NonFiction;
        //This is for Title Name;
        NonFiction nonFiction=new NonFiction("NonFiction Big Bag", 10, "2020");
        System.out.println(nonFiction.description());
        nonFiction.setBorrowDate(2);
        nonFiction.setReturnDate(5);
        System.out.println(fiction.isAvailable(4));
        System.out.println(fiction.isAvailable(6));



    }
}
