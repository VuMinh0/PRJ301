/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class StudentClass {

    private int id;
    private int classId;
    private int studentId;
    private int subjectId;
    private int slotId;
    private int lecturerId;
    private String building;

    private Class classInfo; // StudentClass.Class.name -> Class name
    private Student student;
    private Subject subject;
    private Slot slot; // StudentClass.Slot.endTime
    private Lecturer lecturer;
    private Attendance attendance;

    public StudentClass() {
    }

    public StudentClass(int id, int classId, int studentId, int subjectId, int slotId, int lecturerId, String building) {
        this.id = id;
        this.classId = classId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.slotId = slotId;
        this.lecturerId = lecturerId;
        this.building = building;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Class getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(Class classInfo) {
        this.classInfo = classInfo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "StudentClass{" + "id=" + id + ", building=" + building + ", classInfo=" + classInfo + ", student=" + student + ", subject=" + subject + ", slot=" + slot + ", lecturer=" + lecturer + ", attendance=" + attendance + '}';
    }
}
