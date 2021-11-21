package homework5.pro1;

public class SportsCar implements Icar{


    private Icar car;
    SportsCar(Icar car){
        this.car=car;
    }
    @Override
    public void assemble() {
        this.car.assemble();
        System.out.println("Adding features of Sports Car.  ");
    }
}
