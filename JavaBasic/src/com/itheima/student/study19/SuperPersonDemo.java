package com.itheima.student.study19;

public class SuperPersonDemo {
	public static void main(String[] args) {
		Person person = new Person();
		SuperPerson superPerson = new SuperPerson(person);
		superMan superMan = new superMan();
		person.eat();
		superPerson.superEat();
		superMan.eat();
		

	}
}


class Person{
	
	public void eat() {
		System.out.println("eat");
	}
}

class SuperPerson{
	private Person person;

	public SuperPerson(Person person) {
		super();
		this.setPerson(person);
	}
	
	public void superEat() {
		System.out.println("wine");
		System.out.println("eat");
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}

class superMan extends Person{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("walk");
	}
}