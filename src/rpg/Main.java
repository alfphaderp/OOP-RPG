package rpg;

import rpg.adventurer.Adventurer;

public class Main {
	public static void main(String[] args) {
		Adventurer lordi = new Adventurer("Dena Lordi", 100, 1, 1_000_000, 500_000);
		Adventurer iguanaga = new Adventurer("Kerry Iguanaga", 1_000, 1_000_000, 0, 0.1);
		
		System.out.println(lordi.getName() + " and " + iguanaga.getName() + " have entered the arena!");
		System.out.println(lordi.getName() + " has " + lordi.getHp() + " hp.");
		System.out.println(iguanaga.getName() + " has " + iguanaga.getHp() + " hp.");
		
		lordi.attack(iguanaga);
		
		System.out.println(lordi.getName() + " has " + lordi.getHp() + " hp.");
		System.out.println(iguanaga.getName() + " has " + iguanaga.getHp() + " hp.");
		
		lordi.attack(iguanaga);
		
		System.out.println(lordi.getName() + " has " + lordi.getHp() + " hp.");
		System.out.println(iguanaga.getName() + " has " + iguanaga.getHp() + " hp.");
	}
}
