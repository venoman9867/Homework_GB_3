package com.GeekBrains.Task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.*/

    public static void main(String[] args) {
        String array[] = new String[]{"carrot", "car", "shark", "carrot", "airship", "king", "lion", "king", "carrot", "rabbit", "clone"};
        Map<String, Integer> countWords = new HashMap<>();
        for (String value : array) {
            if (countWords.containsKey(value)) {
                countWords.put(value, countWords.get(value) + 1);
            } else {
                countWords.put(value, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
