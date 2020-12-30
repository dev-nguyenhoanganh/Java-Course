/**
 * @Project_Name 32_Ex1_Study English Game
 */
package com.luvina.english.word;

/**
 * @author Hoang Anh
 * @since 23 thg 12, 2020
 * @version 1.0
 */
public class Word {
	private String word;
	private String vnMean;
	
	/**
	 * 
	 */
	public Word(String word, String vnMean) {
		this.word   = word;
		this.vnMean = vnMean;
	}

	@Override
	public String toString() {
		return "* " + word + "  \t\t" + vnMean;
	}

	@Override
	public boolean equals(Object obj) {
		Word object = (Word) obj;
		return object.word.equals(this.word);
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the vnMean
	 */
	public String getVnMean() {
		return vnMean;
	}

	/**
	 * @param vnMean the vnMean to set
	 */
	public void setVnMean(String vnMean) {
		this.vnMean = vnMean;
	}
}
