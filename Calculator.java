import java.io.*;
import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num1,num2,result=0;
        String operation;
        System.out.println("Enter a number 1: ");
        num1 = sc.nextDouble();
        System.out.println("Enter a number 2: ");
        num2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter an Operation: ");
        operation = sc.nextLine();
        switch(operation){
            case "+":{
                result = num1 + num2;
                break;
            }
            case "-":{
                result = num1 - num2;
                break;
            }
            case "*":{
                result = num1 * num2;
                break;
            }
            case "/":
            {
                if(num2 == 0){
                    System.out.print("Error : Division by Zero is not allowed");
                }
                else{
                    result = num1 / num2;
                }
                break;
            }
            default:
                System.out.println("Please Enter a valid Operator****");
        }
        System.out.println("Result: " + result);  
    }

}
