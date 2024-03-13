package main.java.logic.commands.open;

import main.java.logic.commands.Command;
import main.java.logic.users.Permissions;
import main.java.model.rooms.Room;

public class OpenAllOpenings extends Command {
    protected Room room;

    public OpenAllOpenings(Room room){
        this.room = room;
    }
    public Room getRoom() {
        return room;
    }
    @Override
    public Permissions requirePermissions(){
        return REQUIRED_PERMISSIONS;
    }


    @Override
    public Boolean execute(){
        // if(room.getHasDoors()){
        // room.setDoorOpen(false);
        // } else {
        // potentially send a GUI error
        // System.out.println("No doors to open in " + room);
        // }
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println(room);
        System.out.print("command done: ");
        room.openAllOpenings();
        System.out.println(room);
        System.out.println("----------------------------------------------------------------------");
        return true;
    }

    @Override
    public String toString(){
        return "open all openings";
    }
}
