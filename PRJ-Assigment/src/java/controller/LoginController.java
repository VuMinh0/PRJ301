/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.AccountDBContext;
import dal.LecturerDBContext;
import dal.RoleDBContext;
import dal.StudentDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;
import model.Student;

/**
 *
 * @author dttnb
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        Account account = (Account) session.getAttribute("loggedAccount");
        // Check da dang nhap chua?
//        if (account != null) {
//            // Check la giang vien hay sinh vien?
//            // Sinh vien
//            if ("STUDET".equals(session.getAttribute("role"))) {
//                response.sendRedirect("schedule");
//                return;
//            }
//            // Giang vien
//            response.sendRedirect("index"); // project-name/index
//            return;
//        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("ctl00$mainContent$txtUser");
        String pass = request.getParameter("ctl00$mainContent$txtPass");
        AccountDBContext accCtx = new AccountDBContext();
        StudentDBContext stuCtx = new StudentDBContext();
        LecturerDBContext lecCtx = new LecturerDBContext();

        HttpSession session = request.getSession();
        Account account = accCtx.login(user, pass);
        if (account != null) {
            session.setAttribute("loggedAccount", account);

            // Check là giang vien hay sinh vien
            Student student = stuCtx.getByAccountId(account.getId());
            if (student != null) {
                session.setAttribute("role", "STUDENT");
                session.setAttribute("loggedStudent", student);
            } else {
                session.setAttribute("role", "LECTURER");
                session.setAttribute("loggedLecturer", lecCtx.getByAccountId(account.getId()));
            }
            response.sendRedirect("index"); // -> GET(/login)
        } else {
            response.getWriter().println("login failed");
        }
    }
}
