/************************ PROJECT JIM *************************/
/* Copyright (c) 2023 StuyPulse Robotics. All rights reserved.*/
/* This work is licensed under the terms of the MIT license.  */
/**************************************************************/

package frc.robot.subsystems.swervemodules;

import edu.wpi.first.math.kinematics.SwerveModuleState;

public interface IOSwerveModule {
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

    default void updateInputs(SwerveModuleIOInputs inputs) {}

    default void setDriveVoltage(double voltage) {}

    default void setSteerVoltage(double voltage) {}
    
    default void setModuleState(SwerveModuleState state, boolean isOpenLoop) {}

    default void stopMotors() {}

    default void setDriveBrakeMode(boolean enable) {}

    default void setSteerBrakeMode(boolean enable) {}

    // from MAXSwerveModule 
    // default   public SwerveModuleState getState() {}
    // public SwerveModulePosition getPosition() {
        // public void setDesiredState(SwerveModuleState desiredState) {
            // public void resetEncoders() {
                // public double getDriveVolts() {
                    // public double getDriveOutput() {
                        // public double getDriveSpeed() {
                            // public double getTurnAngle() {

}
