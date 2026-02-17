
import java.util.*;

public class question_6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(45);
        list.add(67);
        list.add(89);
        list.add(34);

        Collections.sort(list);
        System.out.println("Highest Score: "+list.get(list.size()-1));
    }
}
