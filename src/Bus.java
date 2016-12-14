
public class Bus extends Car {//¿Í³µ
		private int Carry;
		public Bus(int Number,String name,int payMoney,int Carry){
			 	this.setNumber(Number);
		        this.setName(name);
		        this.setPayMoney(payMoney);
		        this.Carry=Carry;
		}
		public int getCarry() {
			return Carry;
		}
		public void setCarry(int Carry) {
			this.Carry = Carry;
		}
}
