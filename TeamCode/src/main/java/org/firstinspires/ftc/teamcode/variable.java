package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class variable extends OpMode {
    @Override
    public void init() {
        int teamnumber = 10698;
        double motoerspeed = 0.75;
        boolean clawclose = true;
        String name = "sylys";
        String teamname = "mad mechanic";
        int motorangle = "45";

        telemetry.addData("teamnumber", teamnumber);
telemetry.addData("moterspeed", motoerspeed);
telemetry.addData("clawclose", clawclose);
telemetry.addData("name", teamname);
telemetry.addData("motorangle", motorangle);

    }

    @Override
    public void loop() {

    }
}
