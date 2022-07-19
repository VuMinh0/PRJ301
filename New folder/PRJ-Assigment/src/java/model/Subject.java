/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dai8p
 */
public class Subject {

    private int id;
    private String shortName;
    private String fullName;
    private String instructor; // Lecturer

    public Subject() {
    }

    public Subject(int id, String shortName, String fullName, String instructor) {
        this.id = id;
        this.shortName = shortName;
        this.fullName = fullName;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", shortName=" + shortName + ", fullName=" + fullName + ", instructor=" + instructor + '}';
    }
}
