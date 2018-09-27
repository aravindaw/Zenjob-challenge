package com.aravinda.app.Pages;

import com.aravinda.app.scripts.StartDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class UserAccountPage extends StartDriver {
    private Map<String, String> data;
//    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "c24-search-header")
    @CacheLookup
    private WebElement _24241234089;

    @FindBy(css = "a[title='Abmelden']")
    @CacheLookup
    private WebElement abmelden;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement adresseAnzeigen;

    @FindBy(css = "a[title='AGB Datenschutz Impressum']")
    @CacheLookup
    private WebElement agbDatenschutzImpressum;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement aktivittenAnzeigen;

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
//    @FindBy(css = "a.c24-button.c24-customer-login-opener")
//    @CacheLookup
//    private WebElement anmelden2;
//
//    @FindBy(id = "c24-cl-register-login")
//    @CacheLookup
//    private WebElement anmelden2;
//
//    @FindBy(id = "c24-cl-pw-btn")
//    @CacheLookup
//    private WebElement anmelden2;

    @FindBy(css = "button.points_register")
    @CacheLookup
    private WebElement anmeldenUnd50WillkommenspunkteSichern;

    @FindBy(css = "a[title='Anschlussfinanzierung']")
    @CacheLookup
    private WebElement anschlussfinanzierung;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement anzeigen1;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement anzeigen2;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(4) a:nth-of-type(1)")
    @CacheLookup
    private WebElement anzeigen3;

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

    @FindBy(css = "a[href='/user/clickout.html?url=https%3A%2F%2Fcheck24.de%2Fversicherungsordner%2Fvertraege%2Fbedarfsrechner%2F']")
    @CacheLookup
    private WebElement bedarfPrfen;

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

    @FindBy(id = "cl_pw_prefill")
    @CacheLookup
    private WebElement bitteGebenSieIhrPasswortEin1;

    @FindBy(id = "cl_pw")
    @CacheLookup
    private WebElement bitteGebenSieIhrPasswortEin2;

    @FindBy(id = "cl_pw_register")
    @CacheLookup
    private WebElement bitteWhlenSieEinPasswort;

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
    private WebElement check24Punkte1;

    @FindBy(css = "#c24-kb-advantagelist ul.tileset.multible-tile li.bordered.arrowed a.faux-block-link__overlay-link")
    @CacheLookup
    private WebElement check24Punkte2;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement check24PunkteAnzeigen;

    @FindBy(css = "a[title='Computer & Konsole']")
    @CacheLookup
    private WebElement computerKonsole;

    @FindBy(css = "a[href='https://www.check24.de/unternehmen/cookiehinweis/']")
    @CacheLookup
    private WebElement cookies;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=sidenavi']")
    @CacheLookup
    private WebElement datentarife1;

    @FindBy(css = "a[href='//www.check24.de/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=topnavi']")
    @CacheLookup
    private WebElement datentarife2;

    @FindBy(css = "a[title='Depot']")
    @CacheLookup
    private WebElement depot;

    @FindBy(css = "button.js-push-btn.button.button--link")
    @CacheLookup
    private WebElement desktopBenachrichtigungenEinschalten;

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

    @FindBy(css = "#c24-kb-ua-improvements div.flex div:nth-of-type(3) div:nth-of-type(1) a.faux-block-link__overlay-link")
    @CacheLookup
    private WebElement energie;

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

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement gutscheineGuthabenAnzeigen;

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

    @FindBy(css = "#c24-kb-ua-improvements div.flex div:nth-of-type(1) div:nth-of-type(1) a.faux-block-link__overlay-link")
    @CacheLookup
    private WebElement ihreKonten1;

    @FindBy(css = "#c24-kb-ua-improvements div.flex div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement ihreKonten2;

    @FindBy(css = "#c24-kb-ua-improvements div.flex div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement ihreVertrge1;

    @FindBy(css = "#c24-kb-ua-improvements div.flex div:nth-of-type(3) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement ihreVertrge2;

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

    @FindBy(css = "#c24-cl-form-user-register div.c24-cl-content-top div:nth-of-type(3) div:nth-of-type(4) a.c24-customer-login-opener")
    @CacheLookup
    private WebElement jetztAnmelden;
//
//    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(4) a")
//    @CacheLookup
//    private WebElement jetztAnmelden;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement jetztAutoteileReifenzumBesten;

    @FindBy(css = "#c24-cl-form-user-register div.c24-cl-content-top input.c24-button[type='submit']")
    @CacheLookup
    private WebElement jetztRegistrieren;

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

    @FindBy(css = "a[href='https://www.check24.de/unternehmen/kontakt/?sec=c24']")
    @CacheLookup
    private WebElement kontaktseite;

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
    private WebElement kredit1;

    @FindBy(css = "a[href='/user/clickout.html?url=https%3A%2F%2Fkredit.check24.de%2Fca%2Foverview%3Fref%3Dholding-ca']")
    @CacheLookup
    private WebElement kredit2;

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

    @FindBy(id = "btn-promo-sms")
    @CacheLookup
    private WebElement linkAnMeinHandySenden;

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

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(5) a:nth-of-type(1)")
    @CacheLookup
    private WebElement ndern;

    @FindBy(css = "button.button-left.button-cancel.grey")
    @CacheLookup
    private WebElement neinDanke;

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

    @FindBy(css = "a.c24-cookie-button")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "button.button-right.button-ok")
    @CacheLookup
    private WebElement okVerstanden;

    private final String pageLoadedText = "E-Mail-Adressen der einzelnen Bereiche finden";

    private final String pageUrl = "/user/account.html";

    @FindBy(css = "a[title='Partner']")
    @CacheLookup
    private WebElement partner;

    @FindBy(css = "a[title='Partnerprogramm']")
    @CacheLookup
    private WebElement partnerprogramm;

    @FindBy(css = "#c24-cl-form-user-login-prefill div.c24-cl-user-prefill div:nth-of-type(1) div:nth-of-type(5) div.c24-cl-input-wrapper.c24-cl-input-pw-wrapper div:nth-of-type(1) a.c24-cl-pwf")
    @CacheLookup
    private WebElement passwortVergessen1;

    @FindBy(css = "#c24-cl-form-user-login div:nth-of-type(2) div.c24-cl-content-top div:nth-of-type(5) div.c24-cl-input-wrapper div:nth-of-type(1) a.c24-cl-pwf")
    @CacheLookup
    private WebElement passwortVergessen2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement pauschalreisen1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement pauschalreisen2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement pauschalreisenZuDenBestenPreisen;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(5) a:nth-of-type(2)")
    @CacheLookup
    private WebElement persnlicheDatenAnzeigen;

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

    @FindBy(css = "a[title='CHECK24 - Vergleichsportal - Produktübersicht']")
    @CacheLookup
    private WebElement produktenDerCheck24Gruppe;

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

    @FindBy(css = "#c24-dialog-points-modal div.c24-dialog-box header button.dialog-box-close.button-cancel.close")
    @CacheLookup
    private WebElement schliessen1;

    @FindBy(css = "#c24-dialog-pushnotification-modal div.c24-dialog-box header button.dialog-box-close.button-cancel.close")
    @CacheLookup
    private WebElement schliessen2;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement schutzbriefautomobilclub1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement schutzbriefautomobilclub2;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement schutzbriefautomobilclub3;

    @FindBy(id = "mobilenumber")
    @CacheLookup
    private WebElement sehenSieIhreAktivittenGutscheineUnd;

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

    @FindBy(css = "a.c24-meinkonto-reflink.c24-customer-register-opener")
    @CacheLookup
    private WebElement startenSieHier;

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

    @FindBy(css = "a[title='Teilnahmebedingungen']")
    @CacheLookup
    private WebElement teilnahmebedingungen;

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

    @FindBy(id = "date-filter")
    @CacheLookup
    private WebElement umDieVorteileDesCheck24Punkte1;

    @FindBy(id = "search-field")
    @CacheLookup
    private WebElement umDieVorteileDesCheck24Punkte2;

    @FindBy(id = "termsaccepted")
    @CacheLookup
    private WebElement umDieVorteileDesCheck24Punkte3;

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
    private WebElement versicherungen1;

    @FindBy(css = "#c24-kb-ua-improvements div.flex div:nth-of-type(2) div:nth-of-type(1) a.faux-block-link__overlay-link")
    @CacheLookup
    private WebElement versicherungen2;

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
    private WebElement versicherungscenterIhrDigitalerVersicherungsordner;

    @FindBy(css = "#c24-ver li:nth-of-type(6) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement versicherungscenterVersicherungenVerwaltenUndOptimieren;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement verwalten1;

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement verwalten2;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement waschmaschinen1;

    @FindBy(css = "#c24-sho li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement waschmaschinen2;

    @FindBy(id = "c24-cl-user-btn")
    @CacheLookup
    private WebElement weiter;

    @FindBy(css = "a[href='/user/clickout.html?url=https%3A%2F%2Fhomecenter.energie.check24.de%2Fmytimeline']")
    @CacheLookup
    private WebElement wichtigeTermine;

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

    @FindBy(css = "#c24-kb-container div.c24-kb-ua-container div:nth-of-type(2) div.c24-grid-12.c24-grid-center.alpha.omega.clearfix div.bar.grid.grid--gutters div:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement zahlungsdatenAnzeigen;

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

    public UserAccountPage() {
    }

    public UserAccountPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public UserAccountPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public UserAccountPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Abmelden Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAbmeldenLink() {
        abmelden.click();
        return this;
    }

    /**
     * Click on Adresse Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAdresseAnzeigenLink() {
        adresseAnzeigen.click();
        return this;
    }

    /**
     * Click on Agb Datenschutz Impressum Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAgbDatenschutzImpressumLink() {
        agbDatenschutzImpressum.click();
        return this;
    }

    /**
     * Click on Aktivitten Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAktivittenAnzeigenLink() {
        aktivittenAnzeigen.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAllInclusive1Link() {
        allInclusive1.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAllInclusive2Link() {
        allInclusive2.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAlleKategorien1Link() {
        alleKategorien1.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAlleKategorien2Link() {
        alleKategorien2.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAlleKategorien3Link() {
        alleKategorien3.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAlleKategorien4Link() {
        alleKategorien4.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAlleKategorienLink() {
        alleKategorien.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAllnetFlatTarife1Link() {
        allnetFlatTarife1.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAllnetFlatTarife2Link() {
        allnetFlatTarife2.click();
        return this;
    }

    /**
     * Click on Anbieter Mit Prmie Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnbieterMitPrmieLink() {
        anbieterMitPrmie.click();
        return this;
    }

    /**
     * Click on Anmelden Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnmelden1Button() {
        anmelden1.click();
        return this;
    }

    /**
     * Click on Anmelden Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnmelden1Link() {
        anmelden1.click();
        return this;
    }

//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage clickAnmelden1Link() {
//        anmelden1.click();
//        return this;
//    }
//
//    /**
//     * Click on Anmelden Button.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage clickAnmelden2Button() {
//        anmelden2.click();
//        return this;
//    }

//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage clickAnmelden2Link() {
//        anmelden2.click();
//        return this;
//    }
//
//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage clickAnmelden2Link() {
//        anmelden2.click();
//        return this;
//    }

    /**
     * Click on Anmelden Und 50 Willkommenspunkte Sichern Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnmeldenUnd50WillkommenspunkteSichernButton() {
        anmeldenUnd50WillkommenspunkteSichern.click();
        return this;
    }

    /**
     * Click on Anschlussfinanzierung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnschlussfinanzierungLink() {
        anschlussfinanzierung.click();
        return this;
    }

    /**
     * Click on Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnzeigen1Link() {
        anzeigen1.click();
        return this;
    }

    /**
     * Click on Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnzeigen2Link() {
        anzeigen2.click();
        return this;
    }

    /**
     * Click on Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAnzeigen3Link() {
        anzeigen3.click();
        return this;
    }

    /**
     * Click on Auto Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutoLink() {
        auto.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutokredit1Link() {
        autokredit1.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutokredit2Link() {
        autokredit2.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutokredit3Link() {
        autokredit3.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutoreifen1Link() {
        autoreifen1.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutoreifen2Link() {
        autoreifen2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutoteile1Link() {
        autoteile1.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutoteile2Link() {
        autoteile2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickAutoteile3Link() {
        autoteile3.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBand1Link() {
        band1.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBand2Link() {
        band2.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBaufinanzierung1Link() {
        baufinanzierung1.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBaufinanzierung2Link() {
        baufinanzierung2.click();
        return this;
    }

    /**
     * Click on Baufinanzierungsrechner Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBaufinanzierungsrechnerLink() {
        baufinanzierungsrechner.click();
        return this;
    }

    /**
     * Click on Beauty Wellness Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBeautyWellnessLink() {
        beautyWellness.click();
        return this;
    }

    /**
     * Click on Bedarf Prfen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBedarfPrfenLink() {
        bedarfPrfen.click();
        return this;
    }

    /**
     * Click on Beim Dsl Tarifvergleichexklusive Cashbackssichern Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBeimDslTarifvergleichexklusiveCashbackssichernLink() {
        beimDslTarifvergleichexklusiveCashbackssichern.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionangebote Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBer1MillionangeboteLink() {
        ber1Millionangebote.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionhotels Weltweit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBer1MillionhotelsWeltweitLink() {
        ber1MillionhotelsWeltweit.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBerufsunfhigkeitLink() {
        berufsunfhigkeit.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeitsversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBerufsunfhigkeitsversicherungLink() {
        berufsunfhigkeitsversicherung.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBewerbungsfotograf1Link() {
        bewerbungsfotograf1.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBewerbungsfotograf2Link() {
        bewerbungsfotograf2.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBilligflge1Link() {
        billigflge1.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBilligflge2Link() {
        billigflge2.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBrautstylist1Link() {
        brautstylist1.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBrautstylist2Link() {
        brautstylist2.click();
        return this;
    }

    /**
     * Click on Bremsbelag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBremsbelagLink() {
        bremsbelag.click();
        return this;
    }

    /**
     * Click on Bremsbelge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBremsbelgeLink() {
        bremsbelge.click();
        return this;
    }

    /**
     * Click on Bremsscheibe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBremsscheibeLink() {
        bremsscheibe.click();
        return this;
    }

    /**
     * Click on Bremsscheiben Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickBremsscheibenLink() {
        bremsscheiben.click();
        return this;
    }

    /**
     * Click on Check24 Punkte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickCheck24Punkte1Link() {
        check24Punkte1.click();
        return this;
    }

    /**
     * Click on Check24 Punkte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickCheck24Punkte2Link() {
        check24Punkte2.click();
        return this;
    }

    /**
     * Click on Check24 Punkte Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickCheck24PunkteAnzeigenLink() {
        check24PunkteAnzeigen.click();
        return this;
    }

    /**
     * Click on Computer Konsole Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickComputerKonsoleLink() {
        computerKonsole.click();
        return this;
    }

    /**
     * Click on Cookies Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickCookiesLink() {
        cookies.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDatentarife1Link() {
        datentarife1.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDatentarife2Link() {
        datentarife2.click();
        return this;
    }

    /**
     * Click on Depot Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDepotLink() {
        depot.click();
        return this;
    }

    /**
     * Click on Desktop Benachrichtigungen Einschalten. Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDesktopBenachrichtigungenEinschaltenButton() {
        desktopBenachrichtigungenEinschalten.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDeutschNachhilfe1Link() {
        deutschNachhilfe1.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDeutschNachhilfe2Link() {
        deutschNachhilfe2.click();
        return this;
    }

    /**
     * Click on Deutschlands Besterkreditvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDeutschlandsBesterkreditvergleichLink() {
        deutschlandsBesterkreditvergleich.click();
        return this;
    }

    /**
     * Click on Deutschlands Gnstiger Onlinekredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDeutschlandsGnstigerOnlinekreditLink() {
        deutschlandsGnstigerOnlinekredit.click();
        return this;
    }

    /**
     * Click on Die Besten Tarife Mitund Ohne Smartphone Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDieBestenTarifeMitundOhneLink() {
        dieBestenTarifeMitundOhne.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDigitalkameras1Link() {
        digitalkameras1.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDigitalkameras2Link() {
        digitalkameras2.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDj1Link() {
        dj1.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDj2Link() {
        dj2.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDsl1Link() {
        dsl1.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDsl2Link() {
        dsl2.click();
        return this;
    }

    /**
     * Click on Dsl Handy Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslHandyLink() {
        dslHandy.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslservice1Link() {
        dslservice1.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslservice2Link() {
        dslservice2.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslspeedtest1Link() {
        dslspeedtest1.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslspeedtest2Link() {
        dslspeedtest2.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslverfgbarkeit1Link() {
        dslverfgbarkeit1.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslverfgbarkeit2Link() {
        dslverfgbarkeit2.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslvergleich1Link() {
        dslvergleich1.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickDslvergleich2Link() {
        dslvergleich2.click();
        return this;
    }

    /**
     * Click on Elektrische Zahnbrsten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickElektrischeZahnbrstenLink() {
        elektrischeZahnbrsten.click();
        return this;
    }

    /**
     * Click on Elektronik Haushalt Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickElektronikHaushaltLink() {
        elektronikHaushalt.click();
        return this;
    }

    /**
     * Click on Elektronik Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickElektronikLink() {
        elektronik.click();
        return this;
    }

    /**
     * Click on Elektrowerkzeug Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickElektrowerkzeugLink() {
        elektrowerkzeug.click();
        return this;
    }

    /**
     * Click on Energie Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEnergieLink() {
        energie.click();
        return this;
    }

    /**
     * Click on Energie Strom Gas Heizstrom Heizl Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEnergieStromGasHeizstromHeizlLink() {
        energieStromGasHeizstromHeizl.click();
        return this;
    }

    /**
     * Click on Energiecenter Energievertrge Verwalten Und Optimieren Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEnergiecenterEnergievertrgeVerwaltenUndOptimierenLink() {
        energiecenterEnergievertrgeVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Energiecenter Ihre Wechselfristen Fr Strom Und Gasvertrge Nutzen Und Erneut Sparen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEnergiecenterIhreWechselfristenFrStromLink() {
        energiecenterIhreWechselfristenFrStrom.click();
        return this;
    }

    /**
     * Click on Energiecenter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEnergiecenterLink() {
        energiecenter.click();
        return this;
    }

    /**
     * Click on Englisch Nachhilfe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEnglischNachhilfeLink() {
        englischNachhilfe.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickErnhrungsberater1Link() {
        ernhrungsberater1.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickErnhrungsberater2Link() {
        ernhrungsberater2.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEventfotograf1Link() {
        eventfotograf1.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickEventfotograf2Link() {
        eventfotograf2.click();
        return this;
    }

    /**
     * Click on Familienfotograf Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFamilienfotografLink() {
        familienfotograf.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFamilienurlaub1Link() {
        familienurlaub1.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFamilienurlaub2Link() {
        familienurlaub2.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFernseher1Link() {
        fernseher1.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFernseher2Link() {
        fernseher2.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFestgeld1Link() {
        festgeld1.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFestgeld2Link() {
        festgeld2.click();
        return this;
    }

    /**
     * Click on Festnetztelefone Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFestnetztelefoneLink() {
        festnetztelefone.click();
        return this;
    }

    /**
     * Click on Finanzierung Fr Kauf Und Bau Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFinanzierungFrKaufUndBauLink() {
        finanzierungFrKaufUndBau.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlge1Link() {
        flge1.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlge2Link() {
        flge2.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlge3Link() {
        flge3.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlgeLondon1Link() {
        flgeLondon1.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlgeLondon2Link() {
        flgeLondon2.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlgeMallorca1Link() {
        flgeMallorca1.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlgeMallorca2Link() {
        flgeMallorca2.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlgeNewYork1Link() {
        flgeNewYork1.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlgeNewYork2Link() {
        flgeNewYork2.click();
        return this;
    }

    /**
     * Click on Flugvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlugvergleichLink() {
        flugvergleich.click();
        return this;
    }

    /**
     * Click on Flugversptung Ihre Rechte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFlugversptungIhreRechteLink() {
        flugversptungIhreRechte.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFotoautomat1Link() {
        fotoautomat1.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFotoautomat2Link() {
        fotoautomat2.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFotografie1Link() {
        fotografie1.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFotografie2Link() {
        fotografie2.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFrhbucher1Link() {
        frhbucher1.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickFrhbucher2Link() {
        frhbucher2.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGalaxyS9MitVertrag1Link() {
        galaxyS9MitVertrag1.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGalaxyS9MitVertrag2Link() {
        galaxyS9MitVertrag2.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGanzjahresreifen1Link() {
        ganzjahresreifen1.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGanzjahresreifen2Link() {
        ganzjahresreifen2.click();
        return this;
    }

    /**
     * Click on Garantiert Diegnstigstenpreise Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGarantiertDiegnstigstenpreiseLink() {
        garantiertDiegnstigstenpreise.click();
        return this;
    }

    /**
     * Click on Gartengerte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGartengerteLink() {
        gartengerte.click();
        return this;
    }

    /**
     * Click on Gasanbieter Wechseln Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGasanbieterWechselnLink() {
        gasanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGasvergleich1Link() {
        gasvergleich1.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGasvergleich2Link() {
        gasvergleich2.click();
        return this;
    }

    /**
     * Click on Gebudeversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGebudeversicherungLink() {
        gebudeversicherung.click();
        return this;
    }

    /**
     * Click on Gesangslehrer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGesangslehrerLink() {
        gesangslehrer.click();
        return this;
    }

    /**
     * Click on Gesellschaftsspiele Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGesellschaftsspieleLink() {
        gesellschaftsspiele.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGewerbegas1Link() {
        gewerbegas1.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGewerbegas2Link() {
        gewerbegas2.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGewerbestrom1Link() {
        gewerbestrom1.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGewerbestrom2Link() {
        gewerbestrom2.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGirokonto1Link() {
        girokonto1.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGirokonto2Link() {
        girokonto2.click();
        return this;
    }

    /**
     * Click on Gitarrenlehrer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGitarrenlehrerLink() {
        gitarrenlehrer.click();
        return this;
    }

    /**
     * Click on Gnstige Mietwagenangebote Weltweit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGnstigeMietwagenangeboteWeltweitLink() {
        gnstigeMietwagenangeboteWeltweit.click();
        return this;
    }

    /**
     * Click on Gutscheine Guthaben Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGutscheineGuthabenAnzeigenLink() {
        gutscheineGuthabenAnzeigen.click();
        return this;
    }

    /**
     * Click on Gutscheine Guthaben Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGutscheineGuthabenLink() {
        gutscheineGuthaben.click();
        return this;
    }

    /**
     * Click on Gutscheine Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickGutscheineLink() {
        gutscheine.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHaftpflichtversicherung1Link() {
        haftpflichtversicherung1.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHaftpflichtversicherung2Link() {
        haftpflichtversicherung2.click();
        return this;
    }

    /**
     * Click on Handy Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyLink() {
        handy.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyMitVertrag1Link() {
        handyMitVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyMitVertrag2Link() {
        handyMitVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyOhneVertrag1Link() {
        handyOhneVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyOhneVertrag2Link() {
        handyOhneVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Telefon Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyTelefonLink() {
        handyTelefon.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandybersicht1Link() {
        handybersicht1.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandybersicht2Link() {
        handybersicht2.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandytarifeNurSimkarte1Link() {
        handytarifeNurSimkarte1.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandytarifeNurSimkarte2Link() {
        handytarifeNurSimkarte2.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyversicherung1Link() {
        handyversicherung1.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyversicherung2Link() {
        handyversicherung2.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyvertragKndigen1Link() {
        handyvertragKndigen1.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHandyvertragKndigen2Link() {
        handyvertragKndigen2.click();
        return this;
    }

    /**
     * Click on Hausfinanzierung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHausfinanzierungLink() {
        hausfinanzierung.click();
        return this;
    }

    /**
     * Click on Haushalt Wohnen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHaushaltWohnenLink() {
        haushaltWohnen.click();
        return this;
    }

    /**
     * Click on Hausratversicherung 6 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHausratversicherung6MonateGratis1Link() {
        hausratversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Hausratversicherung 6 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHausratversicherung6MonateGratis2Link() {
        hausratversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Brille Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHeilpraktikerBrilleLink() {
        heilpraktikerBrille.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Und Brille Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHeilpraktikerUndBrilleLink() {
        heilpraktikerUndBrille.click();
        return this;
    }

    /**
     * Click on Heimwerken Garten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHeimwerkenGartenLink() {
        heimwerkenGarten.click();
        return this;
    }

    /**
     * Click on Heizl Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHeizlLink() {
        heizl.click();
        return this;
    }

    /**
     * Click on Heizlvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHeizlvergleichLink() {
        heizlvergleich.click();
        return this;
    }

    /**
     * Click on Heizstrom Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHeizstromLink() {
        heizstrom.click();
        return this;
    }

    /**
     * Click on Heizstromvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHeizstromvergleichLink() {
        heizstromvergleich.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHierKontoAnlegen1Link() {
        hierKontoAnlegen1.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHierKontoAnlegen2Link() {
        hierKontoAnlegen2.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHierKontoAnlegen3Link() {
        hierKontoAnlegen3.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHierKontoAnlegen4Link() {
        hierKontoAnlegen4.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHochzeit1Link() {
        hochzeit1.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHochzeit2Link() {
        hochzeit2.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHochzeitsfotograf1Link() {
        hochzeitsfotograf1.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHochzeitsfotograf2Link() {
        hochzeitsfotograf2.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHochzeitssnger1Link() {
        hochzeitssnger1.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHochzeitssnger2Link() {
        hochzeitssnger2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotel1Link() {
        hotel1.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotel2Link() {
        hotel2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotel3Link() {
        hotel3.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotel4Link() {
        hotel4.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelBerlin1Link() {
        hotelBerlin1.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelBerlin2Link() {
        hotelBerlin2.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelMnchen1Link() {
        hotelMnchen1.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelMnchen2Link() {
        hotelMnchen2.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelParis1Link() {
        hotelParis1.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelParis2Link() {
        hotelParis2.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelRom1Link() {
        hotelRom1.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelRom2Link() {
        hotelRom2.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelsucheWeltweit1Link() {
        hotelsucheWeltweit1.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelsucheWeltweit2Link() {
        hotelsucheWeltweit2.click();
        return this;
    }

    /**
     * Click on Hotelvergleiche Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHotelvergleicheLink() {
        hotelvergleiche.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHundehaftpflicht1Link() {
        hundehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHundehaftpflicht2Link() {
        hundehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHundekrankenversicherung1Link() {
        hundekrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickHundekrankenversicherung2Link() {
        hundekrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Ihre Konten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickIhreKonten1Link() {
        ihreKonten1.click();
        return this;
    }

    /**
     * Click on Ihre Konten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickIhreKonten2Link() {
        ihreKonten2.click();
        return this;
    }

    /**
     * Click on Ihre Vertrge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickIhreVertrge1Link() {
        ihreVertrge1.click();
        return this;
    }

    /**
     * Click on Ihre Vertrge Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickIhreVertrge2Link() {
        ihreVertrge2.click();
        return this;
    }

    /**
     * Click on Immobilienfinanzierung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickImmobilienfinanzierungLink() {
        immobilienfinanzierung.click();
        return this;
    }

    /**
     * Click on Internet Dsl Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickInternetDslLink() {
        internetDsl.click();
        return this;
    }

    /**
     * Click on Internet Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickInternetLink() {
        internet.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickInternetanbieter1Link() {
        internetanbieter1.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickInternetanbieter2Link() {
        internetanbieter2.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickIphoneXMitVertrag1Link() {
        iphoneXMitVertrag1.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickIphoneXMitVertrag2Link() {
        iphoneXMitVertrag2.click();
        return this;
    }

    /**
     * Click on Jetzt Anmelden Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickJetztAnmeldenLink() {
        jetztAnmelden.click();
        return this;
    }
//
//    /**
//     * Click on Jetzt Anmelden Link.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage clickJetztAnmeldenLink() {
//        jetztAnmelden.click();
//        return this;
//    }

    /**
     * Click on Jetzt Autoteile Reifenzum Besten Preis Sichern Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickJetztAutoteileReifenzumBestenLink() {
        jetztAutoteileReifenzumBesten.click();
        return this;
    }

    /**
     * Click on Jetzt Registrieren Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickJetztRegistrierenButton() {
        jetztRegistrieren.click();
        return this;
    }

    /**
     * Click on Jetzt Vorliegendesbaufinanzierungsangebotgratis Checken Lassen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickJetztVorliegendesbaufinanzierungsangebotgratisCheckenLassenLink() {
        jetztVorliegendesbaufinanzierungsangebotgratisCheckenLassen.click();
        return this;
    }

    /**
     * Click on Kaffeemaschinen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKaffeemaschinenLink() {
        kaffeemaschinen.click();
        return this;
    }

    /**
     * Click on Kaffeevollautomaten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKaffeevollautomatenLink() {
        kaffeevollautomaten.click();
        return this;
    }

    /**
     * Click on Kapitalbeschaffung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKapitalbeschaffungLink() {
        kapitalbeschaffung.click();
        return this;
    }

    /**
     * Click on Karriere Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKarriereLink() {
        karriere.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKfzversicherung1Link() {
        kfzversicherung1.click();
        return this;
    }

    /**
     * Click on Kfzversicherung 1 Monat Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKfzversicherung1MonatGratis1Link() {
        kfzversicherung1MonatGratis1.click();
        return this;
    }

    /**
     * Click on Kfzversicherung 1 Monat Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKfzversicherung1MonatGratis2Link() {
        kfzversicherung1MonatGratis2.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKfzversicherung2Link() {
        kfzversicherung2.click();
        return this;
    }

    /**
     * Click on Klavierlehrer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKlavierlehrerLink() {
        klavierlehrer.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKogas1Link() {
        kogas1.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKogas2Link() {
        kogas2.click();
        return this;
    }

    /**
     * Click on Kontakt Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKontaktLink() {
        kontakt.click();
        return this;
    }

    /**
     * Click on Kontaktseite Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKontaktseiteLink() {
        kontaktseite.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKontoKredit1Link() {
        kontoKredit1.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKontoKredit2Link() {
        kontoKredit2.click();
        return this;
    }

    /**
     * Click on Kontomanager Finanzen Verwalten Und Optimieren Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKontomanagerFinanzenVerwaltenUndOptimierenLink() {
        kontomanagerFinanzenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Kontomanager Ihre Finanzen An Einem Ort Verwalten Und Optimieren Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKontomanagerIhreFinanzenAnEinemLink() {
        kontomanagerIhreFinanzenAnEinem.click();
        return this;
    }

    /**
     * Click on Kontomanager Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKontomanagerLink() {
        kontomanager.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKostrom1Link() {
        kostrom1.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKostrom2Link() {
        kostrom2.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz 6 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKrankenhauszusatz6MonateGratis1Link() {
        krankenhauszusatz6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz 6 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKrankenhauszusatz6MonateGratis2Link() {
        krankenhauszusatz6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKrankenkassen1Link() {
        krankenkassen1.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKrankenkassen2Link() {
        krankenkassen2.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKrankenzusatzversicherung1Link() {
        krankenzusatzversicherung1.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKrankenzusatzversicherung2Link() {
        krankenzusatzversicherung2.click();
        return this;
    }

    /**
     * Click on Kredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKredit1Link() {
        kredit1.click();
        return this;
    }

    /**
     * Click on Kredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKredit2Link() {
        kredit2.click();
        return this;
    }

    /**
     * Click on Kreditcenter Ihre Aktuellen Kreditanfragen Und Kreditzusagen Auf Einen Blick Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKreditcenterIhreAktuellenKreditanfragenUndLink() {
        kreditcenterIhreAktuellenKreditanfragenUnd.click();
        return this;
    }

    /**
     * Click on Kreditcenter Kreditantrge Abschlsse Auf Einen Blick Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKreditcenterKreditantrgeAbschlsseAufLink() {
        kreditcenterKreditantrgeAbschlsseAuf.click();
        return this;
    }

    /**
     * Click on Kreditcenter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKreditcenterLink() {
        kreditcenter.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKreditkarte1Link() {
        kreditkarte1.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKreditkarte2Link() {
        kreditkarte2.click();
        return this;
    }

    /**
     * Click on Kreditrechner Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKreditrechnerLink() {
        kreditrechner.click();
        return this;
    }

    /**
     * Click on Kreditvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickKreditvergleichLink() {
        kreditvergleich.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLastMinute1Link() {
        lastMinute1.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLastMinute2Link() {
        lastMinute2.click();
        return this;
    }

    /**
     * Click on Lego Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLegoLink() {
        lego.click();
        return this;
    }

    /**
     * Click on Leuchten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLeuchtenLink() {
        leuchten.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLfilter1Link() {
        lfilter1.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLfilter2Link() {
        lfilter2.click();
        return this;
    }

    /**
     * Click on Link An Mein Handy Senden Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLinkAnMeinHandySendenButton() {
        linkAnMeinHandySenden.click();
        return this;
    }

    /**
     * Click on Lte Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLteLink() {
        lte.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLuftfilter1Link() {
        luftfilter1.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickLuftfilter2Link() {
        luftfilter2.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMatheNachhilfe1Link() {
        matheNachhilfe1.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMatheNachhilfe2Link() {
        matheNachhilfe2.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMbeltransport1Link() {
        mbeltransport1.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMbeltransport2Link() {
        mbeltransport2.click();
        return this;
    }

    /**
     * Click on Mehr... Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMehrLink() {
        mehr.click();
        return this;
    }

    /**
     * Click on Mein Konto Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMeinKontoLink() {
        meinKonto.click();
        return this;
    }

    /**
     * Click on Meine Aktivitten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMeineAktivittenLink() {
        meineAktivitten.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagen1Link() {
        mietwagen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagen2Link() {
        mietwagen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagen3Link() {
        mietwagen3.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagen4Link() {
        mietwagen4.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagen5Link() {
        mietwagen5.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenDeutschland1Link() {
        mietwagenDeutschland1.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenDeutschland2Link() {
        mietwagenDeutschland2.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenGoldclub1Link() {
        mietwagenGoldclub1.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenGoldclub2Link() {
        mietwagenGoldclub2.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenMallorca1Link() {
        mietwagenMallorca1.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenMallorca2Link() {
        mietwagenMallorca2.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenRundreisen1Link() {
        mietwagenRundreisen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenRundreisen2Link() {
        mietwagenRundreisen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenSpanien1Link() {
        mietwagenSpanien1.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenSpanien2Link() {
        mietwagenSpanien2.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenUsa1Link() {
        mietwagenUsa1.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMietwagenUsa2Link() {
        mietwagenUsa2.click();
        return this;
    }

    /**
     * Click on Modernisierung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickModernisierungLink() {
        modernisierung.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMotorradversicherung1Link() {
        motorradversicherung1.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMotorradversicherung2Link() {
        motorradversicherung2.click();
        return this;
    }

    /**
     * Click on Musikunterricht Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickMusikunterrichtLink() {
        musikunterricht.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNachhilfe1Link() {
        nachhilfe1.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNachhilfe2Link() {
        nachhilfe2.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNachtspeicherheizung1Link() {
        nachtspeicherheizung1.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNachtspeicherheizung2Link() {
        nachtspeicherheizung2.click();
        return this;
    }

    /**
     * Click on Ndern Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNdernLink() {
        ndern.click();
        return this;
    }

    /**
     * Click on Nein Danke Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNeinDankeButton() {
        neinDanke.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNotebooks1Link() {
        notebooks1.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNotebooks2Link() {
        notebooks2.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNurBis10101Link() {
        nurBis10101.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickNurBis10102Link() {
        nurBis10102.click();
        return this;
    }

    /**
     * Click on Ok Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickOkLink() {
        ok.click();
        return this;
    }

    /**
     * Click on Ok Verstanden Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickOkVerstandenButton() {
        okVerstanden.click();
        return this;
    }

    /**
     * Click on Partner Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPartnerLink() {
        partner.click();
        return this;
    }

    /**
     * Click on Partnerprogramm Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPartnerprogrammLink() {
        partnerprogramm.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPasswortVergessen1Link() {
        passwortVergessen1.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPasswortVergessen2Link() {
        passwortVergessen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPauschalreisen1Link() {
        pauschalreisen1.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPauschalreisen2Link() {
        pauschalreisen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Zu Den Besten Preisen Buchen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPauschalreisenZuDenBestenPreisenLink() {
        pauschalreisenZuDenBestenPreisen.click();
        return this;
    }

    /**
     * Click on Persnliche Daten Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPersnlicheDatenAnzeigenLink() {
        persnlicheDatenAnzeigen.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPersonalTrainer1Link() {
        personalTrainer1.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPersonalTrainer2Link() {
        personalTrainer2.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPferdehaftpflicht1Link() {
        pferdehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPferdehaftpflicht2Link() {
        pferdehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Pflegeversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPflegeversicherungLink() {
        pflegeversicherung.click();
        return this;
    }

    /**
     * Click on Pflegezusatzversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPflegezusatzversicherungLink() {
        pflegezusatzversicherung.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrepaidUnd1monatstarife1Link() {
        prepaidUnd1monatstarife1.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrepaidUnd1monatstarife2Link() {
        prepaidUnd1monatstarife2.click();
        return this;
    }

    /**
     * Click on Presse Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPresseLink() {
        presse.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrivateKrankenversicherung1Link() {
        privateKrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrivateKrankenversicherung2Link() {
        privateKrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrivaterYogalehrer1Link() {
        privaterYogalehrer1.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrivaterYogalehrer2Link() {
        privaterYogalehrer2.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht 12 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrivathaftpflicht12MonateGratis1Link() {
        privathaftpflicht12MonateGratis1.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht 12 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickPrivathaftpflicht12MonateGratis2Link() {
        privathaftpflicht12MonateGratis2.click();
        return this;
    }

    /**
     * Click on Produkten Der Check24 Gruppe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickProduktenDerCheck24GruppeLink() {
        produktenDerCheck24Gruppe.click();
        return this;
    }

    /**
     * Click on Profis Fr Ihr Projekt Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickProfisFrIhrProjektLink() {
        profisFrIhrProjekt.click();
        return this;
    }

    /**
     * Click on Profis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickProfisLink() {
        profis.click();
        return this;
    }

    /**
     * Click on Rasierer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRasiererLink() {
        rasierer.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRatenkredit1Link() {
        ratenkredit1.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRatenkredit2Link() {
        ratenkredit2.click();
        return this;
    }

    /**
     * Click on Ratgeber Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRatgeberLink() {
        ratgeber.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung 3 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRechtsschutzversicherung3MonateGratis1Link() {
        rechtsschutzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung 3 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRechtsschutzversicherung3MonateGratis2Link() {
        rechtsschutzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Reifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReifenLink() {
        reifen.click();
        return this;
    }

    /**
     * Click on Reise Flug Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseFlugLink() {
        reiseFlug.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseGoldclub1Link() {
        reiseGoldclub1.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseGoldclub2Link() {
        reiseGoldclub2.click();
        return this;
    }

    /**
     * Click on Reise Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseLink() {
        reise.click();
        return this;
    }

    /**
     * Click on Reisevergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReisevergleichLink() {
        reisevergleich.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseversicherung1Link() {
        reiseversicherung1.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseversicherung2Link() {
        reiseversicherung2.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseweltBestenlisten1Link() {
        reiseweltBestenlisten1.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickReiseweltBestenlisten2Link() {
        reiseweltBestenlisten2.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRentenversicherung1Link() {
        rentenversicherung1.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRentenversicherung2Link() {
        rentenversicherung2.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung 3 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRisikolebensversicherung3MonateGratis1Link() {
        risikolebensversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung 3 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickRisikolebensversicherung3MonateGratis2Link() {
        risikolebensversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Scheibenwischer Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickScheibenwischerLink() {
        scheibenwischer.click();
        return this;
    }

    /**
     * Click on Schliessen Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSchliessen1Button() {
        schliessen1.click();
        return this;
    }

    /**
     * Click on Schliessen Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSchliessen2Button() {
        schliessen2.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSchutzbriefautomobilclub1Link() {
        schutzbriefautomobilclub1.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSchutzbriefautomobilclub2Link() {
        schutzbriefautomobilclub2.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSchutzbriefautomobilclub3Link() {
        schutzbriefautomobilclub3.click();
        return this;
    }

    /**
     * Click on Senden Button.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSendenButton() {
        senden.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickShoppingLink() {
        shopping.click();
        return this;
    }

    /**
     * Click on Sie Sind Selbst Profi Und Auf Der Suche Nach Neuen Kunden Jetzt Anmelden Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSieSindSelbstProfiUndAufLink() {
        sieSindSelbstProfiUndAuf.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSmartphones1Link() {
        smartphones1.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSmartphones2Link() {
        smartphones2.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSommerreifen1Link() {
        sommerreifen1.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSommerreifen2Link() {
        sommerreifen2.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSpielwaren1Link() {
        spielwaren1.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSpielwaren2Link() {
        spielwaren2.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSportWellness1Link() {
        sportWellness1.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSportWellness2Link() {
        sportWellness2.click();
        return this;
    }

    /**
     * Click on Starten Sie Hier. Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStartenSieHierLink() {
        startenSieHier.click();
        return this;
    }

    /**
     * Click on Staubsauger Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStaubsaugerLink() {
        staubsauger.click();
        return this;
    }

    /**
     * Click on Stdtereisen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStdtereisenLink() {
        stdtereisen.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSterbegeldversicherung1Link() {
        sterbegeldversicherung1.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickSterbegeldversicherung2Link() {
        sterbegeldversicherung2.click();
        return this;
    }

    /**
     * Click on Strom Gas Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStromGasLink() {
        stromGas.click();
        return this;
    }

    /**
     * Click on Stromanbieter Wechseln Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStromanbieterWechselnLink() {
        stromanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Strompreise Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStrompreiseLink() {
        strompreise.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStromvergleich1Link() {
        stromvergleich1.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickStromvergleich2Link() {
        stromvergleich2.click();
        return this;
    }

    /**
     * Click on Tabletpcs Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTabletpcsLink() {
        tabletpcs.click();
        return this;
    }

    /**
     * Click on Tablets Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTabletsLink() {
        tablets.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTagesgeld1Link() {
        tagesgeld1.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTagesgeld2Link() {
        tagesgeld2.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTarifeFrJungeLeute1Link() {
        tarifeFrJungeLeute1.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTarifeFrJungeLeute2Link() {
        tarifeFrJungeLeute2.click();
        return this;
    }

    /**
     * Click on Teilnahmebedingungen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTeilnahmebedingungenLink() {
        teilnahmebedingungen.click();
        return this;
    }

    /**
     * Click on Tilgungsrechner Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTilgungsrechnerLink() {
        tilgungsrechner.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Gypten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTop10HotelsGyptenLink() {
        top10HotelsGypten.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Kanaren Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTop10HotelsKanarenLink() {
        top10HotelsKanaren.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Mallorca Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickTop10HotelsMallorcaLink() {
        top10HotelsMallorca.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUmschuldung1Link() {
        umschuldung1.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUmschuldung2Link() {
        umschuldung2.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUmzugsunternehmen1Link() {
        umzugsunternehmen1.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUmzugsunternehmen2Link() {
        umzugsunternehmen2.click();
        return this;
    }

    /**
     * Click on Unfallversicherung 6 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUnfallversicherung6MonateGratis1Link() {
        unfallversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Unfallversicherung 6 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUnfallversicherung6MonateGratis2Link() {
        unfallversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Unternehmen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUnternehmenLink() {
        unternehmen.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUrlaubsfinder1Link() {
        urlaubsfinder1.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickUrlaubsfinder2Link() {
        urlaubsfinder2.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVeranstaltungenEvents1Link() {
        veranstaltungenEvents1.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVeranstaltungenEvents2Link() {
        veranstaltungenEvents2.click();
        return this;
    }

    /**
     * Click on Versicherungen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungen1Link() {
        versicherungen1.click();
        return this;
    }

    /**
     * Click on Versicherungen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungen2Link() {
        versicherungen2.click();
        return this;
    }

    /**
     * Click on Versicherungen Kfz Rechtsschutz Uvm. Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungenKfzRechtsschutzUvmLink() {
        versicherungenKfzRechtsschutzUvm.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Deals Bis Zu 12 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungjubilumsDealsBisZu121Link() {
        versicherungjubilumsDealsBisZu121.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Deals Bis Zu 12 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungjubilumsDealsBisZu122Link() {
        versicherungjubilumsDealsBisZu122.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Ihr Digitaler Versicherungsordner Vertrge Und Bedarf Richtig Prfen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungscenterIhrDigitalerVersicherungsordnerLink() {
        versicherungscenterIhrDigitalerVersicherungsordner.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungscenterLink() {
        versicherungscenter.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Versicherungen Verwalten Und Optimieren Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVersicherungscenterVersicherungenVerwaltenUndOptimierenLink() {
        versicherungscenterVersicherungenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Verwalten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVerwalten1Link() {
        verwalten1.click();
        return this;
    }

    /**
     * Click on Verwalten Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickVerwalten2Link() {
        verwalten2.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWaschmaschinen1Link() {
        waschmaschinen1.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWaschmaschinen2Link() {
        waschmaschinen2.click();
        return this;
    }

    /**
     * Click on Weiter Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWeiterLink() {
        weiter.click();
        return this;
    }

    /**
     * Click on Wichtige Termine Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWichtigeTermineLink() {
        wichtigeTermine.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWinterreifen1Link() {
        winterreifen1.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWinterreifen2Link() {
        winterreifen2.click();
        return this;
    }

    /**
     * Click on Wischblatt Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWischblattLink() {
        wischblatt.click();
        return this;
    }

    /**
     * Click on Wohngebudeversicherung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWohngebudeversicherungLink() {
        wohngebudeversicherung.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWrmepumpe1Link() {
        wrmepumpe1.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickWrmepumpe2Link() {
        wrmepumpe2.click();
        return this;
    }

    /**
     * Click on Zahlungsdaten Anzeigen Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZahlungsdatenAnzeigenLink() {
        zahlungsdatenAnzeigen.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung 3 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZahnzusatzversicherung3MonateGratis1Link() {
        zahnzusatzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung 3 Monate Gratis Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZahnzusatzversicherung3MonateGratis2Link() {
        zahnzusatzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Zins Schnellcheck Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZinsSchnellcheckLink() {
        zinsSchnellcheck.click();
        return this;
    }

    /**
     * Click on Zu Allen Kategorien Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZuAllenKategorienLink() {
        zuAllenKategorien.click();
        return this;
    }

    /**
     * Click on Zur Anmeldung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZurAnmeldungLink() {
        zurAnmeldung.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZurck1Link() {
        zurck1.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZurck2Link(String sdfsff) {
        zurck2.click();
        return this;
    }

    /**
     * Click on Zurck Zur Anmeldung Link.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage clickZurckZurAnmeldungLink() {
        zurckZurAnmeldung.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage fill() {
//        set24241234TextField089();
        setVersicherungJubilumsDealsBisZu2TextField();
        setEmailadresseIstNichtKorrekt1EmailField();
        setBitteGebenSieIhrPasswortEin1PasswordField();
        setEmailadresseIstNichtKorrekt2EmailField();
        setBitteGebenSieIhrPasswortEin2PasswordField();
        setEmailadresseIstNichtKorrekt3EmailField();
        setEmailadresseIstNichtKorrekt4EmailField();
        setBitteWhlenSieEinPasswortPasswordField();
        setBitteWiederholenSieIhrPasswortPasswordField();
        setSehenSieIhreAktivittenGutscheineUndTelField();
        setUmDieVorteileDesCheck24Punkte1SearchField();
        setUmDieVorteileDesCheck24Punkte2SearchField();
        setUmDieVorteileDesCheck24Punkte3CheckboxField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage fillAndSubmit() {
        fill();
        return submit();
    }

//    /**
//     * Set default value to 089 24 24 12 34 Text field.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage set24241234TextField089() {
//        return set24241234TextField089(data.get("24_24_12_34_089"));
//    }
//
//    /**
//     * Set value to 089 24 24 12 34 Text field.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage set24241234TextField089(String 24241234Value089) {
//        _24241234089.sendKeys(24241234Value089);
//        return this;
//    }

    /**
     * Set default value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteGebenSieIhrPasswortEin1PasswordField() {
        return setBitteGebenSieIhrPasswortEin1PasswordField(data.get("BITTE_GEBEN_SIE_IHR_PASSWORT_EIN_1"));
    }

    /**
     * Set value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteGebenSieIhrPasswortEin1PasswordField(String bitteGebenSieIhrPasswortEin1Value) {
        bitteGebenSieIhrPasswortEin1.sendKeys(bitteGebenSieIhrPasswortEin1Value);
        return this;
    }

    /**
     * Set default value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteGebenSieIhrPasswortEin2PasswordField() {
        return setBitteGebenSieIhrPasswortEin2PasswordField(data.get("BITTE_GEBEN_SIE_IHR_PASSWORT_EIN_2"));
    }

    /**
     * Set value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteGebenSieIhrPasswortEin2PasswordField(String bitteGebenSieIhrPasswortEin2Value) {
        bitteGebenSieIhrPasswortEin2.sendKeys(bitteGebenSieIhrPasswortEin2Value);
        return this;
    }

    /**
     * Set default value to Bitte Whlen Sie Ein Passwort Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteWhlenSieEinPasswortPasswordField() {
        return setBitteWhlenSieEinPasswortPasswordField(data.get("BITTE_WHLEN_SIE_EIN_PASSWORT"));
    }

    /**
     * Set value to Bitte Whlen Sie Ein Passwort Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteWhlenSieEinPasswortPasswordField(String bitteWhlenSieEinPasswortValue) {
        bitteWhlenSieEinPasswort.sendKeys(bitteWhlenSieEinPasswortValue);
        return this;
    }

    /**
     * Set default value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteWiederholenSieIhrPasswortPasswordField() {
        return setBitteWiederholenSieIhrPasswortPasswordField(data.get("BITTE_WIEDERHOLEN_SIE_IHR_PASSWORT"));
    }

    /**
     * Set value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setBitteWiederholenSieIhrPasswortPasswordField(String bitteWiederholenSieIhrPasswortValue) {
        bitteWiederholenSieIhrPasswort.sendKeys(bitteWiederholenSieIhrPasswortValue);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt1EmailField() {
        return setEmailadresseIstNichtKorrekt1EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_1"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt1EmailField(String emailadresseIstNichtKorrekt1Value) {
        emailadresseIstNichtKorrekt1.sendKeys(emailadresseIstNichtKorrekt1Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt2EmailField() {
        return setEmailadresseIstNichtKorrekt2EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_2"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt2EmailField(String emailadresseIstNichtKorrekt2Value) {
        emailadresseIstNichtKorrekt2.sendKeys(emailadresseIstNichtKorrekt2Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt3EmailField() {
        return setEmailadresseIstNichtKorrekt3EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_3"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt3EmailField(String emailadresseIstNichtKorrekt3Value) {
        emailadresseIstNichtKorrekt3.sendKeys(emailadresseIstNichtKorrekt3Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt4EmailField() {
        return setEmailadresseIstNichtKorrekt4EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_4"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setEmailadresseIstNichtKorrekt4EmailField(String emailadresseIstNichtKorrekt4Value) {
        emailadresseIstNichtKorrekt4.sendKeys(emailadresseIstNichtKorrekt4Value);
        return this;
    }

    /**
     * Set default value to Sehen Sie Ihre Aktivitten Gutscheine Und Tel field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setSehenSieIhreAktivittenGutscheineUndTelField() {
        return setSehenSieIhreAktivittenGutscheineUndTelField(data.get("SEHEN_SIE_IHRE_AKTIVITTEN_GUTSCHEINE_UND"));
    }

    /**
     * Set value to Sehen Sie Ihre Aktivitten Gutscheine Und Tel field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setSehenSieIhreAktivittenGutscheineUndTelField(String sehenSieIhreAktivittenGutscheineUndValue) {
        sehenSieIhreAktivittenGutscheineUnd.sendKeys(sehenSieIhreAktivittenGutscheineUndValue);
        return this;
    }

    /**
     * Set default value to Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Search field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setUmDieVorteileDesCheck24Punkte1SearchField() {
        return setUmDieVorteileDesCheck24Punkte1SearchField(data.get("UM_DIE_VORTEILE_DES_CHECK24_PUNKTE_1"));
    }

    /**
     * Set value to Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Search field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setUmDieVorteileDesCheck24Punkte1SearchField(String umDieVorteileDesCheck24Punkte1Value) {
        new Select(umDieVorteileDesCheck24Punkte1).selectByVisibleText(umDieVorteileDesCheck24Punkte1Value);
        return this;
    }

    /**
     * Set default value to Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Search field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setUmDieVorteileDesCheck24Punkte2SearchField() {
        return setUmDieVorteileDesCheck24Punkte2SearchField(data.get("UM_DIE_VORTEILE_DES_CHECK24_PUNKTE_2"));
    }

    /**
     * Set value to Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Search field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setUmDieVorteileDesCheck24Punkte2SearchField(String umDieVorteileDesCheck24Punkte2Value) {
        umDieVorteileDesCheck24Punkte2.sendKeys(umDieVorteileDesCheck24Punkte2Value);
        return this;
    }

    /**
     * Set Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Checkbox field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setUmDieVorteileDesCheck24Punkte3CheckboxField() {
        if (!umDieVorteileDesCheck24Punkte3.isSelected()) {
            umDieVorteileDesCheck24Punkte3.click();
        }
        return this;
    }

    /**
     * Set default value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setVersicherungJubilumsDealsBisZu1TextField() {
        return setVersicherungJubilumsDealsBisZu1TextField(data.get("VERSICHERUNG_JUBILUMS_DEALS_BIS_ZU_1"));
    }

    /**
     * Set value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setVersicherungJubilumsDealsBisZu1TextField(String versicherungJubilumsDealsBisZu1Value) {
        versicherungJubilumsDealsBisZu1.click();
        return this;
    }

    /**
     * Set default value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setVersicherungJubilumsDealsBisZu2TextField() {
        return setVersicherungJubilumsDealsBisZu2TextField(data.get("VERSICHERUNG_JUBILUMS_DEALS_BIS_ZU_2"));
    }

    /**
     * Set value to Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Text field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage setVersicherungJubilumsDealsBisZu2TextField(String versicherungJubilumsDealsBisZu2Value) {
        versicherungJubilumsDealsBisZu2.sendKeys(versicherungJubilumsDealsBisZu2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage submit() {
        clickJetztRegistrierenButton();
        return this;
    }

    /**
     * Unset Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Checkbox field.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage unsetUmDieVorteileDesCheck24Punkte3CheckboxField() {
        if (umDieVorteileDesCheck24Punkte3.isSelected()) {
            umDieVorteileDesCheck24Punkte3.click();
        }
        return this;
    }

//    /**
//     * Unset default value from Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Drop Down List field.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage unsetUmDieVorteileDesCheck24PunkteDropDownListField() {
//        return unsetUmDieVorteileDesCheck24PunkteDropDownListField(data.get("UM_DIE_VORTEILE_DES_CHECK24_PUNKTE"));
//    }

//    /**
//     * Unset value from Um Die Vorteile Des Check24 Punkte Programms Siehe Teilnahmebedingungen Nutzen Zu Knnen Stimme Ich Zu Dass Die Check24 Gmbh Mich Ber Angebote Gutscheine Und Newsletter Per Email Und Post Zu Den Produkten Der Check24 Gruppe Informiert. Diese Einwilligung Kann Ich Jederzeit Mit Wirkung Fr Die Zukunft Per Email An Punktecheck24.de Widerrufen. Drop Down List field.
//     *
//     * @return the UserAccountPage class instance.
//     */
//    public UserAccountPage unsetUmDieVorteileDesCheck24PunkteDropDownListField(String umDieVorteileDesCheck24PunkteValue) {
//        new Select(umDieVorteileDesCheck24Punkte).deselectByVisibleText(umDieVorteileDesCheck24PunkteValue);
//        return this;
//    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage verifyPageLoaded() {
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
     * @return the UserAccountPage class instance.
     */
    public UserAccountPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
