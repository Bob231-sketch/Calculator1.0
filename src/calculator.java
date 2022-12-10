import java.util.*;

public class calculator {
    public static void main(String[] args) {

        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {

            System.out.println("Enter a number");

            System.out.println("0.Exit");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");

            double User = sc.nextInt();
            if (User == 0) {
                break;
            }
            if(User>4){
                System.out.println("you will be directed to the menu");
                continue;
            }
            if(User<0){
                System.out.println("you will be directed to the menu");
                continue;
            }

            System.out.println("You have enter the number" + User);

            System.out.println("Enter first number");
            double n1 = sc.nextDouble();

            System.out.println("Enter second number");
            double n2 = sc.nextDouble();

            if(User==1){
                System.out.println(add(n1,n2));
            }

            if(User==2){
                System.out.println(subtract(n1,n2));
            }
           if(User==3){
               System.out.println(multiply(n1,n2));
           }
          if(User==4){
              System.out.println(divide(n1,n2));
              if(n2==0){
                  System.out.println("Undefined");
              }

          }

          }

        }


    public static double add(double num1, double num2) {
        return (num1 + num2);
    }

    public static double subtract(double num1,double num2) {
        return (num1-num2);
    }

    public static double multiply(double num1,double num2) {
        return (num1*num2);
    }

    public static double divide(double num1,double num2) {
        return (num1/num2);
    }
}





