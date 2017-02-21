package soft.idea.hospital.kidny2017.se.models;
// Generated Feb 21, 2017 8:45:30 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AddressPation generated by hbm2java
 */
@Entity
@Table(name="address_pation"
    ,catalog="safenets_host_se"
)
public class AddressPation  implements java.io.Serializable {


     private Integer idaddress;
     private Pation pation;
     private String addressNo;
     private String addressStreetName;
     private String addressTown;

    public AddressPation() {
    }

	
    public AddressPation(Pation pation) {
        this.pation = pation;
    }
    public AddressPation(Pation pation, String addressNo, String addressStreetName, String addressTown) {
       this.pation = pation;
       this.addressNo = addressNo;
       this.addressStreetName = addressStreetName;
       this.addressTown = addressTown;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idaddress", unique=true, nullable=false)
    public Integer getIdaddress() {
        return this.idaddress;
    }
    
    public void setIdaddress(Integer idaddress) {
        this.idaddress = idaddress;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pation_idpation", nullable=false)
    public Pation getPation() {
        return this.pation;
    }
    
    public void setPation(Pation pation) {
        this.pation = pation;
    }

    
    @Column(name="address_no", length=45)
    public String getAddressNo() {
        return this.addressNo;
    }
    
    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    
    @Column(name="address_street_name")
    public String getAddressStreetName() {
        return this.addressStreetName;
    }
    
    public void setAddressStreetName(String addressStreetName) {
        this.addressStreetName = addressStreetName;
    }

    
    @Column(name="address_town", length=45)
    public String getAddressTown() {
        return this.addressTown;
    }
    
    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }




}


