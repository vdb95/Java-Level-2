package Lesson_3;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.HashMap;

import java.util.List;




public class PhoneDirectoy {

        private HashMap<String, List<String>> directory;



        public PhoneDirectoy(){

            this.directory = new HashMap<>();

        }



        public void add(String surname, String number){

            if(directory.containsKey(surname)){

                List<String> numbers = directory.get(surname);

                if(!numbers.contains(number)){

                    numbers.add(number);

                    System.out.println("Фамилия: " + surname + " Номер: "+ number );


                }

            } else {

                directory.put(surname, new ArrayList<>(Arrays.asList(number)));

                System.out.println(String.format("Фамилия: " + surname + " Номер: "+ number ));

            }

        }



        public List<String> get(String surname){

            if(directory.containsKey(surname)){

                return directory.get(surname);

            } else {

                System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));

                return new ArrayList<>();

            }

        }
    public static void phoneDirectoy(){


        PhoneDirectoy phonebook = new PhoneDirectoy();




        System.out.println("Cправочник:");

        phonebook.add("Грязнов", "38046");

        phonebook.add("Бабушкин", "35687");

        phonebook.add("Жуков", "30978");

        phonebook.add("Бабушкин", "34907");

        phonebook.add("Трошкин", "35429");




        System.out.println("Выводим номер для фамилии:");

        System.out.println("Бабушкин");

        System.out.println(phonebook.get("Бабушкин"));

    }

}



