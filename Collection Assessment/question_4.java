import java.util.*;

public class question_4 {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(1);

        for(int num:set){
            System.out.println(num);
        }
    }
}
