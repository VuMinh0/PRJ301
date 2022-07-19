/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dttnb
 */
public class Lecturer {

    private int id;
    private int account_id;
    private String name;
    private String email;

    public Lecturer() {
    }

    public Lecturer(int id, int account_id, String name, String email) {
        this.id = id;
        this.account_id = account_id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "id=" + id + ", account_id=" + account_id + ", name=" + name + ", email=" + email + '}';
    }
}
