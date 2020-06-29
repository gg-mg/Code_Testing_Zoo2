package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Animal;

public class TestAnimal {

	/*
	 * Write Test ARRANGE ACT ASSERT Make the test compile Watch the test fail Do
	 * just enough to make all tests pass Refactor and generalise
	 */
	Animal animal;
	List<String> names;
	List<String> invalidNames;
	Scanner scanner;

	@Before
	public void setupTests() {
		animal = new Animal();
		names = new ArrayList<String>();
		names.add("Panda");
		names.add("Kangaroo");
		names.add("Elephant");
		invalidNames = new ArrayList<String>();
		invalidNames.add("Dog");
		invalidNames.add("Fish");
		invalidNames.add("Potato");
		scanner = new Scanner(System.in);
	}

	@Test
	public void test_checkIfAnimalIsOrganic() {
		// Arrange
		animal.setOrganicNature(true);

		// Act
		boolean isOrganic = animal.getOrganicNature();

		// Assert
		assertTrue(isOrganic);
	}

	@Test
	public void test_checkIfAnimalIsInorganic() {
		// Arrange
		animal.setOrganicNature(false);

		// Act
		boolean isOrganic = animal.getOrganicNature();

		// Assert
		assertFalse(isOrganic);
	}

	@Test
	public void test_checkIfAnimalHasProperName() {
		// Arrange
		animal.setName("Lion");
		// Act
		String name = animal.getName();
		// Assert
		assertEquals("Lion", name);
	}
	
	@Test
	public void test_animalHasValidName()
	{
		for (String name : names)
		{
			animal.setName(name);
			assertEquals(name, animal.getName());
		}
		for (String name : invalidNames)
		{
			animal.setName(name);
			assertEquals("Invalid Name", animal.getName());
		}
	}
	
	@After
	public void shutDown()
	{
		names = null;
		invalidNames = null;
		scanner.close();
	}
}
