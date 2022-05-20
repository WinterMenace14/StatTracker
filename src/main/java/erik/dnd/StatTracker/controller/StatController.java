package erik.dnd.StatTracker.controller;

import erik.dnd.StatTracker.service.StatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatController {

    private final StatService statService;

    public StatController(StatService statService) {
        this.statService = statService;
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
