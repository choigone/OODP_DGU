//2016112182최고운

package com.top;

enum Direction {UP,DOWN}
enum MotorStatus {MOVING,STOPPING}
abstract class Motor{
    private MotorStatus motorStatus;
    protected abstract void moveMotor(Direction direction);
    protected abstract String getName();
    public Motor(){
        motorStatus = MotorStatus.STOPPING;
    }

    public MotorStatus getMotorStatus(){
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus){
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction){
        MotorStatus motorStatus = getMotorStatus();
        if(motorStatus == MotorStatus.MOVING)
            return;
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    public void stop(){
        motorStatus = MotorStatus.STOPPING;
        System.out.println("stop Elevator");
    }
}

class LGMotor extends Motor{
    private String name = "LG";
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor " + direction);
    }

    @Override
    protected String getName() {
        return name;
    }
}

class HyundaiMotor extends Motor{
    private String name = "Hyundai";
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyndai Motor " + direction);
    }

    @Override
    protected String getName() {
        return name;
    }
}

class ElevatorController{
    private int id;
    private int curFloor = 1;
    private Motor motor;

    public ElevatorController(int id, Motor motor){
        this.id = id;
        this.motor = motor;
    }

    public void gotoFloor(int destination){
        Direction direction;
        if(destination == curFloor) return;

        if(destination > curFloor) direction = Direction.UP;
        else direction = Direction.DOWN;

        motor.move(direction);

        System.out.print("Elevator [" + id + "] floor : " + curFloor);
        curFloor = destination;
        System.out.println(" ==> " + curFloor + " with " + motor.getName());

        motor.stop();
    }
}

class MotorFactory{
    public Motor createMotor(String type){
        Motor motor = null;
        if(type == "Hyundai"){
            motor = new HyundaiMotor();
        }
        if(type == "LG"){
            motor = new LGMotor();
        }
        return motor;
    }
}

public class FactoryMain {
    public static void main(String[] args){
        MotorFactory factory = new MotorFactory();
        Motor motor = factory.createMotor("LG");
        ElevatorController controller1 = new ElevatorController(1,motor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        motor = factory.createMotor("Hyundai");
        ElevatorController controller2 = new ElevatorController(1,motor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}
