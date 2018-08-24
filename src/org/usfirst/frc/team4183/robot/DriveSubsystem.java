package org.usfirst.frc.team4183.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	// Create some motor controllers for this subsystem
	private WPI_TalonSRX leftFront;
	private WPI_TalonSRX leftRear;
	private WPI_TalonSRX rightFront;
	private WPI_TalonSRX rightRear;
	
	public DriveSubsystem()
	{
		leftFront = new WPI_TalonSRX(11);	// MAGIC NUMBERS are evil
		leftRear = new WPI_TalonSRX(12);
		rightFront = new WPI_TalonSRX(13);
		rightRear = new WPI_TalonSRX(14);
	}
	
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void stop()
    {
    	leftFront.set(0.0);
    	leftRear.set(0.0);
    	rightFront.set(0.0);
    	rightRear.set(0.0);
    }
    
    public void driveForward()
    {
    	leftFront.set(0.2);		// More evil MAGIC NUMBERS, but just enough power to move slowly
    	leftRear.set(0.2);
    	rightFront.set(0.2);
    	rightRear.set(0.2);
    }
    
    public void driveBackward()
    {
    	leftFront.set(-0.2);
    	leftRear.set(-0.2);
    	rightFront.set(-0.2);
    	rightRear.set(-0.2);    	
    }
    
    public void turnRight()
    {
    	leftFront.set(0.2);
    	leftRear.set(0.2);
    	rightFront.set(-0.2);
    	rightRear.set(-0.2);
    }
    
    public void turnLeft()
    {
    	leftFront.set(-0.2);
    	leftRear.set(-0.2);
    	rightFront.set(0.2);
    	rightRear.set(0.2);
    }

}