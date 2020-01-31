package com.capgemini.mvcexample;

public class StudentView {
    public void printStudentDetails(String studentName, String lastName){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + lastName);
    }
}