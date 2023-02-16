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

  public static final int leftmotorID1 = 4;
  public static final int leftmotorID2 = 5;
  public static final int rightmotorID1 = 2;
  public static final int rightmotorID2 = 3;
  public static final int turretmotorID = 9;
  public static final int clawMotorID = 6;
  public static final int pigeonID = 0;
  public static final int armMotorID = 1;
  public static final double driveSpeedMultiplier = .8;
  public static final double turretSpeedMultiplier = .2;
  


  public static class OperatorConstants {

    //joystick axis for arcade drive
    public static final int driveSpeed = 1;
    public static final int driveRotate = 4;

    public static final int driveLeft = 5;
    public static final int driveRight = 1;

    public static final int kDriverControllerPort = 0;
    public static final int kAuxControllerPort = 1;
  }
}
