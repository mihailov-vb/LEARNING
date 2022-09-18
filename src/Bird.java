public abstract class Bird {
	private String species;
	private int age;

	public abstract void fly();

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Mockingjay extends Bird {
	@Override
	public void fly() {
		System.out.println("Птичка лети!");
	}

	public static void main(String[] args) {
		Mockingjay mockingjay = new Mockingjay();
		mockingjay.setAge(4);
		System.out.println(mockingjay.getAge());
	}
}
