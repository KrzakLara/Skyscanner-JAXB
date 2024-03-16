package Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class Carriers {
    @XmlElement(name = "status")
    private String status;

    @XmlElement(name = "carriers")
    private CarrierList carrierList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CarrierList getCarrierList() {
        return carrierList;
    }

    public void setCarrierList(CarrierList carrierList) {
        this.carrierList = carrierList;
    }
}

@XmlAccessorType(XmlAccessType.FIELD)
class CarrierList {
    @XmlElement(name = "carrier")
    private List<Carrier> carriers;

    public List<Carrier> getCarriers() {
        return carriers;
    }

    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }
}
