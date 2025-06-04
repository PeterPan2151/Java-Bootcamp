public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < this.contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    public Contact getContact(int index) {
        Contact copy = new Contact(this.contacts[index]);
        return copy;
    }

    public void setContact(Contact contact, int index) {
        Contact newContact = new Contact(contact);
        this.contacts[index] = newContact;
    }
}
