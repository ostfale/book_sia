package de.ostfale.sbsia.repository;

import de.ostfale.sbsia.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Simple Crud repository
 * Created :  04.06.2020
 *
 * @author : Uwe Sauerbrei
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
