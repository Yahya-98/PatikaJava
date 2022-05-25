public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "905551112233");
        Teacher t2 = new Teacher("Braham Bell", "FZK", "905551112234");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "905551123535");

        Course tarih = new Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji", "103","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Saban", "123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,60,50,80,100,50,0.2);
        s1.isPass();

    }
}
