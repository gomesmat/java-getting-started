import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Fatorial;

public class TesteFato {

    @Test
    public void Teste1() {
        Fatorial f = new Fatorial();
        assertEquals(1L, f.fatorial(1));
    }
    @Test
    public void Teste2() {
        Fatorial f = new Fatorial();
        assertEquals(6L, f.fatorial(3));
    }
    @Test
    public void Teste3() {
        Fatorial f = new Fatorial();
        assertEquals(2L, f.fatorial(2));
    }
    @Test
    public void Teste4() {
        Fatorial f = new Fatorial();
        assertEquals(6L, f.fatorial(3));
    }
}