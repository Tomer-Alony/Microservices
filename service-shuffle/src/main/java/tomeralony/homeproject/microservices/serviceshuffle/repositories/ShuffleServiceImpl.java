package tomeralony.homeproject.microservices.serviceshuffle.repositories;

import org.springframework.stereotype.Service;
import tomeralony.homeproject.microservices.serviceshuffle.services.ShuffleService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ShuffleServiceImpl implements ShuffleService {

    @Override
    public List<Integer> shuffle(int numberOfElements) {
        List<Integer> listOfShuffledNumbers = new ArrayList<Integer>();

        for (int currentNumber = 0; currentNumber < numberOfElements; currentNumber++) {
            listOfShuffledNumbers.add(currentNumber + 1);
        }

        // Collections.shuffle runs at O(n)
        Collections.shuffle(listOfShuffledNumbers);
        return listOfShuffledNumbers;
    }
}
