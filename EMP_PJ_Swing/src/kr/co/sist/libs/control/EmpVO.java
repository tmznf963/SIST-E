package kr.co.sist.libs.control;


public class EmpVO {
	private String e_code;//���
	public EmpVO(String e_code, String e_name, int b_sal, int n_t, int fam) {
		this.e_code = e_code;
		this.e_name = e_name;
		this.b_sal = b_sal;
		this.n_t = n_t;
		this.fam = fam;
	}
	
	public String getE_code() {
		return e_code;
	}
	public void setE_code(String e_code) {
		this.e_code = e_code;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getB_sal() {
		return b_sal;
	}
	public void setB_sal(int b_sal) {
		this.b_sal = b_sal;
	}
	public int getN_t() {
		return n_t;
	}
	public void setN_t(int n_t) {
		this.n_t = n_t;
	}
	public int getFam() {
		return fam;
	}
	public void setFam(int fam) {
		this.fam = fam;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public int getG_s() {
		return g_s;
	}
	public void setG_s(int g_s) {
		this.g_s = g_s;
	}
	public int getF_s() {
		return f_s;
	}
	public void setF_s(int f_s) {
		this.f_s = f_s;
	}
	public int getN_s() {
		return n_s;
	}
	public void setN_s(int n_s) {
		this.n_s = n_s;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getR_m() {
		return r_m;
	}
	public void setR_m(int r_m) {
		this.r_m = r_m;
	}

	private String e_name;//����̸�
	private int b_sal;//�⺻�޿�
	private int n_t;//�߰��ð�
	private int fam;//������
	private String d_name;//�μ���
	private int g_s;//ȣ�޼���
	private int f_s;//��������
	private int n_s;//�߰�����
	private int sum;//����
	private int r_m;//�Ǽ��ɾ�
	

}
