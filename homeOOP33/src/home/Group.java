package home;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private String groupName;
	private Student[] student = new Student[10];
	public Group(String groupName, Student[] student) {
		super();
		this.groupName = groupName;
		this.student = student;
	}
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", student=" + Arrays.toString(student) + "]";
	}
	public void addStudent(Student student) throws GroupOverflowException{
		int count = -1;
		
			for (int j = 0; j < this.student.length; j++) {
				if(this.student[j] != null) {
					++count;
				}
				}
			if(count==9) {
				throw new GroupOverflowException("GroupOverflow");
			}
			for (int i = 0; i < this.student.length; i++) {
				if(student != null) {
				if(this.student[i] == null) {
				this.student[i] = student;
				System.out.println("Studend add  "+ student);
				return;
			}
				}
			}
			
		
	}
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (int i = 0; i < this.student.length; i++) {
			if(student[i]!=null){
			if(student[i].getLastName().equals(lastName)) {
				System.out.println("Studend add");
			return student[i];
			}
			}
		}
		throw new StudentNotFoundException("StudentNotFound");
		
	}
	public boolean removeStudentByID(int id) {
		for (int i = 0; i < this.student.length; i++) {
		if(student[i]!=null){
		if (student[i].getId()==id) {
			student[i]=null;
			System.out.println("Studend remove");
			return true;
		}
		}
		}
		return false;
	}
	public void sortStudentsByLastName(){
		Arrays.sort(student, Comparator.nullsFirst(new StudentLastnameComparator()));
	}
	public void show(){
		
		System.out.println();
		for (int i = 0; i < this.student.length; i++) {
			if(student[i] == null){
			continue;
			}
	
			System.out.println(student[i].getName() + " " + student[i].getLastName());
		}
	}
}

