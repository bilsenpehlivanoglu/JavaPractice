package day33exceptionsenumiterator;

public class ExceptionRunner {
    public static void main(String[] args) throws InvalidStudentGradeException {

        getStdGrade(50);
        getStdGrade(150);

    }

    public static void getStdGrade(int grade) throws InvalidStudentGradeException {

        if (grade<0 || grade>100){
            throw new InvalidStudentGradeException("student's grade cannot be less than zero or greater than 100");
        }else {
            System.out.println(grade);
        }
    }
}
