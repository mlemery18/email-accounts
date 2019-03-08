import components.map.Map;
import components.map.Map1L;

/**
 * Implementation of {@code EmailAccount}.
 *
 *
 */
public final class EmailAccount1 implements EmailAccount {

    /*
     * Private members --------------------------------------------------------
     */

    private String firstName;
    private String lastName;
    private static int dotNum;
    private Map<String, Integer> email = new Map1L<String, Integer>();

    /*
     * Constructor ------------------------------------------------------------
     */

    /**
     * Constructor.
     *
     * @param firstName
     *            the first name
     * @param lastName
     *            the last name
     */
    public EmailAccount1(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName.toLowerCase();
        this.dotNum = 1;
        if (this.email.hasKey(lastName)) {
            this.dotNum = this.email.value(lastName) + 1;
            this.email.replaceValue(lastName, this.dotNum);
        } else {
            this.email.add(lastName, this.dotNum);
        }

    }

    /*
     * Methods ----------------------------------------------------------------
     */

    @Override
    public String name() {

        return this.firstName + "" + this.lastName;

    }

    @Override
    public String emailAddress() {

        return this.lastName + "." + this.dotNum;
    }

    @Override
    public String toString() {

        return "Name: " + this.firstName + "" + this.lastName + " Email: "
                + this.lastName + "." + this.dotNum;

    }

}
