
package hib.swing;

public class Vehicle 
{
    private int vehicleId;
    private int numberPlate;
    private int type;
    private String entryTime;
    private String exitTime;
    private int slotNum;

    public Vehicle(int vehicleId, int numberPlate, int type, String entryTime, String exitTime, int slotNum) {
        this.vehicleId = vehicleId;
        this.numberPlate = numberPlate;
        this.type = type;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.slotNum = slotNum;
    }

    public Vehicle() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * @return the vehicleId
     */
    public int getVehicleId() {
        return vehicleId;
    }

    /**
     * @param vehicleId the vehicleId to set
     */
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * @return the numberPlate
     */
    public int getNumberPlate() {
        return numberPlate;
    }

    /**
     * @param numberPlate the numberPlate to set
     */
    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the entryTime
     */
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime the entryTime to set
     */
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return the exitTime
     */
    public String getExitTime() {
        return exitTime;
    }

    /**
     * @param exitTime the exitTime to set
     */
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
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
    
}