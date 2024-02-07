public class Tiger implements Animal{
	private int age;
	private int cost;
	private int numOfBabies;
	private int foodCost;
	private double payoff;
	
	public Tiger(int a, int b, int c, int d, double e) {
		age = a;
		cost = b;
		numOfBabies =c;
		foodCost = d;
		payoff = e;
	}
public int getAge() {
		
		return age;
	}
	@Override
	public int getCost() {
		
		return cost;
	}
	@Override
	public int getNumBabies() {
		
		return numOfBabies;
	}
	@Override
	public int getBaseFoodCost() {
		
		return foodCost;
	}
	@Override
	public double getPayOff() {
		
		return payoff;
	}
	@Override
	public void setAge(int age) {
		this.age = age;
		
	}
	@Override
	public void setCost(int cost) {
		this.cost = cost;
		
	}
	@Override
	public void setNumBabies(int numBabies) {
		this.numOfBabies = numBabies;
		
	}
	@Override
	public void setBaseFoodCost(int baseFoodCost) {
		this.foodCost = baseFoodCost;
		
	}
	@Override
	public void setPayOff(double payOff) {
		this.payoff = payOff;
		
	}
	
	

}

