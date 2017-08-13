package com.gmail.kovalchuk;


public class Statistic {

    public static long getAnsNumber(String ques, String ans, FormsList formsList) {
        long num = formsList.getForms().stream().filter(form -> ans.equals(form.getAnswers().get(ques))).count();
        return num;
    }
}