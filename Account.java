import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Account {
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 0.07;
    private Date date;

    Account() {

    }

    Account(int a, double b, double c) {

        id = a;
        balance = b;
        annualInterestRate = c;

    }

    public void getdata() {

        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        balance = sc.nextDouble();
        annualInterestRate = sc.nextDouble();

    }

    public void putdata() {
        System.out.println(id);
        System.out.println(balance);
        System.out.println(annualInterestRate);
    }

    public void getdate() {
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
        Date newdate = new Date();
        System.out.println(dateform.format(newdate));

    }

    public double getMonthlyIntrestRate() {
        double l;
        l = balance * (annualInterestRate / 12);
        System.out.println(l);
        return l;
    }

    public void Withdraw() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        balance -= l;
        System.out.println(balance);

    }

    public void Deposit() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        balance += l;
        System.out.println(balance);

    }

    public static void main(String[] args) {

        Account acc = new Account();

        acc.getdata();
        acc.putdata();
        acc.getdate();
        acc.getMonthlyIntrestRate();
        acc.Deposit();
        acc.Withdraw();
        System.out.println("he");
        acc.putdata();

    }

}
