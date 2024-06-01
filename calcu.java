import java.util.Scanner;
import java.lang.Math;
public class calcu 
{
        public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
                int n,i,maxmarks;
                double totmarks=0;
                double percentage=0;
                String grade="";
                System.out.print("Enter number of subject : ");
                n=sc.nextInt();
                for(i=0;i<n;i++)
                {
                        int marks=0;
                        System.out.print("\nEnter marks in subject-"+(i+1)+" : ");
                        marks=sc.nextInt();
                        totmarks=totmarks+marks;
                }
                maxmarks=n*100;
                percentage=Math.round((totmarks/maxmarks)*100);
                if(percentage>=90){
                        grade="A+";
                }
                else if(percentage>=80 && percentage<90){
                        grade="A";
                }
                else if(percentage>=70 && percentage<80){
                        grade="B";
                }
                else if(percentage>=60 && percentage<70){
                        grade="C";
                }
                else if(percentage>=50 && percentage<60){
                        grade="D";
                }
                else if(percentage>=40 && percentage<50){
                        grade="E";
                }
                else{
                        grade="F";
                }
                if(grade.equals("F")){
                        System.out.println("You failed in exams");
                }
                else{
                        System.out.println("Total marks obtainted = "+totmarks);
                        System.out.println("Average Percentage obtained = "+percentage);
                        System.out.println("Average Grade obtained = "+grade);       
                }
        }
}