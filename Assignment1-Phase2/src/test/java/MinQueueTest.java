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
    void testIntDequeue(){
        MinQueue q1 = new MinQueue();
        assertEquals(Integer.valueOf(-1), q1.dequeue());
    }

    /**
     * Adding an integer in the queue
     *
     */
    @Test
    void testIntEnqueue(){
        MinQueue q1 = new MinQueue();
        assertEquals(true, q1.enqueue(8));
    }
}
