import java.util.ArrayList;

public class Solution 
{
	public static String reverseString(String str) 
	{
		ArrayList<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < str.length(); i++){
			if(Character.isWhitespace(str.charAt(i)) && !sb.toString().isEmpty()){
				list.add(sb.toString());
				sb = new StringBuilder();
			}else{
				sb.append(str.charAt(i));
				if(i == str.length() - 1 && !sb.toString().isEmpty()){
					list.add(sb.toString());
				}
			}
		}
		sb = new StringBuilder();
		for(int i = list.size() - 1; i >= 0; i--){
			sb.append(list.get(i) + " ");
		}
		return sb.toString().trim();
	}
}
