/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author dttnb
 */
public class AuthenticationRequired implements Filter {
    
    public void init(FilterConfig args) throws ServletException {
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest rq = (HttpServletRequest) request; // Ep kieu vi thu vien Servlet Request khong co session =))
        HttpServletResponse rp = (HttpServletResponse) response;
        HttpSession session = rq.getSession();
        
        if (session.getAttribute("loggedAccount") != null) {
            // Cho phep truy cap vao controller
            chain.doFilter(request, response);
            return;
        }
        // Neu chua dang nhap chuyen huong sang URL login
        rp.sendRedirect("login");
    }
    
    public void destroy() {
    }
}
