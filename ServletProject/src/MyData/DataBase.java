package MyData;
import java.util.*;

public class DataBase
{
	public static List<User> users = new ArrayList<User>();
	
	public static User getUserByLogin(String login)
	{
		User target = null;
		for(User u : users)
		{
			if(u.login.equals(login))
			{
				target = u;
				break;
			}
		}
		return target;
	}
	
	public static User getUserById(int id)
	{
		User target = null;
		for(User u : users)
		{
			if(u.id == id)
			{
				target = u;
				break;
			}
		}
		return target;
	}
}
