class vehicle{
    int value;

    vehicle(int value){
        this.value=value;
    }

    double Insurance(){
        return 0;
    }
}

class Car extends vehicle{
    Car(int value){
        super(value);
    }

    @Override
    double Insurance(){
        return (value*0.05);
    }
}

class Bike extends vehicle{
    Bike(int value){
        super(value);
    }

    @Override
    double Insurance(){
        return (value*0.02);
    }
}

public class iVehicle {
    public static void main(String[] args){
        vehicle v;

        v=new Car(400000);
        System.out.println(v.Insurance());

        v=new Bike(10000);
        System.out.println(v.Insurance());
    }
}
