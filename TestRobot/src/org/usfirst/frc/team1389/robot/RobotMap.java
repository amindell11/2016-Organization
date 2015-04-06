package org.usfirst.frc.team1389.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	static final int ButtonX 			  = 3; // XBox Controller X Button number for getRawButton= or getRawAxis=
	static final int ButtonA			  = 1; // XBox Controller A Button number
	static final int ButtonB			  = 2; // XBox Controller B Button number
	static final int ButtonY			  = 4; // XBox Controller Y Button number
	static final int BumperL			  = 5; // XBox Controller  Left Bumper number
	static final int BumperR			  = 6; // XBox Controller Right Bumper number
	
	static final int LeftY				  = 1; // XBox Controller  Left Y Axis number
	static final int LeftX				  = 0; // XBox Controller  Left X Axis number
	static final int LeftTrigger		  = 3; // XBox Controller  Left Trigger Axis number
	static final int RightTrigger	      = 4; // XBox Controller  Right Trigger Axis number
	static final int RightY			 	  = 5; // XBox Controller Right Y Axis number
	static final int RightX				  = 4; // XBox Controller Right X Axis number
	
	//Motor PWM ports
	public static final int RIGHT_PWM_DRIVE          = 0;
	public static final int LEFT_PWM_DRIVE           = 1;
	static final int ELEVATOR_ONE_PWM         = 2;
	static final int ELEVATOR_TWO_PWM         = 3;
	static final int CENTER_PWM 			  = 4;
	
	//Joystick USB ports
	static final int DRIVE_JOY            = 0;
	static final int MANIP_JOY            = 1;
	
	//IR Sensor Digital Ports
	static final int INFRARED_ONE         = 0;
	static final int INFRARED_TWO         = 1;
	static final int INFRARED_THREE       = 2;
	static final int INFRARED_FOUR        = 3;
	static final int CONTACT_SENSE        = 2;
	
	//Encoder Digital Ports
	static final int ENCODER_1A           = 7;
	static final int ENCODER_1B           = 6;
	static final int ENCODER_2A           = 8;
	static final int ENCODER_2B           = 9;
}
