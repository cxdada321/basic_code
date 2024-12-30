package test.stuproject;

public class UserInfo {
    private String username;
    private String password;
    private String cetificationid;
    private String telnumber;


    public UserInfo() {
    }
    public UserInfo(String username, String password, String cetificationid, String telnumber) {
        this.username = username;
        this.password = password;
        this.cetificationid = cetificationid;
        this.telnumber = telnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCetificationid() {
        return cetificationid;
    }

    public void setCetificationid(String cetificationid) {
        this.cetificationid = cetificationid;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }
}
