package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Gamepad extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double difference = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double speedforward2 = gamepad1.left_trigger = gamepad1.right_trigger;
        double speedforward = -gamepad1.left_stick_x /2.0;
        telemetry.addData("x", speedforward);
        telemetry.addData("y", gamepad1.left_stick_y);
        telemetry.addData("a", gamepad1.a);
        telemetry.addData("x", gamepad1.right_stick_x);
        telemetry.addData("y", gamepad1.right_stick_y);
        telemetry.addData("b", gamepad1.b);
        telemetry.addData("difference", difference);
        telemetry.addData("sum triggers", speedforward2);


    }
}
