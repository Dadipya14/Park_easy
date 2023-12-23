
package hib.swing;

public class SlotDetails 
{
    private int slotNum;
    private int slotOccupied;
    private int slotEmpty;

    public SlotDetails(int slotNum, int slotOccupied, int slotEmpty) {
        this.slotNum = slotNum;
        this.slotOccupied = slotOccupied;
        this.slotEmpty = slotEmpty;
    }

    public SlotDetails() {
    }

    /**
     * @return the slotNum
     */
    public int getSlotNum() {
        return slotNum;
    }

    /**
     * @param slotNum the slotNum to set
     */
    public void setSlotNum(int slotNum) {
        this.slotNum = slotNum;
    }

    /**
     * @return the slotOccupied
     */
    public int getSlotOccupied() {
        return slotOccupied;
    }

    /**
     * @param slotOccupied the slotOccupied to set
     */
    public void setSlotOccupied(int slotOccupied) {
        this.slotOccupied = slotOccupied;
    }

    /**
     * @return the slotEmpty
     */
    public int getSlotEmpty() {
        return slotEmpty;
    }

    /**
     * @param slotEmpty the slotEmpty to set
     */
    public void setSlotEmpty(int slotEmpty) {
        this.slotEmpty = slotEmpty;
    }
}

