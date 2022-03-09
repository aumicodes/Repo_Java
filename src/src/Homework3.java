package src;

public class Homework3 {
    public static void main(String[] args) {

        //convert C to F
        double cTemp = 20;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(+ cTemp + " degrees C is equal to " + fTemp + " degrees F");

        //convert C to K
        double kTemp = cTemp + 273.15;
        System.out.println(+ cTemp + " degrees C is equal to " + kTemp + " degrees K");

        //convert F to C
        double f1Temp = 70;
        double c1Temp = ((f1Temp - 32) * 5/9);
        System.out.println(+f1Temp + " degrees F is equal to " + c1Temp + "degrees C");

        //convert F to K
        double k1Temp = ((f1Temp-32) * (.556) + 273.15);
        System.out.println(+f1Temp + " degrees F is equal to " + k1Temp + " degrees K");

        //convert K to C
        double k2Temp = 300;
        double c2Temp = k2Temp - 273.15;
        System.out.println(+k2Temp + " degrees K is equal to " + c2Temp + " degrees C");

        //convert K to F
        double f2Temp = (((k2Temp - 273.15)* (1.8))+32);
        System.out.println(+k2Temp + " degrees K is equal to " + f2Temp + " degrees F");
    }
}
