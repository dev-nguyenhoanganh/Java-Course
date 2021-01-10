/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.user;

/**
 * @author Hoang Anh
 * @since 10 thg 1, 2021
 * @version 1.0
 */
public interface IUserAction {

    public boolean signUp(String userID, 
						  String name, 
						  String date, 
						  String account, 
						  String pass,
						  String priorityLevel);

	public User signIn(String userID, String pass);

}
