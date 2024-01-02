import java.util.Scanner;

class Student {
    private String USN;
    private String Name;
    private int[] Marks = new int[3];

    // Constructor to initialize Student object
    public Student(String usn, String name, int[] marks) {
        USN = usn;
        Name = name;
        for (int i = 0; i < 3; ++i) {
            Marks[i] = marks[i];
        }
    }

    
    public double calculateAverage() {
        
        for (int i = 0; i < 2; ++i) {
            for (int j = i + 1; j < 3; ++j) {
                if (Marks[i] < Marks[j]) {
                    int temp = Marks[i];
                    Marks[i] = Marks[j];
                    Marks[j] = temp;
                }
            }
        }
        return (Marks[0] + Marks[1]) / 2.0;
    }

    
    public void displayDetails() {
        double avg = calculateAverage();
        System.out.println("USN: " + USN + ", Name: " + Name + ", Average Marks: " + avg);
    }
}

public class constdest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

       
        Student[] students = new Student[n];

       
        for (int i = 0; i < n; ++i) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Enter marks in 3 tests: ");
            int[] marks = new int[3];
            for (int j = 0; j < 3; ++j) {
                marks[j] = scanner.nextInt();
            }
            students[i] = new Student(usn, name, marks);
        }

        
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < n; ++i) {
            students[i].displayDetails();
        }

        
        scanner.close();
    }
}


   
   
    // Finalize method to perform cleanup before garbage collection
    // @Override
    // protected void finalize() throws Throwable {
    //     try {
    //         // Perform cleanup operations here if needed
    //         System.out.println("Student with USN " + USN + " is being finalized.");
    //     } finally {
    //         super.finalize();
    //     }
    // }
