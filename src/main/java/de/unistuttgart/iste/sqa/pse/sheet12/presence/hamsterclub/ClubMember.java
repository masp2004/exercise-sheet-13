package de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub;

/**
 * This class models an individual member of a club. 
 * @see de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub.HamsterClub
 */
public final class ClubMember implements Comparable<ClubMember> {
	
	private String name;
	private int age;
	private double contributions;
	private boolean hasPaidFees;
	
	/*@
	  @ requires name != null && age >= 0 && contributions >= 0;
 	  @*/
	/**
	 * Constructor of a club member.
	 * @param name
	 * @param age
	 * @param contributions
	 * @param hasPaidFees
	 * @throws IllegalArgumentException if name is {@code null} or the any of age and contributions is negative.
	 */
	public ClubMember(final String name, final int age, final double contributions, final boolean hasPaidFees) 
		throws IllegalArgumentException {
		if(name == null || age < 0 ||contributions < 0){
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.age = age;
		this.contributions = contributions;
		this.hasPaidFees = hasPaidFees;
	}
	
	/**
	 * Checks if the speficied object equals the club member on which it is called.
	 */
	@Override
	public boolean equals(final Object object) { 
		  
        if (object == this) { 
            return true; 
        } 
          
        if (!(object instanceof ClubMember)) { 
            return false; 
        } 
          
        ClubMember member = (ClubMember) object; 
          
        return member.getName().equals(name) &&
        	   member.getAge() == age &&
        	   member.getContributions() == contributions &&
        	   member.getHasPaidContributions() == hasPaidFees; 
    } 
 
	/**
	 * Overridden compareTo method for use with clubMemberComparator. It compares members based on their age.
	 */
	@Override
	public int compareTo(final ClubMember otherMember) {
		return this.age - otherMember.getAge();
	}
		
	public /*@ pure @*/ String getName() {
		return name;
	}
	
	/*@
	  @ requires name != null;
	  @*/
	public void setName(final String name) {
		if(name != null){
			throw new IllegalArgumentException();	
		}
		this.name = name;
	}
	public /*@ pure @*/ int getAge() {
		return age;
	}
	
	/*@
	  @ requires age > 0;
	  @*/
	public void setAge(final int age) {
		if(age <= 0){
			throw new IllegalArgumentException();	
		}
		this.age = age;
	}
	
	public /*@ pure @*/ double getContributions() {
		return contributions;
	}
	
	/*@
	  @ requires contributions >= 0;
	  @*/
	public void setContributions(final double contributions) {
		if(contributions < 0){
			throw new IllegalArgumentException();
		}
		this.contributions = contributions;
	}
	
	public /*@ pure @*/ boolean getHasPaidContributions() {
		return hasPaidFees;
	}
	
	public void setHasPaidContributions(final boolean hasPaidFees) {
		this.hasPaidFees = hasPaidFees;
	}

	
	
	

}
