
public class Main {

    public static void main(String[] args){
        int numberD ;
        numberD = 12;
        byte by = -128;
        short s = -3_2000;
        numberD = 2_000_000_000;
        long l = 2_000_000_000_000_000_000l;

        float f = 3.4f;
        double d = 6.8;
        char c = 'a';

        boolean bu = true;

        String string = new String("New");

        string.charAt(1);
        c = string.charAt(1);



        Giraffe a = new Giraffe(10,10);
        Giraffe b = new Giraffe();

        System.out.println(b.getColor());

        System.out.println(a.getNeck_length(10));
        System.out.println(a.bDay(10));
        System.out.println(a.poop(1));
        System.out.println(a.eat(1));
    }
}