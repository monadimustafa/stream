import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       /* List<Personne> ps = Arrays.asList(
                new Personne(1,"aaa",12500),
                new Personne(2,"bbb",22000),
                new Personne(3,"ccc",12000)
        );
        Map<String,Integer> pRes = ps.stream()
                .filter(p->p.getAge()<20_000)
                .collect(Collectors.toMap(p->p.getName(),p->p.getAge()));
        System.out.println();

        }*/
       /* List<Personne> ps = Arrays.asList(
                new Personne(1,"aaa",12500),
                new Personne(2,"bbb",22000),
                new Personne(3,"ccc",19000)
        );
        List<Personne> pe = Arrays.asList(
                new Personne(1,"zzz",12500),
                new Personne(2,"eee",22000),
                new Personne(3,"vvv",12000)
        );
        List<List<Personne>> listP = Arrays.asList(ps,pe);
        Optional<Personne> pi = listP.stream().flatMap(listPers->listPers.stream())
                                             .min((pc1,pc2)->{ return pc1.compareTo(pc2);});
        System.out.println(pi);*/
        List<Integer> numbers = Arrays.asList(1,2,3);
        List<String> mots = Arrays.asList("4","5","6");
        List<Integer> convMots = mots.stream().map(m->Integer.parseInt(m)).collect(Collectors.toList());
        Stream<Integer> total = Stream.concat(numbers.stream(),convMots.stream());
        Optional<Integer> rt = total.reduce((val1,val2)-> val1+val2);
        System.out.println(rt.get());


    }


}