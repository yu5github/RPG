package framework;

import java.util.Objects;

public abstract class Character {
	protected int hp;

	int getHp() {
		return hp;
	}

	void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		return hp == other.hp;
	}
	
	abstract public void attack(Character target);
}
