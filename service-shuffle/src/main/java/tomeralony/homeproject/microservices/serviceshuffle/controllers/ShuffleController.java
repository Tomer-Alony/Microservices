package tomeralony.homeproject.microservices.serviceshuffle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tomeralony.homeproject.microservices.serviceshuffle.exceptions.NumberOutOfRangeException;
import tomeralony.homeproject.microservices.serviceshuffle.services.ShuffleService;

import java.util.List;

@RestController
public class ShuffleController {
    @Autowired
    private ShuffleService shuffleService;

    @PostMapping("/shuffle/{numberOfElements}")
    public List<Integer> shuffle(@PathVariable("numberOfElements") int numberOfElements) throws NumberOutOfRangeException {
        if (numberOfElements >= 1 && numberOfElements <= 1000)
            return this.shuffleService.shuffle(numberOfElements);
        else {
            throw new NumberOutOfRangeException("The number should be between 1 to 1000");
        }
    }
}
