package homework3.pro1;

public class Psychiatrist {

    public void examine(Moody moody){

    }
    //a moodyObject is observed to either laugh or cry
    public void observe( Moody moody){
        System.out.println(moody.getMpod());
        moody.ExpressFeelings();
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(Moody moody){
        return moody.toString();
    }
}
