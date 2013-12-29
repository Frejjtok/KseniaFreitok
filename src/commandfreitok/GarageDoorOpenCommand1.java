/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandfreitok;

import bsuir.mycommand.Command;

/**
 *
 * @author Alexander
 */
public class GarageDoorOpenCommand1 implements Command{
    private GarageDoor door;
    public GarageDoorOpenCommand1( GarageDoor door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
