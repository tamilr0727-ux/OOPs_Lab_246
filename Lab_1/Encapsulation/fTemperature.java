class Temperature{
    private double temp;

    Temperature(double temp){
        this.temp=temp;
    }

    double getCelsius(){
        return temp;
    }

    double getFah(){
        return ((temp*9/5)+32);
    }
}

public class fTemperature {
    public static void main(String[] args){
        Temperature t1=new Temperature(25);

        System.out.println(t1.getCelsius());
        System.out.println(t1.getFah());
    }
}