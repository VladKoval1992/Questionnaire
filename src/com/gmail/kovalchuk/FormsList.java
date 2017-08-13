package com.gmail.kovalchuk;
import java.util.ArrayList;
import java.util.List;


public class FormsList {
    private static final FormsList formsList = new FormsList();
    private final List<Form> forms = new ArrayList<Form>();

    private FormsList() {
        super();
    }

    public synchronized List<Form> getForms() {
        return forms;
    }

    public static FormsList getInstance(){
        return formsList;
    }
    public synchronized void add(Form form){
        forms.add(form);
    }
}