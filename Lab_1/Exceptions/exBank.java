class InsufficientBalance extends Exception{
    InsufficientBalance (String msg){
        super(msg);
    }
}

class Bank{
    private double balance;

    Bank(double balance){
        this.balance=balance;
    }

    void withdraw(double amt) throws InsufficientBalance{
        if (amt>balance){
            throw new InsufficientBalance("Amount Exceeds Balance.");
        }else{
            balance-=amt;
            System.out.println("Amount Withdrawn:"+amt);
        }
    }
}

class exBank{
    public static void main(String[] args){
        Bank b1=new Bank(2000);

        try{
            b1.withdraw(3000);
        }catch (InsufficientBalance e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}