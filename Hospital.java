package PatientRecords;

/**
 *
 * @author MUQADASA SHERANI
 */
public class Hospital {
    //list of patients recorded in the hospital
    private Patient[] patients = new Patient[20];
    private int index=0;
    
    //Hospital constructor
    public Hospital(){
        patients = new Patient[20];
    }
    
    //returns the size of the patient array.
    public int getPatientsCount(){
        return this.index;
    }
    
    //getter...
    public Patient[] getPatients() {
        return patients;
    }
    //setter...
    public void setPatients(Patient patients) {
        this.patients[index++] = patients;
    }
    //tostring...
    @Override
    public String toString(){
        String str;
        str = "";
        for (int i=0; i<this.index;i++) {
            str = str + this.patients[i].toString();
            str = str + "\n";
        }
        return str;
    }
    
}
