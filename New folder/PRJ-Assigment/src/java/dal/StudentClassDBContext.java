/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.StudentClass;

/**
 *
 * @author dai8p
 */
public class StudentClassDBContext extends DBContext<StudentClass> {

    private final ClassDBContext clsCtx = new ClassDBContext();
    private final StudentDBContext stdCtx = new StudentDBContext();
    private final SubjectDBContext sbjCtx = new SubjectDBContext();
    private final SlotDBContext sltCtx = new SlotDBContext();
    private final LecturerDBContext lecCtx = new LecturerDBContext();
    private final AttendanceDBContext attCtx = new AttendanceDBContext();

    public ArrayList<StudentClass> getByStudentIdAndTime(int studentId, int weekNumber, int Year) {
        try {
            ArrayList<StudentClass> result = new ArrayList<>();
            String sql = "SELECT sc.id          as id,\n"
                    + "       sc.class_id    as class_id,\n"
                    + "       sc.student_id  as student_id,\n"
                    + "       sc.subject_id  as subject_id,\n"
                    + "       sc.slot_id     as slot_id,\n"
                    + "       sc.lecturer_id as lecturer_id,\n"
                    + "       sc.building    as building\n"
                    + "FROM student_class sc\n"
                    + "         JOIN attendance a ON sc.id = a.student_class_id\n"
                    + "WHERE student_id = ?\n"
                    + "  AND week_number = ?\n"
                    + "  AND YEAR(day) = ?;";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, studentId);
            stm.setInt(2, weekNumber);
            stm.setInt(3, Year);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                StudentClass sc = new StudentClass(rs.getInt("id"), rs.getInt("class_id"), rs.getInt("student_id"), rs.getInt("subject_id"), rs.getInt("slot_id"), rs.getInt("lecturer_id"), rs.getString("building"));
                // Set class
                sc.setClassInfo(clsCtx.getById(sc.getClassId()));
                // Set Lectuerer
                sc.setStudent(stdCtx.getById(sc.getStudentId()));
                // Set Subject
                sc.setSubject(sbjCtx.getById(sc.getSubjectId()));
                // Set Slot
                sc.setSlot(sltCtx.getById(sc.getSlotId()));
                // Set Lecturer
                sc.setLecturer(lecCtx.getById(sc.getLecturerId()));
                // Set Attendance
                sc.setAttendance(attCtx.getByStudentClassId(sc.getId()));
                result.add(sc);
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<StudentClass> getByLecturerIdAndTime(int lecturerId, int weekNumber, int Year) {
        try {
            ArrayList<StudentClass> result = new ArrayList<>();
            String sql = "SELECT sc.id          as id,\n"
                    + "       sc.class_id    as class_id,\n"
                    + "       sc.student_id  as student_id,\n"
                    + "       sc.subject_id  as subject_id,\n"
                    + "       sc.slot_id     as slot_id,\n"
                    + "       sc.lecturer_id as lecturer_id,\n"
                    + "       sc.building    as building\n"
                    + "FROM student_class sc\n"
                    + "         JOIN attendance a ON sc.id = a.student_class_id\n"
                    + "WHERE lecturer_id = ?\n"
                    + "  AND week_number = ?\n"
                    + "  AND YEAR(day) = ?;";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, lecturerId);
            stm.setInt(2, weekNumber);
            stm.setInt(3, Year);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                StudentClass sc = new StudentClass(rs.getInt("id"), rs.getInt("class_id"), rs.getInt("student_id"), rs.getInt("subject_id"), rs.getInt("slot_id"), rs.getInt("lecturer_id"), rs.getString("building"));
                // Set class
                sc.setClassInfo(clsCtx.getById(sc.getClassId()));
                // Set Lectuerer
                sc.setStudent(stdCtx.getById(sc.getStudentId()));
                // Set Subject
                sc.setSubject(sbjCtx.getById(sc.getSubjectId()));
                // Set Slot
                sc.setSlot(sltCtx.getById(sc.getSlotId()));
                // Set Lecturer
                sc.setLecturer(lecCtx.getById(sc.getLecturerId()));
                // Set Attendance
                sc.setAttendance(attCtx.getByStudentClassId(sc.getId()));
                result.add(sc);
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    public ArrayList<StudentClass> getByStudentId(int studentId) {
        try {
            ArrayList<StudentClass> result = new ArrayList<>();
            String sql = "SELECT * FROM student_class\n";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                StudentClass sc = new StudentClass(rs.getInt("id"), rs.getInt("class_id"), rs.getInt("student_id"), rs.getInt("subject_id"), rs.getInt("slot_id"), rs.getInt("lecturer_id"), rs.getString("building"));
                // Set class
                sc.setClassInfo(clsCtx.getById(sc.getClassId()));
                // Set Lectuerer
                sc.setStudent(stdCtx.getById(sc.getStudentId()));
                // Set Subject
                sc.setSubject(sbjCtx.getById(sc.getSubjectId()));
                // Set Slot
                sc.setSlot(sltCtx.getById(sc.getSlotId()));
                // Set Lecturer
                sc.setLecturer(lecCtx.getById(sc.getLecturerId()));
                // Set Attendance
                sc.setAttendance(attCtx.getByStudentClassId(sc.getId()));
                result.add(sc);
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<StudentClass> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public StudentClass get(StudentClass entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(StudentClass entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(StudentClass entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(StudentClass entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        ArrayList<StudentClass> test = new StudentClassDBContext().getByLecturerIdAndTime(2, 1, 2021);

        test.forEach(t -> System.out.println(t));
    }
}
