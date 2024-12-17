import java.io.*;
 class employee{
 public String name;
 public String address;
 public String ssn;
 public String nums;
 public void setname(final String name)
 {
  this.name=name;
 }
 public String getname()
 {
  return name;
 }
  public void setaddress(final String address)
 {
  this.address=address;
 }
 public String getaddress()
 {
  return address;
 }
  public void setssn(final String ssn)
 {
  this.ssn=ssn;
 }
 public String getssn()
 {
  return ssn;
 }
  public void setnums(final String nums)
 {
  this.nums=nums;
 }
 public String getnums()
 {
  return nums;
 }
}
public class SerializeDemo {
    public static void main(String[] args) {
        employee e = new employee();
        e.name = "Barry Allen";
        e.address = "Central City";
        e.ssn = "1122334455";
        e.nums = "101";
        try {
            FileOutputStream fo = new FileOutputStream("/temp/Employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(e);
            out.close();
            fo.close();
            System.out.println("Serialized Data is saved in /temp/Employee.ser");
        } catch (Exception i)
         {
            i.printStackTrace();
         }

    }
}
