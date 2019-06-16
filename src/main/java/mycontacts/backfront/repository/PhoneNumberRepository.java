package mycontacts.backfront.repository;

import mycontacts.backfront.model.entity.PhoneNumber;
import mycontacts.backfront.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {

    List<PhoneNumber> findAllByUser(User user);

    PhoneNumber findByPhoneNumber(String phoneNumber);

    void deleteAllByUser(User user);
}
