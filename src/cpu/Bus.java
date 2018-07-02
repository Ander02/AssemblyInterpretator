package cpu;

/**
 *
 * @author Anderson
 */
public class Bus {

    public static Recoder Ax = new Recoder(6, 7);
    public static Recoder Bx = new Recoder(8, 9);
    public static Recoder Cx = new Recoder(10, 11);
    public static Recoder Dx = new Recoder(25, 26);
    public static Recoder PC = new Recoder(1, 2);
    public static Recoder MAR = new Recoder(3, -1);
    public static Recoder MBR = new Recoder(4, 5);
    public static IR IR = new IR();  
    
}
