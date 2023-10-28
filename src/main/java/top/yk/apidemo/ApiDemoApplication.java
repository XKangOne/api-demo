package top.yk.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ApiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class, args);
    }

    @GetMapping("/list")
    public List<String> getList(){
        return List.of("吃饭", "睡觉","初代码.");
    }
}
