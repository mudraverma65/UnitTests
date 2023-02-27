import java.util.ArrayList;
import java.util.List;

public class MinQueue {
    List<Integer> queue;

    MinQueue(){
        List<Integer> queue = new ArrayList<Integer>();
    }

    public int dequeue(){
        if(queue == null){
            return -1;
        }
        return 0;
    }
}
