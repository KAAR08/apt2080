import java.util.Random;

public class Overriding {
    public static void main(String[] args) throws Exception {
        Random dice = new Random();
        int roll1 =dice.nextInt();
        int roll2 =dice.nextInt(101);
        int roll3 = dice.nextInt(50,101);
        System.out.println("First roll: " + roll1);
        System.out.println("Second roll: " + roll2);
        System.out.println("Third roll: " + roll3);

        //My examples
        int roll4 = dice.nextInt(50, 101);
        System.out.println("Fourth roll: " + roll4);
        int roll5 = dice.nextInt(50, 101);
        System.out.println("Fifth roll: " + roll5);


    }
}
