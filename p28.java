class Teacher
{
	String name;
	int id;
	int phoneNo;
	
     void Teacher()
	 {
		System.out.println("Teacher");
	}

}
class p28
{
	public static void main(String args[])
	
	
	{
		Teacher t1=new Teacher();
		t1.name="priyanka";
		t1.id=101;
		t1.phoneNo=77381694;

		System.out.println(t1.name);
		  System.out.println(t1.id);
		  System.out.println(t1.phoneNo);
	
	}
}