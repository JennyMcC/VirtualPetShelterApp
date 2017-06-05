import java.util.HashMap;
import java.util.Map;


public class virtualPetShelter {

	Map<String, virtualPet> allPets = new HashMap<String, virtualPet>();

	public Map<String, virtualPet> getAllPets() {
		return allPets;
	}

	public void setAllPets(Map<String, virtualPet> allPets) {
		this.allPets = allPets;
	}

	void intake(String name, virtualPet pet) {
		allPets.put(name, pet);
	}

	void values(String name, virtualPet pet) {
		allPets.values();
	}

	void key(String name, virtualPet pet) {
		allPets.keySet();
	}

	void remove(String name, virtualPet pet) {
		allPets.remove(name, pet);
	}

	public void addPet(virtualPet allPets) {

	}

	void getPet(String pet) {

	}

	void adopt() {

	}

	void feedPets(int feed) {

	}

	void waterPets(int water) {

	}

	void playWithPet(int boredom) {

	}

	void values(String pet) {
	}
}