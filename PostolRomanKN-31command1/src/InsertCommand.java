class InsertCommand extends AbstractCommand {
    private String text;
    public InsertCommand(String text) {
        this.text = text;
    }
    public void execute() {
        System.out.println("Inserted: " + text);
    }
    public void undo() {
        System.out.println("Undo Insert: " + text);
    }
}