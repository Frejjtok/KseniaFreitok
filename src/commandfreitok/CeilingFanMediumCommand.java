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
public class CeilingFanMediumCommand implements Command{

    CeiligFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanMediumCommand(CeiligFan ceilingFan){
        this.ceilingFan=ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if(prevSpeed==CeiligFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed==CeiligFan.MEDIUM){
            ceilingFan.medium();
        }
        else if(prevSpeed==CeiligFan.LOW){
            ceilingFan.low();
        }
        else if(prevSpeed==CeiligFan.OFF){
            ceilingFan.OFF();
        }
    }
}
