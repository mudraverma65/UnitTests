import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinQueueTest {
    /**
     * Adding an integer in the queue
     * */

    /**
     * This test checks if the Queue is empty
     * if the queue is empty returns -1
     */
    @Test
    void testIntDequeue() {
        MinQueue q1 = new MinQueue();
        assertEquals(Integer.valueOf(-1), q1.dequeue());
    }

    /**
     * Adding an integer in the queue
     */
    @Test
    void testIntEnqueue() {
        MinQueue q1 = new MinQueue();
        assertEquals(true, q1.enqueue(8));
    }

    /**
     * Dequeue on queue with elements
     */
    @Test
    void testIntDequeueWithElements() {
        MinQueue q1 = new MinQueue();
        q1.enqueue(8);
        q1.enqueue(3);
        q1.enqueue(10);
        q1.enqueue(2);
        q1.enqueue(6);
        assertEquals(Integer.valueOf(2),q1.dequeue());
        assertEquals(Integer.valueOf(3),q1.dequeue());
    }

    /**
     * Top on empty queue
     * */

    @Test
    void testEmptyTop(){
        MinQueue q1 = new MinQueue();
        assertEquals(Integer.valueOf(-1),q1.top());
    }




}
