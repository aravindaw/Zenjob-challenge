package com.aravinda.app.Pages;

import java.util.List;
import java.util.Map;

import com.aravinda.app.scripts.StartDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserRegistrationPage extends StartDriver {
    private Map<String, String> data;
//    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "c24-search-header")
    @CacheLookup
    private WebElement _24241234089;

    @FindBy(css = "a[title='AGB Datenschutz Impressum']")
    @CacheLookup
    private WebElement agbDatenschutzImpressum;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement allInclusive1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement allInclusive2;

    @FindBy(css = "a[title='alle Kategorien']")
    @CacheLookup
    private WebElement alleKategorien;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement alleKategorien1;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(3)")
    @CacheLookup
    private WebElement alleKategorien2;

    @FindBy(css = "a.c24-subnav-sec-ele.c24-subnav-sec-ele-bottom-space")
    @CacheLookup
    private WebElement alleKategorien3;

    @FindBy(css = "a.c24-subnav-sec-ele.c24-subnav-sec-ele-sho-all")
    @CacheLookup
    private WebElement alleKategorien4;

    @FindBy(css = "a[href='//www.check24.de/handytarife/vergleich/?minutes_included=flatrate&tid2=sidenavi']")
    @CacheLookup
    private WebElement allnetFlatTarife1;

    @FindBy(css = "a[href='//www.check24.de/handytarife/vergleich/?minutes_included=flatrate&tid2=topnavi']")
    @CacheLookup
    private WebElement allnetFlatTarife2;

    @FindBy(css = "a[title='Anbieter mit Prämie']")
    @CacheLookup
    private WebElement anbieterMitPrmie;

    @FindBy(css = "#c24-customer-salutation a.c24-meinkonto-reflink.c24-meinkonto-login-link")
    @CacheLookup
    private WebElement anmelden1;

//    @FindBy(id = "c24-meinkonto-anmelden")
//    @CacheLookup
//    private WebElement anmelden1;
//
//    @FindBy(id = "c24-cl-user-prefill-btn")
//    @CacheLookup
//    private WebElement anmelden1;
//
//    @FindBy(id = "c24-cl-register-login")
//    @CacheLookup
//    private WebElement anmelden2;
//
//    @FindBy(id = "c24-cl-pw-btn")
//    @CacheLookup
//    private WebElement anmelden2;
//
//    @FindBy(css = "a.c24-button.c24-customer-login-opener")
//    @CacheLookup
//    private WebElement anmelden2;

    @FindBy(css = "#register div:nth-of-type(6) div:nth-of-type(1) a.c24-customer-login-opener")
    @CacheLookup
    private WebElement anmelden3;

    @FindBy(css = "a[title='Anschlussfinanzierung']")
    @CacheLookup
    private WebElement anschlussfinanzierung;

    @FindBy(css = "a[title='Auto']")
    @CacheLookup
    private WebElement auto;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement autokredit1;

    @FindBy(css = "#c24-fin li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement autokredit2;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(2) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement autokredit3;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(2) a.c24-navi-links-title")
    @CacheLookup
    private WebElement autoreifen1;

    @FindBy(css = "#c24-aut li:nth-of-type(1) a.c24-subnav-sec-ele")
    @CacheLookup
    private WebElement autoreifen2;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(1) a.c24-navi-links-title")
    @CacheLookup
    private WebElement autoteile1;

    @FindBy(css = "#c24-aut li:nth-of-type(2) a.c24-subnav-sec-ele")
    @CacheLookup
    private WebElement autoteile2;

    @FindBy(css = "#c24-sho li:nth-of-type(4) ul:nth-of-type(2) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement autoteile3;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement band1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) ul:nth-of-type(1) li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement band2;

    @FindBy(css = "#c24-mainnav-ele-bau a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement baufinanzierung1;

    @FindBy(css = "#c24-fin li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement baufinanzierung2;

    @FindBy(css = "a[title='Baufinanzierungsrechner']")
    @CacheLookup
    private WebElement baufinanzierungsrechner;

    @FindBy(css = "a[title='Beauty & Wellness']")
    @CacheLookup
    private WebElement beautyWellness;

    @FindBy(css = "#c24-mainnav-ele-tel div.c24-subnav.c24-subnav-tel div.c24-subnav-wrapper div:nth-of-type(2) a")
    @CacheLookup
    private WebElement beimDslTarifvergleichexklusiveCashbackssichern;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement ber1Millionangebote;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement ber1MillionhotelsWeltweit;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement berufsunfhigkeit;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement berufsunfhigkeitsversicherung;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement bewerbungsfotograf1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement bewerbungsfotograf2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement billigflge1;

    @FindBy(css = "#c24-flu li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement billigflge2;

    @FindBy(id = "cl_pw_register_repeat")
    @CacheLookup
    private WebElement bitteWiederholenSieIhrPasswort;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement brautstylist1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement brautstylist2;

    @FindBy(css = "a[title='Bremsbelag']")
    @CacheLookup
    private WebElement bremsbelag;

    @FindBy(css = "a[title='Bremsbeläge']")
    @CacheLookup
    private WebElement bremsbelge;

    @FindBy(css = "a[title='Bremsscheibe']")
    @CacheLookup
    private WebElement bremsscheibe;

    @FindBy(css = "a[title='Bremsscheiben']")
    @CacheLookup
    private WebElement bremsscheiben;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=points']")
    @CacheLookup
    private WebElement check24Punkte;

    @FindBy(css = "a[title='Computer & Konsole']")
    @CacheLookup
    private WebElement computerKonsole;

    @FindBy(css = "a[href='https://www.check24.de/unternehmen/cookiehinweis/']")
    @CacheLookup
    private WebElement cookies;

    @FindBy(css = "a[title='Datenschutzhinweise']")
    @CacheLookup
    private WebElement datenschutzhinweisen;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=sidenavi']")
    @CacheLookup
    private WebElement datentarife1;

    @FindBy(css = "a[href='//www.check24.de/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=topnavi']")
    @CacheLookup
    private WebElement datentarife2;

    @FindBy(css = "a[title='Depot']")
    @CacheLookup
    private WebElement depot;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement deutschNachhilfe1;

    @FindBy(css = "#c24-ask li:nth-of-type(3) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement deutschNachhilfe2;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement deutschlandsBesterkreditvergleich;

    @FindBy(css = "a[title='Deutschlands günstiger Onlinekredit']")
    @CacheLookup
    private WebElement deutschlandsGnstigerOnlinekredit;

    @FindBy(css = "#c24-mainnav-ele-mof div.c24-subnav.c24-subnav-mof div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement dieBestenTarifeMitundOhne;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement digitalkameras1;

    @FindBy(css = "#c24-sho li:nth-of-type(1) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement digitalkameras2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement dj1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement dj2;

    @FindBy(css = "#c24-mainnav-ele-tel div.c24-subnav.c24-subnav-tel div.c24-subnav-wrapper div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement dsl1;

    @FindBy(css = "#c24-tel li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement dsl2;

    @FindBy(css = "a[title='DSL & Handy']")
    @CacheLookup
    private WebElement dslHandy;

    @FindBy(css = "#c24-mainnav-ele-tel div.c24-subnav.c24-subnav-tel div.c24-subnav-wrapper div:nth-of-type(1) a:nth-of-type(5)")
    @CacheLookup
    private WebElement dslservice1;

    @FindBy(css = "#c24-tel li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement dslservice2;

    @FindBy(css = "#c24-mainnav-ele-tel div.c24-subnav.c24-subnav-tel div.c24-subnav-wrapper div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement dslspeedtest1;

    @FindBy(css = "#c24-tel li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement dslspeedtest2;

    @FindBy(css = "#c24-mainnav-ele-tel div.c24-subnav.c24-subnav-tel div.c24-subnav-wrapper div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement dslverfgbarkeit1;

    @FindBy(css = "#c24-tel li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement dslverfgbarkeit2;

    @FindBy(css = "#c24-mainnav-ele-tel div.c24-subnav.c24-subnav-tel div.c24-subnav-wrapper div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement dslvergleich1;

    @FindBy(css = "#c24-tel li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement dslvergleich2;

    @FindBy(css = "a[title='Elektrische Zahnbürsten']")
    @CacheLookup
    private WebElement elektrischeZahnbrsten;

    @FindBy(css = "a[title='Elektronik']")
    @CacheLookup
    private WebElement elektronik;

    @FindBy(css = "a[title='Elektronik & Haushalt']")
    @CacheLookup
    private WebElement elektronikHaushalt;

    @FindBy(css = "a[title='Elektrowerkzeug']")
    @CacheLookup
    private WebElement elektrowerkzeug;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement emailadresse;

    @FindBy(id = "cl_email_prefill")
    @CacheLookup
    private WebElement emailadresseIstNichtKorrekt1;

    @FindBy(id = "cl_email")
    @CacheLookup
    private WebElement emailadresseIstNichtKorrekt2;

    @FindBy(id = "cl_email_forget")
    @CacheLookup
    private WebElement emailadresseIstNichtKorrekt3;

    @FindBy(id = "cl_email_register")
    @CacheLookup
    private WebElement emailadresseIstNichtKorrekt4;

    @FindBy(css = "a[title='Energie']")
    @CacheLookup
    private WebElement energieStromGasHeizstromHeizl;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(3) a.c24-subnav-ele")
    @CacheLookup
    private WebElement energiecenter;

    @FindBy(css = "#c24-nrg li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement energiecenterEnergievertrgeVerwaltenUndOptimieren;

    @FindBy(css = "#c24-meinkonto div.c24-customer-layer.c24-header-hover-layer ul:nth-of-type(2) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement energiecenterIhreWechselfristenFrStrom;

    @FindBy(css = "a[title='Englisch Nachhilfe']")
    @CacheLookup
    private WebElement englischNachhilfe;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement ernhrungsberater1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement ernhrungsberater2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement eventfotograf1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement eventfotograf2;

    @FindBy(css = "a[title='Familienfotograf']")
    @CacheLookup
    private WebElement familienfotograf;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement familienurlaub1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement familienurlaub2;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement fernseher1;

    @FindBy(css = "#c24-sho li:nth-of-type(1) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement fernseher2;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement festgeld1;

    @FindBy(css = "#c24-fin li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement festgeld2;

    @FindBy(css = "a[title='Festnetz-Telefone']")
    @CacheLookup
    private WebElement festnetztelefone;

    @FindBy(css = "a[title='Finanzierung für Kauf und Bau']")
    @CacheLookup
    private WebElement finanzierungFrKaufUndBau;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement flge1;

    @FindBy(css = "#c24-header-bottom div.c24-header-content nav div.c24-nav.clearfix.full.point div:nth-of-type(2) ul.c24-mainnav-sec.clearfix li:nth-of-type(6) a.c24-mainnav-sec-ele.c24-header-hover")
    @CacheLookup
    private WebElement flge2;

    @FindBy(css = "#c24-flu li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement flge3;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement flgeLondon1;

    @FindBy(css = "#c24-flu li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement flgeLondon2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement flgeMallorca1;

    @FindBy(css = "#c24-flu li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement flgeMallorca2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement flgeNewYork1;

    @FindBy(css = "#c24-flu li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement flgeNewYork2;

    @FindBy(css = "a[title='Flugvergleich']")
    @CacheLookup
    private WebElement flugvergleich;

    @FindBy(css = "a[title='Flugverspätung - Ihre Rechte']")
    @CacheLookup
    private WebElement flugversptungIhreRechte;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement fotoautomat1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement fotoautomat2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(3)")
    @CacheLookup
    private WebElement fotografie1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement fotografie2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement frhbucher1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement frhbucher2;

    @FindBy(css = "a[href='//www.check24.de/handyvertrag/samsung-galaxy-s9/?tid2=sidenavi']")
    @CacheLookup
    private WebElement galaxyS9MitVertrag1;

    @FindBy(css = "a[href='//www.check24.de/handyvertrag/samsung-galaxy-s9/?tid2=topnavi']")
    @CacheLookup
    private WebElement galaxyS9MitVertrag2;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement ganzjahresreifen1;

    @FindBy(css = "#c24-aut li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement ganzjahresreifen2;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(4) a")
    @CacheLookup
    private WebElement garantiertDiegnstigstenpreise;

    @FindBy(css = "a[title='Gartengeräte']")
    @CacheLookup
    private WebElement gartengerte;

    @FindBy(css = "a[title='Gasanbieter wechseln']")
    @CacheLookup
    private WebElement gasanbieterWechseln;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement gasvergleich1;

    @FindBy(css = "#c24-nrg li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement gasvergleich2;

    @FindBy(css = "a[title='Gebäudeversicherung']")
    @CacheLookup
    private WebElement gebudeversicherung;

    @FindBy(css = "a[title='Gesangslehrer']")
    @CacheLookup
    private WebElement gesangslehrer;

    @FindBy(css = "a[title='Gesellschaftsspiele']")
    @CacheLookup
    private WebElement gesellschaftsspiele;

    @FindBy(css = "a[title='Gewerbegas Vergleich']")
    @CacheLookup
    private WebElement gewerbegas1;

    @FindBy(css = "a[title='Gewerbegas']")
    @CacheLookup
    private WebElement gewerbegas2;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement gewerbestrom1;

    @FindBy(css = "#c24-nrg li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement gewerbestrom2;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement girokonto1;

    @FindBy(css = "#c24-fin li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement girokonto2;

    @FindBy(css = "a[title='Gitarrenlehrer']")
    @CacheLookup
    private WebElement gitarrenlehrer;

    @FindBy(css = "a[href='https://mietwagen.check24.de/mietwagen']")
    @CacheLookup
    private WebElement gnstigeMietwagenangeboteWeltweit;

    @FindBy(css = "a[title='Gutscheine']")
    @CacheLookup
    private WebElement gutscheine;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=cs_codes']")
    @CacheLookup
    private WebElement gutscheineGuthaben;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement haftpflichtversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement haftpflichtversicherung2;

    @FindBy(css = "a[title='Handy']")
    @CacheLookup
    private WebElement handy;

    @FindBy(css = "#c24-mainnav-ele-mof div.c24-subnav.c24-subnav-mof div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement handyMitVertrag1;

    @FindBy(css = "a[href='//www.check24.de/handyvertrag/?tid2=topnavi']")
    @CacheLookup
    private WebElement handyMitVertrag2;

    @FindBy(css = "#c24-mainnav-ele-mof div.c24-subnav.c24-subnav-mof div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(5)")
    @CacheLookup
    private WebElement handyOhneVertrag1;

    @FindBy(css = "#c24-tel li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement handyOhneVertrag2;

    @FindBy(css = "a[title='Handy & Telefon']")
    @CacheLookup
    private WebElement handyTelefon;

    @FindBy(css = "a[href='https://www.check24.de/handyvertrag/vergleich/?tid2=sidenavi']")
    @CacheLookup
    private WebElement handybersicht1;

    @FindBy(css = "a[href='//www.check24.de/handyvertrag/vergleich/?tid2=topnavi']")
    @CacheLookup
    private WebElement handybersicht2;

    @FindBy(css = "a[href='//www.check24.de/handytarife/?tid2=sidenavi']")
    @CacheLookup
    private WebElement handytarifeNurSimkarte1;

    @FindBy(css = "a[href='//www.check24.de/handytarife/?tid2=topnavi']")
    @CacheLookup
    private WebElement handytarifeNurSimkarte2;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement handyversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement handyversicherung2;

    @FindBy(css = "a[href='https://www.check24.de/handyvertrag/kuendigen/?tid2=sidenavi']")
    @CacheLookup
    private WebElement handyvertragKndigen1;

    @FindBy(css = "a[href='https://www.check24.de/handyvertrag/kuendigen/?tid2=topnavi']")
    @CacheLookup
    private WebElement handyvertragKndigen2;

    @FindBy(css = "a[title='Hausfinanzierung']")
    @CacheLookup
    private WebElement hausfinanzierung;

    @FindBy(css = "a[title='Haushalt & Wohnen']")
    @CacheLookup
    private WebElement haushaltWohnen;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement hausratversicherung6MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement hausratversicherung6MonateGratis2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(6)")
    @CacheLookup
    private WebElement heilpraktikerBrille;

    @FindBy(css = "#c24-ver li:nth-of-type(4) ul.c24-subsubnav-sec.clearfix li:nth-of-type(6) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement heilpraktikerUndBrille;

    @FindBy(css = "a[title='Heimwerken & Garten']")
    @CacheLookup
    private WebElement heimwerkenGarten;

    @FindBy(css = "a[title='Heizöl']")
    @CacheLookup
    private WebElement heizl;

    @FindBy(css = "a[title='Heizölvergleich']")
    @CacheLookup
    private WebElement heizlvergleich;

    @FindBy(css = "a[title='Heizstrom']")
    @CacheLookup
    private WebElement heizstrom;

    @FindBy(css = "a[title='Heizstromvergleich']")
    @CacheLookup
    private WebElement heizstromvergleich;

    @FindBy(css = "#c24-cl-form-user-login-prefill div.c24-cl-user-prefill div:nth-of-type(1) div:nth-of-type(4) div:nth-of-type(4) a.c24-cl-user-register")
    @CacheLookup
    private WebElement hierKontoAnlegen1;

    @FindBy(css = "#c24-cl-form-user-login-prefill div.c24-cl-user-prefill div:nth-of-type(2) div:nth-of-type(1) a.c24-cl-user-register")
    @CacheLookup
    private WebElement hierKontoAnlegen2;

    @FindBy(css = "#c24-cl-form-user-login div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(4) a.c24-cl-user-register")
    @CacheLookup
    private WebElement hierKontoAnlegen3;

    @FindBy(css = "#c24-cl-form-user-login div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(1) a.c24-cl-user-register")
    @CacheLookup
    private WebElement hierKontoAnlegen4;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement hochzeit1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement hochzeit2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement hochzeitsfotograf1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) ul:nth-of-type(2) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement hochzeitsfotograf2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(3)")
    @CacheLookup
    private WebElement hochzeitssnger1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) ul:nth-of-type(2) li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement hochzeitssnger2;

    @FindBy(css = "#c24-mainnav-ele-hot a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement hotel1;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement hotel2;

    @FindBy(css = "#c24-header-bottom div.c24-header-content nav div.c24-nav.clearfix.full.point div:nth-of-type(2) ul.c24-mainnav-sec.clearfix li:nth-of-type(7) a.c24-mainnav-sec-ele.c24-header-hover")
    @CacheLookup
    private WebElement hotel3;

    @FindBy(css = "#c24-hot li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement hotel4;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement hotelBerlin1;

    @FindBy(css = "#c24-hot li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement hotelBerlin2;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement hotelMnchen1;

    @FindBy(css = "#c24-hot li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement hotelMnchen2;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement hotelParis1;

    @FindBy(css = "#c24-hot li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement hotelParis2;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement hotelRom1;

    @FindBy(css = "#c24-hot li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement hotelRom2;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a.c24-subnav-ele.c24-spacing")
    @CacheLookup
    private WebElement hotelsucheWeltweit1;

    @FindBy(css = "a.c24-subsubnav-sec-ele.c24-subproduct.c24-spacing")
    @CacheLookup
    private WebElement hotelsucheWeltweit2;

    @FindBy(css = "a[title='Hotelvergleiche']")
    @CacheLookup
    private WebElement hotelvergleiche;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(6)")
    @CacheLookup
    private WebElement hundehaftpflicht1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(6) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement hundehaftpflicht2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(7)")
    @CacheLookup
    private WebElement hundekrankenversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(7) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement hundekrankenversicherung2;

    @FindBy(css = "a[title='Immobilienfinanzierung']")
    @CacheLookup
    private WebElement immobilienfinanzierung;

    @FindBy(css = "a[title='Internet']")
    @CacheLookup
    private WebElement internet;

    @FindBy(css = "a[title='Internet & DSL']")
    @CacheLookup
    private WebElement internetDsl;

    @FindBy(css = "a[href='//www.check24.de/dsl-handy/internetanbieter/']")
    @CacheLookup
    private WebElement internetanbieter1;

    @FindBy(css = "a[href='https://www.check24.de/dsl-handy/internetanbieter/']")
    @CacheLookup
    private WebElement internetanbieter2;

    @FindBy(css = "a[title='iPhone X mit Vertrag']")
    @CacheLookup
    private WebElement iphoneXMitVertrag1;

    @FindBy(css = "a[title='iPhone x mit Vertrag']")
    @CacheLookup
    private WebElement iphoneXMitVertrag2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(4) a")
    @CacheLookup
    private WebElement jetztAnmelden;

//    @FindBy(css = "#c24-cl-form-user-register div.c24-cl-content-top div:nth-of-type(3) div:nth-of-type(4) a.c24-customer-login-opener")
//    @CacheLookup
//    private WebElement jetztAnmelden;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement jetztAutoteileReifenzumBesten;

    @FindBy(css = "#c24-cl-form-user-register div.c24-cl-content-top input.c24-button[type='submit']")
    @CacheLookup
    private WebElement jetztRegistrieren1;

    @FindBy(id = "c24-kb-btn")
    @CacheLookup
    private WebElement jetztRegistrieren2;

    @FindBy(css = "a[href='https://baufinanzierung.check24.de/baufinanzierung/pages/best-zins-check']")
    @CacheLookup
    private WebElement jetztVorliegendesbaufinanzierungsangebotgratisCheckenLassen;

    @FindBy(css = "a[title='Kaffeemaschinen']")
    @CacheLookup
    private WebElement kaffeemaschinen;

    @FindBy(css = "a[title='Kaffeevollautomaten']")
    @CacheLookup
    private WebElement kaffeevollautomaten;

    @FindBy(css = "a[title='Kapitalbeschaffung']")
    @CacheLookup
    private WebElement kapitalbeschaffung;

    @FindBy(css = "a[title='Stellenanzeigen']")
    @CacheLookup
    private WebElement karriere;

    @FindBy(css = "#c24-aut li:nth-of-type(3) a.c24-subnav-sec-ele")
    @CacheLookup
    private WebElement kfzversicherung1;

    @FindBy(css = "a.c24-subnav-ele.c24-subnav-ele-vw")
    @CacheLookup
    private WebElement kfzversicherung1MonatGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kfzversicherung1MonatGratis2;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kfzversicherung2;

    @FindBy(css = "a[title='Klavierlehrer']")
    @CacheLookup
    private WebElement klavierlehrer;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement kogas1;

    @FindBy(css = "#c24-nrg li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement kogas2;

    @FindBy(css = "a[title='Kontakt']")
    @CacheLookup
    private WebElement kontakt;

    @FindBy(css = "#c24-mainnav-ele-fin a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement kontoKredit1;

    @FindBy(css = "#c24-header-bottom div.c24-header-content nav div.c24-nav.clearfix.full.point div:nth-of-type(2) ul.c24-mainnav-sec.clearfix li:nth-of-type(2) a.c24-mainnav-sec-ele.c24-header-hover")
    @CacheLookup
    private WebElement kontoKredit2;

    @FindBy(css = "a[href='https://www.check24.de/kontomanager/?ref=c24burger']")
    @CacheLookup
    private WebElement kontomanager;

    @FindBy(css = "a[href='https://www.check24.de/kontomanager/?ref=c24navi']")
    @CacheLookup
    private WebElement kontomanagerFinanzenVerwaltenUndOptimieren;

    @FindBy(css = "a[href='https://www.check24.de/kontomanager/?ref=c24konto']")
    @CacheLookup
    private WebElement kontomanagerIhreFinanzenAnEinem;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement kostrom1;

    @FindBy(css = "#c24-nrg li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement kostrom2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement krankenhauszusatz6MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(4) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement krankenhauszusatz6MonateGratis2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement krankenkassen1;

    @FindBy(css = "#c24-ver li:nth-of-type(4) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement krankenkassen2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement krankenzusatzversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(4) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement krankenzusatzversicherung2;

    @FindBy(css = "a[title='Kredit']")
    @CacheLookup
    private WebElement kredit;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(3) a.c24-subnav-ele")
    @CacheLookup
    private WebElement kreditcenter;

    @FindBy(css = "#c24-meinkonto div.c24-customer-layer.c24-header-hover-layer ul:nth-of-type(2) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement kreditcenterIhreAktuellenKreditanfragenUnd;

    @FindBy(css = "#c24-fin li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kreditcenterKreditantrgeAbschlsseAuf;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement kreditkarte1;

    @FindBy(css = "#c24-fin li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kreditkarte2;

    @FindBy(css = "a[title='Kreditrechner']")
    @CacheLookup
    private WebElement kreditrechner;

    @FindBy(css = "a[title='Kreditvergleich']")
    @CacheLookup
    private WebElement kreditvergleich;

    @FindBy(css = "a[href='mailto:kundenkonto@check24.de']")
    @CacheLookup
    private WebElement kundenkontocheck24De;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement lastMinute1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement lastMinute2;

    @FindBy(css = "a[title='Lego']")
    @CacheLookup
    private WebElement lego;

    @FindBy(css = "a[title='Leuchten']")
    @CacheLookup
    private WebElement leuchten;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement lfilter1;

    @FindBy(css = "#c24-aut li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement lfilter2;

    @FindBy(css = "a[title='LTE']")
    @CacheLookup
    private WebElement lte;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement luftfilter1;

    @FindBy(css = "#c24-aut li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement luftfilter2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement matheNachhilfe1;

    @FindBy(css = "#c24-ask li:nth-of-type(3) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement matheNachhilfe2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement mbeltransport1;

    @FindBy(css = "#c24-ask li:nth-of-type(4) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mbeltransport2;

    @FindBy(css = "a[title='mehr...']")
    @CacheLookup
    private WebElement mehr;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=overview']")
    @CacheLookup
    private WebElement meinKonto;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=activitylist']")
    @CacheLookup
    private WebElement meineAktivitten;

    @FindBy(css = "#c24-mainnav-ele-mwa a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement mietwagen1;

    @FindBy(css = "#c24-mainnav-ele-mwa div.c24-subnav.c24-subnav-mwa div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement mietwagen2;

    @FindBy(css = "#c24-header-bottom div.c24-header-content nav div.c24-nav.clearfix.full.point div:nth-of-type(2) ul.c24-mainnav-sec.clearfix li:nth-of-type(8) a.c24-mainnav-sec-ele.c24-header-hover")
    @CacheLookup
    private WebElement mietwagen3;

    @FindBy(css = "#c24-mwa li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagen4;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagen5;

    @FindBy(css = "#c24-mainnav-ele-mwa div.c24-subnav.c24-subnav-mwa div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement mietwagenDeutschland1;

    @FindBy(css = "#c24-mwa li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagenDeutschland2;

    @FindBy(css = "a.c24-subnav-ele.c24-rsnmwa-goldclub.c24-spacing")
    @CacheLookup
    private WebElement mietwagenGoldclub1;

    @FindBy(css = "#c24-mwa li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-rsnmwa-goldclub")
    @CacheLookup
    private WebElement mietwagenGoldclub2;

    @FindBy(css = "#c24-mainnav-ele-mwa div.c24-subnav.c24-subnav-mwa div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement mietwagenMallorca1;

    @FindBy(css = "#c24-mwa li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagenMallorca2;

    @FindBy(css = "#c24-mainnav-ele-mwa div.c24-subnav.c24-subnav-mwa div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(6)")
    @CacheLookup
    private WebElement mietwagenRundreisen1;

    @FindBy(css = "#c24-mwa li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagenRundreisen2;

    @FindBy(css = "#c24-mainnav-ele-mwa div.c24-subnav.c24-subnav-mwa div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement mietwagenSpanien1;

    @FindBy(css = "#c24-mwa li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagenSpanien2;

    @FindBy(css = "#c24-mainnav-ele-mwa div.c24-subnav.c24-subnav-mwa div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement mietwagenUsa1;

    @FindBy(css = "#c24-mwa li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagenUsa2;

    @FindBy(css = "a[title='Modernisierung']")
    @CacheLookup
    private WebElement modernisierung;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement motorradversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement motorradversicherung2;

    @FindBy(css = "a[title='Musikunterricht']")
    @CacheLookup
    private WebElement musikunterricht;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement nachhilfe1;

    @FindBy(css = "#c24-ask li:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement nachhilfe2;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(2) a:nth-of-type(3)")
    @CacheLookup
    private WebElement nachtspeicherheizung1;

    @FindBy(css = "#c24-nrg li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(6) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement nachtspeicherheizung2;

    @FindBy(css = "#c24-breadcrumb div.c24-grid-flex-content.content.clearfix ul li a")
    @CacheLookup
    private WebElement neuanmeldung;

    @FindBy(css = "a[title='Nachrichten']")
    @CacheLookup
    private WebElement news;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement notebooks1;

    @FindBy(css = "#c24-sho li:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement notebooks2;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement nurBis10101;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement nurBis10102;

    @FindBy(css = "#register div:nth-of-type(2) div:nth-of-type(2) div.c24-kb-help-content p:nth-of-type(1) a.popup")
    @CacheLookup
    private WebElement nutzungsbedingungen1;

    @FindBy(css = "#terms-update p a:nth-of-type(1)")
    @CacheLookup
    private WebElement nutzungsbedingungen2;

    @FindBy(css = "a.c24-cookie-button")
    @CacheLookup
    private WebElement ok;

    private final String pageLoadedText = "der CHECK24 GmbH in 80251 München zu";

    private final String pageUrl = "/user/register.html";

    @FindBy(css = "a[title='Partner']")
    @CacheLookup
    private WebElement partner;

    @FindBy(css = "a[title='Partnerprogramm']")
    @CacheLookup
    private WebElement partnerprogramm;

    @FindBy(id = "cl_pw_prefill")
    @CacheLookup
    private WebElement passwortAuswhlen1;

    @FindBy(id = "cl_pw")
    @CacheLookup
    private WebElement passwortAuswhlen2;

    @FindBy(id = "cl_pw_register")
    @CacheLookup
    private WebElement passwortAuswhlen3;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement passwortAuswhlen4;

    @FindBy(css = "#c24-cl-form-user-login-prefill div.c24-cl-user-prefill div:nth-of-type(1) div:nth-of-type(5) div.c24-cl-input-wrapper.c24-cl-input-pw-wrapper div:nth-of-type(1) a.c24-cl-pwf")
    @CacheLookup
    private WebElement passwortVergessen1;

    @FindBy(css = "#c24-cl-form-user-login div:nth-of-type(2) div.c24-cl-content-top div:nth-of-type(5) div.c24-cl-input-wrapper div:nth-of-type(1) a.c24-cl-pwf")
    @CacheLookup
    private WebElement passwortVergessen2;

    @FindBy(id = "passwordrepetition")
    @CacheLookup
    private WebElement passwortWiederholen;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement pauschalreisen1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement pauschalreisen2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement pauschalreisenZuDenBestenPreisen;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement personalTrainer1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement personalTrainer2;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(7)")
    @CacheLookup
    private WebElement pferdehaftpflicht1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(7) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement pferdehaftpflicht2;

    @FindBy(css = "a[title='Pflegeversicherung']")
    @CacheLookup
    private WebElement pflegeversicherung;

    @FindBy(css = "a[title='Pflegezusatzversicherung']")
    @CacheLookup
    private WebElement pflegezusatzversicherung;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?select_contract=-1&data_included=0&minutes_included=all&tid2=sidenavi']")
    @CacheLookup
    private WebElement prepaidUnd1monatstarife1;

    @FindBy(css = "a[href='//www.check24.de/handytarife/vergleich/?select_contract=-1&data_included=0&minutes_included=all&tid2=topnavi']")
    @CacheLookup
    private WebElement prepaidUnd1monatstarife2;

    @FindBy(css = "a[title='Presse']")
    @CacheLookup
    private WebElement presse;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement privateKrankenversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(4) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement privateKrankenversicherung2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(2) a:nth-of-type(3)")
    @CacheLookup
    private WebElement privaterYogalehrer1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement privaterYogalehrer2;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement privathaftpflicht12MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement privathaftpflicht12MonateGratis2;

    @FindBy(css = "a[title='Profis']")
    @CacheLookup
    private WebElement profis;

    @FindBy(css = "a[title='Profis für Ihr Projekt']")
    @CacheLookup
    private WebElement profisFrIhrProjekt;

    @FindBy(css = "a[title='Rasierer']")
    @CacheLookup
    private WebElement rasierer;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement ratenkredit1;

    @FindBy(css = "#c24-fin li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement ratenkredit2;

    @FindBy(css = "a[title='Ratgeber']")
    @CacheLookup
    private WebElement ratgeber;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement rechtsschutzversicherung3MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement rechtsschutzversicherung3MonateGratis2;

    @FindBy(css = "a[title='Reifen']")
    @CacheLookup
    private WebElement reifen;

    @FindBy(css = "a[title='Reise']")
    @CacheLookup
    private WebElement reise;

    @FindBy(css = "a[title='Reise & Flug']")
    @CacheLookup
    private WebElement reiseFlug;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(8)")
    @CacheLookup
    private WebElement reiseGoldclub1;

    @FindBy(css = "#c24-pau li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(6) a.c24-subsubnav-sec-ele.c24-rsnmwa-goldclub")
    @CacheLookup
    private WebElement reiseGoldclub2;

    @FindBy(css = "a[title='Reisevergleich']")
    @CacheLookup
    private WebElement reisevergleich;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(6)")
    @CacheLookup
    private WebElement reiseversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(6) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement reiseversicherung2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(7)")
    @CacheLookup
    private WebElement reiseweltBestenlisten1;

    @FindBy(css = "#c24-pau li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement reiseweltBestenlisten2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement rentenversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement rentenversicherung2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement risikolebensversicherung3MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement risikolebensversicherung3MonateGratis2;

    @FindBy(css = "a[title='Scheibenwischer']")
    @CacheLookup
    private WebElement scheibenwischer;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement schutzbriefautomobilclub1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement schutzbriefautomobilclub2;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement schutzbriefautomobilclub3;

    @FindBy(id = "c24-cl-pw-forget-btn")
    @CacheLookup
    private WebElement senden;

    @FindBy(css = "a.c24-mainnav-sec-ele.c24-header-hover.last")
    @CacheLookup
    private WebElement shopping;

    @FindBy(css = "#c24-ask li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement sieSindSelbstProfiUndAuf;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement smartphones1;

    @FindBy(css = "#c24-sho li:nth-of-type(1) ul:nth-of-type(2) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement smartphones2;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement sommerreifen1;

    @FindBy(css = "#c24-aut li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement sommerreifen2;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement spielwaren1;

    @FindBy(css = "#c24-sho li:nth-of-type(4) a.c24-subnav-sec-ele")
    @CacheLookup
    private WebElement spielwaren2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement sportWellness1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement sportWellness2;

    @FindBy(css = "a.c24-meinkonto-reflink.c24-meinkonto-register-link")
    @CacheLookup
    private WebElement startenSieHier1;

    @FindBy(css = "a.c24-meinkonto-reflink.c24-customer-register-opener")
    @CacheLookup
    private WebElement startenSieHier2;

    @FindBy(css = "a[title='Staubsauger']")
    @CacheLookup
    private WebElement staubsauger;

    @FindBy(css = "a[title='Städtereisen']")
    @CacheLookup
    private WebElement stdtereisen;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement sterbegeldversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement sterbegeldversicherung2;

    @FindBy(css = "a[title='Strom & Gas']")
    @CacheLookup
    private WebElement stromGas;

    @FindBy(css = "a[title='Stromanbieter wechseln']")
    @CacheLookup
    private WebElement stromanbieterWechseln;

    @FindBy(css = "a[title='Strompreise']")
    @CacheLookup
    private WebElement strompreise;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement stromvergleich1;

    @FindBy(css = "#c24-nrg li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement stromvergleich2;

    @FindBy(css = "a[title='Tablet-PCs']")
    @CacheLookup
    private WebElement tabletpcs;

    @FindBy(css = "a[title='Tablets']")
    @CacheLookup
    private WebElement tablets;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement tagesgeld1;

    @FindBy(css = "#c24-fin li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement tagesgeld2;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?young_tariff=all&tid2=sidenavi']")
    @CacheLookup
    private WebElement tarifeFrJungeLeute1;

    @FindBy(css = "a[href='//www.check24.de/handytarife/vergleich/?young_tariff=all&tid2=topnavi']")
    @CacheLookup
    private WebElement tarifeFrJungeLeute2;

    @FindBy(css = "a[title='Tilgungsrechner']")
    @CacheLookup
    private WebElement tilgungsrechner;

    @FindBy(css = "a[title='Top 10 Hotels Ägypten']")
    @CacheLookup
    private WebElement top10HotelsGypten;

    @FindBy(css = "a[title='Top 10 Hotels Kanaren']")
    @CacheLookup
    private WebElement top10HotelsKanaren;

    @FindBy(css = "a[title='Top 10 Hotels Mallorca']")
    @CacheLookup
    private WebElement top10HotelsMallorca;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement umschuldung1;

    @FindBy(css = "#c24-fin li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement umschuldung2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement umzugsunternehmen1;

    @FindBy(css = "#c24-ask li:nth-of-type(4) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement umzugsunternehmen2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement unfallversicherung6MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement unfallversicherung6MonateGratis2;

    @FindBy(css = "a[title='Unternehmen']")
    @CacheLookup
    private WebElement unternehmen;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(6)")
    @CacheLookup
    private WebElement urlaubsfinder1;

    @FindBy(css = "#c24-pau li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement urlaubsfinder2;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement veranstaltungenEvents1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement veranstaltungenEvents2;

    @FindBy(css = "a[title='Versicherung Jubiläums Deals']")
    @CacheLookup
    private WebElement versicherungJubilumsDealsBisZu1;

    @FindBy(id = "c24-search-navi-sho")
    @CacheLookup
    private WebElement versicherungJubilumsDealsBisZu2;

    @FindBy(css = "a[href='//www.check24.de/versicherungen/']")
    @CacheLookup
    private WebElement versicherungen;

    @FindBy(css = "#c24-mainnav-ele-ver a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement versicherungenKfzRechtsschutzUvm;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement versicherungjubilumsDealsBisZu121;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement versicherungjubilumsDealsBisZu122;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(2) a.c24-subnav-ele")
    @CacheLookup
    private WebElement versicherungscenter;

    @FindBy(css = "#c24-meinkonto div.c24-customer-layer.c24-header-hover-layer ul:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement versicherungscenterIhrDigitalerVersicherungsordnerBedarf;

    @FindBy(css = "#c24-ver li:nth-of-type(6) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement versicherungscenterVersicherungenVerwaltenUndOptimieren;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement waschmaschinen1;

    @FindBy(css = "#c24-sho li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement waschmaschinen2;

    @FindBy(id = "c24-cl-user-btn")
    @CacheLookup
    private WebElement weiter;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement winterreifen1;

    @FindBy(css = "#c24-aut li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement winterreifen2;

    @FindBy(css = "a[title='Wischblatt']")
    @CacheLookup
    private WebElement wischblatt;

    @FindBy(css = "a[title='Wohngebäudeversicherung']")
    @CacheLookup
    private WebElement wohngebudeversicherung;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement wrmepumpe1;

    @FindBy(css = "#c24-nrg li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement wrmepumpe2;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement zahnzusatzversicherung3MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(4) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement zahnzusatzversicherung3MonateGratis2;

    @FindBy(css = "a[title='Zins Schnell-Check']")
    @CacheLookup
    private WebElement zinsSchnellcheck;

    @FindBy(css = "a[title='zu allen Kategorien']")
    @CacheLookup
    private WebElement zuAllenKategorien;

    @FindBy(css = "a.all.c24-meinkonto-login-link")
    @CacheLookup
    private WebElement zurAnmeldung;

    @FindBy(css = "#c24-cl-form-user-login div:nth-of-type(2) div.c24-cl-content-top div:nth-of-type(5) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurck1;

    @FindBy(css = "#c24-cl-form-user-pwforget div:nth-of-type(2) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurck2;

    @FindBy(css = "#c24-page-container-header div.c24-page header div:nth-of-type(2) div:nth-of-type(4) div.c24-cl-content-top div:nth-of-type(3) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurckZurAnmeldung;

    public UserRegistrationPage() {
    }

    public UserRegistrationPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public UserRegistrationPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public UserRegistrationPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Agb Datenschutz Impressum Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAgbDatenschutzImpressumLink() {
        agbDatenschutzImpressum.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAllInclusive1Link() {
        allInclusive1.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAllInclusive2Link() {
        allInclusive2.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAlleKategorien1Link() {
        alleKategorien1.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAlleKategorien2Link() {
        alleKategorien2.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAlleKategorien3Link() {
        alleKategorien3.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAlleKategorien4Link() {
        alleKategorien4.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAlleKategorienLink() {
        alleKategorien.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAllnetFlatTarife1Link() {
        allnetFlatTarife1.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAllnetFlatTarife2Link() {
        allnetFlatTarife2.click();
        return this;
    }

    /**
     * Click on Anbieter Mit Prmie Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAnbieterMitPrmieLink() {
        anbieterMitPrmie.click();
        return this;
    }

    /**
     * Click on Anmelden Button.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAnmelden1Button() {
        anmelden1.click();
        return this;
    }

//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage clickAnmelden1Link() {
//        anmelden1.click();
//        return this;
//    }
//
//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage clickAnmelden1Link() {
//        anmelden1.click();
//        return this;
//    }

//    /**
//     * Click on Anmelden Button.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage clickAnmelden2Button() {
//        anmelden2.click();
//        return this;
//    }
//
//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage clickAnmelden2Link() {
//        anmelden2.click();
//        return this;
//    }

//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage clickAnmelden2Link() {
//        anmelden2.click();
//        return this;
//    }

    /**
     * Click on Anmelden Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAnmelden3Link() {
        anmelden3.click();
        return this;
    }

    /**
     * Click on Anschlussfinanzierung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAnschlussfinanzierungLink() {
        anschlussfinanzierung.click();
        return this;
    }

    /**
     * Click on Auto Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutoLink() {
        auto.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutokredit1Link() {
        autokredit1.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutokredit2Link() {
        autokredit2.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutokredit3Link() {
        autokredit3.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutoreifen1Link() {
        autoreifen1.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutoreifen2Link() {
        autoreifen2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutoteile1Link() {
        autoteile1.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutoteile2Link() {
        autoteile2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickAutoteile3Link() {
        autoteile3.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBand1Link() {
        band1.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBand2Link() {
        band2.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBaufinanzierung1Link() {
        baufinanzierung1.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBaufinanzierung2Link() {
        baufinanzierung2.click();
        return this;
    }

    /**
     * Click on Baufinanzierungsrechner Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBaufinanzierungsrechnerLink() {
        baufinanzierungsrechner.click();
        return this;
    }

    /**
     * Click on Beauty Wellness Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBeautyWellnessLink() {
        beautyWellness.click();
        return this;
    }

    /**
     * Click on Beim Dsl Tarifvergleichexklusive Cashbackssichern Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBeimDslTarifvergleichexklusiveCashbackssichernLink() {
        beimDslTarifvergleichexklusiveCashbackssichern.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionangebote Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBer1MillionangeboteLink() {
        ber1Millionangebote.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionhotels Weltweit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBer1MillionhotelsWeltweitLink() {
        ber1MillionhotelsWeltweit.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBerufsunfhigkeitLink() {
        berufsunfhigkeit.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeitsversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBerufsunfhigkeitsversicherungLink() {
        berufsunfhigkeitsversicherung.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBewerbungsfotograf1Link() {
        bewerbungsfotograf1.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBewerbungsfotograf2Link() {
        bewerbungsfotograf2.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBilligflge1Link() {
        billigflge1.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBilligflge2Link() {
        billigflge2.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBrautstylist1Link() {
        brautstylist1.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBrautstylist2Link() {
        brautstylist2.click();
        return this;
    }

    /**
     * Click on Bremsbelag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBremsbelagLink() {
        bremsbelag.click();
        return this;
    }

    /**
     * Click on Bremsbelge Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBremsbelgeLink() {
        bremsbelge.click();
        return this;
    }

    /**
     * Click on Bremsscheibe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBremsscheibeLink() {
        bremsscheibe.click();
        return this;
    }

    /**
     * Click on Bremsscheiben Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickBremsscheibenLink() {
        bremsscheiben.click();
        return this;
    }

    /**
     * Click on Check24 Punkte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickCheck24PunkteLink() {
        check24Punkte.click();
        return this;
    }

    /**
     * Click on Computer Konsole Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickComputerKonsoleLink() {
        computerKonsole.click();
        return this;
    }

    /**
     * Click on Cookies Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickCookiesLink() {
        cookies.click();
        return this;
    }

    /**
     * Click on Datenschutzhinweisen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDatenschutzhinweisenLink() {
        datenschutzhinweisen.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDatentarife1Link() {
        datentarife1.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDatentarife2Link() {
        datentarife2.click();
        return this;
    }

    /**
     * Click on Depot Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDepotLink() {
        depot.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDeutschNachhilfe1Link() {
        deutschNachhilfe1.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDeutschNachhilfe2Link() {
        deutschNachhilfe2.click();
        return this;
    }

    /**
     * Click on Deutschlands Besterkreditvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDeutschlandsBesterkreditvergleichLink() {
        deutschlandsBesterkreditvergleich.click();
        return this;
    }

    /**
     * Click on Deutschlands Gnstiger Onlinekredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDeutschlandsGnstigerOnlinekreditLink() {
        deutschlandsGnstigerOnlinekredit.click();
        return this;
    }

    /**
     * Click on Die Besten Tarife Mitund Ohne Smartphone Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDieBestenTarifeMitundOhneLink() {
        dieBestenTarifeMitundOhne.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDigitalkameras1Link() {
        digitalkameras1.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDigitalkameras2Link() {
        digitalkameras2.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDj1Link() {
        dj1.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDj2Link() {
        dj2.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDsl1Link() {
        dsl1.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDsl2Link() {
        dsl2.click();
        return this;
    }

    /**
     * Click on Dsl Handy Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslHandyLink() {
        dslHandy.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslservice1Link() {
        dslservice1.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslservice2Link() {
        dslservice2.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslspeedtest1Link() {
        dslspeedtest1.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslspeedtest2Link() {
        dslspeedtest2.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslverfgbarkeit1Link() {
        dslverfgbarkeit1.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslverfgbarkeit2Link() {
        dslverfgbarkeit2.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslvergleich1Link() {
        dslvergleich1.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickDslvergleich2Link() {
        dslvergleich2.click();
        return this;
    }

    /**
     * Click on Elektrische Zahnbrsten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickElektrischeZahnbrstenLink() {
        elektrischeZahnbrsten.click();
        return this;
    }

    /**
     * Click on Elektronik Haushalt Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickElektronikHaushaltLink() {
        elektronikHaushalt.click();
        return this;
    }

    /**
     * Click on Elektronik Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickElektronikLink() {
        elektronik.click();
        return this;
    }

    /**
     * Click on Elektrowerkzeug Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickElektrowerkzeugLink() {
        elektrowerkzeug.click();
        return this;
    }

    /**
     * Click on Energie Strom Gas Heizstrom Heizl Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickEnergieStromGasHeizstromHeizlLink() {
        energieStromGasHeizstromHeizl.click();
        return this;
    }

    /**
     * Click on Energiecenter Energievertrge Verwalten Und Optimieren Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickEnergiecenterEnergievertrgeVerwaltenUndOptimierenLink() {
        energiecenterEnergievertrgeVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Energiecenter Ihre Wechselfristen Fr Strom Und Gasvertrge Nutzen Und Erneut Sparen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickEnergiecenterIhreWechselfristenFrStromLink() {
        energiecenterIhreWechselfristenFrStrom.click();
        return this;
    }

    /**
     * Click on Energiecenter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickEnergiecenterLink() {
        energiecenter.click();
        return this;
    }

    /**
     * Click on Englisch Nachhilfe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickEnglischNachhilfeLink() {
        englischNachhilfe.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickErnhrungsberater1Link() {
        ernhrungsberater1.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickErnhrungsberater2Link() {
        ernhrungsberater2.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickEventfotograf1Link() {
        eventfotograf1.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickEventfotograf2Link() {
        eventfotograf2.click();
        return this;
    }

    /**
     * Click on Familienfotograf Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFamilienfotografLink() {
        familienfotograf.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFamilienurlaub1Link() {
        familienurlaub1.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFamilienurlaub2Link() {
        familienurlaub2.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFernseher1Link() {
        fernseher1.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFernseher2Link() {
        fernseher2.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFestgeld1Link() {
        festgeld1.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFestgeld2Link() {
        festgeld2.click();
        return this;
    }

    /**
     * Click on Festnetztelefone Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFestnetztelefoneLink() {
        festnetztelefone.click();
        return this;
    }

    /**
     * Click on Finanzierung Fr Kauf Und Bau Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFinanzierungFrKaufUndBauLink() {
        finanzierungFrKaufUndBau.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlge1Link() {
        flge1.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlge2Link() {
        flge2.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlge3Link() {
        flge3.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlgeLondon1Link() {
        flgeLondon1.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlgeLondon2Link() {
        flgeLondon2.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlgeMallorca1Link() {
        flgeMallorca1.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlgeMallorca2Link() {
        flgeMallorca2.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlgeNewYork1Link() {
        flgeNewYork1.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlgeNewYork2Link() {
        flgeNewYork2.click();
        return this;
    }

    /**
     * Click on Flugvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlugvergleichLink() {
        flugvergleich.click();
        return this;
    }

    /**
     * Click on Flugversptung Ihre Rechte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFlugversptungIhreRechteLink() {
        flugversptungIhreRechte.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFotoautomat1Link() {
        fotoautomat1.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFotoautomat2Link() {
        fotoautomat2.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFotografie1Link() {
        fotografie1.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFotografie2Link() {
        fotografie2.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFrhbucher1Link() {
        frhbucher1.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickFrhbucher2Link() {
        frhbucher2.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGalaxyS9MitVertrag1Link() {
        galaxyS9MitVertrag1.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGalaxyS9MitVertrag2Link() {
        galaxyS9MitVertrag2.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGanzjahresreifen1Link() {
        ganzjahresreifen1.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGanzjahresreifen2Link() {
        ganzjahresreifen2.click();
        return this;
    }

    /**
     * Click on Garantiert Diegnstigstenpreise Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGarantiertDiegnstigstenpreiseLink() {
        garantiertDiegnstigstenpreise.click();
        return this;
    }

    /**
     * Click on Gartengerte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGartengerteLink() {
        gartengerte.click();
        return this;
    }

    /**
     * Click on Gasanbieter Wechseln Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGasanbieterWechselnLink() {
        gasanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGasvergleich1Link() {
        gasvergleich1.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGasvergleich2Link() {
        gasvergleich2.click();
        return this;
    }

    /**
     * Click on Gebudeversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGebudeversicherungLink() {
        gebudeversicherung.click();
        return this;
    }

    /**
     * Click on Gesangslehrer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGesangslehrerLink() {
        gesangslehrer.click();
        return this;
    }

    /**
     * Click on Gesellschaftsspiele Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGesellschaftsspieleLink() {
        gesellschaftsspiele.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGewerbegas1Link() {
        gewerbegas1.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGewerbegas2Link() {
        gewerbegas2.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGewerbestrom1Link() {
        gewerbestrom1.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGewerbestrom2Link() {
        gewerbestrom2.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGirokonto1Link() {
        girokonto1.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGirokonto2Link() {
        girokonto2.click();
        return this;
    }

    /**
     * Click on Gitarrenlehrer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGitarrenlehrerLink() {
        gitarrenlehrer.click();
        return this;
    }

    /**
     * Click on Gnstige Mietwagenangebote Weltweit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGnstigeMietwagenangeboteWeltweitLink() {
        gnstigeMietwagenangeboteWeltweit.click();
        return this;
    }

    /**
     * Click on Gutscheine Guthaben Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGutscheineGuthabenLink() {
        gutscheineGuthaben.click();
        return this;
    }

    /**
     * Click on Gutscheine Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickGutscheineLink() {
        gutscheine.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHaftpflichtversicherung1Link() {
        haftpflichtversicherung1.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHaftpflichtversicherung2Link() {
        haftpflichtversicherung2.click();
        return this;
    }

    /**
     * Click on Handy Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyLink() {
        handy.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyMitVertrag1Link() {
        handyMitVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyMitVertrag2Link() {
        handyMitVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyOhneVertrag1Link() {
        handyOhneVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyOhneVertrag2Link() {
        handyOhneVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Telefon Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyTelefonLink() {
        handyTelefon.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandybersicht1Link() {
        handybersicht1.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandybersicht2Link() {
        handybersicht2.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandytarifeNurSimkarte1Link() {
        handytarifeNurSimkarte1.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandytarifeNurSimkarte2Link() {
        handytarifeNurSimkarte2.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyversicherung1Link() {
        handyversicherung1.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyversicherung2Link() {
        handyversicherung2.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyvertragKndigen1Link() {
        handyvertragKndigen1.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHandyvertragKndigen2Link() {
        handyvertragKndigen2.click();
        return this;
    }

    /**
     * Click on Hausfinanzierung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHausfinanzierungLink() {
        hausfinanzierung.click();
        return this;
    }

    /**
     * Click on Haushalt Wohnen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHaushaltWohnenLink() {
        haushaltWohnen.click();
        return this;
    }

    /**
     * Click on Hausratversicherung 6 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHausratversicherung6MonateGratis1Link() {
        hausratversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Hausratversicherung 6 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHausratversicherung6MonateGratis2Link() {
        hausratversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Brille Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHeilpraktikerBrilleLink() {
        heilpraktikerBrille.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Und Brille Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHeilpraktikerUndBrilleLink() {
        heilpraktikerUndBrille.click();
        return this;
    }

    /**
     * Click on Heimwerken Garten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHeimwerkenGartenLink() {
        heimwerkenGarten.click();
        return this;
    }

    /**
     * Click on Heizl Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHeizlLink() {
        heizl.click();
        return this;
    }

    /**
     * Click on Heizlvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHeizlvergleichLink() {
        heizlvergleich.click();
        return this;
    }

    /**
     * Click on Heizstrom Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHeizstromLink() {
        heizstrom.click();
        return this;
    }

    /**
     * Click on Heizstromvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHeizstromvergleichLink() {
        heizstromvergleich.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHierKontoAnlegen1Link() {
        hierKontoAnlegen1.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHierKontoAnlegen2Link() {
        hierKontoAnlegen2.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHierKontoAnlegen3Link() {
        hierKontoAnlegen3.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHierKontoAnlegen4Link() {
        hierKontoAnlegen4.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHochzeit1Link() {
        hochzeit1.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHochzeit2Link() {
        hochzeit2.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHochzeitsfotograf1Link() {
        hochzeitsfotograf1.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHochzeitsfotograf2Link() {
        hochzeitsfotograf2.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHochzeitssnger1Link() {
        hochzeitssnger1.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHochzeitssnger2Link() {
        hochzeitssnger2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotel1Link() {
        hotel1.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotel2Link() {
        hotel2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotel3Link() {
        hotel3.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotel4Link() {
        hotel4.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelBerlin1Link() {
        hotelBerlin1.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelBerlin2Link() {
        hotelBerlin2.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelMnchen1Link() {
        hotelMnchen1.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelMnchen2Link() {
        hotelMnchen2.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelParis1Link() {
        hotelParis1.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelParis2Link() {
        hotelParis2.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelRom1Link() {
        hotelRom1.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelRom2Link() {
        hotelRom2.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelsucheWeltweit1Link() {
        hotelsucheWeltweit1.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelsucheWeltweit2Link() {
        hotelsucheWeltweit2.click();
        return this;
    }

    /**
     * Click on Hotelvergleiche Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHotelvergleicheLink() {
        hotelvergleiche.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHundehaftpflicht1Link() {
        hundehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHundehaftpflicht2Link() {
        hundehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHundekrankenversicherung1Link() {
        hundekrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickHundekrankenversicherung2Link() {
        hundekrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Immobilienfinanzierung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickImmobilienfinanzierungLink() {
        immobilienfinanzierung.click();
        return this;
    }

    /**
     * Click on Internet Dsl Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickInternetDslLink() {
        internetDsl.click();
        return this;
    }

    /**
     * Click on Internet Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickInternetLink() {
        internet.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickInternetanbieter1Link() {
        internetanbieter1.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickInternetanbieter2Link() {
        internetanbieter2.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickIphoneXMitVertrag1Link() {
        iphoneXMitVertrag1.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickIphoneXMitVertrag2Link() {
        iphoneXMitVertrag2.click();
        return this;
    }
//
//    /**
//     * Click on Jetzt Anmelden Link.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage clickJetztAnmeldenLink() {
//        jetztAnmelden.click();
//        return this;
//    }
//
//    /**
//     * Click on Jetzt Anmelden Link.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage clickJetztAnmeldenLink() {
//        jetztAnmelden.click();
//        return this;
//    }

    /**
     * Click on Jetzt Autoteile Reifenzum Besten Preis Sichern Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickJetztAutoteileReifenzumBestenLink() {
        jetztAutoteileReifenzumBesten.click();
        return this;
    }

    /**
     * Click on Jetzt Registrieren Button.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickJetztRegistrieren1Button() {
        jetztRegistrieren1.click();
        return this;
    }

    /**
     * Click on Jetzt Registrieren Button.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickJetztRegistrieren2Button() {
        jetztRegistrieren2.click();
        return this;
    }

    /**
     * Click on Jetzt Vorliegendesbaufinanzierungsangebotgratis Checken Lassen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickJetztVorliegendesbaufinanzierungsangebotgratisCheckenLassenLink() {
        jetztVorliegendesbaufinanzierungsangebotgratisCheckenLassen.click();
        return this;
    }

    /**
     * Click on Kaffeemaschinen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKaffeemaschinenLink() {
        kaffeemaschinen.click();
        return this;
    }

    /**
     * Click on Kaffeevollautomaten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKaffeevollautomatenLink() {
        kaffeevollautomaten.click();
        return this;
    }

    /**
     * Click on Kapitalbeschaffung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKapitalbeschaffungLink() {
        kapitalbeschaffung.click();
        return this;
    }

    /**
     * Click on Karriere Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKarriereLink() {
        karriere.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKfzversicherung1Link() {
        kfzversicherung1.click();
        return this;
    }

    /**
     * Click on Kfzversicherung 1 Monat Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKfzversicherung1MonatGratis1Link() {
        kfzversicherung1MonatGratis1.click();
        return this;
    }

    /**
     * Click on Kfzversicherung 1 Monat Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKfzversicherung1MonatGratis2Link() {
        kfzversicherung1MonatGratis2.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKfzversicherung2Link() {
        kfzversicherung2.click();
        return this;
    }

    /**
     * Click on Klavierlehrer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKlavierlehrerLink() {
        klavierlehrer.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKogas1Link() {
        kogas1.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKogas2Link() {
        kogas2.click();
        return this;
    }

    /**
     * Click on Kontakt Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKontaktLink() {
        kontakt.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKontoKredit1Link() {
        kontoKredit1.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKontoKredit2Link() {
        kontoKredit2.click();
        return this;
    }

    /**
     * Click on Kontomanager Finanzen Verwalten Und Optimieren Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKontomanagerFinanzenVerwaltenUndOptimierenLink() {
        kontomanagerFinanzenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Kontomanager Ihre Finanzen An Einem Ort Verwalten Und Optimieren Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKontomanagerIhreFinanzenAnEinemLink() {
        kontomanagerIhreFinanzenAnEinem.click();
        return this;
    }

    /**
     * Click on Kontomanager Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKontomanagerLink() {
        kontomanager.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKostrom1Link() {
        kostrom1.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKostrom2Link() {
        kostrom2.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz 6 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKrankenhauszusatz6MonateGratis1Link() {
        krankenhauszusatz6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz 6 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKrankenhauszusatz6MonateGratis2Link() {
        krankenhauszusatz6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKrankenkassen1Link() {
        krankenkassen1.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKrankenkassen2Link() {
        krankenkassen2.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKrankenzusatzversicherung1Link() {
        krankenzusatzversicherung1.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKrankenzusatzversicherung2Link() {
        krankenzusatzversicherung2.click();
        return this;
    }

    /**
     * Click on Kredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditLink() {
        kredit.click();
        return this;
    }

    /**
     * Click on Kreditcenter Ihre Aktuellen Kreditanfragen Und Kreditzusagen Auf Einen Blick Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditcenterIhreAktuellenKreditanfragenUndLink() {
        kreditcenterIhreAktuellenKreditanfragenUnd.click();
        return this;
    }

    /**
     * Click on Kreditcenter Kreditantrge Abschlsse Auf Einen Blick Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditcenterKreditantrgeAbschlsseAufLink() {
        kreditcenterKreditantrgeAbschlsseAuf.click();
        return this;
    }

    /**
     * Click on Kreditcenter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditcenterLink() {
        kreditcenter.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditkarte1Link() {
        kreditkarte1.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditkarte2Link() {
        kreditkarte2.click();
        return this;
    }

    /**
     * Click on Kreditrechner Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditrechnerLink() {
        kreditrechner.click();
        return this;
    }

    /**
     * Click on Kreditvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKreditvergleichLink() {
        kreditvergleich.click();
        return this;
    }

    /**
     * Click on Kundenkontocheck24.de Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickKundenkontocheck24DeLink() {
        kundenkontocheck24De.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLastMinute1Link() {
        lastMinute1.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLastMinute2Link() {
        lastMinute2.click();
        return this;
    }

    /**
     * Click on Lego Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLegoLink() {
        lego.click();
        return this;
    }

    /**
     * Click on Leuchten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLeuchtenLink() {
        leuchten.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLfilter1Link() {
        lfilter1.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLfilter2Link() {
        lfilter2.click();
        return this;
    }

    /**
     * Click on Lte Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLteLink() {
        lte.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLuftfilter1Link() {
        luftfilter1.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickLuftfilter2Link() {
        luftfilter2.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMatheNachhilfe1Link() {
        matheNachhilfe1.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMatheNachhilfe2Link() {
        matheNachhilfe2.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMbeltransport1Link() {
        mbeltransport1.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMbeltransport2Link() {
        mbeltransport2.click();
        return this;
    }

    /**
     * Click on Mehr... Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMehrLink() {
        mehr.click();
        return this;
    }

    /**
     * Click on Mein Konto Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMeinKontoLink() {
        meinKonto.click();
        return this;
    }

    /**
     * Click on Meine Aktivitten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMeineAktivittenLink() {
        meineAktivitten.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagen1Link() {
        mietwagen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagen2Link() {
        mietwagen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagen3Link() {
        mietwagen3.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagen4Link() {
        mietwagen4.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagen5Link() {
        mietwagen5.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenDeutschland1Link() {
        mietwagenDeutschland1.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenDeutschland2Link() {
        mietwagenDeutschland2.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenGoldclub1Link() {
        mietwagenGoldclub1.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenGoldclub2Link() {
        mietwagenGoldclub2.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenMallorca1Link() {
        mietwagenMallorca1.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenMallorca2Link() {
        mietwagenMallorca2.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenRundreisen1Link() {
        mietwagenRundreisen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenRundreisen2Link() {
        mietwagenRundreisen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenSpanien1Link() {
        mietwagenSpanien1.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenSpanien2Link() {
        mietwagenSpanien2.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenUsa1Link() {
        mietwagenUsa1.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMietwagenUsa2Link() {
        mietwagenUsa2.click();
        return this;
    }

    /**
     * Click on Modernisierung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickModernisierungLink() {
        modernisierung.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMotorradversicherung1Link() {
        motorradversicherung1.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMotorradversicherung2Link() {
        motorradversicherung2.click();
        return this;
    }

    /**
     * Click on Musikunterricht Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickMusikunterrichtLink() {
        musikunterricht.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNachhilfe1Link() {
        nachhilfe1.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNachhilfe2Link() {
        nachhilfe2.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNachtspeicherheizung1Link() {
        nachtspeicherheizung1.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNachtspeicherheizung2Link() {
        nachtspeicherheizung2.click();
        return this;
    }

    /**
     * Click on Neuanmeldung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNeuanmeldungLink() {
        neuanmeldung.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNotebooks1Link() {
        notebooks1.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNotebooks2Link() {
        notebooks2.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNurBis10101Link() {
        nurBis10101.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNurBis10102Link() {
        nurBis10102.click();
        return this;
    }

    /**
     * Click on Nutzungsbedingungen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNutzungsbedingungen1Link() {
        nutzungsbedingungen1.click();
        return this;
    }

    /**
     * Click on Nutzungsbedingungen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickNutzungsbedingungen2Link() {
        nutzungsbedingungen2.click();
        return this;
    }

    /**
     * Click on Ok Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickOkLink() {
        ok.click();
        return this;
    }

    /**
     * Click on Partner Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPartnerLink() {
        partner.click();
        return this;
    }

    /**
     * Click on Partnerprogramm Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPartnerprogrammLink() {
        partnerprogramm.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPasswortVergessen1Link() {
        passwortVergessen1.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPasswortVergessen2Link() {
        passwortVergessen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPauschalreisen1Link() {
        pauschalreisen1.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPauschalreisen2Link() {
        pauschalreisen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Zu Den Besten Preisen Buchen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPauschalreisenZuDenBestenPreisenLink() {
        pauschalreisenZuDenBestenPreisen.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPersonalTrainer1Link() {
        personalTrainer1.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPersonalTrainer2Link() {
        personalTrainer2.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPferdehaftpflicht1Link() {
        pferdehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPferdehaftpflicht2Link() {
        pferdehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Pflegeversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPflegeversicherungLink() {
        pflegeversicherung.click();
        return this;
    }

    /**
     * Click on Pflegezusatzversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPflegezusatzversicherungLink() {
        pflegezusatzversicherung.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrepaidUnd1monatstarife1Link() {
        prepaidUnd1monatstarife1.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrepaidUnd1monatstarife2Link() {
        prepaidUnd1monatstarife2.click();
        return this;
    }

    /**
     * Click on Presse Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPresseLink() {
        presse.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrivateKrankenversicherung1Link() {
        privateKrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrivateKrankenversicherung2Link() {
        privateKrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrivaterYogalehrer1Link() {
        privaterYogalehrer1.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrivaterYogalehrer2Link() {
        privaterYogalehrer2.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht 12 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrivathaftpflicht12MonateGratis1Link() {
        privathaftpflicht12MonateGratis1.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht 12 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickPrivathaftpflicht12MonateGratis2Link() {
        privathaftpflicht12MonateGratis2.click();
        return this;
    }

    /**
     * Click on Profis Fr Ihr Projekt Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickProfisFrIhrProjektLink() {
        profisFrIhrProjekt.click();
        return this;
    }

    /**
     * Click on Profis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickProfisLink() {
        profis.click();
        return this;
    }

    /**
     * Click on Rasierer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRasiererLink() {
        rasierer.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRatenkredit1Link() {
        ratenkredit1.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRatenkredit2Link() {
        ratenkredit2.click();
        return this;
    }

    /**
     * Click on Ratgeber Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRatgeberLink() {
        ratgeber.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung 3 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRechtsschutzversicherung3MonateGratis1Link() {
        rechtsschutzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung 3 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRechtsschutzversicherung3MonateGratis2Link() {
        rechtsschutzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Reifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReifenLink() {
        reifen.click();
        return this;
    }

    /**
     * Click on Reise Flug Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseFlugLink() {
        reiseFlug.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseGoldclub1Link() {
        reiseGoldclub1.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseGoldclub2Link() {
        reiseGoldclub2.click();
        return this;
    }

    /**
     * Click on Reise Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseLink() {
        reise.click();
        return this;
    }

    /**
     * Click on Reisevergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReisevergleichLink() {
        reisevergleich.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseversicherung1Link() {
        reiseversicherung1.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseversicherung2Link() {
        reiseversicherung2.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseweltBestenlisten1Link() {
        reiseweltBestenlisten1.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickReiseweltBestenlisten2Link() {
        reiseweltBestenlisten2.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRentenversicherung1Link() {
        rentenversicherung1.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRentenversicherung2Link() {
        rentenversicherung2.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung 3 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRisikolebensversicherung3MonateGratis1Link() {
        risikolebensversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung 3 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickRisikolebensversicherung3MonateGratis2Link() {
        risikolebensversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Scheibenwischer Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickScheibenwischerLink() {
        scheibenwischer.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSchutzbriefautomobilclub1Link() {
        schutzbriefautomobilclub1.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSchutzbriefautomobilclub2Link() {
        schutzbriefautomobilclub2.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSchutzbriefautomobilclub3Link() {
        schutzbriefautomobilclub3.click();
        return this;
    }

    /**
     * Click on Senden Button.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSendenButton() {
        senden.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickShoppingLink() {
        shopping.click();
        return this;
    }

    /**
     * Click on Sie Sind Selbst Profi Und Auf Der Suche Nach Neuen Kunden Jetzt Anmelden Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSieSindSelbstProfiUndAufLink() {
        sieSindSelbstProfiUndAuf.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSmartphones1Link() {
        smartphones1.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSmartphones2Link() {
        smartphones2.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSommerreifen1Link() {
        sommerreifen1.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSommerreifen2Link() {
        sommerreifen2.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSpielwaren1Link() {
        spielwaren1.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSpielwaren2Link() {
        spielwaren2.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSportWellness1Link() {
        sportWellness1.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSportWellness2Link() {
        sportWellness2.click();
        return this;
    }

    /**
     * Click on Starten Sie Hier. Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStartenSieHier1Link() {
        startenSieHier1.click();
        return this;
    }

    /**
     * Click on Starten Sie Hier. Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStartenSieHier2Link() {
        startenSieHier2.click();
        return this;
    }

    /**
     * Click on Staubsauger Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStaubsaugerLink() {
        staubsauger.click();
        return this;
    }

    /**
     * Click on Stdtereisen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStdtereisenLink() {
        stdtereisen.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSterbegeldversicherung1Link() {
        sterbegeldversicherung1.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickSterbegeldversicherung2Link() {
        sterbegeldversicherung2.click();
        return this;
    }

    /**
     * Click on Strom Gas Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStromGasLink() {
        stromGas.click();
        return this;
    }

    /**
     * Click on Stromanbieter Wechseln Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStromanbieterWechselnLink() {
        stromanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Strompreise Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStrompreiseLink() {
        strompreise.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStromvergleich1Link() {
        stromvergleich1.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickStromvergleich2Link() {
        stromvergleich2.click();
        return this;
    }

    /**
     * Click on Tabletpcs Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTabletpcsLink() {
        tabletpcs.click();
        return this;
    }

    /**
     * Click on Tablets Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTabletsLink() {
        tablets.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTagesgeld1Link() {
        tagesgeld1.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTagesgeld2Link() {
        tagesgeld2.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTarifeFrJungeLeute1Link() {
        tarifeFrJungeLeute1.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTarifeFrJungeLeute2Link() {
        tarifeFrJungeLeute2.click();
        return this;
    }

    /**
     * Click on Tilgungsrechner Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTilgungsrechnerLink() {
        tilgungsrechner.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Gypten Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTop10HotelsGyptenLink() {
        top10HotelsGypten.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Kanaren Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTop10HotelsKanarenLink() {
        top10HotelsKanaren.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Mallorca Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickTop10HotelsMallorcaLink() {
        top10HotelsMallorca.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUmschuldung1Link() {
        umschuldung1.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUmschuldung2Link() {
        umschuldung2.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUmzugsunternehmen1Link() {
        umzugsunternehmen1.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUmzugsunternehmen2Link() {
        umzugsunternehmen2.click();
        return this;
    }

    /**
     * Click on Unfallversicherung 6 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUnfallversicherung6MonateGratis1Link() {
        unfallversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Unfallversicherung 6 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUnfallversicherung6MonateGratis2Link() {
        unfallversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Unternehmen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUnternehmenLink() {
        unternehmen.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUrlaubsfinder1Link() {
        urlaubsfinder1.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickUrlaubsfinder2Link() {
        urlaubsfinder2.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVeranstaltungenEvents1Link() {
        veranstaltungenEvents1.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVeranstaltungenEvents2Link() {
        veranstaltungenEvents2.click();
        return this;
    }

    /**
     * Click on Versicherungen Kfz Rechtsschutz Uvm. Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVersicherungenKfzRechtsschutzUvmLink() {
        versicherungenKfzRechtsschutzUvm.click();
        return this;
    }

    /**
     * Click on Versicherungen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVersicherungenLink() {
        versicherungen.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Deals Bis Zu 12 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVersicherungjubilumsDealsBisZu121Link() {
        versicherungjubilumsDealsBisZu121.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Deals Bis Zu 12 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVersicherungjubilumsDealsBisZu122Link() {
        versicherungjubilumsDealsBisZu122.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Ihr Digitaler Versicherungsordner Bedarf Und Vertrge Richtig Prfen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVersicherungscenterIhrDigitalerVersicherungsordnerBedarfLink() {
        versicherungscenterIhrDigitalerVersicherungsordnerBedarf.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVersicherungscenterLink() {
        versicherungscenter.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Versicherungen Verwalten Und Optimieren Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickVersicherungscenterVersicherungenVerwaltenUndOptimierenLink() {
        versicherungscenterVersicherungenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWaschmaschinen1Link() {
        waschmaschinen1.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWaschmaschinen2Link() {
        waschmaschinen2.click();
        return this;
    }

    /**
     * Click on Weiter Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWeiterLink() {
        weiter.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWinterreifen1Link() {
        winterreifen1.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWinterreifen2Link() {
        winterreifen2.click();
        return this;
    }

    /**
     * Click on Wischblatt Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWischblattLink() {
        wischblatt.click();
        return this;
    }

    /**
     * Click on Wohngebudeversicherung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWohngebudeversicherungLink() {
        wohngebudeversicherung.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWrmepumpe1Link() {
        wrmepumpe1.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickWrmepumpe2Link() {
        wrmepumpe2.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung 3 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZahnzusatzversicherung3MonateGratis1Link() {
        zahnzusatzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung 3 Monate Gratis Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZahnzusatzversicherung3MonateGratis2Link() {
        zahnzusatzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Zins Schnellcheck Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZinsSchnellcheckLink() {
        zinsSchnellcheck.click();
        return this;
    }

    /**
     * Click on Zu Allen Kategorien Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZuAllenKategorienLink() {
        zuAllenKategorien.click();
        return this;
    }

    /**
     * Click on Zur Anmeldung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZurAnmeldungLink() {
        zurAnmeldung.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZurck1Link() {
        zurck1.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZurck2Link() {
        zurck2.click();
        return this;
    }

    /**
     * Click on Zurck Zur Anmeldung Link.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage clickZurckZurAnmeldungLink() {
        zurckZurAnmeldung.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage fill() {
//        set24241234TextField089();
        setVersicherungJubilumsDealsBisZu2TextField();
        setEmailadresseIstNichtKorrekt1EmailField();
        setPasswortAuswhlen1PasswordField();
        setEmailadresseIstNichtKorrekt2EmailField();
        setPasswortAuswhlen2PasswordField();
        setEmailadresseIstNichtKorrekt3EmailField();
        setEmailadresseIstNichtKorrekt4EmailField();
        setPasswortAuswhlen3PasswordField();
        setBitteWiederholenSieIhrPasswortPasswordField();
        setEmailadresseTextField();
        setPasswortAuswhlen4PasswordField();
        setPasswortWiederholenPasswordField();
        return this;
    }

//    /**
//     * Fill every fields in the page and submit it to target page.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage fillAndSubmit() {
//        fill();
//        return submit();
//    }

//    /**
//     * Set default value to 089 24 24 12 34 Text field.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage set24241234TextField089() {
//        return set24241234TextField089(data.get("24_24_12_34_089"));
//    }
//
//    /**
//     * Set value to 089 24 24 12 34 Text field.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage set24241234TextField089(String 24241234Value089) {
//        _24241234089.sendKeys(24241234Value089);
//        return this;
//    }

    /**
     * Set default value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setBitteWiederholenSieIhrPasswortPasswordField() {
        return setBitteWiederholenSieIhrPasswortPasswordField(data.get("BITTE_WIEDERHOLEN_SIE_IHR_PASSWORT"));
    }

    /**
     * Set value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setBitteWiederholenSieIhrPasswortPasswordField(String bitteWiederholenSieIhrPasswortValue) {
        bitteWiederholenSieIhrPasswort.sendKeys(bitteWiederholenSieIhrPasswortValue);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt1EmailField() {
        return setEmailadresseIstNichtKorrekt1EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_1"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt1EmailField(String emailadresseIstNichtKorrekt1Value) {
        emailadresseIstNichtKorrekt1.sendKeys(emailadresseIstNichtKorrekt1Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt2EmailField() {
        return setEmailadresseIstNichtKorrekt2EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_2"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt2EmailField(String emailadresseIstNichtKorrekt2Value) {
        emailadresseIstNichtKorrekt2.sendKeys(emailadresseIstNichtKorrekt2Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt3EmailField() {
        return setEmailadresseIstNichtKorrekt3EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_3"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt3EmailField(String emailadresseIstNichtKorrekt3Value) {
        emailadresseIstNichtKorrekt3.sendKeys(emailadresseIstNichtKorrekt3Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt4EmailField() {
        return setEmailadresseIstNichtKorrekt4EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_4"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseIstNichtKorrekt4EmailField(String emailadresseIstNichtKorrekt4Value) {
        emailadresseIstNichtKorrekt4.sendKeys(emailadresseIstNichtKorrekt4Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Text field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseTextField() {
        return setEmailadresseTextField(data.get("EMAILADRESSE"));
    }

    /**
     * Set value to Emailadresse Text field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setEmailadresseTextField(String emailadresseValue) {
        emailadresse.sendKeys(emailadresseValue);
        return this;
    }

    /**
     * Set default value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen1PasswordField() {
        return setPasswortAuswhlen1PasswordField(data.get("PASSWORT_AUSWHLEN_1"));
    }

    /**
     * Set value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen1PasswordField(String passwortAuswhlen1Value) {
        passwortAuswhlen1.sendKeys(passwortAuswhlen1Value);
        return this;
    }

    /**
     * Set default value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen2PasswordField() {
        return setPasswortAuswhlen2PasswordField(data.get("PASSWORT_AUSWHLEN_2"));
    }

    /**
     * Set value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen2PasswordField(String passwortAuswhlen2Value) {
        passwortAuswhlen2.sendKeys(passwortAuswhlen2Value);
        return this;
    }

    /**
     * Set default value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen3PasswordField() {
        return setPasswortAuswhlen3PasswordField(data.get("PASSWORT_AUSWHLEN_3"));
    }

    /**
     * Set value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen3PasswordField(String passwortAuswhlen3Value) {
        passwortAuswhlen3.sendKeys(passwortAuswhlen3Value);
        return this;
    }

    /**
     * Set default value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen4PasswordField() {
        return setPasswortAuswhlen4PasswordField(data.get("PASSWORT_AUSWHLEN_4"));
    }

    /**
     * Set value to Passwort Auswhlen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortAuswhlen4PasswordField(String passwortAuswhlen4Value) {
        passwortAuswhlen4.sendKeys(passwortAuswhlen4Value);
        return this;
    }

    /**
     * Set default value to Passwort Wiederholen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortWiederholenPasswordField() {
        return setPasswortWiederholenPasswordField(data.get("PASSWORT_WIEDERHOLEN"));
    }

    /**
     * Set value to Passwort Wiederholen Password field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setPasswortWiederholenPasswordField(String passwortWiederholenValue) {
        passwortWiederholen.sendKeys(passwortWiederholenValue);
        return this;
    }

    /**
     * Set default value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setVersicherungJubilumsDealsBisZu1TextField() {
        return setVersicherungJubilumsDealsBisZu1TextField(data.get("VERSICHERUNG_JUBILUMS_DEALS_BIS_ZU_1"));
    }

    /**
     * Set value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setVersicherungJubilumsDealsBisZu1TextField(String versicherungJubilumsDealsBisZu1Value) {
        versicherungJubilumsDealsBisZu1.click();
        return this;
    }

    /**
     * Set default value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setVersicherungJubilumsDealsBisZu2TextField() {
        return setVersicherungJubilumsDealsBisZu2TextField(data.get("VERSICHERUNG_JUBILUMS_DEALS_BIS_ZU_2"));
    }

    /**
     * Set value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage setVersicherungJubilumsDealsBisZu2TextField(String versicherungJubilumsDealsBisZu2Value) {
        versicherungJubilumsDealsBisZu2.sendKeys(versicherungJubilumsDealsBisZu2Value);
        return this;
    }

//    /**
//     * Submit the form to target page.
//     *
//     * @return the UserRegistrationPage class instance.
//     */
//    public UserRegistrationPage submit() {
//        clickJetztRegistrierenButton();
//        return this;
//    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the UserRegistrationPage class instance.
     */
    public UserRegistrationPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
