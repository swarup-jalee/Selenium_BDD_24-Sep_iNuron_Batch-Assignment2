package assignments_set2;
import java.util.Scanner;

	public class TrainerScanner {

		public static void main(String[] args) {
			//Asking user to input how many number of Trainers to be provided
			Scanner sc= new Scanner(System.in);
			System.out.println("Please Enter number of Trainers");
			int count=sc.nextInt();
			String name[]=new String[count];
			String email[]=new String[count];
			
			int i=0;//holding the count of the initial array Index
			while(i<count)
			{
			System.out.println("Please Enter Trainer Name");
			name[i]=sc.next();
			
			System.out.println("Please Enter Trainer email");
			email[i]=sc.next();
			
			i++;//incrementing the index count
			
			}
			//Finally asking which trainer details to display	
			System.out.println("Please Enter which students you are looking for");
			Scanner Input=new Scanner(System.in);
			int num=Input.nextInt();
			System.out.println(name[num-1]);
			System.out.println(email[num-1]);
			//closing all the open Scanners
			sc.close();
			Input.close();
		}
		
	}