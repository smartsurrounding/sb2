package smartpro.javabasic;

public class Ex001_SubString {

	public Ex001_SubString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{			
			String str = "1234567890";
			String str2 = "1234567890";
			String str3 = "abcdefg";

//			System.out.println("Example of SubString");
//			System.out.println(str.substring(0));	//substring start with index 0 to the end
//			System.out.println(str.substring(0,1));	//substring start from index 0 to index 1
//			System.out.println(str.substring(0,2));
//			System.out.println(str.substring(1,2));	//substring start from index 1 to index 2
//			System.out.println(str.substring(1,3));
			
//			System.out.println("");	//next line
//			System.out.println("Example of String.contains");
//			System.out.println(str.contains("2"));	//if this string contains "2"? true : false
//			System.out.println(str.contains(str));	//if this string contains 1234567890? true : false
//			System.out.println(str.contains("str"));//if this string contains "str"? true : false

			if(str == str2){
				System.out.println("");	//next line
				System.out.println("str == str2: " + str == str2);	//next line
				System.out.println("str.equals(str2): " + str.equals(str2));	//next line
			}
			if(str2 == str3){
				System.out.println("");	//next line
				System.out.println("str2 == str3: " + str2 == str3);	//next line
				System.out.println("str2.equals(str3): " + str2.equals(str3));	//next line
			}

			System.out.println("");	//next line
			System.out.println("Print hashCode");
			System.out.println(str.hashCode());	//print hashCode of str
			System.out.println(str2.hashCode());	//print hashCode of st2r
			System.out.println(str3.hashCode());	//print hashCode of str3
			
		}catch (Exception e){
			e.printStackTrace();	//next line
		}finally{
			System.out.println("");	//next line
			System.out.println("End of the Exercise");
		}

	}

}
