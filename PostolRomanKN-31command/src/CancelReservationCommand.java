class CancelReservationCommand extends HotelCommand {
    private String customerName;

    public CancelReservationCommand(String customerName) {
        this.customerName = customerName;
    }

    public void execute() {
        System.out.println("Reservation cancelled for: " + customerName);
    }

    public void undo() {
        System.out.println("Reservation reinstated for: " + customerName);
    }
}