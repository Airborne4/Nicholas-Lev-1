
public class person {
	private String ability;
	private String name;
	private boolean isAdult;
	private boolean isMale;

	public person(String ability, String name, boolean isAdult, boolean isMale) {
		this.ability = ability;
		this.name = name;
		this.isAdult = isAdult;
		this.isMale = isMale;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String a) {
		ability = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public boolean getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(boolean a2) {
		isAdult = a2;
	}

	public boolean getIsMale() {
		return isMale;
	}

	public void setIsMale(boolean m) {
		isMale = m;
	}

}
