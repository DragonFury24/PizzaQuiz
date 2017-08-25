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
    public void printQuestion(){
        int index  = (int)(Math.random() * questions.size());
        System.out.println(questions.get(index));
        questions.remove(index);
    }

    public void printAnswer(){

    }
}
