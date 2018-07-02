package cpu;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class Recoder {

    private Integer content;
    private ArrayList<Boolean> opcode = new ArrayList<>(4);
    private Integer inDoor;
    private Boolean inDoorIsOpen;
    private Integer outDoor;
    private Boolean outDoorIsOpen;

    public Recoder(Integer inDoor, Integer outDoor) {
        this.content = 0;
        this.inDoor = inDoor;
        this.inDoorIsOpen = false;
        this.outDoor = outDoor;
        this.outDoorIsOpen = false;
    }
    
    
}
