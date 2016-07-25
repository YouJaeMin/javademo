//package java0714_inheritance.prob;
//
//// 문제
//// 1. Americano 클래스를 만드시오.
//// 2. 카페이름을 추가하여 출력결과처럼 만드시오.
//
//// [출력결과]
//// 원산지 원두이름 물양 우유양 설탕양 원두양 카페이름 가격
//// 남아메리카 세하도 20 0 0 20 스타벅스 3800
//// 중아메리카 엘살바도르 25 0 0 18 커피빈 2500
//// 아프리카 에티오피아 35 0 0 16 이디야 2000
//// 아시아 수마트라 30 0 0 14 탐엔탐스 2800
//// 기타 말라바 40 0 0 10 할리스 2300
//
//class CoffeeBeans {
//	// 원산지
//	private String coffeeBeansCountry;
//	// 원두 이름
//	private String coffeeBeansName;
//
//	public CoffeeBeans() {
//	}
//
//	public CoffeeBeans(String coffeeBeansCountry, String coffeeBeansName) {
//		this.coffeeBeansCountry = coffeeBeansCountry;
//		this.coffeeBeansName = coffeeBeansName;
//	}
//
//	public String getCoffeeBeansCountry() {
//		return coffeeBeansCountry;
//	}
//
//	public void setCoffeeBeansCountry(String coffeeBeansCountry) {
//		this.coffeeBeansCountry = coffeeBeansCountry;
//	}
//
//	public String getCoffeeBeansName() {
//		return coffeeBeansName;
//	}
//
//	public void setCoffeeBeansName(String coffeeBeansName) {
//		this.coffeeBeansName = coffeeBeansName;
//	}
//
//	public String toString() {
//		return "CoffeeBeans class";
//	}
//
//}
//
//class Coffee extends CoffeeBeans {
//	// 물양
//	private int water;
//	// 우유의양
//	private int milk;
//	// 설탕양
//	private int sugur;
//	// 원두의 양
//	private int beans;
//
//	public Coffee() {
//	}
//
//	public Coffee(String coffeeBeansCountry, String coffeeBeansName, int water, int milk, int sugur, int beans) {
//		super(coffeeBeansCountry, coffeeBeansName);
//		this.water = water;
//		this.milk = milk;
//		this.sugur = sugur;
//		this.beans = beans;
//	}
//
//	public Coffee(String coffeeBeansCountry, String coffeeBeansName, int water, int beans) {
//		super(coffeeBeansCountry, coffeeBeansName);
//		this.water = water;
//		this.beans = beans;
//	}
//
//	public int getWater() {
//		return water;
//	}
//
//	public void setWater(int water) {
//		this.water = water;
//	}
//
//	public int getMilk() {
//		return milk;
//	}
//
//	public void setMilk(int milk) {
//		this.milk = milk;
//	}
//
//	public int getSugur() {
//		return sugur;
//	}
//
//	public void setSugur(int sugur) {
//		this.sugur = sugur;
//	}
//
//	public int getBeans() {
//		return beans;
//	}
//
//	public void setBeans(int beans) {
//		this.beans = beans;
//	}
//
//	@Override
//	public String toString() {
//		return "Coffee class";
//	}
//
//}
//
//class Americano extends Coffee {
//	// 여기를 만드시오.
//
//}
//
//class Prob_min1 {
//	public static void main(String[] args) {
////		Americano[] ac = new Americano[5];
////		ac[0] = new Americano("남아메리카", "세하도", 20, 20, " ", 3800);
////		ac[1] = new Americano("중아메리카", "엘살바도르", 25, 0, 0, 18, "", 2500);
////		ac[2] = new Americano("아프리카", "에티오피아", 35, 0, 0, 16, "", 2000);
////		ac[3] = new Americano("아시아", "수마트라", 30, 14, "", 2800);
////		ac[4] = new Americano("기타", "말라바", 40, 0, 0, 10, "", 2300);
////
////		// 여기에 만드시오.
////
////		System.out.println("원산지\t원두이름\t물양\t우유양\t설탕양\t원두양\t카페이름\t가격");
////		for (int i = 0; i < ac.length; i++) {
////			System.out.println(ac[i].toString());
////		}
//
//	}// end main()
//}// end class
