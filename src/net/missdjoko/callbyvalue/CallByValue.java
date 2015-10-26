package net.missdjoko.callbyvalue;

/**
 * Created by Miss_ on 24.10.2015.
 */
public class CallByValue {
    public static void main(String [] args){
        Test ob = new Test();
        ob.a=15;
        ob.b=20;

        System.out.println("do vjzova : " + ob.a +"  " + ob.b);

        ob.meth(ob);

        System.out.println("posle vjzova : " + ob.a + "  " + ob.b);




    }
}
