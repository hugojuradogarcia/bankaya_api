//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.08 a las 03:07:47 PM CST 
//


package co.pokeapi.api.v2.pokemon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abilities complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ability" type="{http://pokeapi.co/api/v2/pokemon}ability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abilities", propOrder = {
    "isHidden",
    "slot",
    "ability"
})
public class Abilities {

    @XmlElement(name = "is_hidden")
    protected boolean isHidden;
    protected int slot;
    protected Ability ability;

    /**
     * Obtiene el valor de la propiedad isHidden.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Define el valor de la propiedad isHidden.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     */
    public void setSlot(int value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad ability.
     * 
     * @return
     *     possible object is
     *     {@link Ability }
     *     
     */
    public Ability getAbility() {
        return ability;
    }

    /**
     * Define el valor de la propiedad ability.
     * 
     * @param value
     *     allowed object is
     *     {@link Ability }
     *     
     */
    public void setAbility(Ability value) {
        this.ability = value;
    }

}
