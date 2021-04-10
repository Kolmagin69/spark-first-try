package main.service.people_creator;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PeopleCreator {

    public void createOneMillion() {
        Gson gson = new Gson();
        for (int i = 0; i < 1000000; i++) {
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter( "people/p" + i +".json"))) {
                writer.write(gson.toJson(randomPeople()));
            } catch (IOException e) {
                e.fillInStackTrace();
            }
        }
    }

    private People randomPeople(){
        String firstName = randomFirstName();
        String lastName = randomLastName();
        String gender = randomGender();
        int age = randomAge();
        return new People(firstName, lastName, gender, age);
    }

    private String randomFirstName() {
        int i = (new Random()).nextInt(11);
        switch (i){
            case 0 : return "Sergey";
            case 1 : return "Nikita";
            case 2 : return "Kristina";
            case 3 : return "Grisha";
            case 4 : return "Alexander";
            case 5 : return "Irina";
            case 6 : return "Nasty";
            case 7 : return "Dima";
            case 8 : return "Stas";
            case 9 : return "Alex";
        }
        return "Ivan";
    }

    private String randomLastName() {
        int i = (new Random()).nextInt(11);
        switch (i){
            case 0 : return "Polykov";
            case 1 : return "Kuznetsov";
            case 2 : return "Chistovich";
            case 3 : return "Tatishev";
            case 4 : return "Kolmagin";
            case 5 : return "Hasymov";
            case 6 : return "Podyomny";
            case 7 : return "Kolmagin";
            case 8 : return "Tymanov";
            case 9 : return "Krasnikov";
        }
        return "Ivanov";
    }

    private String randomGender(){
        int i = (new Random()).nextInt(2);
        if (i == 1) {
            return "man";
        }
        return "woman";
    }

    private int randomAge(){
        return (new Random()).nextInt(30) + 20;
    }
}


