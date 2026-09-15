package com.flames.flames.service;

import org.springframework.stereotype.Service;

import com.flames.flames.entity.LoveResult;
//import com.flames.flames.LoveResult;
import com.flames.flames.repository.LoveResultRepository;

@Service
public class LoveService {

    private final LoveResultRepository repository;

    public LoveService(LoveResultRepository repository) {
        this.repository = repository;
    }

    public LoveResult calculateAndSave(String name1, String name2) {

        int percentage = calculate(name1, name2);

        LoveResult result =
                new LoveResult(name1, name2, percentage);

        return repository.save(result);
    }

    private int calculate(String name1, String name2) {

        name1 = name1.toLowerCase().replaceAll("[^a-z]", "");
        name2 = name2.toLowerCase().replaceAll("[^a-z]", "");

        int common = 0;

        boolean[] used = new boolean[name2.length()];

        for (char c : name1.toCharArray()) {

            for (int j = 0; j < name2.length(); j++) {

                if (!used[j] && c == name2.charAt(j)) {
                    common++;
                    used[j] = true;
                    break;
                }
            }
        }

        int maxLength = Math.max(name1.length(), name2.length());

        if (maxLength == 0)
            return 0;

        return (int) Math.round(
                (double) common / maxLength * 100
        );
    }
}