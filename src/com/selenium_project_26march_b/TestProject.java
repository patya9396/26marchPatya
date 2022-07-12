package com.selenium_project_26march_b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.linkedin.com/in/velocity-corporate-training-center-70073817a");
        driver.get("https://www.linkedin.com/signup/public-profile-join?vieweeVanityName=velocity-corporate-training-center-70073817a&trk=public_profile_top-card-primary-button-join-to-connect");
        driver.get("https://www.linkedin.com/legal/privacy-policy?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fin%2Fvelocity-corporate-training-center-70073817a%3Ftrk%3Dpublic-profile-join-page&amp;amp;trk=registration-frontend_join-form-privacy-policy&amp;trk=registration-frontend_join-form-privacy-policy");
        driver.get("https://www.linkedin.com/legal/cookie-policy?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fin%2Fvelocity-corporate-training-center-70073817a%3Ftrk%3Dpublic-profile-join-page&amp;amp;trk=registration-frontend_join-form-cookie-policy&amp;trk=registration-frontend_join-form-cookie-policy");
        driver.get("https://www.linkedin.com/signup/public-profile-join?vieweeVanityName=velocity-corporate-training-center-70073817a&trk=public_profile_bottom-cta-banner");
        driver.get("https://in.linkedin.com/in/laxman-sapkale-8b388622a?trk=public_profile_browsemap");
        driver.get("https://in.linkedin.com/in/laxman-sapkale-8b388622a?trk=public_profile_browsemap");
        driver.get("https://in.linkedin.com/in/laxman-sapkale-8b388622a?trk=public_profile_browsemap");
        driver.get("https://in.linkedin.com/in/shubham-sontakke-746281226?trk=public_profile_browsemap");
        driver.get("https://in.linkedin.com/in/sagar-patil-0436051b4?trk=public_profile_browsemap");


    }
}
