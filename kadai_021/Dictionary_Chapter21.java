package kadai_021;

import java.util.HashMap;


public class Dictionary_Chapter21 {
	
public void run(String [] nom){
	HashMap<String, String> dictionaryMap = new HashMap<String, String>();
	dictionaryMap.put("apple", "りんご");
	dictionaryMap.put("peach", "桃");
	dictionaryMap.put("banana", "ばなな");
	dictionaryMap.put("lemon", "れもん");
	dictionaryMap.put("pear", "梨");
	dictionaryMap.put("kiwi", "キウィ");
    dictionaryMap.put("strawberry", "いちご");
	dictionaryMap.put("grape", "ぶどう");
	dictionaryMap.put("muscat", "マスカット");
	dictionaryMap.put("cherry", "さくらんぼ");
	
	
    for(int i =0; i < nom.length; i++) {

	 if (null != dictionaryMap.get(nom[i])) {
		
		System.out.println(nom[i] +"の意味は" + dictionaryMap.get(nom[i]));
	 }
		else {
			System.out.println(nom[i] + "辞書に存在しません");
		
}
	
	}
}
}

	
	

	
	

