package homework3;

import homework3.pro1.Happy;
import homework3.pro1.Psychiatrist;
import homework3.pro1.Sad;

public class MainProblem1 {

    public static void main(String[] args) {

        Psychiatrist psychiatrist=new Psychiatrist();

        Happy happy=new Happy();
        Sad sad=new Sad();

        System.out.println("How are you feeling today?");
        psychiatrist.observe(happy);
        System.out.println("Observation:"+psychiatrist.toString(happy));

        System.out.println("How are you feeling today?");
        psychiatrist.observe(sad);
        System.out.println("Observation:"+psychiatrist.toString(happy));

    }

}
