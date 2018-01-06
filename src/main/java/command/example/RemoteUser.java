package command.example;

import command.basic.Command;
import command.example.command.*;
import command.example.device.Fan;
import command.example.device.Light;
import command.example.device.Radio;

public class RemoteUser {
    public static void main(String[] args) {

        // create remote
        Remote r = new Remote();

        // create devices
        Fan f1 = new Fan("master room");
        Fan f2 = new Fan("store room");
        Light l = new Light("kitchen");
        Radio radio = new Radio();

        // create commands
        Command f1OnCommand = new FanOnCommand(f1);
        Command f1OffCommand = new FanOffCommand(f1);
        Command f2OnCommand = new FanOnCommand(f2);
        Command f2OffCommand = new FanOffCommand(f2);
        Command lightOnCommand = new LightOnCommand(l);
        Command lightOffCommand = new LightOffCommand(l);
        Command radioOnCommand = new RadioOnCommand(radio);
        Command radioOffCommand = new RadioOffCommand(radio);

        Command[] csOn = {f1OnCommand, lightOnCommand, radioOnCommand};
        Command[] csOff = {f1OffCommand, lightOffCommand, radioOffCommand};
        Command partyOn = new PartyCommand(csOn);
        Command partyOff = new PartyCommand(csOff);

        // set command
        r.setCommand(0, f1OnCommand, f1OffCommand);
        r.setCommand(1, f2OnCommand, f2OffCommand);
        r.setCommand(2, lightOnCommand, lightOffCommand);
        r.setCommand(3, radioOnCommand, radioOffCommand);
        r.setCommand(6, partyOn, partyOff);

        // operate remote
        r.onButton(3);
        r.onButton(1);
        r.undoButton();
        r.onButton(2);
        r.offButton(1);
        r.undoButton();
        r.onButton(6);
    }
}
