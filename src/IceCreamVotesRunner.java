/*
 (1) Create an IceCreamVotes class.
     (a) Add 3 private member variables: flavor, personName, numVotes.
          Figure out which one(s) need to be static!
     (b) Add a constructor that sets the personName and flavor.
     (c) Create getters for all 3 member variables.

 (2) Create an IceCreamVotesRunner class.
      (a) Create an array of IceCreamVotes objects as shown below.
           The [] indicates that this is an Array (collection) of IceCreamVotes.
           Initialize your collection by instantiating IceCreamVotes.
		
         IceCreamVotes[] votesList = {  
		new IceCreamVotes("voter's name", "your flavor"), 
		new IceCreamVotes("2nd name",     "2nd flavor"), ...
         };
        
     (b) Print the # of votes. If you made 'getNumVotes()' static,
          you can access using IceCreamVotes.getNumVotes() !!

     (c) Using a loop, print each peron's name and favorite flavor 
          (in a sentence!) by accessing the votesList[i] getters.
          For your loop count, you can use: votesList.length

     (d) Add a setter method in the IceCreamVotes class for setting the flavor.
          Pick one or more of your objects and change their favorite flavor.
          Access using votesList[index]. Remember that index starts at 0!!

     (e) Using a loop, print name and flavor just as you did in (b). 
          Check that the changes are what you expected.
          Advanced: create a method to print person/flavor.
*
*/
public class IceCreamVotesRunner {
	static IceCreamVotes[] votesList = { new IceCreamVotes("Bob", "Chocolate"), new IceCreamVotes("Sam", "Vannila"),
			new IceCreamVotes("Joe", "Chocolate") };

	static public void stateList() {
		System.out.println(IceCreamVotes.getnumVotes());
		for (int j = 0; j < votesList.length; j++) {

			System.out.println(votesList[j].getpersonName() + "'s favorite flavor is " + votesList[j].getflavor());
		}
	}

	public static void main(String[] args) {
	stateList();
		votesList[0].setflavor("Mint Chip");	
		stateList();
	}
}
