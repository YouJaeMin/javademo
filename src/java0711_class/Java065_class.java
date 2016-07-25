package java0711_class;

class MenuShop {
	String menu;
	int price;
	int per;

	public MenuShop() {
	}

	// 단축메뉴 -> source -> Generrator constructor using fields....
	public MenuShop(String menu, int price, int per) {
		this.menu = menu;
		this.price = price;
		this.per = per;
	}

	public int count() {
		return price * per;
	}

	public void prn() {
		System.out.println("메뉴 : " + menu);
		System.out.println("가격 : " + price);
		System.out.println("지불금액 : " + count());
	}

}

public class Java065_class {

	public static void main(String[] args) {

		MenuShop ms = new MenuShop("떡볶이", 2000, 3);
		ms.prn();

		MenuShop mc = new MenuShop("순대", 3000, 2);
		mc.prn();

		MenuShop mr = new MenuShop("튀김", 4000, 1);
		mr.prn();

	}// end main()

}// end class
