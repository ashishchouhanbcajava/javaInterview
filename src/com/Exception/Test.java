package com.Exception;

public class Test {
	public void getid(int id) throws CustomException {
		if (id == 100) {
			throw new CustomException("Id not found ");
		}
	}

	public static void main(String[] args) throws CustomException  {
		Test test = new Test();
		test.getid(100);

	}
}
