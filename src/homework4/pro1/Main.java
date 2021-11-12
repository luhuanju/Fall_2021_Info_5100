package homework4.pro1;

public class Main {


    public static void main(String[] args) {


        ThreadSafeLinkedList<Integer> list = new ThreadSafeLinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.addAtPosition(i, i);
        }

        int size = list.size();
        System.out.println("Size " + size);
        System.out.println("First element " + list.getFirst());
        System.out.println("Last element " + list.getLast());


        list.removeAtPosition(0,list.getFirst());

        size = list.size();
        System.out.println("Size " + size);
        System.out.println("First element " + list.getFirst());
        System.out.println("Last element " + list.getLast());


        list.removeAtPosition(list.size()-1,list.getLast());

        size = list.size();
        System.out.println("Size " + size);
        System.out.println("First element " + list.getFirst());
        System.out.println("Last element " + list.getLast());
    }




}
