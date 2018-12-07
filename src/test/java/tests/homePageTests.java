package tests;

import org.testng.annotations.Test;

import Pages.homePage;
import core.BaseClass;

public class homePageTests extends BaseClass {

	@Test
	public void searchDestination(){
		homePage hp = new homePage();
		hp.search();
	}
}
