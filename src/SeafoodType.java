import java.util.*;


public class SeafoodType {

    List<String> questions = new ArrayList<String>();

    public SeafoodType(){
        questions.add("1) Swimming in the ocean with fishes");
        questions.add("1) Pouring water over yourself");
        questions.add("1) Jumping into nearby rivers");
    }

    public void printQuestion(){
        int index  = (int)(Math.random() * questions.size());
        System.out.println(questions.get(index));
        questions.remove(index);
    }

    public void printAnswer(){

    }
}


