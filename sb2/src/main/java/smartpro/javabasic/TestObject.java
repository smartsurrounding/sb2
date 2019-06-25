package smartpro.javabasic;

public class TestObject{

	public static boolean isSexMale() {
		return SEX_MALE;
	}
	public static boolean isSexFemale() {
		return SEX_FEMALE;
	}
	private static final boolean SEX_MALE = true;
	private static final boolean SEX_FEMALE = false;
	
	private String name;
	private boolean sex;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}




