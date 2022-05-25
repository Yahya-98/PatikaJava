public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double snote = 0.0;
    double setki = 0.0;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
        this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyusmuyor");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}
