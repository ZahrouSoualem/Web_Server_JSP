
package com.zahrou;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name="calculation",urlPatterns=("/abc"),"/abc/"))

public class calculation extends HttpServlet{
    
    /**
     *
     * @param request
     * @param respens
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse respens) throws ServletException, IOException{
            String action1 = request.getParameter("fnote1");
            double num1 = Double.parseDouble(action1);
            String action2 = request.getParameter("fnote2");
            double num2 = Double.parseDouble(action2);
            String action3 = request.getParameter("fnote3");
            double num3 = Double.parseDouble(action3);
            System.out.println(num1 +" "+num2+" "+num3);
            moyen moy1 = new moyen(num1, num2, num3);
            double moy = moy1.getMoy();
            moy =Double.parseDouble(new DecimalFormat("##.##").format(moy));
            //PrintWriter out = respens.getWriter();
            //out.println("Result is "+ moy);
            String url = "/result.jsp";
            request.setAttribute("moy", moy);
            getServletContext().getRequestDispatcher(url).forward(request, respens);
    }

    
    
}
