import java.util.ArrayList;
import java.util.Scanner;

public class question_1{
    public static void main(String[] args){

//create an arraylist 
ArrayList <String> dian = new ArrayList<>();
Scanner n = new Scanner(System.in);

//Add Elements
dian.add("Shoes");
dian.add("clothes");
dian.add("Belts");
dian.add("Ties");
dian.add("Wallets");

//display lists

int m;

for (m = 0; m < 5; m++) {
    System.out.println("Element " + m +" : "+dian.get(m));
}
//removing the element
int d;
System.out.println("Enter element to remove: ");
d = n.nextInt();

dian.remove(d);

//list after removing

for (m = 0; m < 4 ; m++) {
    System.out.println( dian.get(m));
    
}
    }
}