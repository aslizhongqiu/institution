package club.chenlinghong.institution;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("club.chenlinghong.institution.repository.dao")
public class InstitutionApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstitutionApplication.class, args);
    }

}
