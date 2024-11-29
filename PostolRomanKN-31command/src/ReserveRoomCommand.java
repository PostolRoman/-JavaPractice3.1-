class ReserveRoomCommand extends HotelCommand {
    private String customerName;

    public ReserveRoomCommand(String customerName) {
        this.customerName = customerName;
    }

    public void execute() {
        System.out.println("Room reserved for: " + customerName);
    }

    public void undo() {
        System.out.println("Reservation cancelled for: " + customerName);
    }
}