package academy.learnprogramming;

public class FiveSeries extends Car{

    private int roadServicesMonth;

    public FiveSeries(int engine, int roadServicesMonth) {
        super("FiveSeries", engine, "Black", 5, 4, "Salon", 4, "Diesel", 6, false);
        this.roadServicesMonth = roadServicesMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
