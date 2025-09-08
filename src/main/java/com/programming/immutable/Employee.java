package com.programming.immutable;

public final class Employee {

    private int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public Employee() {
    }

    public Employee modify(int employeeId) {
        if (employeeId == this.employeeId) {
            return this;
        } else {
            return new Employee(employeeId);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(10);
        System.out.println(e1.modify(10).hashCode());

        System.out.println(e1.modify(100).hashCode());

        System.out.println(e1.modify(10).hashCode());
    }
}
