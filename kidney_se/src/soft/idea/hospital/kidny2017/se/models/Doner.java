package soft.idea.hospital.kidny2017.se.models;
// Generated Feb 26, 2017 1:25:37 PM by Hibernate Tools 4.3.1


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
 * Doner generated by hbm2java
 */
@Entity
@Table(name="doner"
    ,catalog="safenets_host_se"
)
public class Doner  implements java.io.Serializable {


     private Integer iddoner;
     private AddressDoner addressDoner;
     private DonerHostpital donerHostpital;
     private String donerFname;
     private String donerMname;
     private String donerLname;
     private String donerNic;
     private String donerCauseOfDeath;
     private String donerIcuDays;
     private Integer donerSteatoticLiver;
     private Integer donerBilirubin;
     private String donerHla;
     private String donerPhone;
     private String donerDob;
     private String donerGen;
     private String donerHeight;
     private String donerBmi;
     private String donerSodiam;
     private String donerCadaverType;
     private String donerWeight;
     private String donerPastHistoryDrug;
     private String donerSgpt;
     private String donerHivStatus;
     private String donerHbvStatus;
     private String donerDsa;
     private String donerCuntry;
     private String donerBlodGroup;
     private String donerPastHistoryMalignancies;
     private String donerSgot;
     private String donerWhiteBloadPlates;
     private String donerHcvStatus;
     private String donerPra;
     private String donerAge;
     private String donerBrainDeathDate;
     private String donerRegdate;
     private String donerAvailable;
     private String donerStatus;
     private Set<PationHasDoner> pationHasDoners = new HashSet<PationHasDoner>(0);

    public Doner() {
    }

	
    public Doner(AddressDoner addressDoner, DonerHostpital donerHostpital) {
        this.addressDoner = addressDoner;
        this.donerHostpital = donerHostpital;
    }
    public Doner(AddressDoner addressDoner, DonerHostpital donerHostpital, String donerFname, String donerMname, String donerLname, String donerNic, String donerCauseOfDeath, String donerIcuDays, Integer donerSteatoticLiver, Integer donerBilirubin, String donerHla, String donerPhone, String donerDob, String donerGen, String donerHeight, String donerBmi, String donerSodiam, String donerCadaverType, String donerWeight, String donerPastHistoryDrug, String donerSgpt, String donerHivStatus, String donerHbvStatus, String donerDsa, String donerCuntry, String donerBlodGroup, String donerPastHistoryMalignancies, String donerSgot, String donerWhiteBloadPlates, String donerHcvStatus, String donerPra, String donerAge, String donerBrainDeathDate, String donerRegdate, String donerAvailable, String donerStatus, Set<PationHasDoner> pationHasDoners) {
       this.addressDoner = addressDoner;
       this.donerHostpital = donerHostpital;
       this.donerFname = donerFname;
       this.donerMname = donerMname;
       this.donerLname = donerLname;
       this.donerNic = donerNic;
       this.donerCauseOfDeath = donerCauseOfDeath;
       this.donerIcuDays = donerIcuDays;
       this.donerSteatoticLiver = donerSteatoticLiver;
       this.donerBilirubin = donerBilirubin;
       this.donerHla = donerHla;
       this.donerPhone = donerPhone;
       this.donerDob = donerDob;
       this.donerGen = donerGen;
       this.donerHeight = donerHeight;
       this.donerBmi = donerBmi;
       this.donerSodiam = donerSodiam;
       this.donerCadaverType = donerCadaverType;
       this.donerWeight = donerWeight;
       this.donerPastHistoryDrug = donerPastHistoryDrug;
       this.donerSgpt = donerSgpt;
       this.donerHivStatus = donerHivStatus;
       this.donerHbvStatus = donerHbvStatus;
       this.donerDsa = donerDsa;
       this.donerCuntry = donerCuntry;
       this.donerBlodGroup = donerBlodGroup;
       this.donerPastHistoryMalignancies = donerPastHistoryMalignancies;
       this.donerSgot = donerSgot;
       this.donerWhiteBloadPlates = donerWhiteBloadPlates;
       this.donerHcvStatus = donerHcvStatus;
       this.donerPra = donerPra;
       this.donerAge = donerAge;
       this.donerBrainDeathDate = donerBrainDeathDate;
       this.donerRegdate = donerRegdate;
       this.donerAvailable = donerAvailable;
       this.donerStatus = donerStatus;
       this.pationHasDoners = pationHasDoners;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="iddoner", unique=true, nullable=false)
    public Integer getIddoner() {
        return this.iddoner;
    }
    
