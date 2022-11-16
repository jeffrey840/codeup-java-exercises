
import java.util.Random;

public class ServerNameGenerator {

//    main method
    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", randomElement(nouns), randomElement(adjectives));

    }

//    adjectives array
    public static String[] adjectives = {
            "clever",
            "small",
            "adorable",
            "adventurous",
            "aggressive",
            "agreeable",
            "alert",
            "alive",
            "annoying",
            "attractive"
    };



}