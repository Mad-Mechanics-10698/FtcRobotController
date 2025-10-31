package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Ifpract extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double leftstick = gamepad1.left_stick_x;
        if (leftstick < 0){
            telemetry.addData( "left stick x is","negative");


        }
        else if(leftstick >0 ){
            telemetry.addData("left stick", "is greater then zero");

        }
        else{
            telemetry.addData("left stick is", "zero");
        }
        }


    }

