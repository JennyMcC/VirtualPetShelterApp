
public class virtualPet {
	String name;
	String description;
	int hunger;
	int thirst;
	int boredom;
	int interact;

	public virtualPet() {

	}

	public virtualPet(String petName, String traits) {
		name = petName;
		description = traits;
	}

	public virtualPet(String petName, String traits, int petHunger, int petThirst, int petBoredom) {
		name = petName;
		description = traits;
		hunger = petHunger;
		thirst = petThirst;
		boredom = petBoredom;
	}

	public String pet() {
		return name + ", " + description;
	}

	public int feed() {
		hunger = hunger - 10;
		thirst = thirst + 5;
		boredom = boredom + 3;
		return hunger + thirst + boredom;
	}

	public int water() {
		thirst = thirst - 10;
		return thirst;
	}

	public int play() {
		boredom = boredom - 10;
		thirst = thirst + 5;
		hunger = hunger + 5;
		return boredom + thirst + hunger;
	}

	public int time() {
		boredom = boredom - 4;
		thirst = thirst + 4;
		hunger = hunger + 4;
		return boredom + thirst + hunger;
	}

	public String toString() {
		return "\n" + name + "\t" + hunger + "\t\t" + thirst + "\t\t" + boredom;
	}

}
