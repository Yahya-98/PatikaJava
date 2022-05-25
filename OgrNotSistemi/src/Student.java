public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stNO;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stNO, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stNO = stNO;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(double note1,double snote1, double note2, double snote2, double note3, double snote3, double setki) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = (note1 * (1 - setki)) + (snote1 * setki);

        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = (note2 * (1 - setki)) + (snote2 * setki);
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = (note3 * (1 - setki)) + (snote3 * setki);
        }
    }


    void isPass() {
        this.average = ((this.c1.note + this.c2.note + this.c3.note) / 3.0);
        if (this.average > 55) {
            System.out.println("Sınıfı Gectiniz");
            this.isPass = true;
        } else {
            System.out.println("Sınıfı Gecemediniz");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(c1.name + " Notu\t:" + c1.note);
        System.out.println(c2.name + " Notu\t:" + c2.note);
        System.out.println(c3.name + " Notu\t:" + c3.note);
        System.out.println("Ortalamanız: " + this.average);

    }

}


