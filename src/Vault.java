
public class Vault {

	int myCode;
	
	public Vault(int Code){
	
		this.myCode=Code;
		
		}
			
	public boolean tryCode(int sCode) {
		
		if (myCode==sCode) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {

	}
}
