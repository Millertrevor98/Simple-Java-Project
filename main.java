import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        secondary s=new secondary();
        s.name= "Trawww";
        s.age= 93;
        s.year= 1923;


        Scanner person=new Scanner(System.in);
        int r=0;
     System.out.println("What is your name?");
       String a= person.nextLine();
       System.out.println("Date of birth?");
       int b= person.nextInt();
       System.out.println("what is your digit?");
        float c= person.nextFloat();
       //responses
        System.out.println("Your name is "+a);
        System.out.println("Your date of birth is "+b);
        System.out.println("Your digit is "+c);
        System.out.println("Hey there "+a+" your date of birth is "+b+" and your digit is "+c);








    }
}
