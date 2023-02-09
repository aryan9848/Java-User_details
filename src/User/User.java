package User;

public class User {
    private String username;
    private int user_id;
    public User(int u_id,String u_name ){
        this.username=u_name;
        this.user_id=u_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", username=" + username +
                '}';
    }
}
