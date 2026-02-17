import java.util.*;
public class question_1 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("Rahul");
        set.add("Amit");
        set.add("Neha");
        set.add("Rahul");

        for(String s:set){
            System.out.println(s);
        }
    }
}
