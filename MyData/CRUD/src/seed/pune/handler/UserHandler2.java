package seed.pune.handler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import seed.pune.bean.UserBean2;
import seed.pune.dao.UserDao2;

public class UserHandler2 extends HttpServlet {    
    private static String INSERT = "/user2.jsp";
    private static String Edit = "/edit2.jsp";
    private static String UserRecord = "/listUser2.jsp";
    private UserDao2 dao;

    public UserHandler2() {
        super();
        dao = new UserDao2();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect="";
        String uId = request.getParameter("userid");        
        String action = request.getParameter("action");
        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
        {
        	int id = Integer.parseInt(uId);
        	UserBean2 user = new UserBean2();
        	user.setId(id);
            user.setfName(request.getParameter("firstName"));
            user.setlName(request.getParameter("lastName"));
            try {
                Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("mob"));
                user.setDob(dob);
            } catch (ParseException e) {
            	e.printStackTrace();
            	System.out.println("not iiiiiiiiiiiiinserted date");
            }

            
        	dao.addUser(user);
        	redirect = UserRecord;
            request.setAttribute("users2", dao.getAllUsers());    
           	System.out.println("Record Added Successfully");
        }
        else if (action.equalsIgnoreCase("delete")){
            String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);
            dao.removeUser(uid);
            redirect = UserRecord;
            request.setAttribute("users2", dao.getAllUsers());
            System.out.println("Record Deleted Successfully");
        }else if (action.equalsIgnoreCase("editform")){        	
        	redirect = Edit;            
        } else if (action.equalsIgnoreCase("edit")){
        	String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);            
            UserBean2 user = new UserBean2();
        	user.setId(uid);
            user.setfName(request.getParameter("firstName"));
            user.setlName(request.getParameter("lastName"));
            try {
                Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("mob"));
                user.setDob(dob);
            } catch (ParseException e) {
            	e.printStackTrace();
            }
            dao.editUser(user);
            request.setAttribute("user2", user);
            redirect = UserRecord;
            System.out.println("Record updated Successfully");
         } else if (action.equalsIgnoreCase("listUser2")){
            redirect = UserRecord;
            request.setAttribute("users2", dao.getAllUsers());
         } else {
            redirect = INSERT;
        }

        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}