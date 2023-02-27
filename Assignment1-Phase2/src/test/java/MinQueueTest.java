import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinQueueTest {

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
        assertEquals(Integer.valueOf(2), q1.dequeue());
        assertEquals(Integer.valueOf(3), q1.dequeue());
    }

    /**
     * Top on empty queue
     */

    @Test
    void testEmptyTop() {
        MinQueue q1 = new MinQueue();
        assertEquals(Integer.valueOf(-1), q1.top());
    }

    /**
     * Top to get next element
     */

    @Test
    void testTop() {
        MinQueue q1 = new MinQueue();
        q1.enqueue(8);
        q1.enqueue(3);
        q1.enqueue(10);
        q1.enqueue(2);
        q1.enqueue(6);
        assertEquals(Integer.valueOf(3), q1.top()); //{8,3,10,2,6}
    }

    /**
     * Calling top after dequeue
     */

    @Test
    void testTopDequeue() {
        MinQueue q1 = new MinQueue();
        q1.enqueue(8);
        q1.enqueue(3);
        q1.enqueue(10);
        q1.enqueue(2);
        q1.enqueue(6);
        assertEquals(Integer.valueOf(3), q1.top());
        assertEquals(Integer.valueOf(2), q1.dequeue()); //{8,3,10,6}
        assertEquals(Integer.valueOf(3), q1.top());
        assertEquals(Integer.valueOf(3), q1.dequeue()); //{8,10,6}
        assertEquals(Integer.valueOf(10), q1.top());
    }

    /**
     * Calling top with only one value in queue
     */

    @Test
    void testOneTop() {
        MinQueue q1 = new MinQueue();
        q1.enqueue(8);
        assertEquals(Integer.valueOf(-1), q1.top());
    }

    /**
     * Duplicate values at head of queue
     */

    @Test
    void testDuplicate() {
        MinQueue q1 = new MinQueue();
        q1.enqueue(8);
        q1.enqueue(3);
        q1.enqueue(10);
        q1.enqueue(3);
        q1.enqueue(5);
        assertEquals(Integer.valueOf(3), q1.top());
        assertEquals(Integer.valueOf(3), q1.dequeue()); //{8,10,3,5}
        assertEquals(Integer.valueOf(10), q1.top());
    }

    /**
     * Removing first element and calling top
     * */

    @Test
    void testHeadDequeue(){
        MinQueue q1 = new MinQueue();
        q1.enqueue(3);
        q1.enqueue(8);
        q1.enqueue(10);
        q1.enqueue(7);
        q1.enqueue(5);
        assertEquals(Integer.valueOf(8),q1.top());
        assertEquals(Integer.valueOf(3),q1.dequeue()); //{8,10,7,5}
        assertEquals(Integer.valueOf(10),q1.top());
    }

}
