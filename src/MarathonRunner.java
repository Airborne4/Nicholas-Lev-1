
public class MarathonRunner {
public static void main(String[] args) {
	MarathonP bill=new MarathonP("Bill");
	MarathonP dill=new MarathonP("Dill");
	MarathonP jill=new MarathonP("Jill");
	System.out.println("There are " + bill.count+ " people entered in this race! Their names are listed below, \n" + bill.name+ " \n" + dill.name+ " \n"+ jill.name);
}
}
