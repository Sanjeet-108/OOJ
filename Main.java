import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject subject[];

    student() {
        int i;
        subject = new Subject[9];
        for (i = 0; i < 9; i++) {
            subject[i] = new Subject();
        }
        s = new Scanner(System.in);
    }

    void getStudentDeatils() {
        System.out.println("Enter your name:");
        name = s.nextLine();
        System.out.println("Enter your USN:");
        usn = s.nextLine();

    }

    void getMarks() {
        int i;
        for (i = 0; i < 8; i++) {
            System.out.println("Enter the marks and credits for course " + (i + 1) + ":");
            System.out.println("Marks:");
            int marks = s.nextInt();
            System.out.println("Credits:");
            int credits = s.nextInt();
            subject[i].subjectMarks = marks;
            subject[i].credits = credits;
            subject[i].grade = (subject[i].subjectMarks) / (10) + 1;
            if (subject[i].grade == 11) {
                subject[i].grade = 10;
            }
            if (subject[i].grade <= 4) {
                subject[i].grade = 0;
            }

        }
    }

    void computeSGPA() {
        int total_credits = 0;
        int i;
        for (i = 0; i < 8; i++) {
            total_credits += subject[i].credits;
        }
        int totalgradeandcredit = 0;
        for (i = 0; i < 8; i++) {
            totalgradeandcredit += subject[i].credits * subject[i].grade;
        }
        double SGPA = (float) totalgradeandcredit / total_credits;
        System.out.println("Your SGPA is " + SGPA);

    }
}

class Main {
    public static void main(String args[]) {
        student S1 = new student();
        S1.getStudentDeatils();
        S1.getMarks();
        S1.computeSGPA();
        System.out.println("Sanjeet Prajwal Pandit- 1BM22CS241");
    }
}