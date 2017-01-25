package soft.idea.hospital.kidny2017.se.models;
// Generated Jan 26, 2017 4:59:07 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SubWhiteBloadPlates generated by hbm2java
 */
@Entity
@Table(name="sub_white_bload_plates"
    ,catalog="safenets_host_se"
)
public class SubWhiteBloadPlates  implements java.io.Serializable {


     private Integer idsubWhiteBloadPlates;
     private WhiteBloadPlates whiteBloadPlates;
     private String subWhiteBloadPlatesName;
     private String subWhiteBloadPlatesStatus;
     private Set<Doner> doners = new HashSet<Doner>(0);

    public SubWhiteBloadPlates() {
    }

	
    public SubWhiteBloadPlates(WhiteBloadPlates whiteBloadPlates) {
        this.whiteBloadPlates = whiteBloadPlates;
    }
    public SubWhiteBloadPlates(WhiteBloadPlates whiteBloadPlates, String subWhiteBloadPlatesName, String subWhiteBloadPlatesStatus, Set<Doner> doners) {
       this.whiteBloadPlates = whiteBloadPlates;
       this.subWhiteBloadPlatesName = subWhiteBloadPlatesName;
       this.subWhiteBloadPlatesStatus = subWhiteBloadPlatesStatus;
       this.doners = doners;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idsub_white_bload_plates", unique=true, nullable=false)
    public Integer getIdsubWhiteBloadPlates() {
        return this.idsubWhiteBloadPlates;
    }
    
    public void setIdsubWhiteBloadPlates(Integer idsubWhiteBloadPlates) {
        this.idsubWhiteBloadPlates = idsubWhiteBloadPlates;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="white_bload_plates_idwhite_bload_plates", nullable=false)
    public WhiteBloadPlates getWhiteBloadPlates() {
        return this.whiteBloadPlates;
    }
    
    public void setWhiteBloadPlates(WhiteBloadPlates whiteBloadPlates) {
        this.whiteBloadPlates = whiteBloadPlates;
    }

    
    @Column(name="sub_white_bload_plates_name", length=45)
    public String getSubWhiteBloadPlatesName() {
        return this.subWhiteBloadPlatesName;
    }
    
    public void setSubWhiteBloadPlatesName(String subWhiteBloadPlatesName) {
        this.subWhiteBloadPlatesName = subWhiteBloadPlatesName;
    }

    
    @Column(name="sub_white_bload_plates_status", length=45)
    public String getSubWhiteBloadPlatesStatus() {
        return this.subWhiteBloadPlatesStatus;
    }
    
    public void setSubWhiteBloadPlatesStatus(String subWhiteBloadPlatesStatus) {
        this.subWhiteBloadPlatesStatus = subWhiteBloadPlatesStatus;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="subWhiteBloadPlates")
    public Set<Doner> getDoners() {
        return this.doners;
    }
    
    public void setDoners(Set<Doner> doners) {
        this.doners = doners;
    }




}


