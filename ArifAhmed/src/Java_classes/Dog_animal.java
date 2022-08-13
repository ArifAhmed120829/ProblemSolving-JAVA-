package Java_classes;

public class Dog_animal extends Animal {
	

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		System.out.println("Arghh Ooof Oof");
	}
	public Dog_animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

}
