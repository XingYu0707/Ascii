package Ascii;

public class Ascii {
	public static String stringToAscii(String value)
	{
		StringBuffer sbu = new StringBuffer();
		char[] chars = value.toCharArray(); 
		for (int i = 0; i < chars.length; i++) {
			if(i != chars.length - 1)
			{
				//sbu.append((int)chars[i]).append(",");
				sbu.append((int)chars[i]);
			}
			else {
				sbu.append((int)chars[i]);
			}
		}
		return sbu.toString();
	}
	
	public static String asciiToString(String value)
	{
		StringBuffer sbu = new StringBuffer();
		String[] chars = value.split(",");
		for (int i = 0; i < chars.length; i++) {
			sbu.append((char) Integer.parseInt(chars[i]));
		}
		return sbu.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(stringToAscii("150008"));
		System.out.println(stringToAscii("051100"));
		System.out.println(stringToAscii("000010"));
		System.out.println(stringToAscii("00"));
		/*System.out.println(stringToAscii("BGCTV"));
		System.out.println(stringToAscii("备用双向配置服务"));
		System.out.println(asciiToString(stringToAscii("备用双向配置服务")));*/
		// TODO Auto-generated method stub

	}

}
