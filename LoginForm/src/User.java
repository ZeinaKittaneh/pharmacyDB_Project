/**
 * This class is used to create user objects to set and get positions of employees
 * @author KNT
 */
public class User {
    private int positionID;
    
    public int getPosition(){
        return positionID;
    }
    
    public void setPosition(int position){
        this.positionID = position;
    }
}
