package mycontacts.backfront.repository;

import mycontacts.backfront.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByFullName(String name);

}
