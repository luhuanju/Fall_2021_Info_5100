package midterm;

public class Printer {

    private Printer(){}
    private static Object object=new Object();
    private static Printer printer=null;

    public static Printer getInstance(){
        if (printer==null){
            synchronized(object){
                printer=new Printer();
            }
        }
        return printer;
    }

    void getConnection(){
        System.out.println(this);
    }
}
