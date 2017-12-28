package cn.hwtblog.bean;

public class Student {

	private String _s;
	private String sname;
	private int age;
	private int sex;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String _s, String sname, int age, int sex) {
		super();
		this._s = _s;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
	}
	public String get_s() {
		return _s;
	}
	public void set_s(String _s) {
		this._s = _s;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
		return "Student [_s=" + _s + ", sname=" + sname + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
}
