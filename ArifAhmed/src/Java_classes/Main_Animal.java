package Java_classes;

public class Main_Animal {

	public static void main(String[] args) {
		Dog_animal dog = new Dog_animal("SOKINA", 5);
		dog.makenoise();
		System.out.println(dog.name+" "+dog.age);

	}

}
