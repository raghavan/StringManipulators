import java.util.LinkedHashMap;
import java.util.Map;


public class RunLengthEncoding {

	public static void main(String args[]){
		String str = "aaaabbcss";
		
		Map<Character,Integer> strCount = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			int val = 1;
			if(strCount.get(str.charAt(i)) != null){
				val = strCount.get(str.charAt(i)) + 1;
			}
			strCount.put(str.charAt(i), val);
		}
		
		for(Character ch : strCount.keySet()){
			System.out.print(ch+""+strCount.get(ch));
		}
	}
}
