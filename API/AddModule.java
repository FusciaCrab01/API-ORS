      import java.util.*;
public class AddModule extends ORS{

	public AddModule() {
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
}
