import java.util.*;
public class question_7 {
    public static void main(String[] args) {
        Queue<String>queue=new LinkedList<>();
        queue.add("Patient 1");
        queue.add("Patient 2");
        queue.add("Patient 3");
        int n=queue.size();

        for(int i=0;i<n;i++){
            System.out.println("Serving: "+queue.poll());
        }
    }
}
