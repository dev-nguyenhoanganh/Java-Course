/**
 * @Project_Name 32_Ex1_Study English Game
 */
package com.luvina.english.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.luvina.english.word.Word;

/**
 * @author Hoang Anh
 * @since 23 thg 12, 2020
 * @version 1.0
 */
public class WordManager {
	private ArrayList<Word> listWord;
	private String category;

	/**
	 * 
	 */
	public WordManager(String category) {
		this.category = category;
		listWord = new ArrayList<Word>();
	}

	public void display(Word[] array) {
		if(array.length == 0) {
			System.out.println("\nKhông có phần tử");
		}
		System.out.println();
		for (Word word : array) {
			System.out.println(word.toString());
		}
	}

	public void display() {
		if(listWord.isEmpty()) {
			System.out.println("\nKhông có phần tử");
		}
		System.out.println();
		System.out.println(toString());
		for (Word word : listWord) {
			System.out.println(word);
		}
	}

	public String addWord(String word, String vnMean) {
		Word newWord = new Word(word, vnMean);
		if(listWord.contains(newWord)) {
			return "\nTừ này đã tồn tại trong danh sách";
		} else {
			listWord.add(newWord);
			return "\nThêm thành công từ - \"" + word + "\"";
		}
	}

	public Word[] getTwoWordRandom() {
		if(listWord.size() < 2) {
			return null;
		}
		ArrayList<Word> temp = new ArrayList<Word>();
		temp = (ArrayList<Word>) listWord.clone();
		Collections.shuffle(temp);

		return new Word[] {temp.get(0), temp.get(1)};
	}

	public String remove(String word) {
		if(word.isEmpty()) {
			return "\nDữ liệu nhập vào không hợp lệ";
		}
		Word check = new Word(word, "");
		
		int idx = listWord.indexOf(check);

		if(idx == -1) {
			return "\nKhông tồn tại từ bạn muốn xóa";
		} else {
			listWord.remove(idx);
			return "\nĐã xóa từ - \"" + word + "\" - khỏi danh sách";
		}
	}

	@Override
	public String toString() {
		return "Từ vựng chủ đề: " + category;
	}
}