    public void setIddoner(Integer iddoner) {
        this.iddoner = iddoner;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="address_doner_idaddress_doner", nullable=false)
    public AddressDoner getAddressDoner() {
        return this.addressDoner;
    }
    
    public void setAddressDoner(AddressDoner addressDoner) {
        this.addressDoner = addressDoner;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="doner_hostpital_iddoner_hostpital", nullable=false)
    public DonerHostpital getDonerHostpital() {
        return this.donerHostpital;
    }
    
    public void setDonerHostpital(DonerHostpital donerHostpital) {
        this.donerHostpital = donerHostpital;
    }

    
    @Column(name="doner_fname", length=45)
    public String getDonerFname() {
        return this.donerFname;
    }
    
    public void setDonerFname(String donerFname) {
        this.donerFname = donerFname;
    }

    
    @Column(name="doner_mname", length=45)
    public String getDonerMname() {
        return this.donerMname;
    }
    
    public void setDonerMname(String donerMname) {
        this.donerMname = donerMname;
    }

    
    @Column(name="doner_lname", length=45)
    public String getDonerLname() {
        return this.donerLname;
    }
    
    public void setDonerLname(String donerLname) {
        this.donerLname = donerLname;
    }

    
    @Column(name="doner_nic", length=45)
    public String getDonerNic() {
        return this.donerNic;
    }
    
    public void setDonerNic(String donerNic) {
        this.donerNic = donerNic;
    }

    
    @Column(name="doner_cause_of_death", length=45)
    public String getDonerCauseOfDeath() {
        return this.donerCauseOfDeath;
    }
    
    public void setDonerCauseOfDeath(String donerCauseOfDeath) {
        this.donerCauseOfDeath = donerCauseOfDeath;
    }

    
    @Column(name="doner_icu_days", length=45)
    public String getDonerIcuDays() {
        return this.donerIcuDays;
    }
    
    public void setDonerIcuDays(String donerIcuDays) {
        this.donerIcuDays = donerIcuDays;
    }

    
    @Column(name="doner_steatotic_liver")
    public Integer getDonerSteatoticLiver() {
        return this.donerSteatoticLiver;
    }
    
    public void setDonerSteatoticLiver(Integer donerSteatoticLiver) {
        this.donerSteatoticLiver = donerSteatoticLiver;
    }

    
    @Column(name="doner_bilirubin")
    public Integer getDonerBilirubin() {
        return this.donerBilirubin;
    }
    
    public void setDonerBilirubin(Integer donerBilirubin) {
        this.donerBilirubin = donerBilirubin;
    }

    
    @Column(name="doner_hla", length=45)
    public String getDonerHla() {
        return this.donerHla;
    }
    
    public void setDonerHla(String donerHla) {
        this.donerHla = donerHla;
    }

    
    @Column(name="doner_phone", length=45)
    public String getDonerPhone() {
        return this.donerPhone;
    }
    
    public void setDonerPhone(String donerPhone) {
        this.donerPhone = donerPhone;
    }

    
    @Column(name="doner_dob", length=45)
    public String getDonerDob() {
        return this.donerDob;
    }
    
    public void setDonerDob(String donerDob) {
        this.donerDob = donerDob;
    }

    
    @Column(name="doner_gen", length=45)
    public String getDonerGen() {
        return this.donerGen;
    }
    
    public void setDonerGen(String donerGen) {
        this.donerGen = donerGen;
    }

    
    @Column(name="doner_height", length=45)
    public String getDonerHeight() {
        return this.donerHeight;
    }
    
    public void setDonerHeight(String donerHeight) {
        this.donerHeight = donerHeight;
    }

    
    @Column(name="doner_bmi", length=45)
    public String getDonerBmi() {
        return this.donerBmi;
    }
    
    public void setDonerBmi(String donerBmi) {
        this.donerBmi = donerBmi;
    }

    
    @Column(name="doner_sodiam", length=45)
    public String getDonerSodiam() {
        return this.donerSodiam;
    }
    
    public void setDonerSodiam(String donerSodiam) {
        this.donerSodiam = donerSodiam;
    }

    
    @Column(name="doner_cadaver_type", length=45)
    public String getDonerCadaverType() {
        return this.donerCadaverType;
    }
    
    public void setDonerCadaverType(String donerCadaverType) {
        this.donerCadaverType = donerCadaverType;
    }

    
    @Column(name="doner_weight", length=45)
    public String getDonerWeight() {
        return this.donerWeight;
    }
    
    public void setDonerWeight(String donerWeight) {
        this.donerWeight = donerWeight;
    }

    
    @Column(name="doner_past_history_drug")
    public String getDonerPastHistoryDrug() {
        return this.donerPastHistoryDrug;
    }
    
