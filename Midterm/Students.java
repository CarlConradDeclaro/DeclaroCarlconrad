import java.util.*;

 class StudentsManagement {
    
    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private int yearLevel;
    private int phoneNumber;
    private String email;
    List<StudentsManagement> studs = new ArrayList<>();

    StudentsManagement(){}
    StudentsManagement(int studentId,String firstName,String middleName,String lastName,String suffix,int age,int yearLevel,int phoneNumber,String email){
        this.studentId =studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.age = age;
        this.yearLevel = yearLevel;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    int getStudentId(){
        return studentId;
    }
    String getFirstName(){
        return firstName;
    }
    String getMiddleName(){
        return middleName;
    }
    String getlastName(){
        return lastName;
    }
    String getSuffix(){
        return suffix;
    }
    int getAge(){
        return age;
    }
    int getYearLevel(){
        return yearLevel;
    }
    
    int getPhoneNumber(){
        return phoneNumber;
    }
    String getEmai(){
        return email;
    }

    int setStudentId(int studentId){
        return this.studentId =studentId;
    } 
    String setFirstName(String firstName){
        return this.firstName =firstName;
    }
     String setMiddleName(String middleName){
        return this.middleName = middleName;
     }
     String setLastName(String lastName){
         return   this.lastName = lastName;
     }

    String setSuffix(String suffix){
        return  this.suffix = suffix;
    }
    int setAge(int age){
        return    this.age = age;
    }

    int setYearLevel(int yearLevel){
        return this.yearLevel = yearLevel;
    }
    
    int setPhoneNumber(int phoneNumber){
        return   this.phoneNumber = phoneNumber;
    }
    String setEmail(String email){
        return this.email = email;
    }

    void createStudent(){
       Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student id: ");
            int studentId = setStudentId(sc.nextInt());
            System.out.println("Enter First name: ");
            sc.nextLine();
            String firtName = setFirstName(sc.nextLine());
            System.out.println("Enter Middle name: ");
            String middleName = setMiddleName(sc.nextLine());
            System.out.println("Enter Last name: ");
            String lastName = setLastName(sc.nextLine());
            System.out.println("Enter Suffix: ");
            String suffix = setSuffix(sc.nextLine());
            System.out.println("Enter Age: ");
            int age = setAge(sc.nextInt());
            System.out.println("Enter Year level: ");
            int yearLevel = setYearLevel(sc.nextInt());
            System.out.println("Enter Phone number: ");
            int phoneNumber = setPhoneNumber(sc.nextInt());
            System.out.println("Enter Email: ");
            sc.nextLine();
            String email = setEmail(sc.nextLine());

            StudentsManagement stud = new StudentsManagement(studentId, lastName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email);
            studs.add(stud);
        }

        void updateStudent(int id){
          Scanner sc = new Scanner(System.in);
           for(StudentsManagement s : studs){
                  if(s.getStudentId() == id ){                 
                    System.out.println("Enter First name: ");
                    setFirstName(sc.nextLine());
                    System.out.println("Enter Middle name: ");
                    setMiddleName(sc.nextLine());
                    System.out.println("Enter Last name: ");
                    setLastName(sc.nextLine());
                    System.out.println("Enter Suffix: ");
                    setSuffix(sc.nextLine());
                    System.out.println("Enter Age: ");
                    setAge(sc.nextInt());
                    System.out.println("Enter Year level: ");
                    setYearLevel(sc.nextInt());
                    System.out.println("Enter Phone number: ");
                    setPhoneNumber(sc.nextInt());
                    System.out.println("Enter Email: ");
                    setEmail(sc.nextLine());
                  }
           } 
        }

        
  

        void display(){
            System.out.println(getStudentId()+" "+ getFirstName() +" "+ getMiddleName() +" "+ getlastName() +" "+ getSuffix() +" "+ getAge() +" "+ getYearLevel() +" "+ getPhoneNumber() +" "+ getEmai());
        }

}
class Students{
        public static void main(String[] args) {
             
            Scanner sc = new Scanner(System.in);
            
            StudentsManagement student = new StudentsManagement();
             
            // System.out.print("Create Student: ");
            // student.createStudent();
    
            // System.out.println("Student info: ");
            // student.display();

            // System.out.println("Update Student: ");
            // System.out.print("Enter student id: ");
            // student.updateStudent(sc.nextInt());
            
            // System.out.println("\nUpdated Student: ");
            // student.display();

            // // new student
            // System.out.print("Create another Student: ");
            // student.createStudent();

            // System.out.println("new Student info: ");
            // student.display();

          boolean run = true;
          do{
            System.out.print("Create Student: ");
            student.createStudent();
             
            boolean go = true;
            do{
                System.out.println("1, Update Student Profile Details");
                System.out.println("2, Update Student Course Details");
                System.out.println("3,Display Student record");

                    System.out.print("Choice:");
                    int choys = sc.nextInt();
                    switch(choys){
                        case 1: 
                              System.out.print("Enter student id: ");
                              student.updateStudent(sc.nextInt());
                              go =false;
                              break;
                        case 2:
                              System.out.print("Enter student id: ");
                              student.updateStudent(sc.nextInt());
                               go =false;
                              break;
                         case 3: 
                               student.display();
                                go =false;
                               break;                                     
                    }
            }while(go);
              
            System.out.print("Do you want to create new student(y/n)");
             sc.nextLine();
            String ans = sc.nextLine();
             run  = ans.equals("n") ? false : true;
          }while(run);


            

            
        } 
}