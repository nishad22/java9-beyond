package textblocks;

public class TextBlockExample {

    public static void main(String[] args) {

        String textBlocks = """
                Hello world!
                I am a Software programmer!!
               """.formatted("Nishad");

        System.out.println(textBlocks);


        String textBlock1 = """
                Hello, %s!
                I am a Software programmer!!
               """.formatted("Nishad");
        System.out.println(textBlock1);
    }
}
