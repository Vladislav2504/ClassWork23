package by.tms.entity;


public class Operation {
	private double num1;
	private double num2;
	private double result;
	private String operation;

	public Operation() {
	}

	public Operation(double num1, double num2, String operation) {
		this.num1 = num1;
		this.num2 = num2;
		this.operation = operation;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Operation{" +
				"num1=" + num1 +
				", num2=" + num2 +
				", result=" + result +
				", operation='" + operation + '\'' +
				'}';
	}
}
