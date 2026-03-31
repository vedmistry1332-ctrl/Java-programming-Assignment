// Demonstration of Inner Classes
//Problem Statement:
//Write a Java program demonstrating member inner class, local inner class, and anonymous inner class.
class OuterClass {

    int x = 10;

    class MemberInner {

        void display() {
            System.out.println("Member Inner Class: Value of x = " + x);
        }
    }

    void showLocalInner() {

        class LocalInner {

            void display() {
                System.out.println("Local Inner Class inside method");
            }
        }

        LocalInner obj = new LocalInner();
        obj.display();
    }
}

public class Program7 {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        OuterClass.MemberInner memberObj = outer.new MemberInner();
        memberObj.display();

        outer.showLocalInner();

        Runnable r = new Runnable() {

            public void run() {
                System.out.println("Anonymous Inner Class executed");
            }
        };

        r.run();
    }
}