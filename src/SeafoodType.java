import java.util.*;


public class SeafoodType {

    private List<String> questions = new ArrayList<String>();

    public SeafoodType(){
        questions.add("1) Swimming in the ocean with fishes");
        questions.add("1) Pouring water over yourself");
        questions.add("1) Jumping into nearby rivers");
    }

    public void printQuestion(){ //Choose a random question to output and then remove from questions ArrayList so it doesn't repeat
        int index  = (int)(Math.random() * questions.size());
        System.out.println(questions.get(index));
        questions.remove(index);
    }

    public void printAnswer(){
        System.out.println();
        System.out.println("You go with the flow");
        System.out.println("and the flow goes with you");
        System.out.println("You're a lean thin crust topped");
        System.out.println("with anchovies, shrimp, salmon.");
        System.out.println("With every bite, the sounds of the waves");
        System.out.println("crash onto the tip of the tongue.");
    }
}


