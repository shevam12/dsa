package Array;
class Students
{
    int roll_no;
    String name;
    Students(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name=name;
    }
    public String toString()
    {
        return "roll Number: " + roll_no + " name : "+ name;
    }
    public int hashCode()
    {
        return roll_no;
    }
}

public class hashcodedemo 
{
    public static void main(String[] args) {
        
        Students s1=new Students(101, "AAS");
        System.out.println(s1);

        System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(s1.hashCode());
    }

}
