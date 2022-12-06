package JavaPractice;

public class Animal {

    private String name;
    private String species;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String c) {
        this.name = c;
    }

    // Getter
    public String getSpecies() {
        return species;
    }

    // Setter
    public void setSpecies(String c) {
        this.species = c;
    }

    public static String roar(){
        String a = "cat";
        return "I am " + a + ", hear me roar!";
    }

    public static void main(String[] args) {
        System.out.println(Animal.roar());

    }

}
