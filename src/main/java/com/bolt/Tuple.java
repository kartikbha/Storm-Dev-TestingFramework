package com.bolt;

import java.io.Serializable;
import java.util.Map;

public class Tuple implements Serializable {

	/**
	 * 
	 *  Define your tuples in this class with 
	 *  correct data types you are expected to receive in bolts and create getters and setters.
	 *  
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 *  Below tuples samples are kept for example. They have no use, you can remove them.
	 * 
	 */
	 
	private  Map<String,String> example1;
	private String example2;
	private Integer example3;
	public Map<String,String> getExample1() {
		return example1;
	}
	public void setExample1(Map<String,String> example1) {
		this.example1 = example1;
	}
	public String getExample2() {
		return example2;
	}
	public void setExample2(String example2) {
		this.example2 = example2;
	}
	public Integer getExample3() {
		return example3;
	}
	public void setExample3(Integer example3) {
		this.example3 = example3;
	}
	
}
