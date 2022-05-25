public class Teacher {

    String name;
    String telno;
    String branch;

    Teacher(String name, String branch, String telno){
        this.name = name;
        this.branch = branch;
        this.telno = telno;

    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.telno);
        System.out.println("Branş : " + this.branch);
    }
}
