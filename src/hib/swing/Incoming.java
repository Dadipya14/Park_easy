
package hib.swing;

public class Incoming 
{
    private int vehicleId;
    private int numberPlate;
    private String time;
    private String slotNum;

    public Incoming(int vehicleId, int numberPlate, String time, String slotNum) {
        this.vehicleId = vehicleId;
        this.numberPlate = numberPlate;
        this.time = time;
        this.slotNum = slotNum;
    }

    public Incoming() {
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
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the slotNum
     */
    public String getSlotNum() {
        return slotNum;
    }

    /**
     * @param slotNum the slotNum to set
     */
    public void setSlotNum(String slotNum) {
        this.slotNum = slotNum;
    }
    
}
