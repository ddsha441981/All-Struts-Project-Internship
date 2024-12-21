package org.spring.UtilityClasses;

public class SqlQueries {

	public static String vaildlogin = "select userId,username,password,roleName from demologin where username=? and password=? and roleName=?";
}
