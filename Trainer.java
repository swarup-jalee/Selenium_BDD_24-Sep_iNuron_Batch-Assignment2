package assignments_set2;

public class Trainer {

	String name;
	String eDept;
	String eMail;
	int eID;
	
	public Trainer(String eName, String dept,String email, int empId)
	{
		name=eName;
		eDept=dept;
		eMail=email;
		eID=empId;
	}

		public static void main(String[] args)
		{
			Trainer trainer1= new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
			Trainer trainer2= new Trainer("Hitesh","Dev","hitesh@gmail.com",2);
			Trainer trainer3= new Trainer("Nitesh","DevOps","mukesh@gmail.com",3);
			
			System.out.println(trainer1.name+" Can teach "+trainer1.eDept);
			System.out.println(trainer2.name+" Can teach "+trainer2.eDept);
			System.out.println(trainer3.name+" Can teach "+trainer3.eDept);
		}
		
		
		
	
	}


