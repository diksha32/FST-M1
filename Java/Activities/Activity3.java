package activities;

public class Activity3 {

    public static void main(String[] args) {

        double ageInSec=1000000000;
        double ageForMercury=0.2408467,ageForVenus=0.61519726,ageForEarth=31557600,ageForMars=1.8808158,
                ageForJupiter=11.862615,ageForSaturn=29.447498,ageForUranus=84.016846,ageForNeptune=164.79132;

        ageForEarth=Math.ceil(ageInSec/ageForEarth);
        ageForMercury=Math.ceil(ageInSec/(ageForEarth*ageForMercury));
        ageForVenus=Math.ceil(ageInSec/(ageForEarth*ageForVenus));
        ageForMars=Math.ceil(ageInSec/(ageForEarth*ageForMars));
        ageForJupiter=Math.ceil(ageInSec/(ageForEarth*ageForJupiter));
        ageForSaturn=Math.ceil(ageInSec/(ageForEarth*ageForSaturn));
        ageForUranus=Math.ceil(ageInSec/(ageForEarth*ageForUranus));
        ageForNeptune=Math.ceil(ageInSec/(ageForEarth*ageForNeptune));

        System.out.println(ageForMercury);
        System.out.println(ageForVenus);
        System.out.println(ageForEarth);
        System.out.println(ageForMars);
        System.out.println(ageForJupiter);
        System.out.println(ageForSaturn);
        System.out.println(ageForUranus);
        System.out.println(ageForNeptune);





    }
}
