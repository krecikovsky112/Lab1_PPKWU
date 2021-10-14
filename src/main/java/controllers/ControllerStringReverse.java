package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStringReverse {

    @GetMapping("reverseString/{text}")
    public String reverseString(@PathVariable String text){
        return text;
    }
}
