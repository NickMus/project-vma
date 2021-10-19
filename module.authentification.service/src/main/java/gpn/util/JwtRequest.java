package gpn.util;
import java.io.Serializable;

public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String username;
    private String userphone;

    public String getUserphone() {
        return this.userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    //need default constructor for JSON Parsing
    public JwtRequest() {
    }

    public JwtRequest(String username) {
        this.setUsername(username);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}