abstract class FirstYearCourse {
    abstract void printName();
    abstract void printCode();
    void printTotalWeeks() {
        System.out.println("Total weeks in first year: 52");
    }
    public void printSemesterICourses(){
        System.out.println("Semester I");
        System.out.println("Course Code ||Subject                           || Credit Hours");
        System.out.println("ELE 120     ||Basic Electrical Engineering      ||3");
        System.out.println("MTH 110     ||Calculus - I                      ||3");
        System.out.println("ENG 110     ||Communication Techniques          ||2");
        System.out.println("CMP 122     ||Computer Workshop                 ||1");
        System.out.println("ELX 110     ||Digital Logic                     ||3");
        System.out.println("ELX 120     ||Electronics Devices and Circuits  ||3");
        System.out.println("CMP 124     ||Programming in C                  ||3");
        System.out.println("Total Credits: 18");
    }
    public void printSemesterIICourses(){
        System.out.println("Semester II");
        System.out.println("Course Code ||Subject                            ||Credit Hours");
        System.out.println("MTH 150     ||Algebra and Geometry               ||3");
        System.out.println("CHM 110     ||Applied Chemistry                  ||2");
        System.out.println("PHY 110     ||Applied Physics                    ||3");
        System.out.println("MEC 116     ||Basic Engineering Drawing          ||1");
        System.out.println("CMP 160     ||Data Structure and Algorithms      ||3");
        System.out.println("ELE 172     ||Instrumentation                    ||3");
        System.out.println("CMP 162     ||Object Oriented Programming in C++ ||3");
        System.out.println("Total Credits: 18");
    }
}
