package test6;

public class lambedatest {
    final static String salutation="hello ";
    public static void main (String args[]){
        GreetingServise greetingServise1=message -> System.out.println(salutation+message);
        greetingServise1.sayMessage("talpen ");
    }
    interface GreetingServise{
        void sayMessage(String message);
    }

}
