package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

@TeleOp(name="Drive", group = "Main")
@Config

public class Drive extends LinearOpMode
{

    ElapsedTime timer = new ElapsedTime();
    public DcMotor SkystoneLeft;
    public DcMotor SkystoneRight;
    public DcMotor Oxygen;
    public Servo Pale;



    public void runOpMode() throws InterruptedException
    {

        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        SkystoneLeft = hardwareMap.get(DcMotor.class, "SL");
        SkystoneRight = hardwareMap.get(DcMotor.class, "SR");
        Oxygen = hardwareMap.get(DcMotor.class, "OX");
        Pale = hardwareMap.get(Servo.class,"Pale");



        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive() && !isStopRequested())
        {
            telemetry.addData("SL pos: ",SkystoneLeft.getCurrentPosition());
            telemetry.addData("SR pos", SkystoneRight.getCurrentPosition());
            telemetry.update();

        }
    }
}




