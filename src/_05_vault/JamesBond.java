package _05_vault;

public class JamesBond {
	int findCode(Vault v){
	for (int i=0; i <= 1000000000; i++) {
	boolean b = v.tryCode(i);
	if (b == true) {
	return i;
	} 
	}
	return -1;
	}
}
