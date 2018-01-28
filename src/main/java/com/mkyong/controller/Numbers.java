package com.mkyong.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Numbers")
public class Numbers 
{
	@Id
    private int id;
	
	int number1;
	int number2;
	int result;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Numbers() {
	
	}

	public Numbers(int number1, int number2, int result) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public void BoothsMultiplication()
	{
		Booths b =new Booths();
		result = b.multiply(number1, number2);
	}
	
}
