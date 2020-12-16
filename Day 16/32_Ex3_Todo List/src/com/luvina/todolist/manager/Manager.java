/**
 * @Project_Name 32_Ex3_Todo List
 */
package com.luvina.todolist.manager;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.luvina.todolist.task.Task;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class Manager {
	private ArrayList<Task> list;

	/**
	 * Phương thức khởi tạo đối tượng 
	 */
	public Manager() {
		list = new ArrayList<Task>();
	}

	/**
	 * Phương thức hiển thị các tác vụ có trong danh sách
	 */
	public void display() {
		for (Task task : list) {
			task.setId(list.indexOf(task));
			System.out.println(task.toString());
		}
	}

	/**
	 * Phương thức hiển thị các tác vụ có trong danh sách
	 * @param list Danh sách cần hiển thị
	 */
	public void display(ArrayList<Task> list) {
		for (Task task : list) {
			task.setId(list.indexOf(task));
			System.out.println(task.toString());
		}
	}

	/**
	 * Thêm mới một tác vụ
	 * @param newTask tác vụ mới cần thêm
	 * @return Chuỗi trả về kết quả, đã thêm thành công hay chưa
	 */
	public String addTask(Task newTask) {
		if (list.contains(newTask)) {
			return "\nĐã tồn tại tác vụ này";
		} else {
			this.list.add(newTask);
			return "\nThêm thành công";
		}
	}

	/**
	 * Sửa một tác vụ dựa theo nội dung
	 * @param newTask tác vụ mới
	 * @return chuổi trả về kết quả, đã sửa thành công hay chưa
	 */
	public String modifyTask(Task newTask) {
		int index = list.indexOf(newTask);
		if (index == -1) {
			return "\nKhông tồn tại tác vụ cần sửa";
		} else {
			this.list.set(index, newTask);
			return "\nSửa thành công";
		}
	}

	/**
	 * Xóa một tác vụ khỏi danh sách
	 * @param newTask Tác vụ cần xóa
	 * @return Kết quả đã xóa thành công hay chưa
	 */
	public String removeTask(Task newTask) {
		int idx = list.indexOf(newTask);
		if (idx == -1) {
			return "\nKhông tồn tại tác vụ cần xóa";
		} else {
			list.remove(idx);
			return "\nXóa thành công";
		}
	}

	/**
	 * Tìm kiếm các tác vụ có cùng nội dung
	 * @param content nội dung của tác vụ cần tìm
	 * @return danh sách các tác vụ 
	 */
	public ArrayList<Task> findTask(String content) {
		ArrayList<Task> result = new ArrayList<Task>();
		String regex = buildRegex(content);
		for (Task ele : list) {
			if (Pattern.matches(regex, ele.getContent())) {
				result.add(ele);
			} else if (Pattern.matches(regex, ele.getTime())) {
				result.add(ele);
			}
		}
		return result;
	}

	/**
	 * Báo thức khi có tác vụ đến thời gian cần thực hiện
	 * @return Chuỗi nhắc nhở đã tới thời gian ghực hiện hay chưa
	 */
	public String alarm() {
		String result = "";
		for (Task task : list) {
			result += task.alarm() + " : " + task.getContent() + "\n";
		}
		return result;
	}

	// -------------------- PRIVATE LAYER --------------------

	/**
	 * Xây dựng chuỗi regex cho quá trình tìm kiếm
	 * @param name chuỗi cần tách thành regex
	 * @return chuỗi regex
	 */
	private String buildRegex(String name) {
		String result = ".*";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			result += "[" + Character.toUpperCase(ch) + "|" + Character.toLowerCase(ch) + "].*";
		}
		return result;
	}
}
