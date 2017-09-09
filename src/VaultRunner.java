
public class VaultRunner {
public static void main(String[] args) {
	Vault v1=new Vault(12345);
	JamesBond jb=new JamesBond(v1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println(jb.guessCode());
	if (jb.guessCode()==12345) {
		System.out.println("Ha! That's a terrible code for a vault! It's no match for MY genius!");
		if (jb.guessCode()==54321) {
			System.out.println("Ha! That's a terrible code for a vault! It's no match for MY genius!");
		}
	}
}
}
