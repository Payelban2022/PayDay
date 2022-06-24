package src.main.java;

import java.util.Scanner;

public class PayDay {
    String name;
    float hourlyrate;
    float hourWork;
    float deductionRate;
    double grossPay=0.0;
    double deduction;
    double netPay;
    Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        PayDay payDay= new PayDay();
        payDay.pay();
    }

    public String pay(){



        System.out.print("What is your name? ");
        String name = in.nextLine();

        System.out.print(" What is your hourly rate?");
        hourlyrate=in.nextFloat();

        System.out.print(" What is your hourly work?");
        hourWork=in.nextFloat();

        System.out.print(" What is your deduction?");
        deductionRate=in.nextFloat();

        grossPay=hourWork* hourlyrate;
        deduction=grossPay*deductionRate;
        netPay=grossPay-deduction;

        return ("This is return:" + name+" "+grossPay+" "+ deduction+" "+netPay);

    }
}
