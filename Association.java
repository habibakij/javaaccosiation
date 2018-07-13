package association;

import java.util.ArrayList;

/**
 @author Habib_Adnan
 */
public class Association {
    public static void main(String[] args) {
        // TODO code application logic here
        Member member=new Member("HABIB", "4", "JOB");
        Room room=new Room("100yeards", "Mohakhali");
        member.setRoom(room);
        System.out.println(member.getRoom().getRoomsize()+" in "+member.getRoom().getRoomlocation()+"\n");
        
        ArrayList<Student>studentdata= new ArrayList<Student>();

         
        Student student= new Student();
        student.setName("Habib adnan");
        student.setRull("768188");
        student.setTreat("computer");
        student.setEmail("adnanhabib454@gmail.com");
        
        Student student1= new Student();
        student1.setName("Golam kibria");
        student1.setRull("575263");
        student1.setTreat("computer");
        student1.setEmail("golakibria@gmail.com");
        
        Student student2= new Student();
        student2.setName("Azizul haque");
        student2.setRull("575262");
        student2.setTreat("architecture");
        student2.setEmail("azizulhaque@gmail.com");
        
        Student student3= new Student();
        student3.setName("Bayzid monshi");
        student3.setRull("768205");
        student3.setTreat("computer");
        student3.setEmail("bayzidmonshi@gmail.com");
        
        School school= new School();
        school.setScname("Laimpaha High School");
        school.setCode("110336");
        /*school.getStudent().add(student);
        school.getStudent().add(student1);
        school.getStudent().add(student2);
        school.getStudent().add(student3);*/
        
        studentdata.add(student);
        studentdata.add(student1);
        studentdata.add(student2);
        studentdata.add(student3);
        System.out.println(studentdata.size());
        for(int i=0;i<studentdata.size();i++){
            System.out.println("Name: "+studentdata.get(i).getName()+" Rull: "+studentdata.get(i).getRull()+" Tread: "+studentdata.get(i).getTreat()+" Email: "+studentdata.get(i).getEmail());
        }
        /*for(Student std: studentdata){
            System.out.println(student.getName()+" "+student.getRull()+" "+student.getTreat()+" "+student.getEmail());
            break;
        }*/
    }
}
class Member{
    private String memname;
    private String whatsmember;
    private String whatsdoingmember;
    Room room;

    public Member(String memname, String whatsmember, String whatsdoingmember, Room room) {
        this.memname = memname;
        this.whatsmember = whatsmember;
        this.whatsdoingmember = whatsdoingmember;
        this.room = room;
    }

    public Member(String memname, String whatsmember, String whatsdoingmember) {
        this.memname = memname;
        this.whatsmember = whatsmember;
        this.whatsdoingmember = whatsdoingmember;
    }
    
    public void setMemname(String memname) {
        this.memname = memname;
    }

    public void setWhatsmember(String whatsmember) {
        this.whatsmember = whatsmember;
    }

    public void setWhatsdoingmember(String whatsdoingmember) {
        this.whatsdoingmember = whatsdoingmember;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getMemname() {
        return memname;
    }

    public String getWhatsmember() {
        return whatsmember;
    }

    public String getWhatsdoingmember() {
        return whatsdoingmember;
    }

    public Room getRoom() {
        return room;
    }
    public void showalldata(){
        System.out.println(memname+" "+whatsmember+" "+whatsdoingmember);
        return;
    }
}
class Room{
    private String roomsize;
    private String roomlocation;

    public void setRoomsize(String roomsize) {
        this.roomsize = roomsize;
    }

    public void setRoomlocation(String roomlocation) {
        this.roomlocation = roomlocation;
    }

    public String getRoomsize() {
        return roomsize;
    }

    public String getRoomlocation() {
        return roomlocation;
    }

    public Room(String roomsize, String roomlocation) {
        this.roomsize = roomsize;
        this.roomlocation = roomlocation;
    }
}
class Student{
   private String name;
   private String rull;
   private String treat;
   private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setRull(String rull) {
        this.rull = rull;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getRull() {
        return rull;
    }

    public String getTreat() {
        return treat;
    }

    public String getEmail() {
        return email;
    }
   
}
class School{
    private String scname;
    private String code;
    ArrayList<Student>studentdata= new ArrayList<Student>();

    public void setScname(String scname) {
        this.scname = scname;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStudent(ArrayList<Student> student) {
        this.studentdata = student;
    }

    public String getScname() {
        return scname;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Student> getStudent() {
        return studentdata;
    }

    
    
    
}