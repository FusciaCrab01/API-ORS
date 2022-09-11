
public class ViewModule extends ORS{

    public ViewModule() {
    }

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

}