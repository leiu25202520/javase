package oob.oob0818;

public class User {

    private String userId;
    private String email;
    private String password;

    public User(String userId, String password, String email) {
        if(userId == "" || password == ""){
            System.out.println("用户名或者密码不能为空");
            return;
        }
        this.userId = userId;
        this.password = password;
        if(email != ""){

            this.email = email;
        }else {
            this.email = userId + "@163.com";
        }
    }

    public User(String userId, String password) {
        if(userId == "" || password == ""){
            System.out.println("用户名或者密码不能为空");
            return;
        }
        this.userId = userId;
        this.password = password;

        this.email = userId + "@163.com";
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User u = new User("89","123");
        System.out.println(u.toString());
    }
}
