package design_patterns.builder;

public class BuilderPattren{
    public static void main(String[] args) {
        User user=new User.UserBuilder("Raghu","Ram")
                .location("Hyderabad")
                .age("30")
                .phone("9550080061")
                .build();
        System.out.println(user);

    }
}
