/**
 * @Project_Name 32_Ex3_Todo List
 */
package com.luvina.todolist.main;

import com.luvina.todolist.manager.Manager;
import com.luvina.todolist.task.Task;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager man = new Manager();

		man.addTask(new Task("Gấp chăn màn", "5h15"));
		man.addTask(new Task("Nấu cơm", "1h6"));
		man.addTask(new Task("Rửa bát", "11h03"));
		man.display();

		String result = man.modifyTask(new Task("Rửa bát", "12h00"));
		System.out.println(result);

		System.out.println("Kết quả tìm kiếm:");
		man.display(man.findTask("5h15"));

		result = man.alarm();
		System.out.println("\nBáo thức: ");
		System.out.println(result);
	}

}
