package OOP.interfaces;

public class BussinessMan implements Richman, SocialWorker {

	@Override
	public void helptoOther() {
		System.out.println("Help to Others");
		System.out.println("Work : " + work);

	}

	@Override
	public void earnMoney() {
		System.out.println("Earn Money : " + money); 

	}

	@Override
	public void donation() {
		System.out.println("Donation : " + donation);

	}

	@Override
	public void party() {
		System.out.println("Party : " + partyExpenses);
	}

}
