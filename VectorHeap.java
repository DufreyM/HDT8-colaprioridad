import java.util.PriorityQueue;

public class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E> {
    public VectorHeap() {
        super();
    }
    
    public VectorHeap(int initialCapacity) {
        super(initialCapacity);
    }
}
