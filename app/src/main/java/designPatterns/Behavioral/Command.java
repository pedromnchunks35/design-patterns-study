package designPatterns.Behavioral;

public interface Command {
    // ? The command
    interface ActualCommand {
        void execute();
    }
    //? OBJECT AS A SWITCH
    class LightOnCommand implements ActualCommand {
        private Light light;

        public LightOnCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOn();
        }

    }
    //? OBJECT AS A SWITCH
    class LightOffCommand implements ActualCommand {
        private Light light;

        public LightOffCommand(Light light) {
            this.light = light;
        }

        public void execute() {
            light.turnOff();
        }
    }
    //? THE OPERATOR
    class Light {
        void turnOn() {
            System.out.println("Turning on");
        }

        void turnOff() {
            System.out.println("Turning off");
        }
    }

    //? Remote controll
    class RemoteControl{
        private ActualCommand command;
        public void setCommand(ActualCommand command){
            this.command=command;
        }
        public void pressButton(){
            command.execute();
        }
    }

    //? BASICLY WE WOULD CREATE A COMMAND LIKE LIGHTON AND THEN REGISTER THEM ON THE REMOTE CONTROL WHICH THEN HAS THE OPTION TO PRESS THE BUTTON
}
