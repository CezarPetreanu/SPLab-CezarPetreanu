package com.example.sp_lab2.difexample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    private final ClientComponent clientComponent; // Inject ClientComponent

    @Autowired
    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    public String hello() {
        String message = "Hello from ClientComponent = " + clientComponent.toString();
        return message;
    }
}