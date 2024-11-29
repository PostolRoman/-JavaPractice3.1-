import  java.util.List;
import  java.util.ArrayList;

class HotelManager {
    private List<HotelCommand> commandsToExecute = new ArrayList<>();
    private List<HotelCommand> commandHistory = new ArrayList<>();

    public void addCommand(HotelCommand command) {
        commandsToExecute.add(command);
    }

    public void executeAllCommands() {
        for (HotelCommand command : commandsToExecute) {
            command.execute();
            commandHistory.add(command);
        }
        commandsToExecute.clear();
    }

    public void undoLastCommands(int changesToUndo) {
        for (int i = 0; i < changesToUndo && !commandHistory.isEmpty(); i++) {
            HotelCommand lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }
}