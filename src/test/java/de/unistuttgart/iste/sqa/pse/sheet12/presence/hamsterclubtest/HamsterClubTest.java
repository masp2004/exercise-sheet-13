package de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclubtest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub.Club;
import de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub.ClubMember;
import de.unistuttgart.iste.sqa.pse.sheet12.presence.hamsterclub.HamsterClub;

public final class HamsterClubTest {

	private Club club;

	@Before
	public void setUp() {
		final ArrayList<ClubMember> members = new ArrayList<>();

		ClubMember c = new ClubMember("c", 10, 7.0, false);
		members.add(c);
		ClubMember b = new ClubMember("b", 23, 30.0, true);
		members.add(b);
		ClubMember a = new ClubMember("a", 90, 10.0, true);
		members.add(a);
		ClubMember e = new ClubMember("e", 90, 50.0, false);
		members.add(e);
		ClubMember d = new ClubMember("d", 40, 40.0, true);
		members.add(d);
		ClubMember f = new ClubMember("f", 55, 100.0, false);
		members.add(f);

		this.club = new HamsterClub(members);
	}

	@Test
	public void testGetNameOfMembers() {
		final ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
		assertEquals(expected, club.getNameOfMembers());
	}

	@Test
	public void testGetTotalContributions() {
		final double expected = 237.0;
		final double epsilon = 0.0001;
		assertEquals(expected, club.getTotalContributions(), epsilon);
	}

	@Test
	public void testApplyDiscount() {
		final ArrayList<ClubMember> list = new ArrayList<>(club.getMembers());
		final Double[] expected = new Double[] { list.get(2).getContributions() * 9 / 10,
				list.get(3).getContributions() * 9 / 10 };
		club.applyDiscount();
		final Double[] actual = new Double[] { list.get(2).getContributions(), list.get(3).getContributions() };
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testGetMembersWithUnpaidFees() {
		final ArrayList<ClubMember> expected = new ArrayList<>();
		expected.add(club.getMembers().get(0));
		expected.add(club.getMembers().get(3));
		expected.add(club.getMembers().get(5));
		assertEquals(expected, club.getMembersWithUnpaidFees());
	}

	@Test
	public void testGetOldestMember() {
		final ClubMember expected = club.getMembers().get(2);
		assertEquals(expected, club.getOldestMember());
	}
}
