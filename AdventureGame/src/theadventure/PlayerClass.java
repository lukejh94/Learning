package theadventure;

public class PlayerClass {
	public String classname;
	public int hitpoints;
	public int attackstat;
	public int defensestat;
	public int evasionchance;
	public int escapechance;
	
	public PlayerClass(String name,int hp,int attstat,int defstat,int evchance,int escch) {
		this.classname=name;
		this.hitpoints=hp;
		this.attackstat=attstat;
		this.defensestat=defstat;
		this.evasionchance=evchance;
		this.escapechance=escch;
		

	}
}
