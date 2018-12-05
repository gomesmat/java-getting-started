import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Fibonacci;

public class TesteFibo {

    @Test
    public void Teste1() {
        Fibonacci f = new Fibonacci();
        assertEquals(1L, f.fatorial(1));
    }
    @Test
    public void Teste2() {
        Fibonacci f = new Fibonacci();
        assertEquals(2L, f.fatorial(2));
    }
    @Test
    public void Teste3() {
        Fibonacci f = new Fibonacci();
        assertEquals(120L, f.fatorial(5));
    }
    @Test
    public void Teste4() {
        Fibonacci f = new Fibonacci();
        assertEquals(6L, f.fatorial(3));
    }
    @Test
    public void Teste5() {
        Fibonacci f = new Fibonacci();
        assertEquals(24L, f.fatorial(4));
    }
}