import java.util.*;
public class EditModule extends ORS {

    public EditModule() {
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


}