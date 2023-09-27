package simpleBank;

public class Bank {
    String accountName  ;
    int accountNumber;
    double balance  ;

    public Bank(String accountName , int accountNumber, double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance =  balance;


    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        if(amount  < 1){
            System.out.println("amount is less then 0");
        }else{
            this.balance +=  amount;

        }
    }
    public void withDraw(double amount){
        if(amount > this.balance){
            System.out.println("balance is not sufficent");

        }
        else{
            this.balance -= amount;
        }

    }
    public void getAccountInfo(){
        System.out.println("account Inofrmation:");
        System.out.println("account Name : "+this.accountName);
        System.out.println("account Number :"+this.accountNumber);

        System.out.println("account Balance "+this.balance);

    }

    public static void main(String[] args) {

        Bank  b = new Bank("amir ",1010101,10);
        b.getAccountInfo();
        b.withDraw(300);
        b.withDraw(10);
        b.getAccountInfo();
        b.deposit(200);
        b.getAccountInfo();
    }

}
