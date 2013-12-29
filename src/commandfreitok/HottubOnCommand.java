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
public class HottubOnCommand implements Command{

    Hottub hottub;
    public HottubOnCommand( Hottub hottub){
        this.hottub=hottub;
    }
    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
    
}
