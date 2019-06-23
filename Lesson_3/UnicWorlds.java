package Lesson_3;

import java.util.*;

public class UnicWorlds {

    public static void unicWorld(){

        List<String> words = Arrays.asList(

                "ЦСКА", "Динамо", "Урал", "Арсенал", "Сочи",

                "Ростов", "ЦСКА", "Динамо", "Зенит", "ЦСКА",

                "ЦСКА", "Уфа", "Краснодар", "ЦСКА", "Динамо",

                "Краснодар", "ЦСКА", "Краснодар", "Динамо", "ЦСКА"

        );



        Set<String> unique = new HashSet<String>(words);



        System.out.println("Массив слов:");

        System.out.println(words.toString());

        System.out.println("Уникальные слова: ");

        System.out.println(unique.toString());

        System.out.println("Сколько раз встречается слово:");

        for (String key : unique) {

            System.out.println(key + " : " + Collections.frequency(words, key));

        }

    }
}
