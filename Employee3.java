public class Employee3{
    // Static variables
    private static int eid;
    private static String ename;
    private static String companyName;

    // Static method to set employee details
    public static void setEmployeeDetails(int id, String name, String company) {
        eid = id;
        ename = name;
        companyName = company;
    }

    // Static method to get employee details
    public static void getEmployeeDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        // Set employee details
        Employee3.setEmployeeDetails(1, "suryasindhu", "dell");
        
        // Get and display employee details
        Employee3.getEmployeeDetails();
    }
}
