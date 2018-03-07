import org.apache.commons.lang3.BitField;

public class Main {
    public static void main(String[] args) {
        BitField blue = new BitField(0xFF);
        BitField green = new BitField(0xFF00);
        BitField red = new BitField(0xFF0000);
        int paintInstruction = 0;
        paintInstruction = red.setValue(paintInstruction, 35);
        paintInstruction = green.setValue(paintInstruction, 100);
        paintInstruction = blue.setValue(paintInstruction, 255);
        System.out.println(red.getValue(paintInstruction));     // prints 35
        System.out.println(green.getValue(paintInstruction));   // prints 100
        System.out.println(blue.getValue(paintInstruction));    // prints 255

    }
}
