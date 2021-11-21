package homework5.pro1;

public class LuxuryCar implements Icar{

    Icar icar;
    public LuxuryCar(Icar icar) {
        this.icar=icar;
    }

    @Override
    public void assemble() {
        this.icar.assemble();
        System.out.println("Adding features of LuxuryCar Car.  ");
    }
}
