package homework3.pro1;

public class Happy extends Moody{

    @Override
    String getMpod() {
        return "I feel happy Today";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
