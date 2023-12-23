package hib.swing;

public class Staff {

    private int staffId;
    private String name;
    private int contactNo;
    private String password;
    private String role;

    /**
     * @return the staffId
     */
    public int getStaffId() {
        return staffId;
    }

    public Staff() {
    }

    public Staff(int staffId, String name, int contactNo, String password, String role) {
        this.staffId = staffId;
        this.name = name;
        this.contactNo = contactNo;
        this.password = password;
        this.role = role;
    }

    /**
     * 
     * @param staffId the staffId to set
     */
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contactNo
     */
    public int getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
}
