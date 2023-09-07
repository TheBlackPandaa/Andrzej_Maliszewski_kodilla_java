package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        int c;
        //dodawanie test
        c = Calculator.add(4,5);
        if(c == 9) {
            System.out.println("ok");
        }else{
            System.out.println("error");
        }
        //odejmowanie test
        c = Calculator.substract(6,5);
        if(c == -1) {
            System.out.println("ok");
        }else{
            System.out.println("error");
        }

    }
}
