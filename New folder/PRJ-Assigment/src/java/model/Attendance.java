/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author dai8p
 */
public class Attendance {

    private int id;
    private int studentClassId;
    private int weekNumber;
    private String day;
    private int attendanceStatus;

    public Attendance() {
    }

    public Attendance(int id, int studentClassId, int weekNumber, String day, int attendanceStatus) {
        this.id = id;
        this.studentClassId = studentClassId;
        this.weekNumber = weekNumber;
        this.day = day;
        this.attendanceStatus = attendanceStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentClassId() {
        return studentClassId;
    }

    public void setStudentClassId(int studentClassId) {
        this.studentClassId = studentClassId;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(int attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    @Override
    public String toString() {
        return "Attendance{" + "id=" + id + ", studentClassId=" + studentClassId + ", weekNumber=" + weekNumber + ", day=" + day + ", attendanceStatus=" + attendanceStatus + '}';
    }
}
