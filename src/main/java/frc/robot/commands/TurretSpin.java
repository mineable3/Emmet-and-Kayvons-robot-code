// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class TurretSpin extends CommandBase {
  /** Creates a new TurretSpin. */
  double turrentSpeed;
  public TurretSpin(double turSpeed) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.m_Turret);
    turrentSpeed = turSpeed;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    //double lTrigger = RobotContainer.m_driverController.getLeftTriggerAxis();
    //double rTrigger = RobotContainer.m_driverController.getRightTriggerAxis();

    //lTrigger *= Constants.turretSpeedMultiplier;
    //rTrigger *= Constants.turretSpeedMultiplier;

    //RobotContainer.m_Turret.turnTurret((rTrigger - lTrigger));
   RobotContainer.m_Turret.setTurret(turrentSpeed);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.m_Turret.setTurret(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
