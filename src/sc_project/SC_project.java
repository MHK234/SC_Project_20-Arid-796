package sc_project;
import java.util.Scanner;
public class SC_project {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        Teacher t=new Teacher();
        Admin a=new Admin();
       do{
        System.out.println("\t\tWELCOME TO ACADEMY MANAGEMENT SYSTEM");
        System.out.println("press 1 for Student Account");
        System.out.println("press 2 for Teacher Account");
        System.out.println("press 3 for Admin Account");
        System.out.print("\nEnter Choice:");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("\n\npress 1 for View Lectures");
                System.out.println("press 2 for View Tasks");
                System.out.println("press 3 for Submit Quiz");
                System.out.println("press 4 for View Result");
                System.out.println("press 5 for View Schedule");
                System.out.println("press 6 for Ask Question");
                System.out.println("press 7 for Report Feedback");
                System.out.print("\nEnter choice: ");
                choice=sc.nextInt();
                if(choice==1)
                    s.view_lecture();
                else if (choice==2)
                    s.view_tasks();
                else if (choice==3)
                    s.submit_quiz();
                else if (choice==4)
                    s.view_result();
                else if (choice==5)
                    s.view_schecule();
                else if (choice==6)
                    s.ask_question();
                else if (choice==7)
                    s.report_feedback();
                else
                    System.out.println("Invalid Choice");
                    
            break;
            case 2:
                System.out.println("\n\npress 1 for Upload Lectures");
                System.out.println("press 2 for Upload Tasks");
                System.out.println("press 3 for View Schedule");
                System.out.println("press 4 for Create Quiz");
                System.out.println("press 5 for Report Student");
                System.out.println("press 6 for Generate Report");
                System.out.println("press 7 for Report Feedback");
                System.out.print("\nEnter choice: ");
                choice=sc.nextInt();
                if(choice==1)
                    t.upload_lecture();
                else if(choice==2)
                    t.upload_tasks();
                else if(choice==3)
                    t.view_schedule();
                else if(choice==4)
                    t.create_quiz();
                else if(choice==5)
                    t.report_students();
                else if(choice==6)
                    t.generate_report();
                else if(choice==7)
                    t.report_feedback();
                else
                    System.out.println("Invalid Option");
                
            break;
            case 3:
                System.out.println("\n\npress 1 for Add student");
                System.out.println("press 2 for Remove Student");
                System.out.println("press 3 for Add Teacher");
                System.out.println("press 4 for Remove Teacher");
                System.out.println("press 5 for Generate Income");
                System.out.println("press 6 for Pay Salary");
                System.out.println("press 7 for check_feedback");
                System.out.println("press 8 for Calculate Total Students");
                System.out.println("press 9 for Calculate Total Teacher");
                System.out.println("press 10 for Check Student Progress");
                System.out.print("\nEnter choice: ");
                choice=sc.nextInt();
                if(choice==1)
                    a.addstudent();
                else if(choice==2)
                    a.removeStudent();
                else if(choice==3)
                    a.addteacher();
                else if(choice==4)
                    a.removeStudent();
                else if(choice==5)
                    a.generateincome();
                else if(choice==6)
                    a.paysalary();
                else if(choice==7)
                    a.check_feedback();
                else if(choice==8)
                    a.calculate_total_students();
                else if(choice==9)
                    a.calculate_total_teachers();
                else if(choice==10)
                    a.check_student_progress();
                else 
                    System.out.println("Invalid Option");
            break;
            default:
                System.out.println("Invalid choice");
        }//end of switch
        System.out.println("\n\nPress 1 to continue");
        System.out.print("Enter Choice:");
        choice=sc.nextInt();
       }while(choice==1);
       System.out.println("\n\nThanks For Visiting");
    }
    
}
