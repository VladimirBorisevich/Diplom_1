package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("Белый хлеб", 50);
    }

    @Test
    public void checkGetNameCorrectReturn() {
        assertEquals("Name should equals to Белый хлеб", bun.getName(), "Белый хлеб");
    }

    @Test
    public void checkGetPriceCorrectReturn() {
        assertEquals("Price should equals to 50", bun.getPrice(), 50, 0);
    }
}
