package theadventure;

public class Enemies {
	public String classname;
	public int maxhitpoints;
	public int attackstat;
	public int defensestat;
	public int evasionchance;
	public int escapechance;
	
	
	public Enemies(String clname,int hp,int attstat,int defstat,int evchance,int escch) {
		this.classname=clname;
		this.maxhitpoints=hp;
		this.attackstat=attstat;
		this.defensestat=defstat;
		this.evasionchance=evchance;
		this.escapechance=escch;
	}
}
