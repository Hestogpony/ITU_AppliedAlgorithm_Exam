import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Rand {

    public List<Integer> generateRandomInts(boolean negativeAllowed, int startInclusive, int endInclusive, int limit) {

        List<Integer> intList;

        Random random = new Random(System.currentTimeMillis());
        intList = random.ints()
                .map(x -> x % (Math.max(Math.abs(startInclusive), endInclusive)) + 1)
                .map(x -> negativeAllowed ? x : Math.abs(x))
                .filter(x -> x >= startInclusive && x <= endInclusive)
                .boxed()
                .limit(limit)
                .collect(Collectors.toList());

        return intList;
    }

    public List<Integer> generateInts(boolean negativeAllowed, int startInclusive, int endInclusive, int interval) {
        List<Integer> intList;
        IntStream intStream;

        intStream = IntStream.range(startInclusive, endInclusive + 1);
        intList = intStream
                .map(x -> negativeAllowed ? x : Math.abs(x))
                .filter(x -> x % interval == 0)
                .boxed()
                .collect(Collectors.toList());

        return intList;
    }


    public void printGeneratedInts(List<Integer> integers) {

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {

        Rand rand = new Rand();

        List<Integer> randomInts = rand.generateRandomInts(true, 0, 20, 10);
        rand.printGeneratedInts(randomInts);

        List<Integer> integers = rand.generateInts(false, 0, 20, 5);
        rand.printGeneratedInts(integers);

    }

}
