package cn.hwtblog.bean;

public class Student {

	private String _s;
	private String sName;
	private int age;
	private int sex;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String _s, String sName, int age, int sex) {
		super();
		this._s = _s;
		this.sName = sName;
		this.age = age;
		this.sex = sex;
	}
	public String get_s() {
		return _s;
	}
	public void set_s(String _s) {
		this._s = _s;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [_s=" + _s + ", sName=" + sName + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
}
