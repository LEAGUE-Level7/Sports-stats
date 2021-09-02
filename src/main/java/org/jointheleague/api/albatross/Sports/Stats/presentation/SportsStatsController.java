package org.jointheleague.api.albatross.Sports.Stats.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SportsStatsController {

    @GetMapping("/searchLocResults")
    public String getResults(){
        return "Hello, world!";
    }

}
