/************************ PROJECT JIM *************************/
/* Copyright (c) 2023 StuyPulse Robotics. All rights reserved.*/
/* This work is licensed under the terms of the MIT license.  */
/**************************************************************/

package frc.robot.subsystems.odometry;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class Odometry extends SubsystemBase {

    // Singleton data
    private static final Odometry instance;

    static {
        instance = new OdometryImpl();
    }


    public static Odometry getInstance(){
        return instance;
    }

    // Odometry methods
    protected Odometry() {
    }

    public abstract Field2d getField();

    public abstract void reset(Pose2d pose2d);

    public abstract Pose2d getPose();

    public final Translation2d getTranslation() {
        return getPose().getTranslation();
    }

    public final Rotation2d getRotation() {
        return getPose().getRotation();
    }
}
