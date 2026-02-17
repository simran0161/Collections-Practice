import java.util.*;

public class question_3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        HashMap<String,Integer>mp=new HashMap<>();
        for(String s:list){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer>entry:mp.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
    }
}
