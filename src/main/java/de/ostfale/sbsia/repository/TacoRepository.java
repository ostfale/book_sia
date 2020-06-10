package de.ostfale.sbsia.repository;

import de.ostfale.sbsia.domain.Taco;
import org.springframework.data.repository.CrudRepository;

/**
 * Simple repository
 * Created :  05.06.2020
 *
 * @author : Uwe Sauerbrei
 */
public interface TacoRepository extends CrudRepository<Taco, Long> {
}

