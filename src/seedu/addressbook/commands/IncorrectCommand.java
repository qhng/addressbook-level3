package seedu.addressbook.commands;


/**
 * Represents an incorrect command. Upon execution, produces some feedback to the user.
 */
public class IncorrectCommand extends Command{

    public final String feedbackToUser;

    public IncorrectCommand(String feedbackToUser){
        this.feedbackToUser = feedbackToUser;
    }

    /**
     * Queries if this command makes any write changes to the the address book
     * @return True if changes are made, false otherwise
     */
    public boolean isMutating() {
        return false;
    }

    @Override
    public CommandResult execute() {
        return new CommandResult(feedbackToUser);
    }

}
