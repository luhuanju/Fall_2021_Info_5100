package homework3.pro1;

public class Sad extends Moody{

    @Override
    String getMpod() {
        return "I feel sad Today";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("waah’  ‘boo hoo’  ‘weep’ ‘sob ‘");
    }

    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}
