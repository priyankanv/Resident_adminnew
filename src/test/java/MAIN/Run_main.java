package MAIN;

import BL_TC_02.Site_members;
import BL_TC_03.biolabs_site_staff;
import BL_TC_04.Site_Companies;
import BL_TC_05.SiteComLearnMore;
import BL_TC_06.Profile;
import BL_TC_07.AdditionalInformation;
import BL_TC_08.companyprofilepage;
import BL_TC_09.OnboardingInformation;
import BL_TC_10.InvoicePage;
import BL_TC_11.ChangeRequest;
import Browser.Browser_launch;
import Login_page.LoginPage;
import dashboard.BL_TC_01;

public class Run_main {

	public static void main(String[] args) throws Exception {

		Browser_launch.chrome_browser();
		LoginPage.pagelogin();
		//BL_TC_01.Dashboard();//BL_TC_01
		//Site_members.sitemembers();//BL_TC_02
		//biolabs_site_staff.ResidentStaff();//BL_TC_03
		//Site_Companies.sitecompanies();//BL_TC_04
		//SiteComLearnMore.LearnMore();//BL_TC_05
		//Profile.myprofile();//BL_TC_06
		AdditionalInformation.onboardinginformation();//BL_TC_07
		//companyprofilepage.CompanyInformation();//BL_TC_08
		//OnboardingInformation.onboarding();//BL_TC_09
		//InvoicePage.invoice();//BL_TC_10
		//ChangeRequest.change();//BL_TC_11
	
	
	}               

}
