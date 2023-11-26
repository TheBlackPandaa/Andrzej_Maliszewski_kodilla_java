package com.kodilla.patterns.challenges.productorderservice;

public class EmailService implements OrderInformationService {

    @Override
    public void informUser(User user) {
        System.out.println("Confirmation e-mail sent to " + user.getUserName() + " " + user.getUserSurname());
    }
}
