class UGStudent extends Student
{
    private String degree;
	private String stream;
	/*FILL CODE HERE*/
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public UGStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UGStudent(String name, String id, int age, double grade,
			String address, String degree, String stream) {
		super(name, id, age, grade, address);
		this.degree = degree;
		this.stream = stream;
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		
		super.display();
		System.out.println("Degree : "+getDegree());
		System.out.println("Stream : "+getStream());
		
	}
	public boolean isPassed()
	{
		if(grade > 70) return true;
		return false;
	}


		
}
	
