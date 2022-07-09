/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import model.Account;
import model.Student;

/**
 *
 * @author dttnb
 */
// Lam viec voi 2 bang lecturer va student cung 1 luc
public class RoleDBContext extends DBContext<Account> {

    private final LecturerDBContext lecturerDal = new LecturerDBContext();
    private final StudentDBContext studentDal = new StudentDBContext();

    // Neu tim duoc Student -> Student
    // Neu tim duoc Lecturer -> Lecturer
    // Lam 2 method
    // 1 Method (Generic)(T) -> Kieu tong hop chung chung thich tra lai gi cung duoc List<T> -> List object gi cung duoc Student Lecturer
    public <T> T getByAccountId(int accountId) {
        Student student = studentDal.getByAccountId(accountId);
        if (student != null) {
            return (T) student; // T = Class Student
        }
        return (T) lecturerDal.getByAccountId(accountId); // T = Class Lecturer
    }

    @Override
    public ArrayList<Account> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Account get(Account entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Account entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Account entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Account entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
