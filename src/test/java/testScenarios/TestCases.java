package testScenarios;

import org.junit.Test;

import pageObjects.Login;

public class TestCases extends Login
{
	@Test
	public void bookBusTicketAndPrint()
	{
		System.out.println("Test Case : BookBusTicketAndPrint ");
		//launch , login , bookBusTicket , Print , logout , close
		launchApplication();
		loginToApplication();
		//book
		//print
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void bookBusTicketAndCancel()
	{
		System.out.println("Test Case : BookBusTicketAndCancel ");
		launchApplication();
		loginToApplication();
		//book
		//cancel
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void bookBusTicketAndCheckStatus()
	{
		System.out.println("Test Case : BookBusTicketAndCheckStatus ");
		launchApplication();
		loginToApplication();
		//book
		//check status
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void bookBusTicketAndTrackService()
	{
		System.out.println("Test Case : BookBusTicketAndTrackService ");
		launchApplication();
		loginToApplication();
		//book
		//track service
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void bookBusTicketCheckStatusAndPrint()
	{
		System.out.println("Test Case : BookBusTicketCheckStatusAndPrint ");
		launchApplication();
		loginToApplication();
		//book
		//check status
		//print
		logoutFromApplication();
		closeApplication();
	}

}
