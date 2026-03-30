public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullCustomerData() {
        return firstName + " " + lastName + " (" + email + ")";
    }

    @Override
    public String toString() {
        return "CafeCustomer{" +
                "customerId=" + customerId +
                ", name='" + firstName + " " + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CafeCustomer customer = (CafeCustomer) obj;
        return this.customerId == customer.customerId; 
    }
}
