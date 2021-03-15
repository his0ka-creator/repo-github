package JavaLevel1;

public class Practice01 {
    public static void main(String[] args){
        /*
            Practice01 a = new Practice01();
            System.out.println(a.returnFloat(12,34,17,47));
            System.out.println("Sum Two numbers");
            System.out.println(a.sumTwoNumbers(12,15)); //false
            System.out.println(a.sumTwoNumbers(3,4)); //false
            System.out.println(a.sumTwoNumbers(4,6)); //true
            System.out.println(a.sumTwoNumbers(7,8)); //true
            System.out.println(a.sumTwoNumbers(9,11)); //true
            String b = a.helloName("Alfred");
            System.out.println(b);
            System.out.println("Is year leap?");
            System.out.println(a.isLeap(2000)); //true
            System.out.println(a.isLeap(1700)); //false
            System.out.println(a.isLeap(2016)); //true
            System.out.println(a.isLeap(1993)); // false
        */
    }

    float returnFloat (int a, int b, int c, int d) {
        float  result;
        result = a * (b + (1.0f * c / d));
        return result;
    }

    boolean sumTwoNumbers (int a, int b) {
        int sum;
        sum = a + b;
        if (sum >= 10 && sum <=20 ) {
            return true;
        } else {
            return false;
        }
    }

    String helloName (String name){
        System.out.println("Привет, " + name + "!");
        return "Привет, " + name + "!";
    }

    boolean isLeap (int year) {
        if (year%400==0) {
            return true;
        } else if (year%100==0) {
            return false;
        } else if (year%4==0) {
            return true;
        } else
            return false;
    }
}
