public class UserNameDriver {

	public static void main(String[] args) {

		Name n1 = new Name("Bob", "Cruz", 'J');

		UserNameGenerator gen = new UserNameGenerator();

		String userName = gen.generateUserName(n1);

		System.out.println(userName);

	}

}