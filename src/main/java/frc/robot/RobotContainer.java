// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Subsystems.Drivetrain;
import frc.robot.Subsystems.IntakeOutake;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;



public class RobotContainer {
  XboxController X1 = new XboxController(0);
  Drivetrain drivetrain = new Drivetrain(X1);
  IntakeOutake in = new IntakeOutake();
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(X1, Button.kRightBumper.value).onTrue(new InstantCommand(
      () -> {
        in.intake();
      }
      ));
    new JoystickButton(X1, Button.kRightBumper.value).onFalse(new InstantCommand(
      () -> {
        in.stopIntakeMotors();
      }
      ));
    new JoystickButton(X1, Button.kLeftBumper.value).onTrue(new InstantCommand(
      () -> {
        in.outake();
      }
      ));
    new JoystickButton(X1, Button.kLeftBumper.value).onFalse(new InstantCommand(
      () -> {
        in.stopOuatakeMotors();
      }
      ));
    new JoystickButton(X1, Button.kB.value).onTrue(new InstantCommand(
      () -> {
        drivetrain.slowmode();
      } 
      ));
    new JoystickButton(X1, Button.kA.value).onTrue(new InstantCommand(
      () -> {
        drivetrain.periodic();
      }
      ));
      
      

  }


  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
