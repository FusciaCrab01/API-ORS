import java.util.*;


public class DeleteModule extends ORS {

    public DeleteModule() {
    }

	public void DeleteUser()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Username you want to delete :");
	 	String holdname = in.nextLine();

    	int index = 0;
    	String testname = "";
    	for(int x = 0; x<Username.length; x++)
    	{
    		if(holdname.equals(Username[x]))
    		{
    			index = x;
    			testname = Username[x];
    		}
    	}

		if (holdname.equals(testname))
		{
			System.out.println("Do you want to delete this User? [1] Yes and [2] No");
			System.out.print("Enter your choice : ");
			int delete = in.nextInt();

			if(delete == 1 )
			{
            for(int i = index; i < counterU; i++)
            	{
		            if(holdname.equals(testname))
		            	{
	            		if(i == counterU -1 )
	            		{
	            			String [] newUsername = new String [counterU + 1];
							String [] newPassword = new String [counterU +1];
							String [] newName = new String [counterU +1];
							int [] newSectionCode = new int [counterU +1];

							for(int a=0; a<counterU-1; a++)
							{
								newUsername[a] = Username[a];
								newPassword[a] = Password[a];
								newName[a] = Name[a];
								newSectionCode[a] = SectionCode[a];
							}

							Username = newUsername;
							Password = newPassword;
							Name = newName;
							SectionCode = newSectionCode;

				    		counterU--;
	            		}
		            	else
		            	{
			                for(int j = i ; j < counterU-1; j++)
			                {
			                    Username[j] = Username[j+1];
								Password[j] = Password[j+1];
								Name[j] = Name[j+1];
								SectionCode[j] = SectionCode[j+1];

		                       counterU--;
			                }
		           		 }
		                break;
		            	}
	       		}
			}
		System.out.println("User Deleted Successfully!");
		}
		else
		{
			System.out.println("Invalid Username!");
		}


	}

	public void DeleteDocument()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Document Type you want to delete :");
	 	String holdname = in.nextLine();

    	int index = 0;
    	String testname = "";
    	for(int x = 0; x<Type.length; x++)
    	{
    		if(holdname.equals(Type[x]))
    		{
    			index = x;
    			testname = Type[x];
    		}
    	}

		if (holdname.equals(testname))
		{
			System.out.println("Do you want to delete this Document? [1] Yes and [2] No");
			System.out.print("Enter your choice : ");
			int delete = in.nextInt();

			if(delete == 1 )
			{
            for(int i = index; i < counterD; i++)
            	{
		            if(holdname.equals(testname))
		            	{
	            		if(i == counterD -1 )
	            		{
	            			String [] newType = new String [counterD + 1];
							String [] newPurpose = new String [counterD +1];


							for(int a=0; a<counterD-1; a++)
							{
								newType[a] = Type[a];
								newPurpose[a] = Purpose[a];
							}

							Type = newType;
							Purpose = newPurpose;


				    		counterD--;
	            		}
		            	else
		            	{
			                for(int j = i ; j < counterD-1; j++)
			                {
			                    Type[j] = Type[j+1];
								Purpose[j] = Purpose[j+1];

		                       counterD--;
			                }
		           		 }
		                break;
		            	}
	       		}
			}
		System.out.println("Document Deleted Successfully!");
		}
		else
		{
			System.out.println("Invalid Document!");
		}


	}

	public void DeleteSection()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Section you want to delete :");
	 	String holdname = in.nextLine();

    	int index = 0;
    	String testname = "";
    	for(int x = 0; x<Section.length; x++)
    	{
    		if(holdname.equals(Section[x]))
    		{
    			index = x;
    			testname = Section[x];
    		}
    	}

		if (holdname.equals(testname))
		{
			System.out.println("Do you want to delete this Section? [1] Yes and [2] No");
			System.out.print("Enter your choice : ");
			int delete = in.nextInt();

			if(delete == 1 )
			{
            for(int i = index; i < counterS; i++)
            	{
		            if(holdname.equals(testname))
		            	{
	            		if(i == counterS -1 )
	            		{
	            			String [] newSection = new String [counterS + 1];



							for(int a=0; a<counterS-1; a++)
							{
								newSection[a] = Section[a];

							}

							Section = newSection;

				    		counterS--;
	            		}
		            	else
		            	{
			                for(int j = i ; j < counterS-1; j++)
			                {
			                    Section[j] = Section[j+1];

		                       counterS--;
			                }
		           		 }
		                break;
		            	}
	       		}
			}
		System.out.println("Section Deleted Successfully!");
		}
		else
		{
			System.out.println("Invalid Section!");
		}


	}

}