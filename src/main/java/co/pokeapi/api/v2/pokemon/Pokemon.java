//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.08 a las 03:07:47 PM CST 
//


package co.pokeapi.api.v2.pokemon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pokemon complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pokemon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="base_experience" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="is_default" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="location_area_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="abilities" type="{http://pokeapi.co/api/v2/pokemon}abilities" maxOccurs="unbounded"/&gt;
 *         &lt;element name="held_items" type="{http://pokeapi.co/api/v2/pokemon}held_items" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokemon", propOrder = {
    "name",
    "id",
    "order",
    "baseExperience",
    "height",
    "weight",
    "isDefault",
    "locationAreaEncounters",
    "abilities",
    "heldItems"
})
public class Pokemon {

    @XmlElement(required = true)
    protected String name;
    protected int id;
    protected int order;
    @XmlElement(name = "base_experience")
    protected int baseExperience;
    protected int height;
    protected int weight;
    @XmlElement(name = "is_default")
    protected boolean isDefault;
    @XmlElement(name = "location_area_encounters", required = true)
    protected String locationAreaEncounters;
    @XmlElement(required = true)
    protected List<Abilities> abilities;
    @XmlElement(name = "held_items")
    protected List<HeldItems> heldItems;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad baseExperience.
     * 
     */
    public int getBaseExperience() {
        return baseExperience;
    }

    /**
     * Define el valor de la propiedad baseExperience.
     * 
     */
    public void setBaseExperience(int value) {
        this.baseExperience = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad weight.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Define el valor de la propiedad weight.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

    /**
     * Obtiene el valor de la propiedad isDefault.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Define el valor de la propiedad isDefault.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad locationAreaEncounters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Define el valor de la propiedad locationAreaEncounters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAreaEncounters(String value) {
        this.locationAreaEncounters = value;
    }

    /**
     * Gets the value of the abilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abilities }
     * 
     * 
     */
    public List<Abilities> getAbilities() {
        if (abilities == null) {
            abilities = new ArrayList<Abilities>();
        }
        return this.abilities;
    }

    /**
     * Gets the value of the heldItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heldItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeldItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeldItems }
     * 
     * 
     */
    public List<HeldItems> getHeldItems() {
        if (heldItems == null) {
            heldItems = new ArrayList<HeldItems>();
        }
        return this.heldItems;
    }

}
