package medium.java.spring_boot.business;

import lombok.RequiredArgsConstructor;
import medium.java.spring_boot.dataAccess.UserEntityRepository;
import medium.java.spring_boot.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService{

    @Autowired
    private UserEntityRepository repository;

    @Override
    public Flux<UserEntity> getAllUser() {
        return repository.findAll();
    }
}
