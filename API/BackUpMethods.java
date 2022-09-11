
public class BackUpMethods {

	//VIEW SECTION
	public void ViewUser()
	{
		System.out.println("\nAvailable User " + counterU);
		int sechold = 0;
		for(int i=0; i<counterU; i++)
		{
			System.out.println("Name	  : " + Name[i]);
			System.out.println("Username  : " + Username[i]);
			sechold = SectionCode[i];
			System.out.println("Section   : " + Section[sechold]);
			System.out.println("Password  : " + Password[i]);
			System.out.println("---------------------------------------");
		}
	}

	public void ViewUser(int a)
	{
		int b = a;
		System.out.println("\nAvailable User " + counterU);
		int sechold = 0;
		for(int i=b; i<b+1; i++)
		{
			System.out.println("Name	  : " + Name[i]);
			System.out.println("Username  : " + Username[i]);
			sechold = SectionCode[i];
			System.out.println("Section   : " + Section[sechold]);
			System.out.println("Password   : " + Password[i]);
			System.out.println("---------------------------------------");
		}
	}

	public void ViewDocument()
	{
		if (counterD > 0)
		{
			System.out.println("\nType of Document\\s \t Purpose of Document\\s" + counterD);
			for(int i=0; i<counterD; i++)
			{
				System.out.println(Type[i] + "\t\t\t" + Purpose[i]);
			}
		}
		else
		{
			System.out.println("No Available Document/s!");
		}
	}

	public void ViewDocument(int a)
	{
		int b = a;
		if (counterD > 0)
		{
			System.out.println("\nType of Document\\s \t\t Purpose of Document\\s" + counterD);
			for(int i=b; i<b+1; i++)
			{
				System.out.println(Type[i] + "\t\t\t" + Purpose[i]);
			}
		}
		else
		{
			System.out.println("No Available Document/s!" + counterD);
		}
	}

	public void ViewSection()
	{
		if (counterS > 1)
		{
			System.out.println("\nSection in Office \t\t Section Code ");
			for(int i=1; i<counterS; i++)
			{
				System.out.println(Section[i] + "\t\t\t\t   " + i);
			}
		}
		else
		{
			System.out.println("No Available Section!");
		}
	}

	public void ViewSection(int a )
	{
		int b = a;
		if (counterS > 1)
		{
			System.out.println("\nSection in Office \t\t Section Code ");
			for(int i=b; i<b+1; i++)
			{
				System.out.println(Section[i] + "\t\t\t\t   " + i);
			}
		}
		else
		{
			System.out.println("No Available Section!");
		}
	}

	public void ViewForward()
	{
		int counter = 0;
		for (int x = 0; x<counterUp; x++)
		{
			if (UserSecCode == OfficeToCode[x])
			{
				counter = OfficeToCode[x];
			}
		}

		if (counterUp > 0 && UserSecCode == counter)
		{
		System.out.println("Type  \t\t Office To \t\t Purpose \t\t Forward Date \t Recieved Date");
			for(int i=0; i<counterUp; i++)
			{
				if(UserSecCode == OfficeFromCode[i])
				{
		System.out.print(UType[i]+"\t\t"+OfficeTo[i]+"\t\t"+UPurpose[i]+"\t\t"+DateForward[i]);

					if(DateReceived.length > 0 )
					{
						System.out.println("\t\t" + DateReceived[i]);
					}
					else
					{
						System.out.println();
					}
				}

			}
		}
		else
		{
			System.out.println("No Available Document/s!");
		}
	}

	public void ViewReceived()
	{
		int counter = 0;
		for (int x = 0; x<counterUp; x++)
		{
			if (UserSecCode == OfficeToCode[x])
			{
				counter = OfficeToCode[x];
			}
		}

		if (counterUp > 0 && UserSecCode == counter)
		{
		System.out.println("Type  \t\t Office From \t\t Purpose \t\t Forward Date \t Recieved Date");
			for(int i=0; i<counterUp; i++)
			{
			if(UserSecCode == OfficeToCode[i])
				{
		System.out.print(UType[i]+"\t\t"+OfficeFrom[i]+"\t\t"+UPurpose[i]+"\t\t"+DateForward[i]);

					if(DateReceived.length > 0 )
					{
						System.out.println("\t\t" + DateReceived[i]);

					}
					else
					{
						System.out.println();
					}
				}
			}
		}
		else
		{
			System.out.println("No Available Document/s!");
		}
	}

