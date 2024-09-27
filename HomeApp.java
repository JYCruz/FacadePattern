package Java;

public class HomeApp{
    public static void main(String[] args){
        HomeService lights = new Lights();
        HomeService tv = new Tv();
        HomeService airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(lights, tv, airConditioning);

        System.out.println("Turn on all---------------");
        homeInterface.turnOnAll();
        System.out.println("");
        System.out.println("Turn off all---------------");
        homeInterface.turnOffAll();

    }
}
