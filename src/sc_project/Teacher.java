package sc_project;
public class Teacher extends person{
    private int No_of_classes,no_of_courses;
    private static int total_teacher=0;
    private String feedback;
    private String[] coursename=new String[no_of_courses]; 
    void add_teacher(){
        this.total_teacher++;
    }
    void remove_teacher(){
        this.total_teacher--;
    }
    void upload_lecture(){
        System.out.println("Upload Lecture");
    }
    void upload_tasks(){
        System.out.println("Upload Tasks");
    }
    void view_schedule(){
        System.out.println("View Schedule");
    }
    void create_quiz(){
        System.out.println("Create Quiz");
    }
    void report_students(){
        System.out.println("Report Students");
    }
    void generate_report(){
        System.out.println("Genarate Report");
    }
    void report_feedback(){
        System.out.println("report Feedback");
    }
    int gettotal_teacher(){
        return this.getTotal_teacher();
    }

    /**
     * @return the No_of_classes
     */
    public int getNo_of_classes() {
        return No_of_classes;
    }

    /**
     * @param No_of_classes the No_of_classes to set
     */
    public void setNo_of_classes(int No_of_classes) {
        this.No_of_classes = No_of_classes;
    }

    /**
     * @return the no_of_courses
     */
    public int getNo_of_courses() {
        return no_of_courses;
    }

    /**
     * @param no_of_courses the no_of_courses to set
     */
    public void setNo_of_courses(int no_of_courses) {
        this.no_of_courses = no_of_courses;
    }

    /**
     * @return the total_teacher
     */
    public static int getTotal_teacher() {
        return total_teacher;
    }

    /**
     * @param aTotal_teacher the total_teacher to set
     */
    public static void setTotal_teacher(int aTotal_teacher) {
        total_teacher = aTotal_teacher;
    }

    /**
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String[] getCoursename() {
        return coursename;
    }
    public void setCoursename(String[] coursename) {
        this.coursename = coursename;
    }
}