	public void AddReceived()
	{
		int counter = 0;
		for (int x = 0; x<counterUp; x++)
		{
			if (UserSecCode == OfficeToCode[x])
			{
				counter = OfficeToCode[x];
			}
		}

		if (counterUp > 0 && UserSecCode == counter)
		{
		System.out.println("Type  \t\t Office From \t\t Purpose \t\t Forward Date \t Recieved Date");
			for(int i=0; i<counterUp; i++)
			{
				if(UserSecCode == OfficeToCode[i] && DateReceived[i].equals(""))
				{
					System.out.println(UType[i]+"\t\t"+OfficeFrom[i]+"\t\t"+UPurpose[i]
					+"\t\t"+DateForward[i]);

				}
			}
		}
		else
		{
			System.out.println("No Available Document/s!");
		}
	}

	//ADD SECTION
	public void AddNewUser(String sec[])
	{
		Scanner in = new Scanner (System.in);
		Scanner n = new Scanner (System.in);

		System.out.print("Enter the Name: ");
		name = in.nextLine();

		if (counterS > 1)
		{
			System.out.println("\nSection in Office \t\t Section Code ");
			for(int i=1; i<counterS; i++)
			{
				System.out.println(sec[i] + "\t\t\t\t   " + i);
			}
		}

		System.out.print("Enter the Section Code: ");
		sectionCode = n.nextInt();

		System.out.print("Enter the Username: ");
		username = in.nextLine();

		System.out.print("Enter the Password: ");
		password = in.nextLine();

		boolean PassCondition = true;
		do{
		System.out.print("Re type the Password: ");
		repassword = in.nextLine();

			if(password.equals(repassword))
			{
				PassCondition = false;
			}
			else
			{
				System.out.println("Passowrd does not match!");
			}

		}while(PassCondition);

		if(counterU > 0)
		{
			String [] newUsername = new String [counterU + 1];
			String [] newPassword = new String [counterU +1];
			String [] newName = new String [counterU +1];
			int [] newSectionCode = new int [counterU +1];

			for(int i=0; i<counterU; i++)
			{
				newUsername[i] = Username[i];
				newPassword[i] = Password[i];
				newName[i] = Name[i];
				newSectionCode[i] = SectionCode[i];
			}
			newUsername[newUsername.length - 1] =username ;
			newPassword[newPassword.length - 1] =password;
			newName[newName.length - 1] = name ;
			newSectionCode[newSectionCode.length - 1] = sectionCode ;

			Username = newUsername;
    		Password = newPassword;
    		Name = newName;
    		SectionCode = newSectionCode;

	    	counterU++;

	    	System.out.println("User Added Successfully!");
		}
		else
		{
			String [] newUsername = new String [1];
			String [] newPassword = new String [1];
			String [] newName = new String [1];
			int [] newSectionCode = new int [1];

			for(int i=0; i<1; i++)
			{
				newUsername[i] = username;
				newPassword[i] = password;
				newName[i] = name;
				newSectionCode[i] = sectionCode;
			}

			Username = newUsername;
    		Password = newPassword;
    		Name = newName;
    		SectionCode = newSectionCode;

			counterU++;

			System.out.println("User Added Successfully!");
		}
	}

	public void AddNewSection()
	{
		Scanner in = new Scanner (System.in);

		System.out.print("Enter the Section Name: ");
		section = in.nextLine();

		if(counterS > 0)
		{
			String [] newSection = new String [counterS + 1];

			for(int i=0; i<counterS; i++)
			{
				newSection[i] = Section[i];
			}
			newSection[newSection.length - 1] = section;

			Section = newSection;
	    	counterS++;

	    	System.out.println("Section Added Successfully!");
		}
	}

	public void AddNewDocument()
	{
		Scanner in = new Scanner (System.in);

		System.out.print("Enter Type of Documents : ");
		type = in.nextLine();

		System.out.print("Enter Purpose of Documents : ");
		purpose = in.nextLine();

		if(counterD > 0)
		{
			String [] newType = new String [counterD + 1];
			String [] newPurpose = new String [counterD + 1];

			for(int i=0; i<counterD; i++)
			{
				newType[i] = Type[i];
				newPurpose[i] = Purpose[i];
			}
			newType[newType.length - 1] = type;
			newPurpose[newPurpose.length - 1] = purpose;

			Type = newType;
			Purpose = newPurpose;

	    	counterD++;

	    	System.out.println("Document Added Successfully!");
		}
		else
		{
			String [] newType = new String [1];
			String [] newPurpose = new String [1];

			for(int i=0; i<1; i++)
			{
				newType[i] = type;
				newPurpose[i] = purpose;
			}

			Type = newType;
			Purpose = newPurpose;

	    	counterD++;

	    	System.out.println("Document Added Successfully!");
		}
	}

