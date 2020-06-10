package de.ostfale.sbsia.repository;

import de.ostfale.sbsia.domain.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Simple repository with some custom function
 * Created :  10.06.2020
 *
 * @author : Uwe Sauerbrei
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String deliveryZip);
}
