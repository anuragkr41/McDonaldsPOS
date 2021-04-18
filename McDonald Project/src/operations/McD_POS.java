package operations;
import java.util.*;

class itemFromManager
{
	
}
class counterPOS
{
	void additem()
	 {
		 
	 }
	void removeItem()
	{
		
	}
	void  showTotal()
	{
		
	}
}
class Items
{
String	itemname;
int itemprice;
enum Size{ Big,Medium,Small }
   Size s;		

}
class Burger extends Items
{
	itemname="MaharajaBurger";
	itemprice = 320;
}
class Drinks extends Items
{
	
}
class wrap extends Items
{
	
}
class Meals extends Items
{
	
}
class iceCream extends Items
{
	
}
public class McD_POS {

	public static void main(String[] args) {
           System.out.println("Project initiated");
           System.out.println("Enter the choice");
           System.out.println("1. Manager");
           System.out.println("2. Counter Attendant");
           System.out.println("3. Exit Application");
           Scanner s=new Scanner(System.in);
           int choice=s.nextInt();s.close();
           
           if(choice==1)
           {
        	   
           }
           else if(choice==2)
           {
        	   
           }
           else if(choice==3)
           {
        	   
           }
           else
           {
           System.out.println("Invalid Choice");
           }

	}

}
