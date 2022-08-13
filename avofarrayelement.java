//write a java program to calculate the average value of array elements.
public class avofarrayelement 
{
    public static void main(String[] args) {
        double[] numArray = {45,70,20.3,50,30,80,90.5};
        double sum = 0.0;
        for (double num: numArray)
        {
            sum += num;
        }
        
        double average = sum/numArray.length;
        System.out.format("the average is %.2f", average);
    }
    
}
