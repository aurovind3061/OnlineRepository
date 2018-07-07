import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class MainProgram implements Comparable<MainProgram>{
	
	private String name;
	private String city;
	private int id;
	private long phone;
	
	@Override
	public String toString() {
		return "MyComparator [name=" + name + ", city=" + city + ", id=" + id + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	

	public MainProgram(String name, String city, int id, long phone) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
		this.phone = phone;
	}

	/*@Override
	public int compareTo(MainProgram o) {
		// TODO Auto-generated method stub
		int name=this.name.length();
		int name1=o.getName().length();
		if(name>name1) {
			return -1;
		}
		else if(name<name1)
			return 1;
		else return 0;
	}
	*/
	/*public int compareTo(MainProgram o) {
		// TODO Auto-generated method stub
		int name=this.id;
		int name1=o.id;
		if(name>name1) {
			return -1;
		}
		else if(name<name1)
			return 1;
		else return 0;
	}*/
	
	public int compareTo(MainProgram o) {
		// TODO Auto-generated method stub
		int name=this.id;
		int name1=o.id;
		if(name>name1) {
			return -1;
		}
		else if(name<name1)
			return 1;
		else return 0;
	}
	
	

}


public class MyComparator{
	
	public static void main(String[] args) {
		TreeSet list=new TreeSet();
		list.add(new MainProgram("aurovindsamal","bangalore",1,258963));
		list.add(new MainProgram("vikash","bhubaneswar",5,258963));
		list.add(new MainProgram("suchi","balasore",9,258963));
		list.add(new MainProgram("pratik","cuttack",6,258963));
		list.add(new MainProgram("himanshu","bihar",7,258963));
		list.add(new MainProgram("disha","bengal",3,258963));
		list.add(new MainProgram("vinodh","andhra",7,258963));
		
		System.out.println(list);
		
		
		TreeSet tree=new TreeSet<>(new MyOwnComparator());
		tree.add(new MainProgram("name", "city", 56, 147852));
		tree.add(new MainProgram("name123", "city", 56, 147852));
		tree.add(new MainProgram("name52", "city", 56, 147852));
		tree.add(new MainProgram("name41", "city", 56, 147852));
		tree.add(new MainProgram("name0", "city", 56, 147852));
		tree.add(new MainProgram("name3654", "city", 56, 147852));
		System.out.println("Custom Comparator");
		System.out.println(tree);
		
	}
}
