class Employee {
    private int empid;
        public void setEmpid(int eid)  {
empid = eid; }
public int getEmpid(int empid) {
    return empid;
    }


class Company {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.setEmpid(191);
        System.out.println(e.getEmpid());
    }
}
}
