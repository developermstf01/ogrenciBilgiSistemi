public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "543", "TRH");
        Teacher t2 = new Teacher("Einstein", "555", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "111", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "3", tarih, fizik, biyo);
        s1.addBulkExamNote(100,50,80);
        s1.addVerbalNote(60,70,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "124","3",tarih,fizik,biyo);
        s2.addBulkExamNote(90,50,35);
        s2.addVerbalNote(90,50,60);
        s2.isPass();
    }
}
