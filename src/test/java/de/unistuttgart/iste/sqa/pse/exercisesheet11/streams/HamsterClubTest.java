package de.unistuttgart.iste.sqa.pse.exercisesheet11.streams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class HamsterClubTest {

	private Club club;
	
	@Before
	public void setUp() {
		ArrayList<ClubMember> members = new ArrayList<>();
		
		ClubMember c = new ClubMember("c", 10, 7, false);
		members.add(c);
				
		ClubMember b = new ClubMember("b", 23, 30, true);
		members.add(b);
		
		ClubMember a = new ClubMember("a", 70, 10, true);
		members.add(a);
		
		ClubMember e = new ClubMember("e", 90, 50, false);
		members.add(e);
		
		ClubMember d = new ClubMember("d", 40, 40, true);
		members.add(d);
				
		ClubMember f = new ClubMember("f", 55, 100, false);
		members.add(f);
		
		this.club = new HamsterClub(members);
	}
	
	@Test
	public void testGetNameOfMembers(){
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
		
		assertEquals(expected, club.getNameOfMembers());
	}
	
	@Test
	public void testGetTotalContributions(){
		int expected = 237;
		
		assertEquals(expected, club.getTotalContributions());
		
	}
	
	@Test
	public void testApplyDiscount(){
		ArrayList<ClubMember> list = new ArrayList<>(club.getMembers());
		Integer[] expected = new Integer[] {9,45};						
				
		club.applyDiscount();
				 
		Integer[] actual = new Integer[] {list.get(2).getContributions(), list.get(3).getContributions()};

		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void testGetMembersWithUnpaidFees(){
		ArrayList<ClubMember> expected = new ArrayList<>();
		expected.add(club.getMembers().get(0));
		expected.add(club.getMembers().get(3));
		expected.add(club.getMembers().get(5));
		
		assertEquals(expected, club.getMembersWithUnpaidFees());
	}
	
	
	
	@Test
	public void testGetOldestMember(){
		ClubMember expected = club.getMembers().get(3);
		
		assertEquals(expected, club.getOldestMember());
	}
	
	
}
