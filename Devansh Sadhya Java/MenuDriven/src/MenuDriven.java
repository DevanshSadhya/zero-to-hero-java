import java.util.*;

//we have to create menudriven for atm machine
class ATM{
    int amount;
    ATM(){
        int amount=0;
    }
    void deposit(int value){
        amount=amount+value;
        System.out.println("Deposited "+amount);
    }
    void withdraw(int value){
        amount=amount-value;
        System.out.println("Withdrawing "+amount);
    }
    void operations(){
        System.out.println("1. Deposit\n2. Withdraw\n");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:deposit(amount);break;
            case 2:withdraw(amount);break;
        }
    }
}
class MenuDriven{
    public static void main(String[] args){
        ATM obj=new ATM();
        obj.operations();
        obj.deposit(10);
    }
}