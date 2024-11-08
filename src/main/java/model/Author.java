package main.java.model;

public class Author {
    private int id;
    private String name;
    private String bio;

    public Author(int id, String name, String bio) {
        this.id = id;
        this.name = name;
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String toString() {
        return "Athor [id=" + id + ", name=" + name + ", bio=" + bio + "]";
    }
}
