package com.adnabu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.sopify.tests.BaseTest;

public class Myshopify_Scenario extends BaseTest  {
	String SearchTextField="//input[@class='search-header__input search__input']";
	String SearchClick = "//div[@class='site-header__search site-header__icon']";
	String SearchClickXpath = "//form[@class='search search-bar__form']/button";
	String SearchBarXpath = "//input[@id='SearchInput']";
	String SearchSubmitXpath = "//button[@id='SearchResultSubmit']";
	String CataLog_Xpath = "//ul[@id='SiteNav']/li[2]/a";
	String SelectfilterXpath = "//select[@id='FilterTags']";
	String AddTocartbuttonXpath="//button[@name='add']";
	String CartbuttonXpath="//div[@class='site-header__icons-wrapper']/a[2]";

	public void getLunchUrl() {
		Lunch_Url();
		Wait_ByImplicitly(10);
	}

	public void getsearchData(String Searcheddata) {
		//Product Search
		Click_ByXpath(SearchClick);
		sendkeysdata_Xpath(SearchTextField, Searcheddata);
		enterdataxpath(SearchTextField);
		sendkeysdata_Xpath(SearchBarXpath, Searcheddata);
		Click_ByXpath(SearchSubmitXpath);
	}
	public void getfilterhData() {
		//Filtering
		Click_ByXpath(CataLog_Xpath);
		selectindex(SelectfilterXpath, 3);


	}
	public void aDDTOCart() {
		List<WebElement> element1=driver.findElements(By.xpath("//div[@id='Collection']/ul[1]/li"));
		try
		{
			for(int i=1;i<=element1.size();i++)
			{
				driver.findElement(By.xpath("//div[@id='Collection']/ul[1]/li["+i+"]")).click();
				
				Click_ByXpath(AddTocartbuttonXpath);
				driver.navigate().back();
			}
			
		}
		catch(Exception ex)
		{
			
		}
	}
	public void removeproduct() {
		Click_ByXpath(CartbuttonXpath);
		List<WebElement>element2=driver.findElements(By.xpath("//form[@action='/cart']/table/tbody/descendant::p/a"));
		for(int i=1;i<element2.size();i++) {
			driver.findElement(By.xpath("//form[@action='/cart']/table/tbody/descendant::p["+i+"]/a")).click();
		}
	}

}
