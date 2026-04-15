import java.util.ArrayList;

class BankAccount{
    private String AccName;
    private String psw;
    private double balance;
    private ArrayList<String> History;

    public BankAccount(String name,String psw){
        this.AccName=name;
        this.psw=psw;
        this.balance=0.0;
        this.History= new ArrayList<>();
    }

    private boolean authenticate(String inputpsw){
        return this.psw.equals(inputpsw);
    }

    public double getbalance(String psw){
        if (authenticate(psw)){
            return balance;
        }else{
            System.out.println("Access Dennied");
            return -1;
        }
    }

    public void withdraw(double amt,String psw){
        if(!authenticate(psw)){
            System.out.println("Access Denied!");
            return;
        }

        if(amt>0 && amt<=balance){
            balance-=amt;
            History.add("Withdrawn:"+amt);
        }else{
            System.out.println("Insufficient Balance!");
        }
    }

    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            History.add("Deposited:"+amt);
        }else{
            System.out.println("Inappropriate Amount!!");
        }
    }

    public void transfer(BankAccount target,double amt,String psw){
        if(!authenticate(psw)){
            System.out.println("Access Denied");
            return;
        }

        if (amt>0 && amt<=balance){
            this.balance-=amt;
            target.balance+=amt;

            this.History.add("Transfered:"+amt);
            target.History.add("Received:"+amt);

            System.out.println("Transaction Sucessfull!!!");
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void trnX(String inputpsw){
        if(!authenticate(inputpsw)){
            System.out.println("Access Denied!");
            return;
        }

        System.out.println("Transaction History!!");
        for (String t:History){
            System.out.println(t);
        }
    }
}

public class eAccount{
    public static void main(String[] args){

        BankAccount acc1=new BankAccount("Alice","1234");
        BankAccount acc2=new BankAccount("Rahul","5678");

        acc1.deposit(5000);
        acc1.withdraw(1000,"1234");

        acc1.transfer(acc2,2000,"1234");

        acc1.getbalance("3455");

        acc1.trnX("1234");
        acc2.trnX("5678");
    }
}