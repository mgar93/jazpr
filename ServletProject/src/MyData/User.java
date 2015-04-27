package MyData;

public class User 
{
	public static int lastId;
	
	public int id;
	public String login;
	public String password;
	public String email;
	public UserRole role;
	
	public User()
	{
		id = ++lastId;
	}
}
