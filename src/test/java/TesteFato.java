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
        assertEquals(2L, f.fatorial(3));
    }
    @Test
    public void Teste3() {
        Fatorial f = new Fatorial();
        assertEquals(34L, f.fatorial(9));
    }
    @Test
    public void Teste4() {
        Fatorial f = new Fatorial();
        assertEquals(233L, f.fatorial(13));
    }
    @Test
    public void Teste5() {
        Fatorial f = new Fatorial();
        assertEquals(514229L, f.fatorial(29));
    }
}