class Person2{}
class Student2 extends Person2{}
class Researcher extends Person2{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person2 p) {
		if(p instanceof Person2) {
			System.out.print("Person2 ");
		}
		if(p instanceof Student2) {
			System.out.print("Student2 ");
		}
		if(p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) {
			System.out.println("Professor ");
		}
		System.out.println();
	}
}
