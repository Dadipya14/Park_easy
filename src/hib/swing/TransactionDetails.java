
package hib.swing;

public class TransactionDetails 
{
  private int vehicleId;
  private String mode;
  private int amount;
  private int numberPlate;
  private String date;
  private String time;

    public TransactionDetails(int vehicleId, String mode, int amount, int numberPlate, String date, String time) {
        this.vehicleId = vehicleId;
        this.mode = mode;
        this.amount = amount;
        this.numberPlate = numberPlate;
        this.date = date;
        this.time = time;
    }

    public TransactionDetails() {
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
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
  
  
}
