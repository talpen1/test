package test5;

public class EqualsTest {
    public static void main(String[]args)
    {
        Employe alice1=new Employe("Alice Adams ",8500,1987,11,12);
        Employe alice2=alice1;
        Employe alice3=new Employe("Alice Adams ",8500,1987,11,12);
        Employe bob=new Employe("Bob bardson",5000,1989,10,1);
        System.out.println("alice1==alice2:"+(alice1==alice2));
        System.out.println("alice1==alice3:"+(alice1==alice3));

        System.out.println("alice1.equal(alice3):"+alice1.equals(alice3));
        System.out.println("alice1.equals(bob):"+alice1.equals(bob));

        System.out.println("bob.toString:"+bob.toString());

        Manger carl =new Manger("carl Craker",80000.0,1987,12,15);
        Manger boss =new Manger("Carl Craker",80000.0,1987,12,15);
        boss.setBonus(5000);

        System.out.println("boss toStirng:"+boss.toString());
        System.out.println("carl toStirng:"+carl.toString());

        System.out.println("carl.equals(boss):"+carl.equals(boss));
        System.out.println("alice1.hashCode()"+alice1.hashCode());
        System.out.println("alice3.hashCode()"+alice3.hashCode());
        System.out.println("bob.hashCode()"+bob.hashCode());
        System.out.println("boss.hashCode()"+boss.hashCode());







    }
}
