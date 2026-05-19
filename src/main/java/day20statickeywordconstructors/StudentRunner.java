package day20statickeywordconstructors;

public class StudentRunner {
    public static void main(String[] args) {

        //stdName static oldugu icin object olusturmadik
        System.out.println(Student.stdName);//Tom Hanks

        //age non static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student();//bu bir constructor, static objelere bu sekilde ulasabiliriz.
        System.out.println(std1.age);//13

        Student.staticMethod();//static method

        std1.nonStaticMethod();//non static method
    }
}
