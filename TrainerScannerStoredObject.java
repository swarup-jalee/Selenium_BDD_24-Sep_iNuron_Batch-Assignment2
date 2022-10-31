package assignments_set2;
public class TrainerScannerStoredObject {
	String name;
	String eDept;
	String eMail;
	int eID;
	
	public TrainerScannerStoredObject(String eName, String dept,String email, int empId)
	{
		name=eName;
		eDept=dept;
		eMail=email;
		eID=empId;
	}

	public static void main(String[] args) {
	//create array of Trainer object
	TrainerScannerStoredObject[] trainerDetails= new TrainerScannerStoredObject[3];
	
	//create & initialize actual employee objects using constructor
	trainerDetails[0]= new TrainerScannerStoredObject("Mukesh","Testing","mukesh@gmail.com",1);
	trainerDetails[1]= new TrainerScannerStoredObject("Hitesh","Dev","hitesh@gmail.com",2);
	trainerDetails[2]= new TrainerScannerStoredObject("Nitesh","DevOps","mukesh@gmail.com",3);
	
	System.out.println(trainerDetails[0].name+","+trainerDetails[0].eDept+","+trainerDetails[0].eMail+","+trainerDetails[0].eID);
	System.out.println(trainerDetails[1].name+","+trainerDetails[1].eDept+","+trainerDetails[1].eMail+","+trainerDetails[1].eID);
	System.out.println(trainerDetails[2].name+","+trainerDetails[2].eDept+","+trainerDetails[2].eMail+","+trainerDetails[2].eID);
	}
	
		
}


