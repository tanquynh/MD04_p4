package ra.md04_project_part4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import ra.md04_project_part4.model.entity.Role;
import ra.md04_project_part4.model.entity.RoleName;
import ra.md04_project_part4.model.entity.User;
import ra.md04_project_part4.repository.IUserRepository;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Md04ProjectPart4Application {

    public static void main(String[] args) {
        SpringApplication.run(Md04ProjectPart4Application.class, args);
    }
//        @Bean
//    public CommandLineRunner runner(PasswordEncoder passwordEncoder, IUserRepository userRepository){
//        return args -> {
//            Role admin = new Role(null, RoleName.ROLE_ADMIN)  ;
//            Role user = new Role(null, RoleName.ROLE_USER)  ;
//            Role manager = new Role(null, RoleName.ROLE_MANAGER)  ;
//            Set<Role> set = new HashSet<>();
//            set.add(admin);
//            set.add(user);
//            set.add(manager);
//
//           User roleAdmin = new User(null,"admin123","admin",null,passwordEncoder.encode("admin123"),set,true);
//           userRepository.save(roleAdmin);
//        };
//    }
//    @Bean
//    public CommandLineRunner runner(MailService mailService){
//        return args -> {
//            mailService.sendMail("hung18061999hung@gmail.com","Mailracsc, kiem thu tinh nang gủi mail");
//        };
//    }
}
