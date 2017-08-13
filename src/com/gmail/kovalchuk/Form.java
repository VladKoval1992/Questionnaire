package com.gmail.kovalchuk;
import java.util.HashMap;
import java.util.Map;


public class Form {
    private Person person;
    private Map<String, String> answers = new HashMap<>();

    public Form(Person person, Map<String, String> answers) {
        super();
        this.person = person;
        this.answers = answers;
    }

    public Form() {
        super();
    }

    public Person getPerson() {
        return person;
    }

    public Map<String, String> getAnswers() {
        return answers;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }
}