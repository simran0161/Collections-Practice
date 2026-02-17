import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class question_10 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        Map<Integer,Integer>mp=new HashMap<>();

        for(int a:list){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }

        System.out.print("Duplicates: ");
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
        
    }
}
