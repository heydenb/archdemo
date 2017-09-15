package com.heydenb.archdemo.springbootdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heydenb
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
