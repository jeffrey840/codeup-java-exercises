package JavaPractice;

public class Animal {

    private String name;
    private String species;

    // Getter
    public String name() {
        return name;
    }

    // Setter
    public void name(String c) {
        this.name = c;
    }

    // Getter
    public String species() {
        return species;
    }

    // Setter
    public void species(String c) {
        this.species = c;
    }

    public static String roar(){
        String c = "cat";
        return "I am " + c + ", hear me roar!";
    }

    public static void main(String[] args) {
        System.out.println(Animal.roar());

    }

}
