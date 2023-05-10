package at.technikum.slmcalcapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/calc/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b) {
        return a + b;
    }
}
