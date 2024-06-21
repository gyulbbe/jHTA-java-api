package demo3;

public class StringApp3 {

	public static void main(String[] args) {
		
		/*
		 * boolean contains(String str)
		 * 	지정된 문자열이 포함되어 있으면 true를 반환한다.
		 */
		String str1 = "Hello, java";
		System.out.println(str1.contains("hello"));//false
		System.out.println(str1.contains("Hello"));//true
		
		/*
		 * int indexOf(String str)
		 * 	지정된 문자열이 등장하는 위치를 반환한다.
		 * int indexOf(String str, int fromIndex)
		 * 	지정된 위치에서부터 검색했을 때 지정된 문자열이 등장하는 위치를 반환한다.
		 * int indexOf(String str, int beginIndex, int endIndex)
		 * 	지정된 범위내에서 지정된 문자열이 등장하는 위치를 반환한다.
		 * int lastIndexOf(String str)
		 * 	지정된 문자열이 맨 마지막으로 등장하는 위치를 반환한다.
		 * int lastIndexOf(String str, int fromIndex)
		 * 	지정된 위치에서부터 검색했을 때
		 * 	지정된 문자열이 맨 마지막으로 등장하는 위치를 반환한다.
		 * 
		 *  만약, 지정된 문자열을 찾을 수 없었다면 -1을 반환한다.
		 */
		
		String str2 = "홍길동은 홍길동의 아들과 홍길동의 집에서 살고 있다.";
		System.out.println(str2.indexOf("홍길동"));
		System.out.println(str2.indexOf("김유신"));
		System.out.println(str2.lastIndexOf("홍길동", 20));
		
		/*
		 * boolean startsWith(String prefix)
		 * 	prefix에 해당하는 문자열로 시작하면 true를 반환한다.
		 * 
		 * boolean endsWith(String suffix)
		 * 	suffix에 해당하는 문자열로 끝나면 true를 반환한다.
		 */
		
		String str3 = "이력서_홍길동.docx";
		System.out.println(str3.startsWith("이력서"));
		System.out.println(str3.endsWith("docx"));
		
		/*
		 * 
		 * char charAt(int index)
		 * 	문자열에서 지정된 위치를 문자를 char형으로 반환한다.
		 */
		String str6 = "문자열에서 지정된 위치를";
		char c1 = str6.charAt(0);
		char c2 = str6.charAt(30);
		System.out.println(c1);
		System.out.println(c2);
	}
}