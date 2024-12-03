package medium.java.spring_boot.business;

import medium.java.spring_boot.entity.UserEntity;
import reactor.core.publisher.Flux;

public interface UserService {
    Flux<UserEntity> getAllUser();
}
