package OOP.interfaces;

public class BussinessMan implements Richman, SocialWorker{

	@Override
	public void helptoOther() {
		System.out.println("Help to Others");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earn Money");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
	}

}
