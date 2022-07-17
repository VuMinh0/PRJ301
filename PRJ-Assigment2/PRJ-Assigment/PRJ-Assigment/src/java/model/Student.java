/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dttnb
 */
public class Student {

    private int id;
    private int accountId;
    private String fullName;
    private boolean gender;
    private String idCard;

    public Student() {
    }

    public Student(int id, int accountId, String fullName, boolean gender, String idCard) {
        this.id = id;
        this.accountId = accountId;
        this.fullName = fullName;
        this.gender = gender;
        this.idCard = idCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", accountId=" + accountId + ", fullName=" + fullName + ", gender=" + gender + ", idCard=" + idCard + '}';
    }
}
