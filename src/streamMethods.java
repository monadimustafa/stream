import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamMethods {
    public static void main(String[] args) {
        //filter  >> Modulo
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> numerbsPair = new ArrayList<>();
        numerbsPair=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        numerbsPair.forEach(System.out::println);
    }
}
