package lab_5.College;

import java.lang.reflect.Array;

public class College {
    public static void main(String[] args) {
        Student[] stud = new Student[4];
        Student progr1 = new Student("Pasha", 17, 3, "3П1.17");
        Student progr2 = new Student("Sergei", 20, 4, "4П1.17");
        Student progr3 = new Student("Maxim", 18, 3, "3П1.17");
        Student progr4 = new Student("Eldar", 20, 4, "4П1.17");
//stud[0] = new Student("Pasha", 17, 3, "3П1.17");
        stud[0] = progr1;
        stud[1] = progr2;
        stud[2] = progr3;
        stud[3] = progr4;
//System.out.println(stud[0]);
        for (int i = 0; i < 4; i++) {
            System.out.print(stud[i].group + "\t");
            System.out.print(stud[i].name + "\t");
            System.out.print(stud[i].age + "\t");
            System.out.print(stud[i].course + "\t");
            System.out.println();
        }
        System.out.println(stud[0].age);
    }

    public static class Student {
        private String group;
        private int age;
        private int course;
        private String name;

        public Student(String _name, int _age, int _course, String _group) {
            name = _name;
            age = _age;
            course = _course;
            group = _group;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public int getCourse() {
            return course;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        private String getGroup() {
            return group;
        }
    }
}