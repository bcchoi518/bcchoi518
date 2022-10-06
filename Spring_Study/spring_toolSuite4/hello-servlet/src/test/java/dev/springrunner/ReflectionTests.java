package dev.springrunner;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class ReflectionTests {
	@Test
	void objectCreateAndMethodCall() throws Exception
	{
		Duck duck = new Duck();
		duck.quack();
		
		//java.lang.reflect 패키지에 있는 자바문서를 활용하면 좋음
		Class<?> duckClass = Class.forName("dev.springrunner.ReflectionTests$Duck");
		Object duckObject = duckClass.getDeclaredConstructor().newInstance();
		Method quack = duckObject.getClass().getDeclaredMethod("quack", new Class<?>[0]);
		quack.invoke(duckObject);
	}//objectCreateAndMethodCall
	
	static class Duck 
	{
		void quack()
		{
			System.out.println("꽥꽥!");
		}//quack
	}//Duck
}//ReflectionTests
