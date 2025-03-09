class Student{
	private String name;
	private float cgpa;
	
	public Student(){
		System.out.println("E-constructor");
		name= "no name" ;
		cgpa= 0.0f;
	}
	
	public Student(String name , float cgpa){
		System.out.println("p-constructor");
		this.name= name ;
		this.cgpa= cgpa;
	}
	
	public void setName(String name){
		this.name = name ;
		
	}
	
	public String getName(){
		return name ;
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
	  //s1.name= "Kamal";
	  s1.setName("kamal");
	  //s1.cgpa= 3.5f ;
	  s1.setCgpa(3.5f) ;
	  s1.showdDetails();
	  
	  Student s2 = new Student("tanvir" , 3.8f);
	  s2.showdDetails();

	  
	}
}