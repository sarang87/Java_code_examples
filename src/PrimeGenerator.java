import java.util.ArrayList;
public class PrimeGenerator {

    public static ArrayList<Integer> generatePrimes(int range) {
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();
        if (range < 2){
            return primes;
        }
        for (int i = 2; i <= range; i++) {
            primes.add(i);
        }
        for (int i = 0; i < primes.size(); i++) {
            int currentNum = primes.get(i);
            if(primes.get(i) == -1){
                continue;
            }
            results.add(primes.get(i));
            for (int j = i+1; j < primes.size(); j++){
                if(primes.get(j) > 0 && primes.get(j) % currentNum == 0){
                    primes.set(j,-1);
                }
            }
        }
        System.out.println(results);
        return results;

    }

}
