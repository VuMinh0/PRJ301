/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lecturer;
import model.Student;

/**
 *
 * @author dttnb
 */
public class LecturerDBContext extends DBContext<Lecturer> {

    public List<Student> getStudentInClass(int lecturerId, String day) {
        try {
            List<Student> result = new ArrayList<>();
            String sql = "SELECT s.id as id,\n"
                    + "       s.account_id as account_id,\n"
                    + "       s.full_name as full_name,\n"
                    + "       s.gender as gender,\n"
                    + "       s.id_card as id_card\n"
                    + "FROM student s\n"
                    + "JOIN student_class sc ON s.id = sc.student_id\n"
                    + "JOIN attendance a ON a.student_class_id = sc.id\n"
                    + "WHERE a.day = ?\n"
                    + "      and sc.lecturer_id=?;";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, day);
            stm.setInt(2, lecturerId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                result.add(new Student(rs.getInt("id"), rs.getInt("account_id"), rs.getString("full_name"), rs.getBoolean("gender"), rs.getString("id_card")));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Lecturer getById(int id) {
        try {
            String sql = "SELECT * FROM lecturer\n"
                    + "WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new Lecturer(rs.getInt("id"), rs.getInt("account_id"), rs.getString("name"), rs.getString("email"));
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Lecturer getByAccountId(int accountId) {
        try {
            String sql = "SELECT * FROM lecturer\n"
                    + "WHERE account_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new Lecturer(rs.getInt("id"), rs.getInt("account_id"), rs.getString("name"), rs.getString("email"));
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Lecturer> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Lecturer get(Lecturer entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Lecturer entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Lecturer entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Lecturer entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        List<Student> test = new LecturerDBContext().getStudentInClass(2, "2022-07-19");

        test.forEach(s -> System.out.println(s.toString()));
    }
}
