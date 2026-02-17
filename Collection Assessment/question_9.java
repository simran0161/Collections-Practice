
import java.util.*;
public class question_9 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Rahul");
        list.add("Amit");
        list.add("Neha");

        Collections.sort(list);

        for(String s:list){
            System.out.print(s+" ");
        }
    }
}
