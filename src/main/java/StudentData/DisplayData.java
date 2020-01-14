import java.util.Scanner;

public class DisplayData extends Student {
    
    public static void main(String[] args)
    {
        
        Student s[] = new Student[5];
        Scanner scan = new Scanner(System.in);
       
        for (int x=0; x < s.length; x++){ 
            
            s[x] = new Student();
            System.out.println("Enter id: ");
            s[x].setID(scan.nextInt());
            System.out.println("Enter name: ");
            s[x].setName(scan.next());
        }
    
    for (Student item : s){
        System.out.println("id: " + item.getID() + "name: " + item.getName());
    }

    }
}