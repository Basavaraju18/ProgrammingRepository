package com.bas.newInstanceMethod;

public class NewInstanceMethodMainClass {
	
	public static void main(String[] args) {
		
		
		try {
			Dinga d1=(Dinga) Class.forName("com.bas.newInstanceMethod.Dilnga").newInstance();
			System.out.println(d1);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/**
In Java, there are several ways to create objects. Here are the most common methods:

1. Using the `new` Keyword:
   You can create an object of a class using the `new` keyword followed by the class constructor. For example:

   ```java
   ClassName objectName = new ClassName();
   ```

2. Using Object Cloning:
   Java provides the `clone()` method, which can be used to create a copy of an existing object. The class you want to clone must implement the `Cloneable` interface and override the `clone()` method.

   ```java
   MyClass originalObject = new MyClass();
   MyClass clonedObject = (MyClass) originalObject.clone();
   ```

3. Using Class.forName() method:
   You can use the `Class.forName()` method to create objects dynamically by specifying the class name as a string. This is particularly useful for scenarios where you don't know the class name at compile time.

   ```java
   String className = "com.example.MyClass";
   Class<?> clazz = Class.forName(className);
   Object object = clazz.newInstance();
   ```

4. Using Object Deserialization:
   You can create objects by deserializing them from a byte stream using Java's ObjectInputStream. This is often used for reading objects from files or network streams.

   ```java
   FileInputStream fileInputStream = new FileInputStream("object.ser");
   ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
   MyClass obj = (MyClass) objectInputStream.readObject();
   ```

5. Using Factory and Static Factory Methods:
   Some classes provide factory methods that create objects. These methods are typically declared as `static` and return an instance of the class.

   ```java
   MyClass object = MyClass.createInstance(); // Assuming createInstance is a static factory method.
   ```

6. Using Dependency Injection:
   You can use dependency injection frameworks like Spring to manage and create objects for you. These frameworks allow you to configure object creation and manage object lifecycles.

   ```java
   @Autowired
   private MyClass myClass;
   ```

These are some of the common ways to create objects in Java. The choice of which method to use depends on the specific requirements and design patterns of your application.

*/