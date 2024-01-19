package pl.majczyna.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
