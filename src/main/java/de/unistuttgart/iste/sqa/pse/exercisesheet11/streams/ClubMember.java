package de.unistuttgart.iste.sqa.pse.exercisesheet11.streams;

/**
 * Individual member of a Club. 
 * @see {@link de.unistuttgart.iste.sqa.pse.exercisesheet11.streams.Club}
 * 
 */
public class ClubMember {
	
	private String name;
	private int age;
	private int contributions;
	private boolean hasPaidFees;
	
	public ClubMember(String name, int age, int contributions, boolean hasPaidFees) {
		this.name = name;
		this.age = age;
		this.contributions = contributions;
		this.hasPaidFees = hasPaidFees;
	}
	
	/**
	 * Overridden equals method to enable proper comparisons
	 */
	@Override
	public boolean equals(Object obj) { 
		  
        if (obj == this) { 
            return true; 
        } 
          
        if (!(obj instanceof ClubMember)) { 
            return false; 
        } 
          
        ClubMember member = (ClubMember) obj; 
          
        return member.getName().equals(this.getName()) &&
        	   member.getAge() == this.getAge() &&
        	   member.getContributions() == this.getContributions() &&
        	   member.getHasPayedContributions() == this.getHasPayedContributions(); 
    } 
 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getContributions() {
		return contributions;
	}
	public void setContributions(int contributions) {
		this.contributions = contributions;
	}
	public boolean getHasPayedContributions() {
		return hasPaidFees;
	}
	public void setHasPayedContributions(boolean hasPaidFees) {
		this.hasPaidFees = hasPaidFees;
	}
	
	

}
