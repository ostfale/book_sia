package de.ostfale.sbsia.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Simple pojo
 * Created :  02.06.2020
 *
 * @author : Uwe Sauerbrei
 */
@Entity
public class Ingredient {

    @Id
    private final String id;


    private final String name;
    private final Type type;

    public Ingredient() {
        this.id = null;
        this.name = null;
        this.type = null;
    }

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
