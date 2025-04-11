package encapsulation.library;

interface Reservable {
    void reserveItem(String borrower);

    boolean checkAvailability();
}
