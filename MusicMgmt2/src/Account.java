class Account {
	private int bunho;  
	private String code;  
	private int su;         
	
	Account(int bunho, String code, int su) {
		this.bunho = bunho;
		this.code = code;
		this.su = su;
	}
	
	int getBunho() {
		return bunho;
	}
	String getCode() {
		return code;
	}
	int getSu() {
		return su;
	}
}
