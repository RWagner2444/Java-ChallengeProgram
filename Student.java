import java.util.*;
/**
 * 3/12/2021
 * Ryan Wagner
 * Object Class
 */
public class Student
{
    private String name;
    private ArrayList<Integer> testScores = new ArrayList<Integer>();
    
    public Student(String name, ArrayList<Integer> testScores)
    {
        this.name = name;
        this.testScores = testScores;
    }
    
    public Integer quizValue(int quizNumber){
        return testScores.get(quizNumber);
    }
    
    public void setQuizValue(int quizNumber, Integer quizValue){
        testScores.set(quizNumber, quizValue);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
        
    public String toString(){
        return String.format("%s %15s %7s %7s %7s %7s", getName(), testScores.get(0), testScores.get(1), testScores.get(2), testScores.get(3), testScores.get(4));
    }
}
