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
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
