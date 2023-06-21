import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            //creaza un obiect din clasa DemoClass
            //DemoClass obiect1 = new DemoClass();
            //DemoClass obiect2 = new DemoClass();
            //System.out.println(obiect1.x);
            //System.out.println(obiect2.x);
            //obiect1.x=6;
           // System.out.println(obiect1.x);

            Human adelina= new Human();
            adelina.email="adelina.suciu99";
            adelina.verify();
            adelina.sendEmail();
            System.out.println(adelina.email);
            Human jon=new Human();
            jon.adress="Test Street 123";
            System.out.println(jon.email);
            System.out.println(jon.adress);

            book book1=new book();
            book book2=new book();
            book1.author="Mihai Eminescu";
            book1.title="Poezii";
            System.out.println(book1.afiseaza());

        }
}
