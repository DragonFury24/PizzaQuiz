import java.util.*;

/**
 * Created by Duy on 8/25/2017.
 */
public class VeggieType {
    private List<String> questions = new ArrayList<String>();

    public VeggieType() {
        questions.add("3) Wrapping yourself in seaweed");
        questions.add("3) Finding shade underneath a tree");
        questions.add("3) Clothing yourself with lettuce");
    }
    public void printQuestion(){ //Choose a random question to output and then remove from questions ArrayList so it doesn't repeat
        int index  = (int)(Math.random() * questions.size());
        System.out.println(questions.get(index));
        questions.remove(index);
    }

    public void printAnswer(){
        System.out.println();
        System.out.println("A piece of art that blends in with the earth itself,");
        System.out.println("the forces of nature command this plate.");
        System.out.println("With every bite, every crunch, roots entangle you,");
        System.out.println("trapping you into the eternal abyss of the world");
    }
}
