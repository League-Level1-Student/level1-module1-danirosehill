package _05_vault;

public class Vault {
	int secret= 899976;
	Vault(int variable){
	secret= variable;
	}
	boolean tryCode(int number){
	if (number == secret) {
	return true;
	} else {
	return false;
	}
	}
}
