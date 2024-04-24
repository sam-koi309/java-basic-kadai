package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26{
	String Jyan = "";
	String Jyan2 = "";
	
	public String getMyChoice(){
	
		while (true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		Jyan = scanner.next();
		String r ="r";
		String s ="s";
		String p ="p";
		
	
		 if (Jyan.equals(r)||Jyan.equals(s)||Jyan.equals(p)) {
			 scanner.close();
		return Jyan;
			 
		 }
		}
		
		}

	public String getRandom() {
		String[] nom = {"r", "s","p"};
		int randNum = (int)(Math.floor(Math.random() * 2));
		Jyan2 = nom[randNum];
		return Jyan2;
	}
		
	
	
	public void playGame() {
		getRandom();
		HashMap<String, String> playGame = new HashMap<String, String>();
		playGame.put("r", "グー");
		playGame.put("s", "チョキ");
		playGame.put("p", "パー");
		
		
		System.out.println("自分の手は" + playGame.get(Jyan) + ",対戦相手の手は" + playGame.get(Jyan2));
		if(Jyan.equals(Jyan2)) {
			System.out.println("あいこです");
		}else if(Jyan.equals("r")&&Jyan2.equals("s") ) {
			System.out.println("自分の勝ちです");
		}else if(Jyan.equals("s")&&Jyan2.equals("p")) {
			System.out.println("自分の勝ちです");
		}else if(Jyan.equals("p")&&Jyan2.equals("r") ) {
			System.out.println("自分の勝ちです");
			
	  }else if(Jyan.equals("r")&&Jyan2.equals("p") ) {
		System.out.println("自分の負けです");
	  }else if(Jyan.equals("s")&&Jyan2.equals("r")) {
		System.out.println("自分の負けです");
	  }else 
			System.out.println("自分の負けです");
}
	
}
