
public class Product {
   String name;
   int su;
   int sell_price;
   int buy_price;
   int fee;
   int cost;
   double per_cost;
   
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getSu() {
      return su;
   }
   public void setSu(int su) {
      this.su = su;
   }
   public int getSell_price() {
      return sell_price;
   }
   public void setSell_price(int sell_price) {
      this.sell_price = sell_price;
   }
   public int getBuy_price() {
      return buy_price;
   }
   public void setBuy_price(int buy_price) {
      this.buy_price = buy_price;
   }
   public int getFee() {
      return fee;
   }
   public void setFee(int fee) {
      this.fee = fee;
   }
   public int getCost() {
      return cost;
   }
   public void setCost(int cost) {
      this.cost = cost;
   }
   public double getPer_cost() {
      return per_cost;
   }
   public void setPer_cost(double per_cost) {
      this.per_cost = per_cost;
   }
   public Product(String name, int su, int sell_price, int buy_price, int fee) {
      
      this.name = name;
      this.su = su;
      this.sell_price = sell_price;
      this.buy_price = buy_price;
      this.fee = fee;
   }
}