	public void UploadFile(int a , String sec[] , String b[] , String c[])
	{
		Scanner in = new Scanner(System.in);
		Scanner n = new Scanner(System.in);

		System.out.print("Enter Date (MM-DD-YYYY) :");
		dateforward = in.nextLine();

		if (counterS > 0)
		{
			System.out.println("\nSection in Office \t\t Section Code ");
			for(int i=0; i<counterS; i++)
			{
				if( a == i)
				{}
				else
				{
					System.out.println(sec[i] + "\t\t\t\t   " + i);
				}
			}
		}

		System.out.print("Enter the Section Code: ");
		sectionCode = n.nextInt();

		if (counterD > 0)
		{
			System.out.println("\nType \t\t Purpose \t\t Code");
			for(int i=0; i<counterD; i++)
			{
				System.out.print(c[i] + "\t\t" + b[i]);
				System.out.println("\t\t" +i);
			}
		}

		System.out.print("Enter the Document Code: ");
		documentCode = n.nextInt();

		String sectionFrom = "";
		int x = sectionCode;
		for(int i=x; i<x+1; i++)
			{
				section = Section[x];
			}
		int x2 = documentCode;
		for(int i=x2; i<x2+1; i++)
			{
				type = Type[x2];
				purpose = Purpose[x2];
			}
		int x3 = a;
		for(int i=x3; i<x3+1; i++)
			{
				sectionFrom = Section[x3];
			}


		System.out.println("Date Forwarded      : " + dateforward);
		System.out.println("Office To           : " + section);
		System.out.println("Office From         : " + sectionFrom);
		System.out.println("Type of Document    : " + type);
		System.out.println("Purpose of Document : " + purpose);

		int uploadchoice;
		System.out.println("Do you want to upload this ? [1] Yes [2] No");
		System.out.print("Enter you choice : ");
		uploadchoice = in.nextInt();

		if(uploadchoice == 1)
		{
			if(counterUp > 0)
			{
				String [] newUType = new String [counterUp + 1];
				String [] newUPurpose = new String [counterUp +1];
				String [] newOfficeFrom = new String [counterUp +1];
				String [] newOfficeTo = new String [counterUp + 1];
				String [] newDateForward = new String [counterUp +1];
				String [] newDateReceived = new String [counterUp +1];
				int [] newOfficeFromCode = new int [counterUp +1];
				int [] newOfficeToCode = new int [counterUp +1];

				for(int i=0; i<counterUp; i++)
				{
					newUType[i] = UType[i];
					newUPurpose[i] = UPurpose[i];
					newOfficeFrom[i] = OfficeFrom[i];
					newOfficeTo[i] = OfficeTo[i];
					newDateForward[i] = DateForward[i];
					newDateReceived[i] = DateReceived[i];
					newOfficeFromCode[i] = OfficeFromCode[i];
					newOfficeToCode[i] = OfficeToCode[i];
				}

				newUType[newUType.length - 1] = type;
				newUPurpose[newUPurpose.length - 1] = purpose;
				newOfficeFrom[newOfficeFrom.length - 1] = sectionFrom;
				newOfficeTo[newOfficeTo.length - 1] = section;
				newDateForward[newDateForward.length - 1] = dateforward;
				newDateReceived[newDateReceived.length - 1] = "";
				newOfficeFromCode[newOfficeFromCode.length - 1] = a;
				newOfficeToCode[newOfficeToCode.length - 1] = sectionCode;

				UType = newUType;
				UPurpose = newUPurpose;
				OfficeFrom = newOfficeFrom;
				OfficeTo = newOfficeTo;
				DateForward = newDateForward;
				DateReceived = newDateReceived;
				OfficeFromCode = newOfficeFromCode;
				OfficeToCode = newOfficeToCode;

		    	counterUp++;

		    	System.out.println("File Uploaded Successfully!");
			}
			else
			{
				String [] newUType = new String [counterUp + 1];
				String [] newUPurpose = new String [counterUp +1];
				String [] newOfficeFrom = new String [counterUp +1];
				String [] newOfficeTo = new String [counterUp + 1];
				String [] newDateForward = new String [counterUp +1];
				String [] newDateReceived = new String [counterUp +1];
				int [] newOfficeFromCode = new int [counterUp +1];
				int [] newOfficeToCode = new int [counterUp +1];

				for(int i=0; i<1; i++)
				{
					newUType[i] = type;
					newUPurpose[i] = purpose;
					newOfficeFrom[i] = sectionFrom;
					newOfficeTo[i] = section;
					newDateForward[i] = dateforward;
					newDateReceived[i] = "";
					newOfficeFromCode[i] = a;
					newOfficeToCode[i] = sectionCode;
				}

				UType = newUType;
				UPurpose = newUPurpose;
				OfficeFrom = newOfficeFrom;
				OfficeTo = newOfficeTo;
				DateForward = newDateForward;
				DateReceived = newDateReceived;
				OfficeFromCode = newOfficeFromCode;
				OfficeToCode = newOfficeToCode;

				counterUp++;

				System.out.println("File Uploaded Successfully!");
			}
		}

	}

