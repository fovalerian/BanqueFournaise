package gestion;

import entity.User;
import java.util.Map;

public class UserGestion {
    
    public Map addUser(Map users, User user) {
        users.put(user.getId(), user);
        return users;
    }
    
    public Map deleteUser(Map users, User user){
        if (users.containsKey(user.getId())){
            users.remove(user.getId());
            System.out.println("User "+user.getFirstName()+" "+user.getFirstName()+" is delete");
        } else {
            System.out.println("This user dosn't exist");
        }
        return users;
    }
    
    public Map updateUser(Map users, User user){
        if(users.containsKey(user.getId())){
            users.remove(user.getId());
            users.put(user.getId(), user);
        } else {
            System.out.println("This user dosn't exist");
        }
        return users;
    }
    
    public void readUser(Map users,User user) {
        if(users.containsKey(user.getId())) {
            System.out.println(users.get(user.getId()).toString());
        } else {
            System.out.println("This user dosn't exist");
        }
    }
}
