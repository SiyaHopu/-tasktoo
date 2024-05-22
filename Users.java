import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Records{

    private List<Users> users;

    @XmlElement(name = "user")
    public List<Users> getUsers(){
        return users;
    }

    public void setRecords(List<Users> users){
        this.users = users;
    }

}

public class Users{
    private String name;
    private int postalZip;
    private String region;
    private String country;
    private String address;
    private int [] list;

    @XmlAttribute
    public String getName(){
        return name;
    }

    @XmlElement
    public int getPostalZip() {
        return postalZip;
    }

    @XmlElement
    public String getRegion() {
        return region;
    }

    @XmlElement
    public String getCountry() {
        return country;
    }

    @XmlElement
    public String getAddress() {
        return address;
    }
      
    @XmlElement
    public String getList() {
        return list;
    }

    /* public void setName(String name){
      this.name = name;
    } */
}   