import java.util.Comparator;

public class MyOwnComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		MainProgram name1=(MainProgram)o1;
		MainProgram name2=(MainProgram)o2;
		String s1=name1.getName();
		String s2=name2.getName();
		//return s1.compareTo(s2);
		return -s1.compareTo(s2);
		
		
		
	}
	

}
