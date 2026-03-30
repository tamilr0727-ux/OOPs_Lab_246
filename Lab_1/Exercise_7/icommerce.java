class Product{
    String pdtid;
    String name;
    int price;

    Product(String pdtid,String name,int price){
        this.pdtid=pdtid;
        this.name=name;
        this.price=price;
    }

    void displayPdt(){
        System.out.println(pdtid);
        System.out.println(name);
        System.out.println(price);
    }
}

class Electronics extends Product{
    int wrt;

    Electronics(String pdtid,String name,int price,int wrt){
        super(pdtid,name,price);
        this.wrt=wrt;
    }

    void displayelc(){
        displayPdt();
        System.out.println(wrt);
    }
}

class Clothing extends Product{
    int size;

    Clothing(String pdtid,String name,int price,int size){
        super(pdtid,name,price);
        this.size=size;
    }

    void displayCth(){
        displayPdt();
        System.out.println(size);
    }
}

public class icommerce {
    public static void main(String[] args){
        Electronics e1=new Electronics("101","Mobile",30000,2);
        Clothing c1=new Clothing("102","T-shirt",500,1);
        e1.displayelc();
        c1.displayCth();
    }
}
