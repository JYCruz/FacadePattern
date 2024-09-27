package Java;

public class HomeApp{
    public static void main(String[] args){
        HomeService lights = new Lights();
        HomeService tv = new Tv();
        HomeService airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(lights, tv, airConditioning);

        System.out.println("--------------------------------");
        System.out.println("TURN ON ALL!\n");
        homeInterface.turnOnAll();
        System.out.println("--------------------------------");
        System.out.println("TURN OFF ALL!\n");
        homeInterface.turnOffAll();
        System.out.println("--------------------------------");

    }
}
