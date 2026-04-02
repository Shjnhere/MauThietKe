package Prototype;

public class Rabbit implements Cloneable {
    private String name;
    private int age;
    private Person owner;

    public Rabbit(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    // ===== SHALLOW COPY (Exercise 5a) =====
    public Rabbit cloneShallow() {
        try {
            return (Rabbit) super.clone(); // copy reference owner
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // ===== DEEP COPY (Exercise 5b) =====
    public Rabbit cloneDeep() {
        try {
            Rabbit cloned = (Rabbit) super.clone();
            // clone owner manually
            cloned.owner = new Person(this.owner.getName());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Rabbit{name='" + name + "', age=" + age + ", owner=" + owner + "}";
    }
}