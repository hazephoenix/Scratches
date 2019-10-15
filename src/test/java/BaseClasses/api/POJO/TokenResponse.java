package BaseClasses.api.POJO;

import lombok.Data;

@Data
public class TokenResponse {

    private String token;

    public TokenResponse (){
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
