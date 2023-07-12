// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Vehicle{
    public void start(){
        System.out.println("Vehicle started");
    }
    public void stop(){
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("car started");
    }
    public void stop(){
        System.out.println("car stopped");
    }
}
class Motorcycle extends Vehicle{
    public void start(){
        System.out.println("motorcyle started");
    }
    public void stop(){
        System.out.println("motorcyle stopped");
    }
}

public class Main
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        Car car=new Car();
        car.start();
        car.stop();
        Motorcycle motorcyle=new Motorcycle();
        motorcyle.start();
        motorcyle.stop();
    }
}

