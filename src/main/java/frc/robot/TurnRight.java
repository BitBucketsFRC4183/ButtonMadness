package frc.robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnRight extends Command {

    public TurnRight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.printf("TurnRight INIT\n");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.driveSubsystem.turnRight();
        System.out.printf("TurnRight EXECUTE\n");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.driveSubsystem.stop();
        System.out.printf("TurnRight END\n");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.printf("TurnRight INTERRUPTED\n");
        end();
    }
}
