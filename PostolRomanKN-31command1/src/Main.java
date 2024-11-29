public class Main {
    public static void main(String[] args) {
        WindowController controller = new WindowController();
        controller.addCommand(new CopyCommand());
        controller.addCommand(new CutCommand());
        controller.addCommand(new InsertCommand("Hello"));

        controller.executeAllPendingCommands();
        controller.undoChanges(2);
    }
}