	public void ReceiveFile()
	{
		Scanner in = new Scanner(System.in);
			String tester = "";
			boolean ConRe = true;
			int index = 0;
			int protection = 0;
			do{
			System.out.print("Enter the Type : ");
			tester = in.nextLine();

			for (int x = 0; x<counterUp; x++)
			{
				if(tester.equals(UType[x]))
				{
					index = x;
					protection = 1;
					ConRe = false;
					break;
				}

			}
				ConRe = false;
			}while(ConRe);

			if(protection == 1){
			System.out.print("Enter the date Received (MM-DD-YYYY) :");
			datereceived = in.nextLine();
			int y = index + 1;
			for (int x = index; x<y ; x++)
			{
				DateReceived[x] = datereceived;
				break;
			}

			}
			else
			{
				System.out.println("Incorrect Type!");
			}

	}

	//EDIT SECTION
	public int EditUser(String sec[])
	{
		int index = 0;
		boolean EditCondition = true;
		do{
			Scanner n2 = new Scanner (System.in);
			System.out.print("Enter the Username you want to edit : ");
			String holdname = n2.nextLine();
			String testname = "";

			for(int x = 0; x<counterU; x++)
			{
				if(holdname.equals(Username[x]))
				{
					index = x;
					testname = Username[x];
				}
			}

			if(holdname.equals(testname))
			{
				boolean editCondition = true;
				do{
		    		System.out.println("[1] Name\n[2] Username\n[3] Password\n[4] Section");
			    	System.out.print("Enter you choice: ");
			    	int choi1 = n2.nextInt();

			    	Scanner in = new Scanner(System.in);

			    	if(choi1 == 1)
					{
						System.out.print("Enter the new Name :");
						String up = in.nextLine();
						int y = index + 1;
						for(int x = index; x<y; x++)
						{
							Name[x] = up;
						}
					System.out.println("Name updated successfully!");
					}
					else if (choi1 == 2)
					{
						System.out.print("Enter the new Username :");
						String up = in.nextLine();
						int y = index + 1;
						for(int x = index; x<y; x++)
						{
							Username[x] = up;
						}
					System.out.println("Username updated successfully!");
					}
					else if (choi1 == 3)
					{
						System.out.print("Enter the new Password :");
						String up = in.nextLine();
						int y = index + 1;
						for(int x = index; x<y; x++)
						{
							Password[x] = up;
						}
					System.out.println("Password updated successfully!");
					}
					else if (choi1 == 4)
					{
						if (counterS > 1)
						{
							System.out.println("\nSection in Office \t\t Section Code ");
							for(int i=1; i<counterS; i++)
							{
								System.out.println(sec[i] + "\t\t\t\t   " + i);
							}
						}
						int up;
						boolean EditSecCondition = true;
						do{
						System.out.print("Enter the new Section Code :");
						up = in.nextInt();

						for (int a = 1; a<counterS; a++)
						{
							if(up == a)
							{
								EditSecCondition = false;
							}
							else
							{
								System.out.println("Incorrect Section Code!");
							}
						}

						}while(EditSecCondition);
						int y = index + 1;
						for(int x = index; x<y; x++)
						{
							SectionCode[x] = up;
						}
					System.out.println("Section updated successfully!");
					}
					else
					{
						System.out.println("Invalid Choice!");
					}

					boolean condition = true;
					do{
						System.out.print("\nDo you want to edit this User again? [y]-Yes [n]-No :");
						ch1= in.next().charAt(0);
						if(ch1 == 'y' || ch1 == 'Y'){
							condition = false;
						}
						else if(ch1 == 'n' || ch1 == 'N'){
							editCondition = false;
							condition = false;
						}
						else{
							System.out.println("Invalid Choice!");
						}

					}while(condition);

				}while(editCondition);
				EditCondition = false;
			}
			else
			{
				System.out.println("Invalid Username!");
			}
		}while(EditCondition);

			return index;
	}

