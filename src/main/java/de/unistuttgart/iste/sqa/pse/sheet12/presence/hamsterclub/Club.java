package de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Club Interface providing methods to process a list of club members  .
 */
public interface Club {
	/*@  
	  @ ensures The result contains the names of all members sorted alphabetically;
	  @*/
	/**
	 * Maps the names of all members to a new list of alphabetically sorted Strings.
	 * 
	 * @return an alphabetically sorted list of the names of all members
	 */
	public /*@ pure @*/ List<String> getNameOfMembers();
	
	
	/*@  
	  @ ensures The result is the sum of all contributions across all members;
	  @*/
	/**
	 * Totals the amount of contributions this club can expect.
	 * 
	 * @return the sum of total contributions across all members
	 */
	public /*@ pure @*/ double getTotalContributions();
	
	
	/*@  
	  @ ensures The contributions of all members above the specified age was reduced by the specific amount;
	  @*/
	/**
	 * Applies a discount to all members above a certain age. 
	 * Calling this method multiple times will provide a stacking discount.
	 */
	public void applyDiscount();
	
	
	/*@  
	  @ ensures The result contains all members with unpaid membership fees;
	  @*/
	/**
	 * Filters the list of members for those that have not payed their membership-fees yet.
	 * 
	 * @return list of all members with outstanding fees
	 */
	public /*@ pure @*/ List<ClubMember> getMembersWithUnpaidFees();
	
	
	/*@  
	  @ ensures The result is the club member with the highest age value;
	  @ ensures If two or more members share the highest age value,
	  @         the member with the alphabetically highest ranking name is returned;   
	  @*/
	/**
	 * Searches the List of members for the oldest individual, alphabetical order acts as a tie-breaker.
	 * 
	 * @throws NoSuchElementException if there is no oldest member 
	 * @return oldest member of this club
	 */
	public /*@ pure @*/ ClubMember getOldestMember();
	
	
	/*@  
	  @ ensures The result is the exact list of member objects of this club;
	  @*/
	/**
	 * Getter method for the member field.
	 * 
	 * @return a list containing the members of this club
	 */
	public /*@ pure @*/ List<ClubMember> getMembers();
	
}
