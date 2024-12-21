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
import seed.pune.dao.UserDao1;
import seed.pune.bean.UserBean1;



public class UserHandler1 extends HttpServlet {    
    private static String INSERT = "/user1.jsp";
    private static String Edit = "/edit1.jsp";
    private static String UserRecord = "/listUser1.jsp";
    private UserDao1 dao;

    public UserHandler1() {
        super();
        dao = new UserDao1();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect="";
        String uId = request.getParameter("userid");        
        String action = request.getParameter("action");
        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
        {
        	int id = Integer.parseInt(uId);
        	UserBean1 user = new UserBean1();
        	user.setId(id);
            user.setfName(request.getParameter("firstName"));
            user.setlName(request.getParameter("email"));
            user.setMessage(request.getParameter("message"));
        	dao.addUser(user);
        	redirect = UserRecord;
            request.setAttribute("users1", dao.getAllUsers());    
           	System.out.println("Record Added Successfully");
        }
        else if (action.equalsIgnoreCase("delete")){
            String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);
            dao.removeUser(uid);
            redirect = UserRecord;
            request.setAttribute("users1", dao.getAllUsers());
            System.out.println("Record Deleted Successfully");
        }else if (action.equalsIgnoreCase("editform")){        	
        	redirect = Edit;            
        } else if (action.equalsIgnoreCase("edit")){
        	String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);            
            UserBean1 user = new UserBean1();
        	user.setId(uid);
            user.setfName(request.getParameter("firstName"));
            user.setlName(request.getParameter("email"));
            user.setMessage(request.getParameter("message"));
            dao.editUser(user);
            ///////////
            request.setAttribute("user1", user);
            redirect = UserRecord;
            System.out.println("Record updated Successfully");
         } else if (action.equalsIgnoreCase("listUser1")){
            redirect = UserRecord;
            request.setAttribute("users1", dao.getAllUsers());
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