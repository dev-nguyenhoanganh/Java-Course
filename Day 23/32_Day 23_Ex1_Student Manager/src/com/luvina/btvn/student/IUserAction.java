/**
 * @Project_Name 32_Day 23_Ex1_Student Manager
 */
package com.luvina.btvn.student;

import java.util.ArrayList;

/**
 * @author Hoang Anh
 * @since 8 thg 1, 2021
 * @version 1.0
 */
public interface IUserAction {

    public boolean signUp(String userName, 
						  String userID, 
						  String dateOfBirth,
						  String pass, 
                          String priorityLevel);
                          
    public String signIn(String userName, String pass);

	public User findStudentByAccount(String account);

	public ArrayList<User> findStudent(String studentName);

}
