
import java.util.*;
public class Student {
    String name;
    String middleName;
    String lastName;
    String suffix;

    Student(){}
    Student(String name,String middleName,String lastName,String suffix ){
       this.name = name;
       this.middleName = middleName;
       this.lastName = lastName ;
       this.suffix = suffix;
    }

    public String getName(){return name;}
    public String getMiddleName(){return  middleName;}
    public String getLastName(){return lastName;}
    public String getSuffix(){return suffix;}



    public String setName(String name){
        return this.name =name;
    }
    public String setMiddleName(String middleName){
        return  this.middleName = middleName;
    }
    public String setLastName(String lastName){
        return this.lastName = lastName;
    }
    public String setSuffix(String suffix){
        return this.suffix = suffix;
    }
    
    public void display(){
        System.out.println("Full Name: "+getName() + " "+ getMiddleName() + " "+ getLastName() +" "+ getSuffix());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter name: ");
        String name = student.setName(sc.nextLine());
        System.out.print("Enter middle name: ");
        String midName = student.setMiddleName(sc.nextLine());
        System.out.print("Enter last name: ");
        String lastname = student.setLastName(sc.nextLine());
        System.out.print("Enter suffix: ");
        String suffix= student.setSuffix(sc.nextLine());

        Student fullName = new Student(name,midName, lastname, suffix);
        fullName.display();
     }
}
