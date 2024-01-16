package com.javalec.function;

public class Calc {

	int num1;
	int num2;
	int result;

	public Calc() {

	}

	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double div() {
			return (double) num1 / num2;
		}

	public int calc(char a) {
		switch (a) {
		case '+':
			result = num1 + num2;
			return result;
		case '-':
			result = num1 - num2;
			return result;

		case '*':
			result = num1 * num2;
			return result;
		}
		return 0;
	}

}
