// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems ;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj.XboxController;
import org.carlmontrobotics.lib199.MotorControllerFactory;
import com.revrobotics.CANSparkMax;
//import frc.robot.Constants;
import org.carlmontrobotics.lib199.MotorConfig;
//import edu.wpi.first.wpilibj.Timer;

public class IntakeOutake extends SubsystemBase {
  CANSparkMax intakerightMotor = MotorControllerFactory.createSparkMax(0, MotorConfig.NEO);
  CANSparkMax intakeleftMotor = MotorControllerFactory.createSparkMax(1, MotorConfig.NEO);
  CANSparkMax outakerightMotor = MotorControllerFactory.createSparkMax(2, MotorConfig.NEO);
  CANSparkMax outakeleftMotor = MotorControllerFactory.createSparkMax(3, MotorConfig.NEO);
 



  /** Creates a new shooter. */
  public IntakeOutake() {}


  public void intake() {
    intakeleftMotor.set(1.0);
    intakerightMotor.set(-1.0);
    //if (intakeleftMotor < 0.45 && intakerightMotor < 0.45){
      //intakeleftMotor.set(1.0);
      //intakerightMotor.set(-1.0);
    //} 
    double intakeLeftOutput = intakeleftMotor.get();
    double intakeRightOutput = intakerightMotor.get();

    if (intakeLeftOutput <= 0.45 && intakeRightOutput <= -0.45) {
        intakeleftMotor.set(0.0);
        intakerightMotor.set(0.0);
    }
  }

  public void stopIntakeMotors() {
    intakeleftMotor.set(0);
    intakerightMotor.set(0);
  }

  public void outake() {
    outakeleftMotor.set(1.0);
    outakerightMotor.set(-1.0);


  }

  public void stopOuatakeMotors() {
    outakeleftMotor.set(0);
    outakerightMotor.set(0);
  }

  }
  // @Override
  // public void periodic() {
  //   boolean intakeoutake = X1.getLeftBumperPressed();
  //   if (intakeoutake == true) {
  //     intakeoutakeleftMotor.set(1.0);
  //     intakeoutakerightMotor.set(-1.0);
  //   } else {
  //      intakeoutakeleftMotor.set(0);
  //      intakeoutakerightMotor.set(0);
    
  //   }
    // This method will be called once per scheduler run
  //}
//}
