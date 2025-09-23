package lvti;

import java.util.List;
import java.util.Map;

public class LVTIExample {
    public static void main(String[] args) {

        var stringList = List.of("Amay","Shaurya");
        boolean isValid = stringList instanceof List<String>;
        System.out.println("is list valid --> "+stringList +" --> "+ isValid );

        var map = Map.of("a",List.of("Amay","Shaurya"));
        System.out.println(map);
        map.forEach((s,names) -> System.out.println(s +" : "+names));
    }
}