	public int EditDocument()
	{
		int index = 0;
		boolean EditCondition = true;
		do{
			Scanner n2 = new Scanner (System.in);
			System.out.print("Enter the Type of Document you want to edit : ");
			String holdname = n2.nextLine();
			String testname = "";

			for(int x = 0; x<counterD; x++)
			{
				if(holdname.equals(Type[x]))
				{
					index = x;
					testname = Type[x];
				}
			}

				if(holdname.equals(testname))
				{
					boolean editCondition = true;
					do{
						System.out.println("[1] Type of Document\n[2] Purpose of Document");
				    	System.out.print("Enter you choice: ");
				    	int choi1 = n2.nextInt();

				    	Scanner in = new Scanner(System.in);

				    	if(choi1 == 1)
						{
							System.out.print("Enter the new Type of Document :");
							String up = in.nextLine();
							int y = index + 1;
							for(int x = index; x<y; x++)
							{
								Type[x] = up;
							}
						System.out.println("Type of Document updated successfully!");
						}
						else if (choi1 == 2)
						{
							System.out.print("Enter the new Username :");
							String up = in.nextLine();
							int y = index + 1;
							for(int x = index; x<y; x++)
							{
								Purpose[x] = up;
							}
						System.out.println("Purpose of Document updated successfully!");
						}
						else
						{
							System.out.println("Invalid Choice!");
						}

						boolean condition = true;
						do{
						System.out.print("\nDo you want to edit this Document again? [y]-Yes [n]-No :");
						ch1= in.next().charAt(0);
						if(ch1 == 'y' || ch1 == 'Y'){
							condition = false;
						}
						else if(ch1 == 'n' || ch1 == 'N'){
							editCondition = false;
							condition = false;
						}
						else{
							System.out.println("Invalid Choice!");
						}

						}while(condition);

					}while(editCondition);
					EditCondition = false;
				}
				else
				{
					System.out.println("Invalid Type of Document!");
				}

		}while(EditCondition);

			return index;
	}

	public int EditSection()
	{
		int index = 0;
		boolean EditCondition = true;
		do{
			Scanner n2 = new Scanner (System.in);
			System.out.print("Enter the Section you want to edit : ");
			String holdname = n2.nextLine();
			String testname = "";

			for(int x = 1; x<counterS; x++)
			{
				if(holdname.equals(Section[x]))
				{
					index = x;
					testname = Section[x];
				}
			}

				if(holdname.equals(testname))
				{
					boolean editCondition = true;
					do{
						System.out.print("Enter the new Section :");
						String up = n2.nextLine();
						int y = index + 1;
						for(int x = index; x<y; x++)
						{
							Section[x] = up;
						}
						System.out.println("Section updated successfully!");

						boolean condition = true;
						do{
							System.out.print("\nDo you want to edit this Document again? [y]-Yes [n]-No :");
							ch1= n2.next().charAt(0);
							if(ch1 == 'y' || ch1 == 'Y'){
								condition = false;
							}
							else if(ch1 == 'n' || ch1 == 'N'){
								editCondition = false;
								condition = false;
							}
							else{
								System.out.println("Invalid Choice!");
							}

						}while(condition);

					}while(editCondition);
					EditCondition = false;
				}
				else
				{
					System.out.println("Invalid Type of Document!");
				}

		}while(EditCondition);

			return index;
	}

	//DELETE SECTION
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

