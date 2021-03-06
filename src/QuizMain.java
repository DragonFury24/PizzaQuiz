import java.util.*;

public class QuizMain {

    public static void main(String[] args) {

        Scanner keyType = new Scanner(System.in);
        SeafoodType seaFood = new SeafoodType();
        MeatType meat = new MeatType();
        VeggieType veggie = new VeggieType();

        int[] ansChoice = {0, 0, 0, 0}; //Index 0 is not used in order to align to answer choices

        System.out.println("What kind of pizza are you?");
        System.out.println("This quick and easy quiz will reveal the true you!");

        System.out.println();
        System.out.println("What is your name?");
        String name = keyType.nextLine();
        System.out.println("To answer, type in the number corresponding to the answer you want to choose");
        System.out.println("Press enter to continue...");

        try {
            System.in.read();
        } catch (Exception e) {
        }

        System.out.println("You enjoy...");

        for (int i = 0; i < ansChoice.length - 1; i++) {
            System.out.println();
            seaFood.printQuestion();
            meat.printQuestion();
            veggie.printQuestion();
            ansChoice[keyType.nextInt()]++;
        }

        int personalityInt; //0 = EnjoysAllTypes, 1 = SeafoodLover, 2 = MeatLover, 3 = VeggieLover

        if (elementsEqual(ansChoice)) {
            personalityInt = 0;
        } else personalityInt = largestArrayElement(ansChoice);

        System.out.println();
        System.out.println(name + ",");
        switch (personalityInt) { //Output answer depending on personality type
            case 0:
                System.out.println();
                System.out.println("You are in equilibrium with all.");
                System.out.println("A magnificent pizza with every topping imaginable defines you.");
                System.out.println("Nothing will stop you will trudging onward.");
                System.out.println("Everything you desire, you shall have.");
                System.out.println("Your gluttony knows no bounds.");
                break;

            case 1:
                seaFood.printAnswer();
                break;

            case 2:
                meat.printAnswer();
                break;

            case 3:
                veggie.printAnswer();
                break;
        }
    }

    public static int largestArrayElement(int[] integers) {
        int largestElement = 0;
        int largestNumber = 0;
        for (int i = 1; i < integers.length; i++) {
            if (largestNumber < integers[i]) {
                largestNumber = integers[i];
                largestElement = i;
            }
        }
        return largestElement;
    }

    public static boolean elementsEqual(int[] integers) {
        int firstElement = integers[1];
        for (int i = 1; i < integers.length; i++)
            if (integers[i] != firstElement)
                return false;
        return true;
    }
}