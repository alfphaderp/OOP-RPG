package rpg.adventurer;

public class Adventurer {
	private String name;
	private boolean isAlive;
	private int level;
	private double hp;
	private double mp;
	private double atk;
	
	public Adventurer(String name, int level, double hp, double mp, double atk) {
		this.name = name;
		this.isAlive = true;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
	}
	
	public void attack(Adventurer a) {
		System.out.println(name + " has attacked " + a.name + "!");
		a.changeHealth(-atk);
		if(a.hp <= 0) {
			a.isAlive = false;
			System.out.println(a.name + " has been slain by " + name);
		}
	}
	
	public void changeHealth(double change) {
		hp += change;
	}

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
