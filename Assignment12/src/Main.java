import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String []args){
        List<Student> studentList=generateList();
        //1.name of all departments in the college
        List Department = studentList.stream().filter(distinctByKey(s->s.engDepartment)).map(d->d.engDepartment).collect(Collectors.toList());
        System.out.println("DEPARTMENT "+Department);

        //2.names of all students who have enrolled after 2018
        List after2018=studentList.stream().filter(s->s.year_of_enrollment>2018).map(n->n.name).collect(Collectors.toList());
        System.out.println("STUDENTS AFTER 2018 ARE "+after2018);

        //3. Details of all male student in the computer science department
        List male_cse=studentList.stream().filter(s->s.gender.equals("Male") && s.engDepartment.equals("Computer Science")).map(n->n.name).collect(Collectors.toList());
        System.out.println("MALE COMPUTER SCIENCE STUDENTS "+male_cse);

        //4.Male and female student are there
        Map<String ,Long> countgender=studentList.stream().collect(Collectors.groupingBy(s->s.gender , Collectors.counting()));
        System.out.println("COUNT OF MALES AND FEMALES ARE "+countgender);

        //5.Average age of male and female students
        Map<String,Double> average_age=studentList.stream().collect(Collectors.groupingBy(s->s.gender, Collectors.averagingInt(s->s.age)));
        System.out.println("AVERAGE AGE OF BOSY AND GIRLS "+average_age);

        //6.Details of highest student having highest percentage
        OptionalDouble st=studentList.stream().map(n->n).mapToDouble(s->s.perTillDate).max();
        double value=st.getAsDouble();
        List students=studentList.stream().filter(s->s.perTillDate==value).collect(Collectors.toList());
        Student maxi= (Student) students.get(0);
        System.out.println(maxi.id+" "+maxi.name+" "+maxi.engDepartment+" "+" "+maxi.gender+" "+maxi.age+" "+maxi.perTillDate+" "+maxi.year_of_enrollment);

        //7.The number of students in each department
        Map<String,Long> students_in_dept=studentList.stream().collect(Collectors.groupingBy(s->s.engDepartment, Collectors.counting()));
        System.out.println("STUDENTS IN EACH DEPARTMENT ARE "+students_in_dept);

        //8.The average percentage achieved in each department
        Map<String, Double> avgPercentageInEachDepartment = studentList.stream().collect(Collectors.groupingBy(s->s.engDepartment, Collectors.averagingDouble(s->s.perTillDate)));
        System.out.println(avgPercentageInEachDepartment);


        //9.Details of youngest male student in the Electronic department
        Student young=studentList.stream().filter(s->s.engDepartment.equals("Electronic") && s.gender.equals("Male")).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).get();
        System.out.println("STUDENT WITH MIN AGE: "+young.id+" "+young.name+" "+young.engDepartment+" "+" "+young.gender+" "+young.age+" "+young.perTillDate+" "+young.year_of_enrollment);

        //10. male and female students are there in the computer science department
        Map<String,Long> cse_students=studentList.stream().filter(n->n.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(s->s.gender ,Collectors.counting()));
        System.out.println(cse_students);

    }

    private static List<Student> generateList() {
        Student student[]=new Student[17];
        student[0]=new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        student[1]=new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        student[2]=new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        student[3]=new Student(144, "Murali Gowda", 18, "Male", "Electric", 2018, 80.0);
        student[4]=new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70.0);
        student[5]=new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70.0);
        student[6]=new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70.0);
        student[7]=new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80.0);
        student[8]=new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85.0);
        student[9]=new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82.0);
        student[10]=new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83.0);
        student[11]=new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        student[12]=new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        student[13]=new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        student[14]=new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        student[15]=new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        student[16]=new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);

        List<Student> studentList =new ArrayList<Student>();
        for(Student s:student){
            studentList.add(s);
        }
        return studentList;
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }



}
