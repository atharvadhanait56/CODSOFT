import java.util.Scanner;
public class Student 
{
    int Subjects; //Stores the Number of Subject
    float marks[]; //Stores the marks of all subjects
    float total=0;
    float percentage;
    Student(int n)
    {
        Subjects=n;
       marks=new float[n]; //Size of array is define by user
    }
    void accept()
    {
        Scanner S=new Scanner(System.in);
        for(int i=0;i<Subjects;i++)
        {
            System.out.print("Enter the Marks of "+(i+1)+" Subject(Out of 100):");
            marks[i]=S.nextFloat(); //Reads the Float values and stores in Marks array
            total=total+marks[i];
        }
        S.close();
    }
    void cal_percentage()
    {
        percentage=(total/(Subjects*100.00f))*100;
    }
    void display()
    {
        cal_percentage(); //cal_percentage() method is called inside display method
        System.out.println("Total Marks are "+total);
        System.out.println("Average Percentage are "+percentage);
        if(percentage>=90)
        {
            System.out.println("Grade:A+");
        }
        else if(percentage>=80 && percentage<90)
        {
            System.out.println("Grade:A");
        }
        else if(percentage>=65 && percentage<80)
        {
            System.out.println("Grade:B");
        }
        else if(percentage>=45 && percentage<65)
        {
            System.out.println("Grade:C");
        }
        else if(percentage>=35 && percentage<45)
        {
             System.out.println("Grade:D");
        }
        else
        {
            System.out.println("Grade:Fail");
        }
    }

     public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the Number of Subject:");
        int n=Sc.nextInt();
        Student S=new Student(n); //instance of Student class
        S.accept();
        S.display();
        Sc.close();
    }
}
