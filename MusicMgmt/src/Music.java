
public class Music {
private int num;	//소매점 번호
private String code;		//음악종류코드
private int su;		//판매수량
private int cost_y;	//지역별 판매액 영남
private int cost_k;	//경기
private int cost_c;		//충청
private int qun_p;	//음악종류 별 팝송
private int qun_k;	//가요
private int qun_kk;	//가극
private int qun_j;		//째즈
private int sum;		//판매량총계
public Music(int num, String code, int su) {
   this.num = num;
   this.code = code;
   this.su = su;
}
public int getNum() {
   return num;
}
public void setNum(int num) {
   this.num = num;
}
public String getCode() {
   return code;
}
public void setCode(String code) {
   this.code = code;
}
public int getSu() {
   return su;
}
public void setSu(int su) {
   this.su = su;
}
public int getCost_y() {
   return cost_y;
}
public void setCost_y(int cost_y) {
   this.cost_y = cost_y;
}
public int getCost_k() {
   return cost_k;
}
public void setCost_k(int cost_k) {
   this.cost_k = cost_k;
}
public int getCost_c() {
   return cost_c;
}
public void setCost_c(int cost_c) {
   this.cost_c = cost_c;
}
public int getQun_p() {
   return qun_p;
}
public void setQun_p(int qun_p) {
   this.qun_p = qun_p;
}
public int getQun_k() {
   return qun_k;
}
public void setQun_k(int qun_k) {
   this.qun_k = qun_k;
}
public int getQun_kk() {
   return qun_kk;
}
public void setQun_kk(int qun_kk) {
   this.qun_kk = qun_kk;
}
public int getQun_j() {
   return qun_j;
}
public void setQun_j(int qun_j) {
   this.qun_j = qun_j;
}
public int getSum() {
   return sum;
}
public void setSum(int sum) {
   this.sum = sum;
}



}