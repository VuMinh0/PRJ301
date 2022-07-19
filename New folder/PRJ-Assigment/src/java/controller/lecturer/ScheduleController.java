/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.lecturer;

import dal.SlotDBContext;
import dal.StudentClassDBContext;
import helper.TimeHelper;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lecturer;
import model.Slot;
import model.Student;
import model.StudentClass;

/**
 *
 * @author dai8p
 */
public class ScheduleController extends HttpServlet {

    private final TimeHelper timeHelper = new TimeHelper();
    private final SlotDBContext sltCtx = new SlotDBContext();
    private final StudentClassDBContext stClCtx = new StudentClassDBContext();
    private ArrayList<Slot> slots;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            int thisYear = Calendar.getInstance().get(Calendar.YEAR);
            int thisWeek = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR) - 2;

            LinkedHashMap<String, String> listWeekWithDate = timeHelper.getAllDateByWeekNumber(thisYear, thisWeek);
            LinkedHashMap<Integer, String> allWeekFromToDateInYear = timeHelper.getAllWeekFromToDateByYear(thisYear);

            slots = sltCtx.list();

            // Lay duoc session student id;
            Lecturer currentLoggedLecturer = (Lecturer) session.getAttribute("loggedLecturer");

            ArrayList<StudentClass> studentClassList = stClCtx.getByLecturerIdAndTime(currentLoggedLecturer.getId(), thisWeek, thisYear);

            request.setAttribute("thisYear", thisYear);
            request.setAttribute("thisChooseYear", thisYear);
            request.setAttribute("thisWeek", thisWeek);
            request.setAttribute("listWeekWithDate", listWeekWithDate);
            request.setAttribute("allWeek", allWeekFromToDateInYear);

            request.setAttribute("slots", slots);

            request.setAttribute("studentClassList", studentClassList);

            request.getRequestDispatcher("/schedule.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(controller.student.ScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            int thisYear = Calendar.getInstance().get(Calendar.YEAR);
            int thisChooseYear = Integer.parseInt(request.getParameter("ctl00$mainContent$drpYear"));
            int thisWeek = Integer.parseInt(request.getParameter("ctl00$mainContent$drpSelectWeek"));

            LinkedHashMap<String, String> listWeekWithDate = timeHelper.getAllDateByWeekNumber(thisChooseYear, thisWeek);
            LinkedHashMap<Integer, String> allWeekFromToDateInYear = timeHelper.getAllWeekFromToDateByYear(thisChooseYear);

            slots = sltCtx.list();

            // Lay duoc session student id;
            Lecturer currentLoggedLecturer = (Lecturer) session.getAttribute("loggedLecturer");

            ArrayList<StudentClass> studentClassList = stClCtx.getByLecturerIdAndTime(currentLoggedLecturer.getId(), thisWeek, thisChooseYear);
            studentClassList.forEach(s -> System.out.println(s.toString()));

            request.setAttribute("thisChooseYear", thisChooseYear);
            request.setAttribute("thisYear", thisYear);
            request.setAttribute("thisWeek", thisWeek);
            request.setAttribute("listWeekWithDate", listWeekWithDate);
            request.setAttribute("allWeek", allWeekFromToDateInYear);

            request.setAttribute("studentClassList", studentClassList);

            request.setAttribute("slots", slots);
            request.getRequestDispatcher("/schedule.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(controller.student.ScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
