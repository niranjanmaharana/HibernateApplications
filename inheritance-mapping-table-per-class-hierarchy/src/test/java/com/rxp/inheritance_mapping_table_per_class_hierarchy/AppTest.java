package com.rxp.inheritance_mapping_table_per_class_hierarchy;

class OuterClass {
	private static String msg = "GeeksForGeeks";

	public static class NestedStaticClass {
		static{
			System.out.println("NestedStaticClass.static()");
		}
		public void printMessage() {
			System.out.println("Message from nested static class: " + msg);
		}
	}

	public class InnerClass {
		public void display() {
			System.out.println("Message from non-static nested class: " + msg);
		}
	}
}

public class AppTest {
	public static void main(String args[]) {
		/*OuterClass outerClass = new OuterClass();*/
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		/*OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		printer.printMessage();
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.display();
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		innerObject.display();*/
	}
}