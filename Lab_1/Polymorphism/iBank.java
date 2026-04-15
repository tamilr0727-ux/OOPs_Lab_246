class Account{
    int accno;
    double balance;

    Account(int a,double b){
        accno=a;
        balance=b;
    }

    void deposit(double amt){
        balance+=amt;
    }

    void withdraw(double amt){
        if (amt>balance){
            System.out.println("Insufficient Balance.");
        }
        else{
            balance-=amt;
            System.out.println("Amount Withdrawn:"+amt);
        }

    }
    
    void displayBalance(){
        System.out.println("Balance:"+balance);
    }
}

class Savingacc extends Account{
    double interest;

    Savingacc(int accno,double balance,double interest){
        super(accno,balance);
        this.interest=interest;
    }

    void Interest(){
        double i=(interest*balance)/100;
        balance+=i;
        System.out.println("Interest Added:"+i);
    }

    @Override
    void withdraw(double amt){
        if (amt>balance){
            System.out.println("Insufficient Balance.");
        }
        else{
            balance-=amt;
            System.out.println("Withdrawn from Savings:"+amt);
        }
    }
}

class Currentacc extends Account{
    int limit;

    Currentacc(int accno,double balance,int limit){
        super(accno,balance);
        this.limit=limit;
    }

    @Override
    void withdraw(double amt){
        if (amt<=balance+limit){
            balance-=amt;
            System.out.println("Amount Withdrawn:"+amt);
        }else{
            System.out.println("Amount Exceeded Overdraft Limit.");
        }
    }
}

public class iBank{
        public static void main(String[] args){
        System.out.println("--Savings Account--");
        Savingacc sa=new Savingacc(101,10000,5);
        sa.displayBalance();
        sa.Interest();
        sa.withdraw(4000);
        sa.displayBalance();
    }
}