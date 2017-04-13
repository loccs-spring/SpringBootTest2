package cn.edu.sjtu.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by spring on 2017/4/13.
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }


}
