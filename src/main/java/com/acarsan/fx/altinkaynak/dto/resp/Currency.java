package com.acarsan.fx.altinkaynak.dto.resp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name = "Kur")
public class Currency {

    String code;
    String desc;
    BigDecimal buying;
    BigDecimal selling;
    String timestamp;

    @XmlElement(name = "Kod")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement(name = "Aciklama")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @XmlElement(name = "Alis")
    public BigDecimal getBuying() {
        return buying;
    }

    public void setBuying(BigDecimal buying) {
        this.buying = buying;
    }

    @XmlElement(name = "Satis")
    public BigDecimal getSelling() {
        return selling;
    }

    public void setSelling(BigDecimal selling) {
        this.selling = selling;
    }

    @XmlElement(name = "GuncellenmeZamani")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", buying=" + buying +
                ", selling=" + selling +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
