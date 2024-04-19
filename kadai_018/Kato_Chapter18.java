package kadai_018;
//親クラス

abstract public class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "東京都中野区〇x";
	
	public void commonIntroduce(String adress) {
		System.out.println("住所は" + address + "です");
	
	}
	
	abstract void output();
public void excecIntroduce() {
	commonIntroduce(address);
	output();

	
}
}
