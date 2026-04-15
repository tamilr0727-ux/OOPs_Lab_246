class Printer{
    void display(String text) {
        System.out.println("String: " + text);
    }
    void display(int num) {
        System.out.println("Integer: " + num);
    }
    void display(String text, int num) {
        System.out.println("String + Integer: " + text + " " + num);
    }
    void display(String text1, String text2) {
        System.out.println("Two Strings: " + text1 + " " + text2);
    }
}

public class iPrint {
    public static void main(String[] args){
        Printer obj = new Printer();
        obj.display("Hello");
        obj.display(100);
        obj.display("Age:", 21);
    }
}
