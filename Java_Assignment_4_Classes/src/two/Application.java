package two;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivatePerson pp = new PrivatePerson();
		pp.setAge(25);
		pp.setName("Rick");
		
		System.out.println("Name: " + pp.getName() + ", Age: " + pp.getAge());
	}

}
