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

import seed.pune.bean.UserBean;
import seed.pune.dao.UserDao;

public class UserHandler extends HttpServlet {    
    private static String INSERT = "/user.jsp";
    private static String Edit = "/edit.jsp";
    private static String UserRecord = "/listUser.jsp";
    private UserDao dao;

    public UserHandler() {
        super();
        dao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect="";
        String uId = request.getParameter("userid");        
        String action = request.getParameter("action");
        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
        {
        	int id = Integer.parseInt(uId);
        	UserBean user = new UserBean();
        	user.setId(id);
            user.setfName(request.getParameter("firstName"));
            user.setlName(request.getParameter("lastName"));
            user.setTel(request.getParameter("mob"));
            user.setEmail(request.getParameter("email"));
            user.setNumberofrooms(request.getParameter("numroom"));
            user.setTwomember(request.getParameter("twomember"));
            user.setThreemember(request.getParameter("threemebr"));
            user.setCheck1(request.getParameter("mess"));
            user.setCheck2(request.getParameter("library"));
            user.setCheck3(request.getParameter("jim"));
        	dao.addUser(user);
        	redirect = UserRecord;
            request.setAttribute("users", dao.getAllUsers());    
           	System.out.println("Record Added Successfully");
           //	System.out.println("Add"+dao.toString());
        }
        else if (action.equalsIgnoreCase("delete")){
            String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);
            dao.removeUser(uid);
            redirect = UserRecord;
            request.setAttribute("users", dao.getAllUsers());
            System.out.println("Record Deleted Successfully");
        }else if (action.equalsIgnoreCase("editform")){        	
        	redirect = Edit;            
        } else if (action.equalsIgnoreCase("edit")){
        	String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);            
            UserBean user = new UserBean();
        	user.setId(uid);
            user.setfName(request.getParameter("firstName"));
            user.setlName(request.getParameter("lastName"));
            user.setTel(request.getParameter("mob"));
            user.setTel(request.getParameter("mob"));
            user.setEmail(request.getParameter("email"));
            user.setNumberofrooms(request.getParameter("numroom"));
            user.setTwomember(request.getParameter("twomember"));
            user.setThreemember(request.getParameter("threemebr"));
            user.setCheck1(request.getParameter("mess"));
            user.setCheck2(request.getParameter("library"));
            user.setCheck3(request.getParameter("jim"));
            dao.editUser(user);
            request.setAttribute("user", user);
            redirect = UserRecord;
            System.out.println("Record updated Successfully");
         } else if (action.equalsIgnoreCase("listUser")){
            redirect = UserRecord;
            request.setAttribute("users", dao.getAllUsers());
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