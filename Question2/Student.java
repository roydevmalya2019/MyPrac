class Student
{
    protected String name;
	protected String id;
	protected int age;
	protected double grade;
	protected String address;
	/*FILL CODE HERE*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String name, String id, int age, double grade, String address) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
	public Student() {
	
	}
	public void display()
	{
		
		System.out.println("Name : "+ getName());
		System.out.println("Id : "+ getId());
		System.out.println("Age : "+ getAge());
		System.out.println("Grade : "+getGrade());
		System.out.println("Address : "+getAddress());
	
		
	}
	public boolean isPassed(){
		if(grade > 50) return true;
		return false;
	}
	
}
