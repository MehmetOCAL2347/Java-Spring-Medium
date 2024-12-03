package medium.java.spring_boot.webApi;

import lombok.RequiredArgsConstructor;
import medium.java.spring_boot.business.UserService;
import medium.java.spring_boot.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public Flux<UserEntity> getAllUsers(){
        return userService.getAllUser();
    }
}
