package com.example.meepmeeptesting;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;
public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(700);
        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
// Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 14.5)
                .build();
        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(0, 0, Math.toRadians(90)))
// Run your test paths here
//...
//Examples below
//.strafeTo(new Vector2d(10, 0))
.waitSeconds(1.5)
.strafeToLinearHeading(new Vector2d(-50, -50), Math.toRadians(235))
.waitSeconds(3.0)
.strafeToLinearHeading(new Vector2d(19, 32.5), Math.toRadians(0))
.waitSeconds(3.0)
.strafeToConstantHeading(new Vector2d(19, 13))
.strafeToLinearHeading(new Pose2d(55, -15, Math.toRadians(0)).component1(), Math.toRadians(-180))
.strafeToConstantHeading(new Vector2d(55, -33))
.waitSeconds(3.0)
.strafeToLinearHeading(new Vector2d(55, 38), Math.toRadians(90))
.waitSeconds(3.0)
.strafeToLinearHeading(new Vector2d(55, 0), Math.toRadians(270))
.strafeToConstantHeading(new Vector2d(0, 0))
.strafeToConstantHeading(new Vector2d(0, -45))
//.splineTo(new Vector2d(0, 0), Math.toRadians(0))
//.splineToConstantHeading(new Vector2d(0,0), Math.toRadians(0))
//.splineToLinearHeading(new Pose2d(0,0, Math.toRadians(0)), Math.toRadians(0))
//.waitSeconds(0.5)
                .build());
        meepMeep.setBackground(MeepMeep.Background.FIELD_DECODE_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}