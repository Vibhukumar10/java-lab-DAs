import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Person{
	String firstName;
	String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
class Q9
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		Integer T = sc.nextInt();// 1
		while (T-- > 0) {
			Integer N = sc.nextInt();// 4
			Map<String, Integer> frequencymap = new HashMap<String, Integer>();
			List<Person> list = new ArrayList<Person>();
			while (N-- > 0) {
				String firstName = sc.next();
				String lastName = sc.next();
				Person p = new Person(firstName, lastName);
				list.add(p);				
		    }
			for(Person p : list) {
				frequencymap.put(p.getFirstName(), frequencymap.getOrDefault(p.getFirstName(),0)+1);
			}
			System.out.println("\n");
			for(Person p : list) {
				if(frequencymap.get(p.getFirstName())>1) {
					System.out.println(p.getFirstName()+ " "+ p.getLastName());
				}
				else {
					System.out.println(p.getFirstName());
				}
			}
	    }
		

	}
}