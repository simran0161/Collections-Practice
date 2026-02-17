import java.util.*;
public class question_8 {
    public static void main(String[] args) {
        Map<Integer,String>mp=new HashMap<>();
        mp.put(101,"Rahul");
        mp.put(102,"Amit");
        mp.put(103,"Neha");

        for(Map.Entry<Integer,String>entry:mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
