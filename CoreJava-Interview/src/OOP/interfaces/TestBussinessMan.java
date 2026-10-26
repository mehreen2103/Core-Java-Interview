package OOP.interfaces;

public class TestBussinessMan {

	public static void main(String[] args) {

		BussinessMan b = new BussinessMan();

		b.donation();
		b.earnMoney();
		b.party();
		b.helptoOther();

		System.out.println("----------------------");

		Richman r = new BussinessMan();

		r.donation();
		r.earnMoney();
		r.party();

		System.out.println("-----------------------");

		SocialWorker s = new BussinessMan();

		s.helptoOther();

	}

}
