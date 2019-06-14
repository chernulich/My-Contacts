package mycontacts.backfront.repository;

import mycontacts.backfront.model.entity.Address;
import mycontacts.backfront.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAllByUser(User user);

    void deleteAllByUser(User user);
}
