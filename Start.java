class Student{
	private String name;
	private String id;
	private String department;
	private float cgpa;
	
	public Student(){
		System.out.println("E-constructor");
		
	}
	
	public Student(String name ,String id, String department, float cgpa){
		System.out.println("p-constructor");
		setName(name);
		setid(id);
		setdepartment(department);
		setCgpa(cgpa);

	}
	
	public void setName(String name){
		this.name = name ;
		
	}
	
	public String getName(){
		return name ;
	}

	public void setid(String id){
		this.id= id ;
	}
	
	public String getid(){
		return id;
	}
    
	public void setdepartment(String department){
		this.department=department;
	}
	public String getdepartment(){
		return department ;
	}

	public void setCgpa(float cgpa){
		if(cgpa>=0 && cgpa <=4){
		this.cgpa = cgpa ;}
		else{System.out.println("Invalid CGPA") ;}
	}
	
	public float getCgpa(){
		return cgpa;
	}
	
	public void showdDetails(){
		System.out.println("--------");
		System.out.println("Name : " +name);
		System.err.println("id : "+ id);
		System.out.println("department : "+department);
		System.out.println("Cgpa : "+cgpa);
		System.out.println("--------");
		
		if(cgpa >= 3.8f){
			System.out.println("Performance is Good");
		}
	}
}
public class Start{
	public static void main(String[] args){
	 
      Student s1 = new Student();
	
	  s1.setName("kamal");
	  s1.setCgpa(5.5f) ;
	  s1.showdDetails();
	  
	  Student s2 = new Student("tanvir" , "24-60390-3", "cse" , 3.8f);
	  s2.showdDetails();

	  
	}
}