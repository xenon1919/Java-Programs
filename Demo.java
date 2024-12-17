import java.util.*;
import java.util.stream.Collectors;
public class Demo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,5);
        List<Integer> sq = num.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(sq);
        List<String> name = Arrays.asList("Reflection","Collection","Stamp");
        List<String> res = name.stream().filter(s ->s.startsWith("s")).collect(Collectors.toList());
        List<String> show = name.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        List<Integer> nums = Arrays.asList(2,3,4,8,5);
        Set<Integer> sqset = nums.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println(sqset);
        num.stream().map(x -> x*x).forEach(y -> System.out.println(y));
        int even = num.stream().filter(x -> x%2==0).reduce(0,(ans,i) -> ans+i);
        System.out.println(even);
    }
}
