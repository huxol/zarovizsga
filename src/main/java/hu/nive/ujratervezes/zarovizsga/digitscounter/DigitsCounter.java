package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashMap;
import java.util.Map;

public class DigitsCounter {

    public int getCountOfDigits(String numbers) {
        Map<Character, String> result = new HashMap<>();
        if (numbers == null || numbers.equals("")) {
            return 0;
        }

        for (int i = 0; i < numbers.length(); i++);

        return result.size();
    }
}
