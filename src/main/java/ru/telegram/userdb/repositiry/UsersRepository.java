package ru.telegram.userdb.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.telegram.userdb.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
