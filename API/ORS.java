import java.util.*;
public class ORS {

	public static String name , section , username , password , repassword , User;
	public String type , purpose , dateforward , datereceived;
	public static int sectionCode , login, UserSecCode , documentCode;
	public String AdminUser = "admin" , AdminPass = "admin123", userTry , passTry;
	public String userTrial , passTrial;
	public static char ch1 , ch;



	//User
	public static String [] Name = {};
	public static String [] Username = {};
	public static String [] Password = {};
	public static int [] SectionCode = {};
	public static int counterU = 0;
	//User

	//Upload
	public static String [] UType = {};
	public static String [] UPurpose = {};
	public static String [] OfficeFrom = {};
	public static String [] OfficeTo = {};
	public static String [] DateForward = {};
	public static String [] DateReceived = {};
	public static int [] OfficeFromCode = {};
	public static int [] OfficeToCode = {};
	public static int counterUp = 0;
	//Upload

	//Document
	public static String [] Type = {};
	public static String [] Purpose = {};
	public static int counterD = 0;
	//Document

	//Section
	public static String [] Section = {"Administrator"};
	public static int counterS = 1;
	//Section

    public static void main (String args [])
    {
    	Scanner in = new Scanner(System.in);
		Scanner n = new Scanner(System.in);

		ViewModule view = new ViewModule();
		AddModule add = new AddModule();
		Login_Module log = new Login_Module();
		EditModule edit = new EditModule();
		DeleteModule delete = new DeleteModule();
		HistoryModule history = new HistoryModule();

  	do{
		System.out.println("\t\tLog In");
		do{System.out.println("[1] Admin\n[2] User");
		System.out.print("Enter your choice :");
		login = n.nextInt();} while(login < 1 || login > 2 );

		if(login == 1)
		{
			boolean UpCondition = true;
			String user, pass;
			int checkHold;
			do{
				System.out.print("Username   :");
				user = in.nextLine();
				System.out.print("Password   :");
				pass = in.nextLine();

				checkHold = log.AdminLogin(user , pass);

				if(checkHold == 1)
				{
					boolean adminCondition = true;
					do{
				    	int tran;
						System.out.println("\n\t\t\t\tAdministrator");
				    	System.out.println("[1] Add\n[2] Edit\n[3] Delete\n[4] Upload\n"
				    		+ "[5] History\n[0] Logout");
						System.out.print("Enter your transaction:");
		    			tran = in.nextInt();

		    			if(tran == 1)
		    			{
							boolean AddCondition = true;
							do{
								System.out.println("----------------  ADD  ----------------");
								int AddChoice;
								System.out.println("[1] User\n[2] Type of Document\n[3] Section");
								System.out.print("Enter your choice :");
								AddChoice = in.nextInt();

								if(AddChoice == 1)
								{
									do{
										view.ViewUser();
										add.AddNewUser(Section);
										System.out.print("\nDo you want to Add Users again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if(AddChoice == 2)
								{
									do{
										view.ViewDocument();
										add.AddNewDocument();
										System.out.print("\nDo you want to Add Document again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');

								}
								else if (AddChoice == 3)
								{
									do{
										view.ViewSection();
										add.AddNewSection();
										System.out.print("\nDo you want to Add Section again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}

								else
								{
									System.out.println("Invalid Choice!");
								}

								boolean TransactionCondition = true;
								do{
									System.out.print("\nDo you want to Add again? [y]-Yes [n]-No :");
									ch	= in.next().charAt(0);
									if(ch == 'y' || ch == 'Y'){
									TransactionCondition = false;
									}
									else if(ch == 'n' || ch == 'N'){
										AddCondition = false;
										TransactionCondition = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
									}
								}while(TransactionCondition);

							}while(AddCondition);
		    			}
		    			else if(tran == 2)
		    			{
		    				boolean EditCondition = true;
				   	 		do
				   	 		{
				   	 		System.out.println("----------------  EDIT  ----------------");
				   	 		int EditChoice;
				   	 		System.out.println("[1] User\n[2] Documents\n[3] Section");
				   	 		System.out.print("Enter your choice : ");
				   	 		EditChoice = in.nextInt();

					   	 		if(EditChoice == 1)
								{
									int EditHolder ;
		    						do{
										view.ViewUser();
										EditHolder = edit.EditUser(Section);
										view.ViewUser(EditHolder);
										System.out.print("\nDo you want to edit Users again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if(EditChoice == 2)
								{
									int EditHolder ;
		    						do{
										view.ViewDocument();
										EditHolder = edit.EditDocument();
										view.ViewDocument(EditHolder);
										System.out.print("\nDo you want to edit Documents again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
										continue;}

										else if(ch == 'n' || ch == 'N'){}

										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if (EditChoice == 3)
								{
									int EditHolder ;
		    						do{
										view.ViewSection();
										EditHolder = edit.EditSection();
										view.ViewSection(EditHolder);
										System.out.print("\nDo you want to edit Sections again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
										continue;}

										else if(ch == 'n' || ch == 'N'){}

										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}

								else
								{
									System.out.println("Invalid Choice!");
								}
								boolean TransactionCondition = true;
								do{
								System.out.print("\nDo you want to Add again? [y]-Yes [n]-No :");
								ch	= in.next().charAt(0);
									if(ch == 'y' || ch == 'Y'){
										TransactionCondition = false;
									}
									else if(ch == 'n' || ch == 'N'){
										EditCondition = false;
										TransactionCondition = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
									}
								}while(TransactionCondition);


				   	 		}while(EditCondition);
		    			}
		    			else if(tran == 3)
		    			{
							boolean DeleteCondition = true;
							do{
								System.out.println("----------------  DELETE  ----------------");
								int DeleteChoice;
								System.out.println("[1] User\n[2] Type of Document\n[3] Section");
								System.out.print("Enter your choice :");
								DeleteChoice = in.nextInt();

								if(DeleteChoice == 1)
								{
									do{
										view.ViewUser();
										delete.DeleteUser();
										System.out.print("\nDo you want to Delete User again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');

								}
								else if(DeleteChoice == 2)
								{
									do{
										view.ViewDocument();
										delete.DeleteDocument();
										System.out.print("\nDo you want to Delete Document again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');

								}
								else if (DeleteChoice == 3)
								{
									do{
										view.ViewSection();
										delete.DeleteSection();
										System.out.print("\nDo you want to Delete Document again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');

								}

								else
								{
									System.out.println("Invalid Choice!");
								}

								boolean TransactionCondition = true;
								do{
								System.out.print("\nDo you want to Delete again? [y]-Yes [n]-No :");
								ch	= in.next().charAt(0);
									if(ch == 'y' || ch == 'Y'){
										TransactionCondition = false;
									}
									else if(ch == 'n' || ch == 'N'){
										DeleteCondition = false;
										TransactionCondition = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
									}
								}while(TransactionCondition);

							}while(DeleteCondition);
		    			}
		    			else if(tran == 4)
		    			{
		    				boolean UploadCondition = true;
							do{
								System.out.println("----------------  Forward  -----------------");
								view.ViewForward();
								System.out.println("--------------------------------------------");
								System.out.println("----------------  Received  ----------------");
								view.ViewReceived();
								System.out.println("--------------------------------------------");

								int UploadChoice;
								System.out.println("[1] Upload File \n[2] Received File \n[0] Back");
								System.out.print("Enter your choice : ");
								UploadChoice = in.nextInt();

								if(UploadChoice == 1 )
								{

									do{
										add.UploadFile(UserSecCode , Section , Purpose , Type );

										System.out.print("\nDo you want to Upload File again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if (UploadChoice == 2)
								{
									do{
										view.AddReceived();
										add.ReceiveFile();

										System.out.print("\nDo you want to Recieve File again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if (UploadChoice == 0)
								{
									UploadCondition = false;
								}
							}while(UploadCondition);
		    			}
		    			else if (tran == 5)
		    			{
		    				boolean HistoryCondition = true;
				   	 		do
				   	 		{
				   	 		System.out.println("----------------  HISTORY  ----------------");
				   	 		int HistoryChoice;
				   	 		System.out.println("[1] Search\n[2] Sort");
				   	 		System.out.print("Enter your choice : ");
				   	 		HistoryChoice = in.nextInt();

					   	 		if(HistoryChoice == 1)
								{
		    						do{
										history.Search();
										System.out.print("\nDo you want to Search again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if(HistoryChoice == 2)
								{
		    						do{
										history.Sort(UType,UPurpose,OfficeFrom,OfficeTo,DateForward,DateReceived);
										System.out.print("\nDo you want to Sort again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else
								{
									System.out.println("Invalid Choice!");
								}
								boolean TransactionCondition = true;
								do{
								System.out.print("\nDo you want to Search/Sort again? [y]-Yes [n]-No :");
								ch	= in.next().charAt(0);
									if(ch == 'y' || ch == 'Y'){
										TransactionCondition = false;
									}
									else if(ch == 'n' || ch == 'N'){
										HistoryCondition = false;
										TransactionCondition = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
									}
								}while(TransactionCondition);


				   	 		}while(HistoryCondition);
		    			}

		    			else if (tran == 0)
		    			{
		    				System.out.println("Log out Successfully!");
		    				adminCondition = false;
		    			}


					}while(adminCondition);
					UpCondition = false;
				}
				else
				{
					System.out.println("Incorrect Credentials");
					UpCondition = false;
				}
			}while(UpCondition);
		}

		else if (login == 2)
		{
			Scanner n2 = new Scanner(System.in);
			boolean UpCondition = true;
			int checkHold;
			String username , password;

			do{
				System.out.print("Username :");
				username = n2.nextLine();
				System.out.print("Password :");
				password = n2.nextLine();

				checkHold = log.UserLogin(username ,password);

				if(checkHold == 1)
				{
					boolean userCondition = true;
					do{
				    	int tran;
						System.out.println("\n\t\t\t" + Section[UserSecCode]);
				    	System.out.println("[1] Upload\n[2] History\n[0] Logout");
						System.out.print("Enter your transaction:");
		    			tran = in.nextInt();

		    			if (tran == 1)
		    			{
		    				boolean UploadCondition = true;
							do{
								System.out.println("----------------  Forward  -----------------");
								view.ViewForward();
								System.out.println("--------------------------------------------");
								System.out.println("----------------  Received  ----------------");
								view.ViewReceived();
								System.out.println("--------------------------------------------");

								int UploadChoice;
								System.out.println("[1] Upload File \n[2] Received File \n[0] Back");
								System.out.print("Enter your choice : ");
								UploadChoice = in.nextInt();

								if(UploadChoice == 1 )
								{

									do{
										add.UploadFile(UserSecCode , Section , Purpose , Type);

										System.out.print("\nDo you want to Upload File again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if (UploadChoice == 2)
								{
									do{
										view.AddReceived();
										add.ReceiveFile();

										System.out.print("\nDo you want to Receive File again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if (UploadChoice == 0)
								{
									UploadCondition = false;
								}
							}while(UploadCondition);

		    			}
		    			else if (tran == 2)
		    			{
		    				boolean HistoryCondition = true;
				   	 		do
				   	 		{
				   	 		System.out.println("----------------  HISTORY  ----------------");
				   	 		int HistoryChoice;
				   	 		System.out.println("[1] Search\n[2] Sort");
				   	 		System.out.print("Enter your choice : ");
				   	 		HistoryChoice = in.nextInt();

					   	 		if(HistoryChoice == 1)
								{
		    						do{
										history.Search();
										System.out.print("\nDo you want to Search again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else if(HistoryChoice == 2)
								{
		    						do{
										history.Sort(UType,UPurpose,OfficeFrom,OfficeTo,DateForward,DateReceived);
										System.out.print("\nDo you want to Sort again? [y]-Yes [n]-No :");
										ch = in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else
								{
									System.out.println("Invalid Choice!");
								}
								boolean TransactionCondition = true;
								do{
								System.out.print("\nDo you want to Search/Sort again? [y]-Yes [n]-No :");
								ch	= in.next().charAt(0);
									if(ch == 'y' || ch == 'Y'){
										TransactionCondition = false;
									}
									else if(ch == 'n' || ch == 'N'){
										HistoryCondition = false;
										TransactionCondition = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
									}
								}while(TransactionCondition);


				   	 		}while(HistoryCondition);

		    			}
		    			else if (tran == 0)
		    			{
		    				System.out.println("Log out Successfully!");
		    				userCondition = false;
		    			}


	    			}while(userCondition);
	    			UpCondition = false;
				}
				else
				{
					System.out.println("Pataka raka oii");
					UpCondition = false;
				}
			}while(UpCondition);
		}
	}while (true);

}

}