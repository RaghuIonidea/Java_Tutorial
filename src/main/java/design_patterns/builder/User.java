package design_patterns.builder;

public class User {
    private String firstName;
    private String lastName;
    private String age;
    private String location;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.location = builder.location;
        this.phone = builder.phone;
    }
    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private String age;
        private String location;
        private String phone;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(String age) {
            this.age=age;
            return this;
        }

        public UserBuilder location(String location) {
            this.location=location;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
