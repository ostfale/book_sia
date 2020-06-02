package de.ostfale.sbsia.domain;

import java.util.List;
import java.util.Objects;

/**
 * Taco pojo
 * Created :  02.06.2020
 *
 * @author : Uwe Sauerbrei
 */
public class Taco {

    private String name;
    private List<Ingredient> ingredients;

    public Taco() {
    }

    public Taco(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Taco{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taco taco = (Taco) o;
        return name.equals(taco.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
