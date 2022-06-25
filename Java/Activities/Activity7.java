package activities;

public class Activity7 {

    public static void main(String[] args) {

        MountainBike mb= new MountainBike(3,0,25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applybrake(5);

    }
}

interface BicycleParts{

    public int gears = 0;
    public int speed=0;
}

interface BicycleOperations{

    public void applybrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements  BicycleParts,BicycleOperations{

    public int gears;
    public int CurrentSpeed;
    public Bicycle(int g,int CurrentSpeed){

        gears=g;
        CurrentSpeed=CurrentSpeed;
    }

    @Override
    public void applybrake(int decrement) {

        CurrentSpeed=CurrentSpeed-decrement;
    }

    @Override
    public void speedUp(int increment) {

        CurrentSpeed=CurrentSpeed+increment;
    }

    public String bicycleDesc(){

        return("No of gears are "+gears+"\nSpeed of bicycle is "+CurrentSpeed);
    }
}

class MountainBike extends Bicycle{

    int seatHeight;

    public MountainBike(int g, int CurrentSpeed, int s) {
        super(g, CurrentSpeed);

        seatHeight=s;
    }
    public void setHeight(int newValue){
        seatHeight=newValue;
    }

    public String bicycleDesc(){

        return("No of gears are "+gears+"\nSpeed of bicycle is "+CurrentSpeed+"\nSeat Height value is "+seatHeight);
    }



}
