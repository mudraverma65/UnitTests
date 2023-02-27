import java.util.ArrayList;
import java.util.List;

public class MinQueue {
    List<Integer> queue;

    MinQueue() {
        queue = new ArrayList<Integer>();
    }

    /**
     * Gets the minimum element
     */
    public int dequeue() {
        if (queue == null || queue.size() == 0) {
            return -1;
        }
        int minimumElement = queue.get(0);
        ;
        int indexOfMinimumElement = 0;
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i) < minimumElement) {
                minimumElement = queue.get(i);
                indexOfMinimumElement = i;
            }
        }
        queue.remove(indexOfMinimumElement);
        return minimumElement;
    }

    /**
     * adds a new element to the queue
     */
    public boolean enqueue(int element) {
        queue.add(element);
        return true;
    }

    /**
     * Returns the second to go element in the queue
     */
    public int top() {
        if (queue == null || queue.size() == 0) {
            return -1;
        }
        if (queue.size() == 1) {
            return -1;
        }
        return queue.get(1);
    }
}
