import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VectorHeapTest {

    @Test
    public void testAdd() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        Paciente paciente1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente paciente2 = new Paciente("Maria Ramirez", "apendicitis", 'A');
        
        heap.add(paciente1);
        heap.add(paciente2);
        
        assertEquals(2, heap.size()); // Comprobar que hay dos elementos en el heap
        assertTrue(heap.contains(paciente1)); 
        assertTrue(heap.contains(paciente2)); 
    }

    @Test
    public void testPoll() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        Paciente paciente1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente paciente2 = new Paciente("Maria Ramirez", "apendicitis", 'A');
        
        heap.add(paciente1);
        heap.add(paciente2);
        
        assertEquals(2, heap.size()); 
        
        Paciente pacienteAtendido = heap.poll();
        
        assertEquals(paciente2, pacienteAtendido); 
        assertEquals(1, heap.size()); 
        assertTrue(heap.contains(paciente1)); 
    }
}
