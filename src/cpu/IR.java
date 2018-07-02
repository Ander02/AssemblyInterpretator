package cpu;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class IR {

    public static ArrayList<Boolean> opcode = new ArrayList<>(4);
    public static Recoder P1 = new Recoder(16, 15);
    public static Recoder P2 = new Recoder(14, 13);

}
