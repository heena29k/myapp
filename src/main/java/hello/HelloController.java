package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
        public String index() {
            return "This is the index!\n";
        }
    @RequestMapping("/hello")
        public String index2() {

            return "Hello, Openshift!\n";
        }

}
