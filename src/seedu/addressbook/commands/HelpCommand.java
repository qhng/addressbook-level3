package seedu.addressbook.commands;


/**
 * Shows help instructions.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" +"Shows program usage instructions.\n\t"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_ALL_USAGES = AddCommand.MESSAGE_USAGE
            + "\n" + DeleteCommand.MESSAGE_USAGE
            + "\n" + ClearCommand.MESSAGE_USAGE
            + "\n" + FindCommand.MESSAGE_USAGE
            + "\n" + ListCommand.MESSAGE_USAGE
            + "\n" + ViewCommand.MESSAGE_USAGE
            + "\n" + ViewAllCommand.MESSAGE_USAGE
            + "\n" + HelpCommand.MESSAGE_USAGE
            + "\n" + ExitCommand.MESSAGE_USAGE;

    public HelpCommand() {}


    /**
     * Queries if this command makes any write changes to the the address book
     * @return True if changes are made, false otherwise
     */
    public boolean isMutating() {
        return false;
    }
    
    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_ALL_USAGES);
    }
}
