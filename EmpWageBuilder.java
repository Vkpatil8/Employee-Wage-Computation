public class EmpWageBuilder {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        EmpWageOfCompanies empWageBuilder = new EmpWageOfCompanies();
        empWageBuilder.computeWage();

    }
}
class EmpWageOfCompanies {
    //constant variables
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;



    void computeWage(){
        //variables
        int empHours;
        int totalWorkingDay = 0;
        int totalEmpHours = 0;

        while (totalEmpHours <= 100 && totalWorkingDay < 20){

            totalWorkingDay++;
            //Generate random value to check employee do work full time, part-time or absent
            int empcheck = (int)(Math.random()*10) % 3;

            //Condition statement switch case
            switch(empcheck){
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }

            //calculate hours
            totalEmpHours += empHours; // gradually adding hours of a day
            System.out.println("Working day : " + totalWorkingDay + " and Employee Hours : " + empHours);
        }
        int totalEmpWage = totalEmpHours * 20;

        System.out.println("Total Emp Wage for company  is " + totalEmpWage);
    }
}
