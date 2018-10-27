import java.util.Scanner;
package net.missdjoko.callbyvalue;

/**
 * Created by Miss_ on 24.10.2015.
 */
public class CallByValue {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Test ob = new Test();
        System.out.println("Enter A=");
        ob.a=sc.nextInt();
        System.out.println("Enter B=");
        ob.b=sc.nextInt();
        System.out.println("In main: printing A and B");
        System.out.println("do vjzova : " + ob.a +"  " + ob.b);
        
        ob.meth(ob);
        System.out.println("Back to main and printing A and B again");
        System.out.println("posle vjzova : " + ob.a + "  " + ob.b);




    }
}
