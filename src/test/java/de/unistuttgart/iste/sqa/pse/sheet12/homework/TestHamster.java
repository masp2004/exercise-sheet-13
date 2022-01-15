package de.unistuttgart.iste.sqa.pse.sheet12.homework;

import static org.junit.Assert.assertEquals;

import java.util.function.Consumer;

import org.junit.Before;
import org.junit.Test;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.datatypes.Size;
import de.hamstersimulator.objectsfirst.external.model.HamsterGame;
import de.hamstersimulator.objectsfirst.external.model.Territory;
import de.hamstersimulator.objectsfirst.external.model.TerritoryBuilder;
import de.hamstersimulator.objectsfirst.external.model.Hamster;


public class TestHamster {

	/**
	 * Size used in this test for both, colums and rows.
	 */
	private static final int TERRITORY_SIZE = 4;
	private HamsterGame game;

	@Before
	public void init() {
		game = new HamsterGame();

		final TerritoryBuilder territoryBuilder = game.getNewTerritoryBuilder();
		territoryBuilder.initializeTerritory(new Size(TERRITORY_SIZE, TERRITORY_SIZE));
		/* Configure hamster with position (0,0), direction, and number of grains */
		territoryBuilder.defaultHamsterAt(Location.ORIGIN, Direction.EAST, 0);

		/* Place a grain at position (1,0) */
		territoryBuilder.grainAt(Location.from(1, 0));

		game.initialize(territoryBuilder);
		game.startGame();
	}

	/**
	 * Test creating a territory via API.
	 */
	@Test
	public void testConfiguredHamsterOnTerritory() {
		Consumer<Territory> hamsterProgram = territory -> {
				final Hamster paule = territory.getDefaultHamster();
				assertEquals(new Size(TERRITORY_SIZE, TERRITORY_SIZE), territory.getTerritorySize());
				assertEquals(Location.ORIGIN, paule.getLocation());
				assertEquals(0, territory.getTotalGrainCount());
			};
		game.runGame(hamsterProgram);
	}

}