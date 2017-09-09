
public class JamesBond {
	Vault myVault;

	public JamesBond(Vault v1) {
		this.myVault = v1;
	}

	public int guessCode() {
		for (int i = 0; i < 1000000000; i++) {
			if (myVault.tryCode(i) == true) {
				return i;

			}

		}
		return -1;
	}
}
