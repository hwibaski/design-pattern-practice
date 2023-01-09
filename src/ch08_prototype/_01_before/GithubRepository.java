package ch08_prototype._01_before;

public class GithubRepository {

    private String user;

    private String name;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GithubRepository{" +
            "user='" + user + '\'' +
            ", name='" + name + '\'' +
            '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
