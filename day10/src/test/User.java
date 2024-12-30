package test;

public class User {
    private String userid;
    private String password;
    public User() {

    }

    public User(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    /**
     * 获取
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{userid = " + userid + ", password = " + password + "}";
    }
}
