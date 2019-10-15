package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private List<Student> students ;

    public StudentManager(){
        students = new ArrayList<Student>();
    }
    public void addStudent(Student s){
        students.add(s);
    }

    public void printAllStudent(){
        for ( int i = 0; i < students.size(); i++){
            Student sI = students.get(i);
            sI.inTT();
            System.out.println("---------------------");
        }
    }

    public Student findStudentByName(String name){
        for ( int i = 0; i < students.size(); i++){
            Student sI = students.get(i);
            if (sI.getName().equals(name)){
                return sI;
               
            }
            
        }
        return null;
    }
    public void sortByPoint(){
        for(int i = 0; i < students.size()-1; i++){
            for ( int j = i+1; j < students.size(); j++){
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if(s1.getPoint()> s2.getPoint()){
                    students.set(i, s2);
                    students.set(j, s1);
                }
            }
        }
    }
    public void sortByAge(){
        for(int i = 0; i < students.size()-1; i++){
            for ( int j = i+1; j < students.size(); j++){
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if ( s1.getAge() > s2.getAge()){
                    //doi cho
                    students.set(i, s2);
                    students.set(j, s1);
                }
            }
        }
    }

    public void sortByName(){
        for(int i = 0; i < students.size()-1; i++){
            for ( int j = i+1; j < students.size(); j++){
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if ( s1.getName().compareTo(s2.getName()) > 0){
                    //doi cho
                    students.set(i, s2);
                    students.set(j, s1);
                }
            }
        }
    }
    public void sortByNameAndAge(){
                for(int i = 0; i < students.size()-1; i++){
            for ( int j = i+1; j < students.size(); j++){
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if ( s1.getName().compareTo(s2.getName()) > 0||
                s1.getName().compareTo(s2.getName()) == 0 &&
                s1.getAge()>s2.getAge())
                {
                    students.set(i, s2);
                    students.set(j, s1);
                }
            }
        }
    }
    public void sortByCompare(){
        Comparator<Student> cp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int co = o1.getName().compareTo(o2.getName());
                if(co>0 ){
                    return 1;   
                    
                }
                if(co<0){
                    return -1;
                }
                
                if(o1.getAge()>o2.getAge()){
                        return 1;
                    }
                if(o1.getAge()<o2.getAge()){
                    return -1;
                }
                return 0;
            }
        };
    }
    public void sortquick(){
        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        };
        students.sort(c);
        //cach 2
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int co = o1.getName().compareTo(o2.getName());
//                if(co>0 ){
//                    return 1;   
//                    
//                }
//                if(co<0){
//                    return -1;
//                }
//                
//                if(o1.getAge()>o2.getAge()){
//                        return 1;
//                    }
//                if(o1.getAge()<o2.getAge()){
//                    return -1;
//                }
//                return 0;
//            }
//           
//        }
    }
}
