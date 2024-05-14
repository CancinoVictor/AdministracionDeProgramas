
package com.uadec.AdminPrograms.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controladorRest {
    
    @GetMapping("/")
    public String start(){
    
    return "index";
    }
}
