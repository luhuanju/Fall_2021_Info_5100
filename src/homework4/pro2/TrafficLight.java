package homework4.pro2;

public class TrafficLight {
    boolean isGreen;
    public TrafficLight() {
        this.isGreen = true;
    }

    public void carArrived(
            int carId,
            int roadId,
            int direction,
            Runnable turnGreen,
            Runnable crossCar
    ) {
        synchronized(this){
            if(roadId==1){
                if(!this.isGreen){
                    this.isGreen = true;
                    turnGreen.run();
                }
            }else{
                if(this.isGreen){
                    this.isGreen = false;
                    turnGreen.run();
                }
            }
            crossCar.run();
        }
    }
}
