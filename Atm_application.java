import java.io.*;
import java.util.*;
import java.lang.*;
class Main
{
    int curpin=1000;
    double balance=100000;
    double withdrawn_amount=0;
    double deposit_amount=0;
    Scanner sc = new Scanner(System.in);
    public void withdraw()
    {
        withdrawn_amount=sc.nextDouble();
        if(balance < withdrawn_amount)
        {
            System.out.println("insufficient");
        }
        else
        {
            balance=balance-withdrawn_amount;
            System.out.println("trascation successful");
        }
    }
    public void deposit()
    {
        deposit_amount=sc.nextDouble();
        balance=balance + deposit_amount;
        System.out.println("trascation successful");
    }
    public void checkbalance()
    {
        System.out.println(balance);
    }
}
class Atmx{
public static void main(String args[])
{
    Main obj=new Main();
    int pin1=1234;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the pin");
    int pin =sc.nextInt();
    boolean a=true;
    if(pin==pin1)
    {
        while(a)
        {
            System.out.println("welcome");
            System.out.println("enter your choice\n 1.withdraw\n 2.deposit\n 3.checkbalance\n");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                        obj.withdraw(); break;
                case 2:obj.deposit(); break;
                case 3:obj.checkbalance(); break;
                default: System.out.println("enter the valid option");
            }
            System.out.println("enter true to continue/false to exit");
            a=sc.nextBoolean();
        }
    }
    else
    {
        System.out.println("invalid pin");
    }
}
}
