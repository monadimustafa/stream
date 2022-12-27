import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Amigo {
    public static void main(String[] args) {
        Personne p1 = new Personne(1,"Driss",32);
        Personne p2 = new Personne(2,"Ahmed",43);
        Personne p3 = new Personne(3,"Ismail",34);
        Personne p4 = new Personne(4,"nadia",32);
        Personne p5 = new Personne(5,"souad",43);
        Personne p6 = new Personne(6,"kamal",34);
        List<Personne> personnes = List.of(p1,p2,p3,p4,p5,p6);
        //personnes.forEach(System.out::println);
        List<Personne> personne2 = personnes.stream().filter(p->p.getAge() < 40 && (p.getName().startsWith("D") || p.getName().endsWith("l")))
                .limit(4)
                 .collect(Collectors.toList());
        personne2.forEach(System.out::println);
        }
    }
