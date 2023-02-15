package framework;

public class Player extends Character {
	Sword sword;
	private int lvl;
	public Player() {
		hp = 100;
	}

	@Override
	public void attack(Character target) {
		if(target == this)return;
		
		target.setHp(target.getHp()-sword.strong);
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
}
