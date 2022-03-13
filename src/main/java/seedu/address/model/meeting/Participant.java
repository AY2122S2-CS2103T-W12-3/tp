package seedu.address.model.meeting;

import static java.util.Objects.requireNonNull;

import seedu.address.model.contact.Contact;

/**
 * Represents the Meeting participants in the address book.
 */
public class Participant {

    public final Contact contact;

    /**
     * Constructs an {@code ParticipantsList}.
     *
     * @param contact A valid contact.
     */
    public Participant(Contact contact) {
        requireNonNull(contact);
        this.contact = contact;
    }

    @Override
    public String toString() {
        return contact.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Participant // instanceof handles nulls
                && contact.equals(((Participant) other).contact)); // state check
    }

    @Override
    public int hashCode() {
        return contact.hashCode();
    }
}