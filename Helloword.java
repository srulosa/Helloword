public class Helloworld
{
	public static void main(String[] args)
	{
		String[] greeting = new String[3];
		greeting[0] = "Welcome to Core Java";
		greeting[1] = "Cay Horstmann";
		greeting[2] = "and Gary Cornell";

		for(int i = 0; i < greeting.length; ++i)
			System.out.println(greeting[i]);
	}
}
