package patternmatching;

import record.Product;

public class PatternMatchingExample {

    public static void main(String[] args) {

        patternMatching();
        Object str = switchPatternMatching("String");
        System.out.println(str);
        Animal cat = new Cat("Boku","Greyish");
        String result = recordPatternMatching(cat);
        System.out.println(result);

    }

    private static String recordPatternMatching(Animal animal) {
        return switch (animal) {
            case Cat c -> c.name();
            default -> "other animal";
        };
    }

    private static Object switchPatternMatching(Object obj) {

        return switch (obj){
            case String str -> "my name is: "+str;
            case Integer i -> i;
            case null, default -> "nothing";
        };
    }

    // Introduced in Java 16,this allows combining an instanceof check with a
    // type cast and variable declaration in a single expression.
    private static void patternMatching() {
        Object obj = "Hello, Java Pattern Matching!";
        if (obj instanceof String s) {
            System.out.println("Object is a String: " + s.toUpperCase());
        } else if (obj instanceof Integer i) {
            System.out.println("Object is an Integer: " + (i * 2));
        }
    }
}
