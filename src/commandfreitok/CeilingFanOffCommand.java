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
public class CeilingFanOffCommand implements Command{
    CeiligFan ceilingFan;
    public CeilingFanOffCommand( CeiligFan fan){
        this.ceilingFan=fan;
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
