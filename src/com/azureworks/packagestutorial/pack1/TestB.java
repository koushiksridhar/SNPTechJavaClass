package pack1;
//import static pack1.TestA.*;

import pack1.pack3.TestE;

public class TestB {
	
	public static void main(String[] args) {
		TestA.aMethod1();
		
		//aMethod1();
		
		TestA aObj = new TestA();
		aObj.aMethod2();
		
		
		TestE eObj = new TestE();
		eObj.methodE1();
	}

}
