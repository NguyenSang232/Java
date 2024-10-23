package Model;

import java.util.Date;

public class Student {
    private String Id;
    private String Name;
    private String Birth;
    private String Gender;
    private String Address;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBirth() {
        return Birth;
    }

    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Student(String Id, String Name, String Gender, String gender, String Address) {
        this.Id = Id;
        this.Name = Name;
        this.Birth = Birth;
        this.Gender = Gender;
        this.Address = Address;
    }

    
}
