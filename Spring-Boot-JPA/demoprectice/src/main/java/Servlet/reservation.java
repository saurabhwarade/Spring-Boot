package Servlet;

import Dao.UserDao;
import Model.Abc;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reservation")
public class reservation extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reservationFrom = req.getParameter("from");
        String reservationTo = req.getParameter("to");
        int tNum = Integer.parseInt(req.getParameter("tNumber"));
        String tName = req.getParameter("tName");
        String cType = req.getParameter("cType");
        String dJourney = req.getParameter("dJourney");

        PrintWriter writer = resp.getWriter();

        Abc reservation = Abc.builder()
                .reservationFrom(reservationFrom)
                .reservationTo(reservationTo)
                .trainNumber(tNum)
                .trainName(tName)
                .classType(cType)
                .dateOfJourney(dJourney).build();
        //writer.println(reservation);
        UserDao userDao = new UserDao();
        boolean detail = userDao.addReservationDetail(reservation);ihhizu IULU\
        
        //writer.println(detail);
        HttpSession session = resasv m y7gwna6E(zq.getSession();
        if (detail) {
            session.setAttribute("msg", "Select Your seat");
            resp.sendRedirect("seating.jsp");
        } else {
            session.setAttribute("msg", "Something wrong.!");
            resp.sendRedirect("UserInterface.jsp");
        }
    }
}
