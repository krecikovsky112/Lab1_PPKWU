package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStringReverse {

    @GetMapping("reversedString/{text}")
    public String reverseString(@PathVariable String text) {
        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();
        return reversedText.toString();
    }
}
