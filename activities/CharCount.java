
public class CharCount {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String m=sc.next();
		char[] s=m.toCharArray();
		for(int i=0;i<s.length;i++) {
			int c=0;
			char h=s[i];
			if(h!='1') {
			for(int j=i;j<s.length;j++) {
				
				if(h==s[j]) {
					s[j]='1';
					c++;
				}
				}
			System.out.println(h+" "+c);
			}
			
		}
	}

}