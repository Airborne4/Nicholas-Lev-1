
public class personRunner {
	public static void main(String[] args) {
		person bill = new person("flight", "Bill", false, true);

		System.out.println(bill.getName() + " has the super ability of " + bill.getAbility() + " and is a "
				+ bill.getIsMale() + " male. Bill is also a " + bill.getIsAdult() + " adult");
		bill.setAbility("laser eyes");
		bill.setName("Billete");
		bill.setIsMale(false);
		bill.setIsAdult(true);
		System.out.println(bill.getName() + " has the super ability of " + bill.getAbility() + " and is a "
				+ bill.getIsMale() + " male. Bill is also a " + bill.getIsAdult() + " adult");

	}
}
