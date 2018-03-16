//creates the class Person which Customer and Employee inherit from

package software_project;


public abstract class Person {
                       
	private int id;
	private String name;
	
	
	public Person(String name, int id){
		this.id = id;
		this.name =name;
	}

    public String getName() {
        return name;
    }
}
