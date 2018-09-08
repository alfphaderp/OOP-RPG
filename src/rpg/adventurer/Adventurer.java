package rpg.adventurer;

// Defines the bare bones of what each adventurer should have
// This class will change in the future as we introduce new OOP concepts
public class Adventurer {
	// Some basic fields or properties that each adventurer has
	private String name;
	private boolean isAlive;
	private int level;
	private double hp, mp, atk;
	
	// A constructor to let us easily create adventurers by providing field values via parameters
	public Adventurer(String name, int level, double hp, double mp, double atk) {
		this.name = name;
		this.isAlive = true;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
	}
	
	// Attack another adventurer
	public void attack(Adventurer a) {
		System.out.println(name + " has attacked " + a.name + "!");
		a.changeHealth(-atk);
		if(a.hp <= 0) {
			a.isAlive = false;
			System.out.println(a.name + " has been slain by " + name);
		}
	}
	
	// Change the health of the adventurer
	public void changeHealth(double change) {
		hp += change;
	}

	// Getters and setters for accessing and modifying the adventurer's properties
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getMp() {
		return mp;
	}

	public void setMp(double mp) {
		this.mp = mp;
	}

	public double getAtk() {
		return atk;
	}

	public void setAtk(double atk) {
		this.atk = atk;
	}
}
