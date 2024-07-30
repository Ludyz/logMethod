package org.example;

import com.luyz.IpCountService;
import com.luyz.annotation.LogMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class DemoController {

    @Resource
    private IpCountService ipCountService;


    @GetMapping("/ipDemo")
    @LogMethod(name = "ipDemo")
    public void ipDemo() {
        ipCountService.count();
        System.out.println("hello world");
    }
}
