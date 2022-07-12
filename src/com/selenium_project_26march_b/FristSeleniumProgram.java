package com.selenium_project_26march_b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristSeleniumProgram {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.in/");
        driver.get("https://www.amazon.in/Waterproof-Metallic-Silver-Car-Cover/dp/B07WLYG7GT?ref_=Oct_d_orecs_d_5257502031&pd_rd_w=uTb8h&pf_rd_p=621e1bcb-8a01-4ac0-9db2-263e5798bda1&pf_rd_r=6H2ZFFDPQQZDH5RKMM49&pd_rd_r=4c5c581e-71e9-4e49-a223-85d2ffc82058&pd_rd_wg=EDzoy&pd_rd_i=B07WLYG7GT");
        driver.get("https://www.amazon.in/Waterproof-Metallic-Silver-Car-Cover/dp/B07WLYG7GT?ref_=Oct_d_orecs_d_5257502031&pd_rd_w=uTb8h&pf_rd_p=621e1bcb-8a01-4ac0-9db2-263e5798bda1&pf_rd_r=6H2ZFFDPQQZDH5RKMM49&pd_rd_r=4c5c581e-71e9-4e49-a223-85d2ffc82058&pd_rd_wg=EDzoy&pd_rd_i=B07WLYG7GT");
        driver.get("https://www.amazon.in/amazon-business-to-business/b/ref=amb_link_2?ie=UTF8&node=11476704031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=product-alert&pf_rd_r=JSRVZ0NXHYQV3R6723RJ&pf_rd_r=JSRVZ0NXHYQV3R6723RJ&pf_rd_t=201&pf_rd_p=3bec99c3-4257-44fd-afaa-9737ca2a9ae8&pf_rd_p=3bec99c3-4257-44fd-afaa-9737ca2a9ae8&pf_rd_i=B07WLYG7GT");
        driver.get("https://www.amazon.in/stores/FABTEC/page/C2B3B089-CDEB-424F-A9EF-7E072967B49E?ref_=ast_bln");
        driver.get("https://www.amazon.in/stores/page/6026F0E5-0855-4DD0-9180-6D744F6B9C16?ingress=2&visitId=215eafbd-0c8a-49cd-9874-71931641325d&ref_=ast_bln");
        driver.get("https://www.amazon.in/stores/page/C9E92E65-DDC4-4B96-8672-444F4977B2E0?ingress=2&visitId=215eafbd-0c8a-49cd-9874-71931641325d&ref_=ast_bln");
        driver.get("https://www.amazon.in/Waterproof-Compatible-Maruti-Baleno-Stitched/dp/B09FGNM2X5?ref_=ast_sto_dp");


    }

}
