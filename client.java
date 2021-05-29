import java.util.*;
/**
 * 07.08 challenge program cliet.java
 * challenge all arraylist skills
 * 3/12/2021
 * Ryan Wagner
 * PMR
 * Everything went really well. I tried to find a faster way to imediatley assign 
 * values to an arraylist but this worked. 
 * PMR
 * In the future, keep code clean and keep working with arraylists
 */
public class client
{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Integer> student0quiz = new ArrayList<Integer>();
        student0quiz.add(90);
        student0quiz.add(90);
        student0quiz.add(90);
        student0quiz.add(90);
        student0quiz.add(90);
        ArrayList<Integer> student1quiz = new ArrayList<Integer>();
        student1quiz.add(75);
        student1quiz.add(75);
        student1quiz.add(75);
        student1quiz.add(75);
        student1quiz.add(75);
        ArrayList<Integer> student2quiz = new ArrayList<Integer>();
        student2quiz.add(59);
        student2quiz.add(59);
        student2quiz.add(59);
        student2quiz.add(59);
        student2quiz.add(59);
        student2quiz.add(59);
        ArrayList<Integer> student3quiz = new ArrayList<Integer>();
        student3quiz.add(99);
        student3quiz.add(99);
        student3quiz.add(99);
        student3quiz.add(99);
        student3quiz.add(99);
        ArrayList<Integer> student4quiz = new ArrayList<Integer>();
        student4quiz.add(83);
        student4quiz.add(83);
        student4quiz.add(83);
        student4quiz.add(83);
        student4quiz.add(83);
        students.add(new Student("Alex", student0quiz));
        students.add(new Student("Bill", student1quiz));
        students.add(new Student("Evan", student2quiz));
        students.add(new Student("Greg", student3quiz));
        students.add(new Student("Ryan", student4quiz));
        
        System.out.println("Starting Gradebook:\n");
        printGrades(students);
        //ChangeName
        //changeName(students, "Greg", "John");
        
        //changeGrade
        //changeGrade(students, "Ryan", 5, 88);
        
        /*Change Student
        ArrayList<Integer> newScores = new ArrayList<Integer>();
        newScores.add(100);
        newScores.add(100);
        newScores.add(100);
        newScores.add(100);
        newScores.add(100);
        changeStudent(students, "Evan", "Carl", newScores);*/
        
        //Add Student. Same Grades as Ryan
        //addStudent(students, "Bill", "Andy", student4quiz);
        
        //Delete Student
        //deleteStudent(students, "Evan");
    }
    
    public static void printGrades(ArrayList<Student> students){
        System.out.printf("%12s %7s %7s %7s %7s %7s \n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-----------------------------------------------------");
        for(Student s: students){
            if(s == null){
            }
            else{
                System.out.println(s);
            }
        }
    }
    
    public static void changeName(ArrayList<Student> students, String oldName, String newName){
        int index = 0;
        for(int i = 0; i < students.size() - 1; i++){
            if(students.get(i).getName().equals(oldName)){
                index = i;
            }
        }
        students.get(index).setName(newName);
        System.out.println("\nChange " + oldName + " to " + newName + ": \n");
        printGrades(students);
    }
    
    /**
     * Enter quiz number 1 - 5
     */
    public static void changeGrade(ArrayList<Student> students, String student, int quizNumber, Integer newScore){
        int quiz = quizNumber - 1, index = 0;
        for(int i = 0; i < students.size() - 1; i++){
            if(students.get(i).getName().equals(student)){
                index = i;
            }
        }
        students.get(index).setQuizValue(quiz, newScore);
        System.out.println("\nChange " + student + "'s quiz " + quizNumber + " score to " + newScore + ": \n");
        printGrades(students);
    }
    
    public static void changeStudent(ArrayList<Student> students, String oldName, String newName, ArrayList<Integer> scores){
        int index = 0;
        for(int i = 0; i < students.size() - 1; i++){
            if(students.get(i).getName().equals(oldName)){
                index = i;
            }
        }
        students.set(index, new Student(newName, scores));
        System.out.println("\nChange " + oldName + " to " + newName + ": \n");
        printGrades(students);
    }
    
    public static void addStudent(ArrayList<Student> students, String nameToFind, String newName, ArrayList<Integer> scores){
        int index = 0;
        for(int i = 0; i < students.size() - 1; i++){
            if(students.get(i).getName().equals(nameToFind)){
                index = i;
            }
        }
        students.add(index, new Student(newName, scores));
        System.out.println("\nAdd " + newName + " before " + nameToFind + ": \n");
        printGrades(students);
    }
    
    public static void deleteStudent(ArrayList<Student> students, String nameToFind){
        int index = 0;
        for(int i = 0; i < students.size() - 1; i++){
            if(students.get(i).getName().equals(nameToFind)){
                index = i;
            }
        }
        for(int i = index; i < students.size()-1; i++){
            students.set(i, students.get(i+1));
        }
        students.set(students.size()-1, null);
        System.out.println("\nDelete " + nameToFind + ": \n");
        printGrades(students);
    }
}
