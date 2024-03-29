package com.kodilla.hibernate.manytomany.facade;

public final class EmployeeDto {
    private final String name;
    private final String lastname;

    public EmployeeDto(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
