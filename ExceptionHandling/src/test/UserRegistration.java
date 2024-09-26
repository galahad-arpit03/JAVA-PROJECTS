package test;

public class UserRegistration {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        String username = args.length > 0 ? args[0] : "DefaultUser";
        String userCountry = args.length > 1 ? args[1] : "India";

        try {
            registration.registerUser(username, userCountry);
        } catch (InvalidCountryException e) {
            System.out.println("InvalidCountryException: " + e.getMessage());
        }
    }
}
