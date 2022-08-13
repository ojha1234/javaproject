/*Create a class named 'Shape' with a method to print "This is This is shape".
 Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print
 "This is rectangular shape" and "This is circular shape" respectively.
 Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
 Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class. */
public class shape{
    public void print_shape(){
        System.out.println("This is a shape!");
    }
}
    class rectangle extends shape{
        public void print_rect(){
            System.out.println("This is rectangle! ");
        }
    }
    class circle extends shape{
        public void print_circle(){
            
        }
    }
    class square extends rectangle{
        public  void print_square(){
            System.out.println("Square is a rectangle");
        }
    }
    
   public class test{
        public static void main(String[] args){
            square sq = new square();
            sq.print_shape();
            sq.print_rect();
        }
