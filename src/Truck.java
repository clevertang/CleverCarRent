
public class Truck extends Car {//
	private int Carry;
	private int cargoCarry;
	public Truck(int Number,String name,int payMoney,int Carry,int cargoCarry ){
		this.setNumber(Number);
        this.setName(name);
        this.setPayMoney(payMoney);
        this.Carry=Carry;
        this.cargoCarry=cargoCarry;
	}
	public int getCarry() {
		return Carry;
	}
	public void setCarry(int carry) {
		Carry = carry;
	}
	public int getCargoCarry() {
		return cargoCarry;
	}
	public void setCargoCarry(int cargoCarry) {
		this.cargoCarry = cargoCarry;
	}
	
}
