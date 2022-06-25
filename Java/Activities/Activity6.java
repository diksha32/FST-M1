package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

       Plane plane = new Plane(10);
        plane.onboard("Dhruv");
        plane.onboard("Paru");
        plane.onboard("Diksha");

        System.out.println("Take off time-"+plane.takeOff());
        System.out.println("List of passangers:"+plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Landed time-"+plane.getLastTimeLanded());
    }
}

class Plane{

    private List<String> passangers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date LastTimeLanded;

    public Plane(int mp){

        this.maxPassengers=mp;
        this.passangers= new ArrayList<>();
    }

    public void onboard(String p){

     this.passangers.add(p);
    }

    public Date takeOff(){

        java.util.Date now = new java.util.Date();

        return now;
    }

    public void land(){

        java.util.Date now = new java.util.Date();
        LastTimeLanded=now;

        passangers.clear();
    }

    public Date getLastTimeLanded(){

        return LastTimeLanded;
    }

    public List getPassengers(){

        return passangers;
    }
}
