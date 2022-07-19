/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import helper.TimeHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Attendance;

/**
 *
 * @author dttnb
 */
public class AttendanceDBContext extends DBContext<Attendance> {

    private final TimeHelper timeHelper = new TimeHelper();

    public Attendance getByStudentClassId(int studentClassId) {
        try {
            String sql = "SELECT * FROM attendance\n"
                    + "WHERE student_class_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, studentClassId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Attendance attendance = new Attendance(rs.getInt("id"), rs.getInt("student_class_id"), rs.getInt("week_number"), rs.getString("day"), rs.getInt("attendance_status"));

                // Convert day to new format
                attendance.setDay(timeHelper.convertStringToDate(attendance.getDay(), "yyyy-MM-dd", "dd/MM"));

                return attendance;
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AttendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Attendance> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Attendance get(Attendance entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Attendance entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Attendance entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Attendance entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        Attendance test = new AttendanceDBContext().getByStudentClassId(1);

        System.out.println(test.toString());
    }
}