    public void setDonerPastHistoryDrug(String donerPastHistoryDrug) {
        this.donerPastHistoryDrug = donerPastHistoryDrug;
    }

    
    @Column(name="doner_sgpt", length=45)
    public String getDonerSgpt() {
        return this.donerSgpt;
    }
    
    public void setDonerSgpt(String donerSgpt) {
        this.donerSgpt = donerSgpt;
    }

    
    @Column(name="doner_hiv_status", length=45)
    public String getDonerHivStatus() {
        return this.donerHivStatus;
    }
    
    public void setDonerHivStatus(String donerHivStatus) {
        this.donerHivStatus = donerHivStatus;
    }

    
    @Column(name="doner_hbv_status", length=45)
    public String getDonerHbvStatus() {
        return this.donerHbvStatus;
    }
    
    public void setDonerHbvStatus(String donerHbvStatus) {
        this.donerHbvStatus = donerHbvStatus;
    }

    
    @Column(name="doner_dsa", length=45)
    public String getDonerDsa() {
        return this.donerDsa;
    }
    
    public void setDonerDsa(String donerDsa) {
        this.donerDsa = donerDsa;
    }

    
    @Column(name="doner_cuntry", length=45)
    public String getDonerCuntry() {
        return this.donerCuntry;
    }
    
    public void setDonerCuntry(String donerCuntry) {
        this.donerCuntry = donerCuntry;
    }

    
    @Column(name="doner_blod_group", length=45)
    public String getDonerBlodGroup() {
        return this.donerBlodGroup;
    }
    
    public void setDonerBlodGroup(String donerBlodGroup) {
        this.donerBlodGroup = donerBlodGroup;
    }

    
    @Column(name="doner_past_history_malignancies")
    public String getDonerPastHistoryMalignancies() {
        return this.donerPastHistoryMalignancies;
    }
    
    public void setDonerPastHistoryMalignancies(String donerPastHistoryMalignancies) {
        this.donerPastHistoryMalignancies = donerPastHistoryMalignancies;
    }

    
    @Column(name="doner_sgot", length=45)
    public String getDonerSgot() {
        return this.donerSgot;
    }
    
    public void setDonerSgot(String donerSgot) {
        this.donerSgot = donerSgot;
    }

    
    @Column(name="doner_white_bload_plates", length=45)
    public String getDonerWhiteBloadPlates() {
        return this.donerWhiteBloadPlates;
    }
    
    public void setDonerWhiteBloadPlates(String donerWhiteBloadPlates) {
        this.donerWhiteBloadPlates = donerWhiteBloadPlates;
    }

    
    @Column(name="doner_hcv_status", length=45)
    public String getDonerHcvStatus() {
        return this.donerHcvStatus;
    }
    
    public void setDonerHcvStatus(String donerHcvStatus) {
        this.donerHcvStatus = donerHcvStatus;
    }

    
    @Column(name="doner_pra", length=45)
    public String getDonerPra() {
        return this.donerPra;
    }
    
    public void setDonerPra(String donerPra) {
        this.donerPra = donerPra;
    }

    
    @Column(name="doner_age", length=45)
    public String getDonerAge() {
        return this.donerAge;
    }
    
    public void setDonerAge(String donerAge) {
        this.donerAge = donerAge;
    }

    
    @Column(name="doner_brain_death_date", length=45)
    public String getDonerBrainDeathDate() {
        return this.donerBrainDeathDate;
    }
    
    public void setDonerBrainDeathDate(String donerBrainDeathDate) {
        this.donerBrainDeathDate = donerBrainDeathDate;
    }

    
    @Column(name="doner_regdate", length=45)
    public String getDonerRegdate() {
        return this.donerRegdate;
    }
    
    public void setDonerRegdate(String donerRegdate) {
        this.donerRegdate = donerRegdate;
    }

    
    @Column(name="doner_available", length=45)
    public String getDonerAvailable() {
        return this.donerAvailable;
    }
    
    public void setDonerAvailable(String donerAvailable) {
        this.donerAvailable = donerAvailable;
    }

    
    @Column(name="doner_status", length=45)
    public String getDonerStatus() {
        return this.donerStatus;
    }
    
    public void setDonerStatus(String donerStatus) {
        this.donerStatus = donerStatus;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="doner")
    public Set<PationHasDoner> getPationHasDoners() {
        return this.pationHasDoners;
    }
    
    public void setPationHasDoners(Set<PationHasDoner> pationHasDoners) {
        this.pationHasDoners = pationHasDoners;
    }




}


