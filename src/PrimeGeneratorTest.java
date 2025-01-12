import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeGeneratorTest {

    @Test
    public void testEmptyRange() {
        Assertions.assertEquals(new ArrayList<>(), PrimeGenerator.generatePrimes(0));
        Assertions.assertEquals(new ArrayList<>(), PrimeGenerator.generatePrimes(1));
    }

    @Test
    public void testPrimesInRange(){
        ArrayList<Integer> primes = new ArrayList<>();
        Assertions.assertEquals(primes, PrimeGenerator.generatePrimes(0));
        Assertions.assertEquals(primes,PrimeGenerator.generatePrimes(1));
        primes.add(2);
        Assertions.assertEquals(primes,PrimeGenerator.generatePrimes(2));
        Collections.addAll(primes,3,5,7);
        Assertions.assertEquals(25,PrimeGenerator.generatePrimes(100).size());
    }
}
