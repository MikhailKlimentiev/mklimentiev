package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author mklimentiev
 * @since 01.04.2017
 * @version 1.0
*/
 public class Calculator {
	/**
	 * Поле result.
	*/
	private double result;

	/**
	 * Сложение.
	 * @param first первый параметр
	 * @param second второй параметр
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}

	/**
	 * Вычитание.
	 * @param first первый параметр
	 * @param second второй параметр
	*/
	public void subtract(double first, double second) {
		this.result = first - second;
	}

	/**
	 * Деление.
	 * @param first первый параметр
	 * @param second второй параметр
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}

	/**
	 * Умножение.
	 * @param first первый параметр
	 * @param second второй параметр
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}

	/**
	 * getResult.
	 *
	 * @return result
	*/
	double getResult() {
		return this.result;
	}
 }