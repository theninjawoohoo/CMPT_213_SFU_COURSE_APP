package ca.cmpt213.as5.model;

import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * This component class has the purpose of storing enrollingCap and totals.
 * The purpose of this is to allow the grouping of all offerings under one course.
 */

public class Component implements Comparable<Component>{
    private int enrollmentCap;
    private int enrollmentTotal;
    private String component;

    @Override
    public int compareTo(Component other) {
        return component.compareTo(other.component);
    }

    public Component(List<String> fields) {
        enrollmentCap = parseInt(fields.get(0));
        enrollmentTotal = parseInt(fields.get(1));
        component = fields.get(2).trim();
    }

    public String getType() {
        return component;
    }

    public void setType(String component) {
        this.component = component;
    }

    public int getEnrollmentCap() {
        return enrollmentCap;
    }

    public void setEnrollmentCap(int enrollmentCap) {
        this.enrollmentCap = enrollmentCap;
    }

    public void addEnrollmentCap(int aggregateCap) {
        enrollmentCap += aggregateCap;
    }

    public int getEnrollmentTotal() {
        return enrollmentTotal;
    }

    public void setEnrollmentTotal(int enrollmentTotal) {
        this.enrollmentTotal = enrollmentTotal;
    }

    public void addEnrollmentTotal(int aggregateTotal) {
        enrollmentTotal += aggregateTotal;
    }
}
