import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> maset = new HashSet<>();
        maset.add(33);
        maset.add(36);
        maset.add(34);
        maset.add(35);


        maset.forEach((a) -> {
            a += 10;
            System.out.println(a);
        });
    }
}
