package Homework20_Advanced_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // 
    }

    @GetMapping("/secure")
    public String securePage() {
        return "secure"; // 
    }
}

