interface shape{
    void area();
}

class circle implements shape{
    double r;

    circle(int r){
        this.r=r;
    }
    public void area(){
        double area=3.14*r*r;
        System.out.println("Area of Circle"+area);
    }
}

class rect implements shape{
    int l;
    int b;

    rect(int l,int b){
        this.l=l;
        this.b=b;
    }
    
    public void area(){
        int area=l*b;
        System.out.println("Area of Rectangle"+area);
    }
}

public class fshape {
    public static void main(String[] args){

        circle c1=new circle(4);
        c1.area();

        rect r1=new rect(2,3);
        r1.area();
    }
}