	//HISTORY SECTION
	public void Search()
	{
		Scanner in = new Scanner(System.in);
		boolean Hcondition = true;
		do{

			System.out.print("Search  : ");
			String search = in.nextLine();

			System.out.println("\tType\t\t Section To\t\t Section From\t\t Purpose\t\t" +
				 "Date Forwarded\t\t Date Received");
			for(int x = 0; x<counterUp; x++)
			{
				if( DateForward[x].toUpperCase().contains(search.toUpperCase()) ||
					DateReceived[x].toUpperCase().contains(search.toUpperCase()) ||
					UType[x].toUpperCase().contains(search.toUpperCase()) ||
					UPurpose[x].toUpperCase().contains(search.toUpperCase()) ||
					OfficeTo[x].toUpperCase().contains(search.toUpperCase()) ||
					OfficeFrom[x].toUpperCase().contains(search.toUpperCase()) )
				{
					System.out.print(UType[x] + "\t\t" + OfficeTo[x] + "\t\t" +
						OfficeFrom[x] + "\t\t" + UPurpose[x] + "\t\t" +
							DateForward[x] + "\t\t" + DateReceived[x]  );
				}
			}

			Hcondition = false;


		}while(Hcondition);
	}

	public void Sort(String T[], String P[], String OF[], String OT[], String DF[], String DR[] )
	{
	Scanner in = new Scanner  (System.in);
	System.out.println("[1] Type\n[2] Purpose\n[3] Date Forward\n[4] Date Received\n[5] Office From\n[6] Office To");
	System.out.print("You want to sort by : ");
	int Hchoi = in.nextInt();

	String [] newType = new String [counterUp];
	String [] newPurpose = new String [counterUp];
	String [] newFrom = new String [counterUp];
	String [] newTo = new String [counterUp];
	String [] newRece = new String [counterUp];
	String [] newForw = new String [counterUp];

	newType = T;
	newPurpose =P;
	newFrom = OF;
	newTo = OT;
	newRece = DR;
	newForw = DF;

	List<String> Type = Arrays.asList(newType);
	List<String> Purpose = Arrays.asList(newPurpose);
	List<String> OffFrom = Arrays.asList(newFrom);
	List<String> OffTo = Arrays.asList(newTo);
	List<String> DateF = Arrays.asList(newForw);
	List<String> DateR = Arrays.asList(newRece);
//	List<Integer> OffToC = new ArrayList<Integer>(OTC.length);
//	for (int i : OTC)
//	{
//		OffToC.add(i);
//	}
//	List<Integer> OffFromC = new ArrayList<Integer>(OFC.length);
//	for (int i : OFC)
//	{
//		OffFromC.add(i);
//	}

	if(Hchoi == 1)
	{
		concurrentSort(Type, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);

	}
	else if (Hchoi == 2)
	{
		concurrentSort(Purpose, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 3)
	{
		concurrentSort(DateF, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 4)
	{
		concurrentSort(DateR, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 5)
	{
		concurrentSort(OffFrom, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 6)
	{
		concurrentSort(OffTo, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	}

	public static <T extends Comparable<T>> void concurrentSort(final List<T> key, List<?> ... lists)
	{
		//Create List Indices
		List<Integer> indices = new ArrayList<Integer>();
		for(int i = 0; i<key.size(); i++)
			indices.add(i);

		//Sort the indices list based on the key
		Collections.sort(indices, new Comparator<Integer>(){
		@Override public int compare(Integer i, Integer j)
		{
			return key.get(i).compareTo(key.get(j));
		}
		});

		Map<Integer,Integer> swapMap = new HashMap<Integer, Integer>(indices.size());
		List<Integer>swapFrom = new ArrayList<Integer>(indices.size()),
					 swapTo   = new ArrayList<Integer>(indices.size());
		for(int i = 0; i<key.size(); i++)
		{
			int k = indices.get(i);
			while(i != k && swapMap.containsKey(k))
				k = swapMap.get(k);

				swapFrom.add(i);
				swapTo.add(k);
				swapMap.put(i , k);
		}

		for(List<?> list : lists)
			for(int i=0; i<list.size(); i++)
				Collections.swap(list, swapFrom.get(i), swapTo.get(i));

	}

	//Login
	public int AdminLogin(String a, String b)
    {
    	int value = 0;
		userTry = a;
		passTry = b;

		if (AdminUser.equals(userTry) && AdminPass.equals(passTry))
		{
			value = 1;
			UserSecCode = 0;
		}

		return value;
    }

	public int UserLogin(String a, String b)
    {
    	int userVal = 0;
		userTrial = a;
		passTrial = b;

		for(int x = 0; x<Username.length; x++)
		{
			if(userTrial.equals(Username[x]) && passTrial.equals(Password[x]))
			{
				userVal = 1;
				UserSecCode = SectionCode[x];
				User = Name[x];
			}

		}
	return userVal;
    }


}