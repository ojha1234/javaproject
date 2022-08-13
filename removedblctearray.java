//.Write a program to remove duplicate elements in an array,
import java.util.*
public class removedblctearray
{
     public static void main(String[] args) 
     {
    List<String> cityList = new ArrayList<>();
    cityList.add("Delhi");
    cityList.add("Mumbai");
    cityList.add("Bangalore");
    cityList.add("Chennai");
    cityList.add("Kolkata");
    cityList.add("Mumbai");
    
    List<String> newList = new ArrayList<>();
    for(String name : cityList){
      if(!newList.contains(name)){
        newList.add(name);
      }
    }

    for(String name : newList){
      System.out.println("City Name - " + name);
    }
  }
    
}
