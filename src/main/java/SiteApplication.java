import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SiteApplication {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    public static void main(String[] args){
        SpringApplication.run(SiteApplication.class, args);
    }
}
