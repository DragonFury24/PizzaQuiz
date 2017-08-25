import java.util.*;

/**
 * Created by Duy on 8/25/2017.
 */
public class MeatType {
    private List<String> questions = new ArrayList<String>();

    public MeatType() {
        questions.add("2) Burying yourself in sand");
        questions.add("2) Spreading mud on yourself");
        questions.add("2) Befriending wild animals");
    }

    public void printQuestion(){
        int index  = (int)(Math.random() * questions.size());
        System.out.println(questions.get(index));
        questions.remove(index);
    }

    public void printAnswer(){
        
    }
}
