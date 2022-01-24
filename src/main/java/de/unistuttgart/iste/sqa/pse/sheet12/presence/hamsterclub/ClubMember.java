package de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub;

/**
 * Individual member of a Club. 
 * @see de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub.HamsterClub
 * 
 */
public class ClubMember implements Comparable<ClubMember> {
	
	private String name;
	private int age;
	private double contributions;
	private boolean hasPaidFees;
	
	/*@
	  @ requires name != null;
	  @ requires contributions >= 0;
 	  @*/
	/**
	 * Constructor of a club member.
	 * @param name
	 * @param age
	 * @param contributions
	 * @param hasPaidFees
	 * @throws IllegalArgumentException if name is {@code null} or the contributions are negative.
	 */
	public ClubMember(final String name, final int age, final double contributions, final boolean hasPaidFees) 
		throws IllegalArgumentException {
		if(name == null || contributions < 0){
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.age = age;
		this.contributions = contributions;
		this.hasPaidFees = hasPaidFees;
	}
	
	/**
	 * Overridden equals method to enable proper comparisons
	 */
	@Override
	public boolean equals(final Object obj) { 
		  
        if (obj == this) { 
            return true; 
        } 
          
        if (!(obj instanceof ClubMember)) { 
            return false; 
        } 
          
        ClubMember member = (ClubMember) obj; 
          
        return member.getName().equals(name) &&
        	   member.getAge() == age &&
        	   member.getContributions() == contributions &&
        	   member.getHasPaidContributions() == hasPaidFees; 
    } 
 
	/**
	 * Overridden compareTo method for use with clubMemberComparator
	 */
	@Override
	public int compareTo(final ClubMember arg0) {
		return this.age - arg0.getAge();
	}
		
	public /*@ pure @*/ String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public /*@ pure @*/ int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public /*@ pure @*/ double getContributions() {
		return contributions;
	}
	public void setContributions(Double contributions) {
		this.contributions = contributions;
	}
	public /*@ pure @*/ boolean getHasPaidContributions() {
		return hasPaidFees;
	}
	public void setHasPaidContributions(boolean hasPaidFees) {
		this.hasPaidFees = hasPaidFees;
	}

	
	
	

}
