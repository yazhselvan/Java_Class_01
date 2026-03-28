package SingleTonProblemSolution;

/*
You are building a health monitoring system,
design a single class name Health monitor with method called getInstance
that ensure the same instance is returned every time it is called throughout
the application runtime. Inside class, include variable called heartrate and
provide method setheatrate and setheatrate to modify and retrieve its value, respectively
Example
Health monitor.getinstance();
Hm.setHeartrate(5);
Hm= HealthMonitor.getinstance();
Int speed=hm.getHeartrate();
Sample input for custom testing
7 2
Sample output
7 7

 */
public class HealthMonitor {
    private HealthMonitor(){

    }

    private static HealthMonitor instance;

    public static HealthMonitor getInstance(){
        if(instance == null){
            instance = new HealthMonitor();
        }
        return instance;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    private int heartrate;


}

class Main{
    public static void main(String[] args) {
        HealthMonitor hm = HealthMonitor.getInstance();
        hm.setHeartrate(7);

        HealthMonitor hm2 = HealthMonitor.getInstance();
        hm2.setHeartrate(5);


        System.out.println(hm2.getHeartrate() + " " + hm.getHeartrate());
    }
}
