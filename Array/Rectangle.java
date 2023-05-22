package Array;

public class Rectangle {
    int length;
    int width;
    Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    
    public String toString()
    {
            return "length"+length+"width"+width;
    }
    public boolean equals(Object obj)
    {
        Rectangle r= (Rectangle) obj;
        if(this.length==r.length && this.width==r.width)
            return true;
        return false;
    }
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println(r1==r2);
        //Rectangle r3=r1;
        if(r1==r2)
        {
            System.out.println("both rectange are equals");
        }
        else
        {
            System.out.println("both are not equals");
        }
        if(r1.equals(r2))
        {
            System.out.println("both rectange are equals");
        }
        else
        {
            System.out.println("both are not equals");
        }
        String s1= "hello";
        String s2= new String("hello");
        if(s1==s2)
        {
            System.out.println("both rectange are equals");
        }
        else
        {
            System.out.println("both are not equals");
        }

    }
}
