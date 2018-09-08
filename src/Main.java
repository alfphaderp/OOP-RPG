import rpg.adventurer.Adventurer;

// The Main class is used for testing the various classes we will create in the rpg package
public class Main {
	public static void main(String[] args) {
		// Create Lordi and Iguanaga as Adventurer objects to have them battle
		Adventurer lordi = new Adventurer("Dena Lordi", 100, 1, 1_000_000, 500_000);
		Adventurer iguanaga = new Adventurer("Kerry Iguanaga", 1_000, 1_000_000, 0, 0.1);
		
		// Print out each teacher's initial health values
		System.out.println(lordi.getName() + " and " + iguanaga.getName() + " have entered the arena!");
		System.out.println(lordi.getName() + " has " + lordi.getHp() + " hp.");
		System.out.println(iguanaga.getName() + " has " + iguanaga.getHp() + " hp.");
		
		// Make Lordi attack Iguanaga
		lordi.attack(iguanaga);
		
		// See how Iguanaga's health changes after being attacked
		System.out.println(lordi.getName() + " has " + lordi.getHp() + " hp.");
		System.out.println(iguanaga.getName() + " has " + iguanaga.getHp() + " hp.");
		
		// Make Lordi attack Iguanaga again
		lordi.attack(iguanaga);
		
		// See how Iguanaga's health changes after being slain
		System.out.println(lordi.getName() + " has " + lordi.getHp() + " hp.");
		System.out.println(iguanaga.getName() + " has " + iguanaga.getHp() + " hp.");
	}
}
