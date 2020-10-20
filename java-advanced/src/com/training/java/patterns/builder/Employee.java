package com.training.java.patterns.builder;


public class Employee {

    private String name;
    private String surname;
    private int    age;


    private Employee() {
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {

        private final Employee employee = new Employee();

        private EmployeeBuilder() {
        }

        public EmployeeBuilder age(final int ageParam) {
            this.employee.age = ageParam;
            return this;
        }

        public EmployeeBuilder surname(final String surnameParam) {
            this.employee.surname = surnameParam;
            return this;
        }

        public EmployeeBuilder name(final String nameParam) {
            this.employee.name = nameParam;
            return this;
        }

        public Employee build() {
            // Validation
            return this.employee;
        }

    }

}
