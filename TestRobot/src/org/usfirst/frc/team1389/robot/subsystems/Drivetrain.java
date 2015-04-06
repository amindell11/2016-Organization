package org.usfirst.frc.team1389.robot.subsystems;

import org.usfirst.frc.team1389.robot.RobotMap;
import org.usfirst.frc.team1389.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public static final float LIMITER = (float) 1.42; //Approximately sqrt(2)
	Victor leftDrive;
	Victor rightDrive;

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public Drivetrain() {
		rightDrive = new Victor(RobotMap.RIGHT_PWM_DRIVE);
		leftDrive = new Victor(RobotMap.LEFT_PWM_DRIVE);
	}

	public void drive(double x, double y) {

		double leftPower = (y + x) / LIMITER;
		double rightPower = (y - x) / LIMITER * -1;
		leftDrive.set(leftPower);
		rightDrive.set(rightPower);
	}
	public void stop(){
		leftDrive.set(0);
		rightDrive.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		new DriveWithJoysticks();
	}

}
