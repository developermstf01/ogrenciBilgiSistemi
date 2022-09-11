public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course vN1;
    Course vN2;
    Course vN3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        this.vN1 = c1;
        this.vN2 = c2;
        this.vN3 = c3;

        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }

        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }

        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
    }

    void addVerbalNote(int note1, int note2, int note3){

        if (note1 >= 0 && note1 <= 100){
            this.vN1.verbalNote = note1;
        }

        if (note2 >= 0 && note2 <= 100){
            this.vN2.verbalNote = note2;
        }

        if (note3 >= 0 && note3 <= 100){
            this.vN3.verbalNote = note3;
        }
    }

    void isPass(){
        System.out.println("==================");
        double x = ((this.c1.note)*0.80) + (this.vN1.verbalNote * 0.20);
        double y = ((this.c2.note)*0.80) + (this.vN2.verbalNote * 0.20);
        double z = ((this.c3.note)*0.80) + (this.vN3.verbalNote * 0.20);

        this.average = x + y + z / 3.0;

        if (average > 55){
            System.out.println("Hababam sınıfı uyanıyor !");
            this.isPass = true;
        }else {
            System.out.println("Hababam sınıfı, sınıfta kaldı !");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        double x = ((this.c1.note)*0.80) + (this.vN1.verbalNote * 0.20);
        double y = ((this.c2.note)*0.80) + (this.vN2.verbalNote * 0.20);
        double z = ((this.c3.note)*0.80) + (this.vN3.verbalNote * 0.20);

        System.out.println("Öğrenci adı: "+this.name);
        System.out.println(this.c1.name + " notu :" + x);
        System.out.println(this.c2.name + " notu :" + y);
        System.out.println(this.c3.name + " notu :" + z);

        if (this.average > 100){
            average = 100;
        }
        System.out.println("Ortalamanız: "+this.average);
    }
}
