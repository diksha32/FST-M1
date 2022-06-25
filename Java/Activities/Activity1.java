package activities;

public class Activity1 {

    public static void main(String[] args) {

        Car carName = new Car(4,4);
        carName.color="Black";
        carName.make=2014;
        carName.transmission="Manual";
        carName.displayCharacteristics();
        carName.accelarate();
        carName.brake();

    }
}

class Car{

    String color, transmission;
    int make,tyres,doors;

    public Car(int t, int d){

        tyres=t;
        doors=d;
    }

    public void displayCharacteristics(){

        System.out.println("color="+color+",transmission="+transmission+",make="+make
        +",tyres="+tyres+",doors="+doors);
    }

    public void accelarate(){

        System.out.println("Car is moving forward");
    }

    public void brake(){

        System.out.println("Car has stopped");
    }
}
