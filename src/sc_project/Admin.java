package sc_project;
class Admin extends person{
    private int total_classes;
    private String timing_schedule;
    private double total_income; 
    Student s =new Student();
    Teacher t=new Teacher();
    /**
     * @return the total_classes
     */
    public int getTotal_classes() {
        return total_classes;
    }

    /**
     * @param total_classes the total_classes to set
     */
    public void setTotal_classes(int total_classes) {
        this.total_classes = total_classes;
    }

    /**
     * @return the timing_schedule
     */
    public String getTiming_schedule() {
        return timing_schedule;
    }

    /**
     * @param timing_schedule the timing_schedule to set
     */
    public void setTiming_schedule(String timing_schedule) {
        this.timing_schedule = timing_schedule;
    }

    /**
     * @return the total_income
     */
    public double getTotal_income() {
        return total_income;
    }

    /**
     * @param total_income the total_income to set
     */
    public void setTotal_income(double total_income) {
        this.total_income = total_income;
    }
    void addstudent(){
        System.out.println("Student Added");
        s.add_student();
    }
    void removestudent(){
        System.out.println("Student Removed");
        s.remove_student();
    }
    void addteacher(){
        System.out.println("Teacher Added");
        t.add_teacher();
    }
    void removeStudent(){
        System.out.println("Teacher Removed");
        t.remove_teacher();
    }
    void generateincome(){
        System.out.println("Generate income");
    }
    void paysalary(){
        System.out.println("Pay Salary");
    }
    void check_feedback(){
        System.out.println("Check Feedback");
    }
    void reply_feedback(){
        System.out.println("Reply Feedback");
    }
    void check_student_progress(){
        System.out.println("Check Student Progress");
    }
    void calculate_total_students(){
        
        System.out.println("Total Students= "+s.gettotal_students());
    }
    void calculate_total_teachers(){
        
        System.out.println("Total Teachers= "+t.gettotal_teacher());
    }
}
