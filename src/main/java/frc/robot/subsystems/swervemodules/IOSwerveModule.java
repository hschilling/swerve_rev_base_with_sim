/************************ PROJECT JIM *************************/
/* Copyright (c) 2023 StuyPulse Robotics. All rights reserved.*/
/* This work is licensed under the terms of the MIT license.  */
/**************************************************************/

package frc.robot.subsystems.swervemodules;

import edu.wpi.first.math.kinematics.SwerveModulePosition;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import com.revrobotics.CANSparkMax;

public interface IOSwerveModule {


    // All fields in interface are public static final


    class SwerveModuleIOInputs {
        public double drivePositionMeters = 0.0;
        public double driveVelocityMetersPerSec = 0.0;
        public double driveAppliedVolts = 0.0;
        public double driveCurrentAmps = 0.0;
        public double driveTempCelcius = 0.0;

        public double steerAbsolutePositionRad = 0.0;
        public double steerAbsoluteVelocityRadPerSec = 0.0;
        public double steerPositionRad = 0.0;
        public double steerVelocityRadPerSec = 0.0;
        public double steerAppliedVolts = 0.0;
        public double steerCurrentAmps = 0.0;
        public double steerTempCelcius = 0.0;
    }

    public void updateInputs(SwerveModuleIOInputs inputs);

    public void setDriveVoltage(double voltage);

    public void setSteerVoltage(double voltage);

    public void setModuleState(SwerveModuleState state, boolean isOpenLoop);

    public void stopMotors();

    public void setDriveBrakeMode(boolean enable);

    public void setSteerBrakeMode(boolean enable);

    public SwerveModulePosition getPosition() ;

    // from MAXSwerveModule
    public SwerveModuleState getState() ;
    public void setDesiredState(SwerveModuleState desiredState) ;
    public void resetEncoders() ;
    public double getDriveVolts() ;
    public double getDriveOutput() ;
    public double getDriveSpeed() ;
    public double getSteerSpeed() ;
    public void setDriveSpeed(double speed) ;
    public void setSteerSpeed(double speed) ;
    public double getTurnAngle() ;

}
