package datatypes;


/**
 * Class to hold data for the names of people.
 * 
 * @author Jonathan McFadden (mcfadden@auburn.edu)
 * @version 1.0
 */
public class HumanName {
	
// CLASS VARIABLES
	/** String to hold the person's first name. */
	private String myFirstName;
	
	/** String to hold the person's middle name. */
	private String myMiddleName;
	
	/** String to hold the person's last name. */
	private String myLastName;
	
//	/** String to hold the person's name prefix. */
//	private String myPrefix;
//	
//	/** String to hold the person's name suffix. */
//	private String mySuffix;
	
	
// CONSTRUCTOR(S)
	/**
	 * Creates an instance of this class to store the name of someone without a middle name.
	 * 
	 * @param theFirstName the first name of the person's name represented by this class.
	 * @param theLastName the last name of the person's name represented by this class.
	 */
	public HumanName(final String theFirstName, final String theLastName) {
		myFirstName = theFirstName;
		myLastName = theLastName;
		myMiddleName = "";
	}
	
	/**
	 * Creates an instance of this class to store the name of someone with a middle name.
	 * 
	 * @param theFirstName the first name of the person's name represented by this class.
	 * @param theMiddleName the middle name of the person's name represented by this class.
	 * @param theLastName the last name of the person's name represented by this class.
	 */
	public HumanName(final String theFirstName, final String theMiddleName, final String theLastName) {
		myFirstName = theFirstName;
		myMiddleName = theMiddleName;
		myLastName = theLastName;
	}
	

// PUBLIC METHODS
	/**
	 * Method to change the first name.
	 * 
	 * @param theFirstName the new first name to be used.
	 */
	public void setFirstName(final String theFirstName) {
		myFirstName = theFirstName;
	} // END OF setFirstName() METHOD
	
	/**
	 * Method to get the first name.
	 * 
	 * @return myFirstName
	 */
	public String getFristName() {
		final String aFristName = myFirstName;
		return aFristName;
	} // END OF getFirstName() METHOD
	
	/**
	 * Method to change the middle name.
	 * 
	 * @param theMiddleName the middle name to be used.
	 */
	public void setMiddleName(final String theMiddleName) {
		myMiddleName = theMiddleName;
	} // END OF setMiddleName() METHOD
	
	/**
	 * Method to get the middle name.
	 * 
	 * @return myMiddleName
	 */
	public String getMiddleName() {
		final String aMiddleName = myMiddleName;
		return aMiddleName;
	} // END OF getMiddleName() METHOD
	
	/**
	 * Method to change the last name.
	 * 
	 * @param theLastName the new last name to be used.
	 */
	public void setLastName(final String theLastName) {
		myLastName = theLastName;
	} // END OF setLastName() METHOD
	
	/**
	 * Method to get the last name.
	 * 
	 * @return myLastName;
	 */
	public String getLastName() {
		final String aLastName = myLastName;
		return aLastName;
	} // END OF getLastName() METHOD
	
	/**
	 * Method to return the entire name (first + middle + last)
	 * 
	 * @return aWholeName the entire name
	 */
	public String getWholeName() {
		StringBuilder aWholeName = new StringBuilder(); 
		
		aWholeName.append(myFirstName);
		aWholeName.append(" ");
		aWholeName.append(myMiddleName);
		aWholeName.append(" ");
		aWholeName.append(myLastName);
		
		if (myMiddleName.equals("") || myMiddleName.equals(" ")) {
			aWholeName = new StringBuilder();
			
			aWholeName.append(myFirstName);
			aWholeName.append(" ");
			aWholeName.append(myLastName);
		} 
		
		final String aWholeNameOUT = aWholeName.toString();
		return aWholeNameOUT;
	} // END OF getWholeName() METHOD
	
	/**
	 * Method to return the entire name, starting with the last name (last, first + middle)
	 *  
	 * @return aWholeNameOUT the entire name, starting with the last name
	 */
	public String getRevWholeName() {
		StringBuilder aWholeName = new StringBuilder();
		
		aWholeName.append(myLastName);
		aWholeName.append(", ");
		aWholeName.append(myFirstName);
		aWholeName.append(" ");
		
		if (!myMiddleName.equals("") && !myMiddleName.equals(" ")) {
			aWholeName.append(" ");
			aWholeName.append(myMiddleName);
		}
		
		final String aWholeNameOUT = aWholeName.toString();
		return aWholeNameOUT;
	} // END OF getRevWholeName() METHOD
	
} // END OF HumanName CLASS
