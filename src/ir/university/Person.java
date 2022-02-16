package ir.university;

public abstract class Person {
    protected String name;
    protected String family;
    protected Gender gender;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public Person(String name, String family, Gender gender) {
        this.name = name;
        this.family = family;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract String toString();
}
