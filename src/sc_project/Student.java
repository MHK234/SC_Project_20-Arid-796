package sc_project;
class Student extends person{
    private int Cls,no_of_course;
    private static int total_students=0;
    private String feedback;
    private String result;
    void view_lecture(){
        System.out.println("View lecture");
    }
    void view_tasks(){
        System.out.println("View task");
    }
    void submit_quiz(){
        System.out.println("Submit Quiz");
    }
    void view_result(){
        System.out.println("View Result");
    }
    void view_schecule(){
        System.out.println("View Schedule");
    }
    void ask_question(){
        System.out.println("Ask Question");
    }
    void report_feedback(){
        System.out.println("Report Feedback");
    }
    int gettotal_students(){
        return this.getTotal_students();
    }
    void add_student(){
       this.total_students++;
    }
    void remove_student(){
       this.total_students--;
    }

    /**
     * @return the Class
     */
    public int getCls() {
        return this.Cls;
    }

    /**
     * @param Class the Class to set
     */
    public void setCls(int Cls) {
        this.Cls = Cls;
    }

    /**
     * @return the no_of_course
     */
    public int getNo_of_course() {
        return no_of_course;
    }

    /**
     * @param no_of_course the no_of_course to set
     */
    public void setNo_of_course(int no_of_course) {
        this.no_of_course = no_of_course;
    }

    /**
     * @return the total_students
     */
    public static int getTotal_students() {
        return total_students;
    }

    /**
     * @param aTotal_students the total_students to set
     */
    public static void setTotal_students(int aTotal_students) {
        total_students = aTotal_students;
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

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
}