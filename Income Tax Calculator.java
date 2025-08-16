import java.util.*;

public class JavaBasics{
    // income tax calculator
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax ;

        if (income < 500000){
            tax = 0;
        }
        else if (income >=500000 && income < 1000000){
                tax = (int)(income * 0.2);  //tax is 20% if salary from 5L to less than 10L
            }
            else{
                tax = (int)(income * 0.3);  //tax is 30% if salary is 10Lakh or above
            }
            System.out.println("Your total tax of your salary is :" +tax);
        }
    }
