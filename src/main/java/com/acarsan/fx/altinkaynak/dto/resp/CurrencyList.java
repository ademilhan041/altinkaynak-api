package com.acarsan.fx.altinkaynak.dto.resp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Kurlar")
public class CurrencyList {

    List<Currency> currList;

    @XmlElement(name = "Kur")
    public List<Currency> getCurrList() {
        return currList;
    }

    public void setCurrList(List<Currency> currList) {
        this.currList = currList;
    }

    @Override
    public String toString() {
        return "CurrencyList{" +
                "currList=" + currList +
                '}';
    }
}
