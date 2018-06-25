package my_programms;

public class Grade_Rating {

	public static void main(String[] args) {
		
		int score = 660;
		String grade=null;
		
		
		if(score<=600)
		{
			grade = "First Division";
			
		}
		else if (score>=450)
		{
			grade = "Second Division";
			
		}
		
		else if (score>=330)
		{	
			grade = "Third Division";
		}
		
		else if (score>=300)
		
		{
			grade = "Fail";
		}
		
		
		
			
		System.out.println("Grade="+ grade);
		
				 
		
	}
		
		
	}

	
