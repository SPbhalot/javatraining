package Basic;

interface StudentManagement{
    String GetName();
    String  GetBatch();
    int GetMark();
    int GetStudentParcentage();
    
}



public class student implements StudentManagement  {
    private  static String StudentName;
    private static String StudentBatch;
    private static int StudentMark;
    private static int MaxMark;

    public student(String name, String batch,int mark,int max){
        StudentName=name;
        StudentBatch=batch;
        StudentMark=mark;
        MaxMark=max;
    }

    public int GetMark(){
        return StudentMark;
    }
    public  String GetName(){
        return StudentName;
    }
    public String GetBatch(){
        return StudentBatch;
    }
    public int GetStudentParcentage(){
       return  (StudentMark*100)/MaxMark;
    }
   
    


    public static void main(String[] args) {
        student s1=new student("sandeep","Exp",250,500);
        System.out.println(s1.GetStudentParcentage());
    }
}