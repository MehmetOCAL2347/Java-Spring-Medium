package medium.java.spring_boot.entity;

import lombok.RequiredArgsConstructor;
import medium.java.spring_boot.dataAccess.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DemoUserCreator {

    @Autowired
    private UserEntityRepository repository;

    @EventListener(ApplicationReadyEvent.class)
    public void createDefaultUsers(){

        UserEntity user_1 = UserEntity.builder()
                .id(100000001)
                .name("user_1")
                .surname("surname_1")
                .build();

        UserEntity user_2 =UserEntity.builder()
                .id(100000002)
                .name("user_2")
                .surname("surname_2")
                .build();

        UserEntity user_3 = UserEntity.builder()
                .id(100000003)
                .name("user_3")
                .surname("surname_3")
                .build();

        repository.save(user_1).subscribe();
        repository.save(user_2).subscribe();
        repository.save(user_3).subscribe();
    }
}
