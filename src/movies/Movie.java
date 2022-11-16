package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

//    getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

//    getter
    public String getCategory() {
        return category;
    }

    // Setter
    public void setCategory(String newCategory) {
        this.category = newCategory;

    }
}
