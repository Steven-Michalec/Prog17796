/**
 *
 * @author Steven Michalec
 */

public class Student {
   
    private String name = (""); //Created a variable to hold names
    private int id;
    private String address;
    String programName;
    
    
    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int newID){
        this.id = newID;
    }
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String newProgramName){
        this.programName = newProgramName;
    }

}