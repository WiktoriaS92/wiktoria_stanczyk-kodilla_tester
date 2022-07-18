import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0;
        int max = 0;
        int min = 30;

        while (sum < 300) {
            int randomNumber = random.nextInt(0, 30);
            sum += randomNumber;

            if (max < randomNumber) {
                max = randomNumber;
            }

            if (min > randomNumber) {
                min = randomNumber;
            }
        }

    }
}
