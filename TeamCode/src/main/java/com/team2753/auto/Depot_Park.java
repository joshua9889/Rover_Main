package com.team2753.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.team2753.Team753Linear;

/**
 * Created by David Zheng | FTC 2753 Team Overdrive on 11/11/2018.
 */
@Autonomous(name = "Depot_Park")
public class Depot_Park extends Team753Linear{
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart("Depot_Park", true, this);

        int i = 0;
        while (opModeIsActive() && i == 0) {

            Robot.getDrive().encoderDrive(0.8, 40, 40, 10, this);
            //Team Marker
            Robot.getMarker().deploy();
            i++;

        }

        finalAction();
    }
}
