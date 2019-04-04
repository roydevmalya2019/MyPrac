class PGStudent extends Student
{
    private String specialization;
	private int noOfPapersPublished;
	/*FILL CODE HERE*/
	public PGStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PGStudent(String name, String id, int age, double grade,
			String address,String specialization,int noOfPapersPublished) {
		super(name, id, age, grade, address);
		this.specialization = specialization;
		this.noOfPapersPublished = noOfPapersPublished;
		// TODO Auto-generated constructor stub
	}
	
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNoOfPapersPublished() {
		return noOfPapersPublished;
	}
	public void setNoOfPapersPublished(int noOfPapersPublished) {
		this.noOfPapersPublished = noOfPapersPublished;
	}
	public void display()
	{
	
		super.display();
		System.out.println("Specialization : "+getSpecialization());
		System.out.println("No. of papers published : "+getNoOfPapersPublished());
		
	}
	public boolean  isPassed()
	{
		if(grade > 70 && noOfPapersPublished >1) return true;
		return false;
	}
	
}
