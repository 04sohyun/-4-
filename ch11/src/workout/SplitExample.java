package workout;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] result = str.split(",");
		for(String s:result) {
			System.out.println(s);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		StringTokenizer stk = new StringTokenizer(str, ",");
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
	
	}
}
