import java.util.Map;
import java.util.Scanner;

public class virtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		virtualPetShelter listPets = new virtualPetShelter();

		virtualPet kenny = new virtualPet("Kenny", "friendly duck", 83, 34, 23);
		virtualPet cartman = new virtualPet("Cartman", "angry cat", 69, 49, 2);
		virtualPet stan = new virtualPet("Stan", "calm puppy", 39, 18, 8);
		virtualPet kyle = new virtualPet("Kyle", "lively dog", 59, 19, 37);

		Map<String, virtualPet> shelterPets = listPets.getAllPets();

		listPets.intake("Kenny (friendly duck)", kenny);
		listPets.intake("Cartman (angry cat)", cartman);
		listPets.intake("Stan (the calm puppy)", stan);
		listPets.intake("Kyle (the lively dog)", kyle);

		System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!");
		System.out.println("The pets in this shelter are: " + shelterPets.keySet());

		System.out.println("\nThis is the status of your pets: \nName: \tHunger: \tThirst: \tBoredom:" + kenny + cartman
				+ stan + kyle);

		do {

			System.out.println(
					"Choose one: \n1.Feed the pets \n2.Water the pets \n3.Play with the pets \n4.Adopt a pet \n5.Admit a pet \n6.Quit");

			int interact = input.nextInt();
			if (interact == 1) {
				kenny.feed();
				cartman.feed();
				stan.feed();
				kyle.feed();
				System.out.println("Nice job! You fed all the pets.");

			} else if (interact == 2) {
				kenny.water();
				cartman.water();
				stan.water();
				kyle.water();
				System.out.println("You gave all the pets water!");

			} else if (interact == 3) {
				System.out.println("Who would you like to play with? " + shelterPets.keySet());
				String who = input.next();
				if (who.toLowerCase().equals("kenny")) {
					kenny.play();
					System.out.println("Great! kenny's boredom level is now " + kenny.boredom);
				} else if (who.toLowerCase().equals("cartman")) {
					cartman.play();
					System.out.println("Great! Cartman's boredom level is now " + cartman.boredom);
				} else if (who.toLowerCase().equals("stan")) {
					stan.play();
					System.out.println("Great! Stan's boredom level is now " + stan.boredom);
				} else if (who.toLowerCase().equals("Kyle")) {
					kyle.play();
					System.out.println("Great! Kyle's boredom level is now " + kyle.boredom);
				}

			} else if (interact == 4) {
				System.out.println("Which pet would you like to adopt? " + shelterPets.keySet());
				String adopt = input.next();
				if (adopt.toLowerCase().equals("kenny")) {
					listPets.remove("Kenny", kenny);
					System.out.println("Awww You've adopted Kenny!");
					System.out.println(shelterPets.keySet());
				} else if (adopt.toLowerCase().equals("cartman")) {
					listPets.remove("cartman", cartman);
					System.out.println("Awww You've adopted Cartman");
					System.out.println(shelterPets.keySet());
				} else if (adopt.toLowerCase().equals("stan")) {
					listPets.remove("stan", stan);
					System.out.println("Awww You've adopted Stan");
					System.out.println(shelterPets.keySet());
				} else if (adopt.toLowerCase().equals("Kyle")) {
					listPets.remove("kyle", kyle);
					System.out.println("Awww You've adopted Kyle");
					System.out.println(shelterPets.keySet());
				}
			} else if (interact == 5) {
				System.out.println("What is the name of your pet?");
				String newPetName = input.next();
				System.out.println("What type of pet is it?");
				//String newPetTraits = input.next();
				//virtualPet newPet = new virtualPet("newPetName", newPetTraits);
				// listPets.intake("newPetName", newPetTraits);
				System.out.println("Ok great! We will take great care of " + newPetName);
			} else {
				System.out.println(
						"You have quit the game. Probably because it doesn't work very well. I can't blame you.");
				break;
			}

			System.out.println(
					"For the status of all pets, type 'status'; for an invididual pets status, type the pets name; if you'd like a list of options type 'list'.");
			String options = input.next();
			if (options.toLowerCase().equals("status")) {
				System.out.println(
						"Here is the pets updated status at the end of the day: \nName: \tHunger: \tThirst: \tBoredom:"
								+ kenny + cartman + stan + kyle);
			} else if (options.toLowerCase().equals("list")) {
				System.out.println("What would you like to do?");
			} else if (options.toLowerCase().equals("kenny")) {
				System.out.println("\nName: \tHunger: \tThirst: \tBoredom:" + kenny);
			} else if (options.toLowerCase().equals("cartman")) {
				System.out.println("\nName: \tHunger: \tThirst: \tBoredom:" + cartman);
			} else if (options.toLowerCase().equals("stan")) {
				System.out.println("\nName: \tHunger: \tThirst: \tBoredom:" + stan);
			} else if (options.toLowerCase().equals("kyle")) {
				System.out.println("\nName: \tHunger: \tThirst: \tBoredom:" + kyle);
			}

		} while ((!shelterPets.isEmpty()) && (cartman.hunger <= 100) && (stan.hunger <= 100) && (kenny.hunger <= 100)
				&& (kyle.hunger <= 100));
		{
			if (shelterPets.isEmpty()) {
				System.out.println("Congratulations! All the pets have been adopted.");
			} else if (cartman.hunger > 100) {
				System.out.println("Cartman died of hunger.");
			} else if (kenny.hunger > 100) {
				System.out.println("Kenny died of hunger.");
			} else if (kyle.hunger > 100) {
				System.out.println("Kyle died of hunger.");
			} else if (stan.hunger > 100) {
				System.out.println("Stan died of hunger.");
			}
			// listPets.tick();
			// stan.time();
			// kyle.time();
			// kenny.time();
		}
		input.close();
	}
}
