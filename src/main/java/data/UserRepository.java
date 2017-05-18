package data;

/**
 * Created by Andriy on 4/6/2017.
 */

//List of users, sub users for all environments and sites
public class UserRepository {

    //Supervisor
    public static User getIxlooSupervisor() {
        return new User("andriykozak", "andriykozak123");
    }
}
