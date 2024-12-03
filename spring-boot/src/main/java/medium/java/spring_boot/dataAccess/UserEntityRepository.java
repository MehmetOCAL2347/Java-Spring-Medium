package medium.java.spring_boot.dataAccess;

import medium.java.spring_boot.entity.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends ReactiveMongoRepository<UserEntity, Long> {
}
