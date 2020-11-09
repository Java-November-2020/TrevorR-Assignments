import java.util.Random;

public class BankAccount{
    private String accountNumber = "";
    private Double checking = 0.0;
    private Double savings = 0.0;
    private static int numberAccounts = 0;
    private static double allMoney = 0.0;

    public BankAccount(double accChecking, double accSavings){
        accNumber();
        checking = accChecking;
        savings = accSavings;
        numberAccounts++;
        allMoney = checking + savings;
    }
    private long accNumber() { 
        Random rand= new Random();
        char [] num = new char[10];
        num[0] = (char) (rand.nextInt(9) + '1');
        for(int i=1; i<num.length; i++) {
            num[i] = (char) (rand.nextInt(10) + '0');
        }
        accountNumber = new String(num);
        return Long.parseLong(accountNumber);
    }
    public double getChecking(){
        return checking;
    }
    public double getSavings(){
        return savings;
    }
    public void deposit(double depositChecking, double depositSavings){
        checking = depositChecking + checking;
        savings = depositSavings + savings;
    }
    public void withdraw(double withdrawChecking, double withdrawSavings){
        if(withdrawChecking < checking){
        checking = withdrawChecking - checking;
        }
        if(withdrawSavings < savings){
        savings = withdrawSavings - savings;
        }
    }
    public double getTotal(){
        return allMoney;
    }
    public int getAcc(){
        return numberAccounts;
    }


}