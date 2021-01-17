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
		
		ClubMember c = new ClubMember("c", 10, 7, true);
		members.add(c);
				
		ClubMember b = new ClubMember("b", 10, 50, true);
		members.add(b);
		
		ClubMember a = new ClubMember("a", 70, 10, true);
		members.add(a);
		
		ClubMember e = new ClubMember("e", 90, 12, true);
		members.add(e);
		
		ClubMember d = new ClubMember("d", 10, 5, true);
		members.add(d);
				
		ClubMember f = new ClubMember("f", 10, 100, true);
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
		int expected = 184;
		
		assertEquals(expected, club.getTotalContributions());
		
	}
	
	@Test
	public void testApplyDiscount(){
		ArrayList<ClubMember> list = new ArrayList<>(club.getMembers());
		Integer[] expected = new Integer[] {9,100};						
				
		club.applyDiscount();
				 
		Integer[] actual = new Integer[] {list.get(0).getContributions(), list.get(4).getContributions()};

		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void testGetOldestMember(){
		ClubMember expected = club.getMembers().get(4);
		
		assertEquals(expected, club.getOldestMember());
	}
	
	
}
