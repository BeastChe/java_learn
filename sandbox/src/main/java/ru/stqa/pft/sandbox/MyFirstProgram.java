package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");
		hello("Kot");

		Square s = new Square(3);
		System.out.println(s.area());

		Prugl p = new Prugl(3,2);
		System.out.println(p.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello " + somebody + "!");
	}

}
