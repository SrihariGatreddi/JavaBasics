
import java.util.*;

class MyJournal{
    public String authorName;
     static String title;
    Date submission;
    public MyJournal(String authorName,String title,Date Submission){
        this.authorName=authorName;
        this.title=title;
        this.submission=Submission;
    }
    public void displayDetails(){
        System.out.println("Title of the book:"+getSubmissionDetails());
        System.out.println("Authors name is :"+authorName);
        System.out.println("Paper published on:"+submission.getDate()+"-"+submission.getMonth()+"-"+submission.getYear());
    }
    public String getSubmissionDetails(){
        if(title!=null||title.isEmpty()){
            return title;
        }
        StringBuilder Converted =new StringBuilder();
        boolean ConvertNext=true;
        for(char ch:title.toCharArray()){
            if(Character.isSpaceChar(ch))
                ConvertNext=true;
            else if (ConvertNext) {
                ch=Character.toTitleCase((ch));
                ConvertNext=false;
            }
            else{
                ch=Character.toLowerCase(ch);
            }
            Converted.append(ch);
        }
        return Converted.toString();
    }
}

public class Journal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Author name :");
        String authorName=sc.nextLine();
        System.out.println("Enter the title of the book ");
        String title=sc.nextLine();
        System.out.println("Enter the date of submission(DD-MM-YY)");
        String dos=sc.nextLine();
        String[] parts=dos.split("-");
        int year =Integer.parseInt(parts[2]);
        int month=Integer.parseInt(parts[1]);
        int date=Integer.parseInt(parts[0]);
        Date Submission=new Date(year,month,date);
        MyJournal myJournal=new MyJournal(authorName,title,Submission);
        System.out.println(MyJournal.title);
        myJournal.displayDetails();
    }
}
