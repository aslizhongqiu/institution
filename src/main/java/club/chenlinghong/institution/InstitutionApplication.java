package club.chenlinghong.institution;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("club.chenlinghong.institution.repository.dao")
public class InstitutionApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(InstitutionApplication.class, args);
    }

    /**
     * WAR包支持
     *
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(InstitutionApplication.class);
    }

}
