package hbrs.de.IA_SmartHoover.model;


public class SalesMan implements ISalesMan{
  
    String id;
    String firstName;
    String lastName;
    String jobTitle;
    String subUnit;
    String supervisor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSubUnit() {
        return subUnit;
    }

    public void setSubUnit(String subUnit) {
        this.subUnit = subUnit;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
