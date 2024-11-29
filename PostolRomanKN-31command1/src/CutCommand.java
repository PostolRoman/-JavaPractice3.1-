class CutCommand extends AbstractCommand {
    public void execute() {
        System.out.println("Cut executed");
    }
    public void undo() {
        System.out.println("Cut undone");
    }
}
