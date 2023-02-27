import java.util.ArrayList;
import java.util.List;

public class MinQueue {
    List<Integer> queue;

    MinQueue() {
        queue = new ArrayList<Integer>();
    }

    public int dequeue() {
        if (queue == null || queue.size() == 0) {
            return -1;
        }
        return 0;
    }

    public boolean enqueue(int element) {
        queue.add(element);
        return true;
    }
}
