//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.02 at 03:34:01 PM MST 
//


package gov.loc.mods.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>baseDateType">
 *       &lt;attribute name="keyDate" type="{http://www.loc.gov/mods/v3}yes" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateType")
public class DateType
    extends BaseDateType
{

    @XmlAttribute
    protected Yes keyDate;

    /**
     * Gets the value of the keyDate property.
     * 
     * @return
     *     possible object is
     *     {@link Yes }
     *     
     */
    public Yes getKeyDate() {
        return keyDate;
    }

    /**
     * Sets the value of the keyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Yes }
     *     
     */
    public void setKeyDate(Yes value) {
        this.keyDate = value;
    }

}
