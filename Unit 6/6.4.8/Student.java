public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;

    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor. 
     */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    
    public int getExamRange()
    {
    // your code goes here! 
        int L = Integer.MIN_VALUE;
        int S = Integer.MAX_VALUE;
        for(int i = 0; i < numExamsTaken; i++)
        {
            /*
            if(L > exams[i])
                L = exams[i];
            if(S < exams[i])
                S = exams[i];
                */
            L = max(L,exams[i]);
            S = min(S,exams[i]);
        }
        return (L-S);
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
