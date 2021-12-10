package EmpWage;

public class UC4 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int Emp_Rate_Per_Hr = 20;
    public static  int empHrs = 0;
    public static  int empWage = 0;


    public static void main(String[] args) {
        double empCheck = (Math.floor(Math.random()*10)%3);
        UC4 attendance = new UC4();
        int wage = attendance.isFullTime((int) empCheck);
    }
    public int isFullTime(int empCheck){
        switch(empCheck){
            case IS_FULL_TIME:
                System.out.println("Employee is present Full_Time");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present Part_Time");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }
        empWage = empHrs * Emp_Rate_Per_Hr;
        System.out.println("Employee Daily Wage is " +empWage);
        return empWage;
    }
}
