package tomeralony.homeproject.microservices.serviceshuffle.services;

import org.springframework.stereotype.Service;
import java.util.List;

public interface ShuffleService {
    List<Integer> shuffle(int numberOfElements);
}
