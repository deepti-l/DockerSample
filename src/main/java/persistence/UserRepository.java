package persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	@Query("Select user from User user where user.userName = :userName")
	User getUserDetails(@Param("userName") String userName);

	@Query("Select user from User user where user.userName = :login and password = :password")
	User login(@Param("login") String userName, @Param("password") String password);
}
