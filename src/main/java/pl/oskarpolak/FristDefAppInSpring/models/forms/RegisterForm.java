package pl.oskarpolak.FristDefAppInSpring.models.forms;

import lombok.Data;

@Data
public class RegisterForm {
    private String login;
    private String password;
    private String passwordRepeat;
    private String email;
}
