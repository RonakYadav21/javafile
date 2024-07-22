class student{
        String name;
       static int rollno;
    
}
public class child{
    public static void main(String[] args) {
        student s1=new student();
        s1.name="ronak";
        student.rollno=1;
        
        student s2=new student();
        s2.name="prince";
        student.rollno=2;

        student s3=new student();
        s3.name="kanish";
        student.rollno=3;

        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+": "+ student.rollno);
        }
    for(student n:students){
        System.out.print(n.name+": "+student.rollno);

    }
    }
}

