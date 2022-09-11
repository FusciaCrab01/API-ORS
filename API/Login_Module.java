
public class Login_Module extends ORS{

	public Login_Module() {
    }

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