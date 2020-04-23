package pl.sda.model;

public class Discussion {
    private String login;
    private String title;
    private String text;

    public Discussion(String login, String title, String twitt) {
        this.login=login;
        this.title = title;
        this.text = twitt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
