public class HotelSystem {
    public static void main(String[] args) {
        HotelManager manager = new HotelManager();
        manager.addCommand(new ReserveRoomCommand("Alice"));
        manager.addCommand(new UpdateGuestInfoCommand("Alice", "VIP Guest"));
        manager.addCommand(new CancelReservationCommand("Alice"));

        manager.executeAllCommands(); // Execute all commands
        manager.undoLastCommands(2); // Undo last two commands
    }
}