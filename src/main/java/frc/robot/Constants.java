// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final double WHEEL_RADIUS = 2;
    public static class Drivetrain {
        public static final int LEFT_MOTOR_PORT = 11;
        public static final int RIGHT_MOTOR_PORT = 12; 
        public static final double AUTO_SPEED = 0.2;
    }

    public static class Intake {
        public static final int FRONT_LEFT_FLYWHEEL_PORT = 1;
        public static final int FRONT_RIGHT_FLYWHEEL_PORT = 9;
        public static final int BACK_LEFT_FLYWHEEL_PORT = 2;
        public static final int BACK_RIGHT_FLYWHEEL_PORT = 3;
    }

    public static class OI {
        public static final int CONTROLLER_PORT = 1;

    }
}
