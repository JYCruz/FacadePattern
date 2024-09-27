package Java;

public class HomeInterface{
    private HomeService lights;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface(HomeService lights, HomeService tv, HomeService airConditioning2){
        this.lights = lights;
        this.tv = tv;
        this.airConditioning = airConditioning2;

    }

    public void turnOnAll(){
        lights.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll(){
        lights.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
    
