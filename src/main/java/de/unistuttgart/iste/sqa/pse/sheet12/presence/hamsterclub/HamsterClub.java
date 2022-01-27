package de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub;

import java.util.Comparator;
import java.util.List;

/**
 * Write a description for your HamsterClub class.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class HamsterClub implements Club {

	private final List<ClubMember> members;
	private final Comparator<ClubMember> clubMemberComparator;
	
	public HamsterClub(final List<ClubMember> members) throws IllegalArgumentException {
		if(members == null) {
			throw new IllegalArgumentException();
		}
		this.members = members;
		this.clubMemberComparator = generateComparator();
	}
	
	
	
	@Override
	public List<String> getNameOfMembers() {
		// TODO: implement
		return null;
	}

	@Override
	public double getTotalContributions() {
		// TODO: implement
		return 0.0;
	}

	@Override
	public void applyDiscount() {
		// TODO: implement
	}

	@Override
	public List<ClubMember> getMembersWithUnpaidFees() {
		// TODO: implement
		return null;
	}

	/**
	 * implement your Comparator here
	 */
	private Comparator<ClubMember> generateComparator() {
		// TODO: implement
		return null;
	}

	@Override
	public ClubMember getOldestMember() {
		// TODO: implement
		return null;
	}
	
	@Override
	public List<ClubMember> getMembers(){
		return members;
	}

}
