package grafos2;

import java.io.Serializable;
import java.util.Map;

import org.jgrapht.io.Attribute;

/**
 *This class will construct a standard vertex.
 *
 * @author Abel Antunes
 * @author José Guilherme
 * @author Mariana Nascimento
 * @author Siuanny Barbosa
 */

public class DefaultVertex implements Serializable {

	private static final long serialVersionUID = 1;

	private Object id;
	private Map<String, Attribute> att;
	
	/**
	 * This is the class constructor, where the variables id and att will be assigned.
	 * 
	 * @param id
	 * @param att
	 */
	public DefaultVertex(Object id, Map<String, Attribute> att) {
		this.id = id;
		this.att = att;
	}
	
	/**
	 * Method that returns the id.
	 */
	public Object getId() {
		return id;
	}
	
	/**
	 * Method that returns the att toString.
	 */
	public String getAtt() {
		return att.toString();
	}
	
	/**
	 * Method that defines a new value for att.
	 */
	public void setAtt(Map<String, Attribute> att) {
		this.att = att;
	}
	
	/**
	 * Method that returns the att label.
	 */
	public String getLabel() {
		return (att.get("label")).toString();
	}
	
	/**
	 * Output class text.
	 */
	public String toString() {
		return (att.get("label")).toString();
	}
	
	/**
	 * A method that compares if an exterior vertex is equal to the vertex in question.
	 * @param v
	 * 
	 * Auxiliary Variable
	 * 
	 * @return
	 * Returns True if they are equal and False if they are different.
	 * 
	 */
	public boolean equals(DefaultVertex v) {
		return this.id.equals(v.id);
	}
	
}
