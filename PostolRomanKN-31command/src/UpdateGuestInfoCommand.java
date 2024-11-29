class UpdateGuestInfoCommand extends HotelCommand {
    private String customerName;
    private String newInfo;

    public UpdateGuestInfoCommand(String customerName, String newInfo) {
        this.customerName = customerName;
        this.newInfo = newInfo;
    }

    public void execute() {
        System.out.println("Guest info updated: " + customerName + " -> " + newInfo);
    }

    public void undo() {
        System.out.println("Guest info update reverted for: " + customerName);
    }
}