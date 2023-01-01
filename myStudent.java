import java.util.ArrayList;
import java.util.Scanner;

public class myStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter arabic hours");
        int hArabic = s.nextInt();
        System.out.println(" enter math hours");
        int hMath = s.nextInt();
        System.out.println(" enter DS hours");
        int hDs = s.nextInt();

        Student m1 = new Student(23, "omer", 12, 4, 64, 67, 88);
        Student m2 = new Student(43, "nana", 13, 5, 77, 79, 66);
        Student m3 = new Student(77, "tata", 14, 6, 88, 86, 91);
        Student m4 = new Student(54, "ahmed", 19, 7, 92, 96, 95);
        Student m5 = new Student(54, "kaka", 20, 8, 56, 67, 87);
        // Student m5 = new Student(87, "loma", 18, 1, 63, 84, 25);

        Student.SortS();

        // loop: while (true) {
        // System.out.println(
        // "----enter operation---- \nAS = (add new student)\nUSD = (update student name
        // by entering id)\nCR = (calculate results)\nVR = (view reports \n\ta.all
        // students report sorted \n\tb.Display the details of a student which id enterd
        // from user. \nE=(exit))");
        // s.nextLine();
        // String op = s.nextLine().toUpperCase();
        // ths: switch (op) {
        // case "E":
        // break loop;
        // case "AS":
        // System.out.println("how many students u wanna add ?");
        // int numOfSt = s.nextInt();
        // for (int i = 0; i < numOfSt; i++) {
        // System.out.println("enter id ");
        // int id = s.nextInt();
        // System.out.println("enter name");
        // s.nextLine();
        // String name = s.nextLine();
        // System.out.println("enter age");
        // int age = s.nextInt();
        // s.nextLine();
        // System.out.println("enter semester (1---8)");
        // int semester = s.nextInt();
        // System.out.println("enter grade int arabic");
        // int gArabic = s.nextInt();
        // System.out.println("enter grade int math");
        // int gMAth = s.nextInt();
        // System.out.println("enter grade in DS");
        // int gDS = s.nextInt();

        // Student.addStudent(id, name, age, semester, gArabic, gMAth, gDS);
        // }
        // s.nextLine();
        // break;
        // case "USD":
        // System.out.println("enter id of student u wanna update : ");
        // Student.printStudents();
        // int oldSId = s.nextInt();
        // s.nextLine();
        // System.out.println("enter new name ");
        // String newSN = s.nextLine();
        // for (Student als : Student.students) {
        // if (als.getId() == oldSId) {
        // als.setName(newSN);
        // break;
        // }
        // }
        // s.nextLine();
        // break;
        // case "CR":
        // for (Student stu : Student.students) {
        // System.out.println(stu.getName() + " : " + stu.calcGrade(hArabic, hMath,
        // hDs));
        // break ths;
        // }
        // s.nextLine();
        // break;
        // case "VR":
        // if (Student.students.size() ==0) {
        // System.out.println("\nyou should add students first !\n");
        // break ;
        // }
        // System.out.println("a or b ?");
        // char choice = s.next().charAt(0);
        // if (choice == 'a') {
        // for (Student stu : Student.students) {
        // System.out.println(stu.getName() + " : " + stu.calcGrade(hArabic, hMath,
        // hDs));
        // }
        // } else if (choice == 'b') {
        // System.out.println("enter id");
        // Student.printStudents();
        // int pID = s.nextInt();
        // for (Student st : Student.students) {
        // if (pID == st.getId() && Student.students.contains(st)) {
        // System.out.println("name : " + st.getName() + " age : " + st.getAge() + "
        // semester : "
        // + st.getSemester() + " grade in math : " + st.getgMAth()
        // + " grade in araabic : " + st.getgArabic() + " grade in DS : " + st.getgDS()
        // + " grade : " + st.calcGrade(hArabic, hMath, hDs));
        // } // else if(!(Student.students.contains())){
        // // System.out.println("ENTER STUDENTS AND THERE DETAILS FIRST !!");
        // // }
        // }
        // } else
        // System.out.println("wrong chocie");
        // s.nextLine();
        // break;

        // default:
        // System.out.println("not available operation !\ntry again sir");
        // s.nextLine();
        // break;
        // }
        // }
        // s.close();
    }
}

class Student {
    static ArrayList<Student> students = new ArrayList<>();
    // static double[] grades = new double[students.size()];

    private int id;
    private int age;
    private String name;
    private int semester;
    private int gArabic;
    private int gMAth;
    private int gDS;
    private double grade;

    Student(int id, String name, int age, int semester, int gArabic, int gMAth, int gDS) {

        if (semester > 8 || semester < 1) {
            System.out.println("wrong semester number the student will not be added !!");
            return;
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.gArabic = gArabic;
        this.gMAth = gMAth;
        this.gDS = gDS;
        grade = this.calcGrade(gArabic, gMAth, gDS);
        students.add(this);
    }

    public static void printStudents() {
        for (Student i : students) {
            System.out.println(i.getId() + " : " + i.getName());
        }
    }

    static void addStudent(int id, String name, int age, int semester, int gArabic, int gMAth, int gDS) {
        new Student(id, name, age, semester, gArabic, gMAth, gDS);
    }

    double calcGrade(int hArabic, int hMath, int hDs) {
        return (this.gDS * hDs + this.gArabic * hArabic + this.gMAth * hMath) / 3;
    }

    static void SortS() {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j + 1 < students.size(); j++) {
                if (students.get(j).grade < students.get(j + 1).grade) {
                    Student t = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, t);
                }
            }
        }

        int k = 0;
        for (Student s : students) {
            System.out.println(++k + "/" + s.name + " : " + s.grade);
        }
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @return the gArabic
     */
    public int getgArabic() {
        return gArabic;
    }

    /**
     * @return the gDS
     */
    public int getgDS() {
        return gDS;
    }

    /**
     * @return the gMAth
     */
    public int getgMAth() {
        return gMAth;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        if (semester > 8 || semester < 1) {
            System.out.println("wrong semester number the student will not be added !!");
            return;
        }
        this.semester = semester;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }
    /**
     * @param grade the grade to set
     */

}