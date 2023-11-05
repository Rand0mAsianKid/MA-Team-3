package frc.robot.Subsystems;

import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  CANSparkMax rightMotor = MotorControllerFactory.createSparkMax(0, MotorConfig.NEO);
  CANSparkMax leftMotor = MotorControllerFactory.createSparkMax(1, MotorConfig.NEO);
  XboxController X1;
  /** Creates a new drivetrain. */
  
  public Drivetrain(XboxController x1) {
    X1 = x1;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    double right = -X1.getRightY() * Constants.driveSpeedMultiplier;
    double left = X1.getLeftY() * Constants.turnSpeedMultiplier;
    leftMotor.set(-left);
    rightMotor.set(right);
  }
  public void slowmode() {
    double right = -X1.getRightY() * Constants.halfDriveSpeedMultiplier;
    double left = X1.getLeftY() * Constants.halfTurnSpeedMultiplier;
    leftMotor.set(-left);
    rightMotor.set(right);
  }
}
