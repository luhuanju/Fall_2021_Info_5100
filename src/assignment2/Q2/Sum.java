package assignment2.Q2;

public class Sum {

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
     double add(double a, int b){
        return a+(double)b;
    }
    double add(int a, double b){
        return (double)a+b;
    }
}
