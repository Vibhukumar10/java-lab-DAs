public class Example
{
    class Rectangle
    {
        private int length;
        protected int width;
        int l;
        Rectangle(int x,int y)
        {
            length=x;
            width=y;
        }
        void getlength()
        {
            l=length;
        }
        void area()
        {
            System.out.println("The area is: "+length*width);
        }
        void perimeter()
        {
            System.out.println("The perimeter is "+2*(length+width));
        }
    }
    // class ThreeDRectangle extends Rectangle
    // {
    //     protected int height;
    //     void area()
    //     {
    //         System.out.println("The area is (overridden): "+l*width);
    //     }
    // }
    
    public static void main(String args[])
    {
        Rectangle R=new Rectangle(4,3);
        R.area();
        R.perimeter();
    }
}
