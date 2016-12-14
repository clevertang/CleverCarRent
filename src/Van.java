
public class Van extends Car {//»õ³µ
	private int cargoCarry;
	public Van(int Number,String name,int payMoney,int cargoCarry ){
		this.setNumber(Number);
        this.setName(name);
        this.setPayMoney(payMoney);
        this.cargoCarry=cargoCarry;
	}
	public int getCargoCarry() {
		return cargoCarry;
	}
	public void setCargoCarry(int cargoCarry) {
		this.cargoCarry = cargoCarry;
	}
	
}
