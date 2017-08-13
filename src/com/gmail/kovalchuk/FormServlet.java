package com.gmail.kovalchuk;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class FormServlet extends HttpServlet {
    private FormsList formsList = FormsList.getInstance();
    private String name;
    private String lastName;
    private int age;
    private String ans1;
    private String ans2;
    private String ans3;
    private final String ques1 = "Яку мову програмування ви хочети вчити?";
    private final String ques2 = "Скільки часу ви готові відавати навчанню?";
    private final String ques3 = "Як ви плануєте вивчати мову програмування?";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        name = req.getParameter("name");
        lastName = req.getParameter("lastname");
        age = Integer.parseInt(req.getParameter("age"));
        ans1 = req.getParameter("ans1");
        ans2 = req.getParameter("ans2");
        ans3 = req.getParameter("ans3");
        Form form = generateForm();
        formsList.add(form);
        resp.sendRedirect("statistic.jsp");
    }

    private Form generateForm(){
        Person person = new Person(name, lastName, age);
        Map<String,String> answers = new HashMap<>();
        answers.put(ques1, ans1);
        answers.put(ques2, ans2);
        answers.put(ques3, ans3);
        return new Form(person,answers);
    }


}