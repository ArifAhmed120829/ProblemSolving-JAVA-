
public class Account {
	String name,F_name,M_name;
	int age;

	public static void main(String[] args) {
		Account a = new Account();// here created an object
		a.setName("Arif");
		a.setF_name("A.K.M Abdullahil Baki");
		a.setM_Name("Afroza Khatun");
		a.setAge(23);
		System.out.print("Account Information: ");
		System.out.print(a.getName()+","+a.getF_name()+","+a.getM_name()+","+a.getage()+".");

	}
	public void setName(String name) {
		this.name = name;// here this means account so this.name = account name
	}
	public void setF_name(String F_name) {
		this.F_name = F_name;
	}
	public void setM_Name(String M_name) {
		this.M_name = M_name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;//here there will be no parameter and use return because void won't return anything
	}
	public String getF_name() {
		return this.F_name;
	}
	public String getM_name() {
		return this.M_name;
	}
	public int getage() {
		return this.age;
	}
	
	

}
