import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(1000);

        System.out.println("Random Number: " + randomNumber);
    }
}
