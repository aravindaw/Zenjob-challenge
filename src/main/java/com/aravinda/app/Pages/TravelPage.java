package com.aravinda.app.Pages;

import com.aravinda.app.scripts.StartDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class TravelPage extends StartDriver {
    private Map<String, String> data;
    //    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "c24-search-header")
    @CacheLookup
    private WebElement _0892424111;

    @FindBy(id = "c24-travel-airport-element")
    @CacheLookup
    public WebElement abflughafen;

    @FindBy(css = "a[title='Abmelden']")
    @CacheLookup
    private WebElement abmelden;

    @FindBy(css = "a[title='AGB']")
    @CacheLookup
    private WebElement agb;

    @FindBy(css = "a[title='Aktuelle Reise-Nachrichten']")
    @CacheLookup
    private WebElement aktuelleReisenachrichten;

    @FindBy(css = "a[title='CHECK24 Reisewelt']")
    @CacheLookup
    private WebElement aktuelleReiseweltartikel;

    @FindBy(name = "info-tab-group")
    @CacheLookup
    private List<WebElement> aktuelles;

    private final String aktuellesValue = "on";

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement allInclusive1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement allInclusive2;

    @FindBy(css = "a.product-button.product-btn-allinclusive")
    @CacheLookup
    private WebElement allInclusivePPAb146;

    @FindBy(css = "a.ekomi-customer-rating")
    @CacheLookup
    private WebElement alleBewertungen;

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

    @FindBy(id = "c24-meinkonto-anmelden")
    @CacheLookup
    private WebElement anmelden;

    @FindBy(css = "#c24-customer-salutation a.c24-meinkonto-reflink.c24-meinkonto-login-link")
    @CacheLookup
    private WebElement anmelden1;
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

    @FindBy(css = "a[title='Anschlussfinanzierung']")
    @CacheLookup
    private WebElement anschlussfinanzierung;

    @FindBy(id = "apartment-option")
    @CacheLookup
    private WebElement apartment;

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

    @FindBy(id = "c24-travel-js-get-traveller-btn")
    @CacheLookup
    private WebElement bernehmen1;

    @FindBy(id = "c24-travel-js-fake-traveller-roomcount-btn")
    @CacheLookup
    private WebElement bernehmen2;

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

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> bitteWhlen;

    @FindBy(id = "cl_pw_register")
    @CacheLookup
    private WebElement bitteWhlenSieEinPasswort;

    private final String bitteWhlenValue = "-";

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

    @FindBy(id = "bungalow-option")
    @CacheLookup
    private WebElement bungalow;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=points&source=51&deviceoutput=desktop&product=package']")
    @CacheLookup
    private WebElement check24Punkte;

    @FindBy(css = "a[href='/reisekalender']")
    @CacheLookup
    private WebElement check24Reisekalender;

    @FindBy(id = "c24-travel-club-top")
    @CacheLookup
    private WebElement club;

    @FindBy(css = "a[title='Computer & Konsole']")
    @CacheLookup
    private WebElement computerKonsole;

    @FindBy(id = "c24-search-navi-sho")
    @CacheLookup
    private WebElement computerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinen;

    @FindBy(css = "a[href='https://www.check24.de/unternehmen/cookiehinweis/']")
    @CacheLookup
    private WebElement cookies;

    @FindBy(css = "a[title='Datenschutz']")
    @CacheLookup
    private WebElement datenschutz;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=sidenavi']")
    @CacheLookup
    private WebElement datentarife1;

    @FindBy(css = "a[href='//www.check24.de/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=topnavi']")
    @CacheLookup
    private WebElement datentarife2;

    @FindBy(id = "deluxe-option")
    @CacheLookup
    private WebElement deluxezimmer;

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

    @FindBy(id = "c24-travel-directbeachaccess-top")
    @CacheLookup
    private WebElement direkteStrandlage;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement dj1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement dj2;

    @FindBy(id = "double-option")
    @CacheLookup
    private WebElement doppelzimmer;

    @FindBy(id = "triple-option")
    @CacheLookup
    private WebElement dreibettzimmer;

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

    @FindBy(id = "duplex-option")
    @CacheLookup
    private WebElement duplexzimmer;

    @FindBy(id = "single-option")
    @CacheLookup
    private WebElement einzelzimmer;

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

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> exaktWieAngegeben;

    private final String exaktWieAngegebenValue = "exact";

    @FindBy(css = "a[title='Familienfotograf']")
    @CacheLookup
    private WebElement familienfotograf;

    @FindBy(id = "c24-travel-familyholiday-top")
    @CacheLookup
    private WebElement familienfreundlich;

    @FindBy(css = "a[href='/reisewelt/top-10-familienfreundliche-hotels']")
    @CacheLookup
    private WebElement familienfreundlichesInselhotel;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement familienurlaub1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement familienurlaub2;

    @FindBy(id = "family-option")
    @CacheLookup
    private WebElement familienzimmer;

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

    @FindBy(id = "js-direct-flight")
    @CacheLookup
    private WebElement flug;

    @FindBy(css = "a[href='/staedtereisen']")
    @CacheLookup
    private WebElement flugUndHotel;

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

    @FindBy(css = "a.product-button.product-btn-earlybird")
    @CacheLookup
    private WebElement frhbucherPPAb102;

    @FindBy(id = "c24-travel-departure-date-element")
    @CacheLookup
    public WebElement frhesteHinreise;

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

    @FindBy(css = "a[href='/reisen/spanien/gran-canaria']")
    @CacheLookup
    private WebElement granCanaria;

    @FindBy(css = "a[href='/hotel/grand-resort-hurghada-15334']")
    @CacheLookup
    private WebElement grandResortHurghada;

    @FindBy(css = "a[href='/reisen/griechenland']")
    @CacheLookup
    private WebElement griechenland;

    @FindBy(id = "c24-travel-rating-element")
    @CacheLookup
    private WebElement gstebewertung;

    @FindBy(css = "a[title='Gutscheine']")
    @CacheLookup
    private WebElement gutscheine;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=cs_codes&source=51&deviceoutput=desktop&product=package']")
    @CacheLookup
    private WebElement gutscheineGuthaben;

    @FindBy(css = "a[title='Urlaub Ägypten']")
    @CacheLookup
    private WebElement gyptenUrlaub;

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

    @FindBy(css = "#c24-travel-js-searchform-box-element-wrapper div:nth-of-type(4) div.c24-travel-nowherecheaper-tooltip-cnt.c24-travel-js-nowherecheaper-tooltip-cnt a.c24-travel-tooltip-link-details")
    @CacheLookup
    private WebElement hierErfahrenSieMehr1;

    @FindBy(css = "#c24-travel-js-searchform-box-element-wrapper div:nth-of-type(5) div.c24-travel-best-in-test-tooltip-cnt.c24-travel-js-best-in-test-tooltip-cnt p:nth-of-type(2) a")
    @CacheLookup
    private WebElement hierErfahrenSieMehr2;

    @FindBy(css = "#c24-travel-js-searchform-box-element-wrapper div:nth-of-type(6) div.c24-travel-best-in-test-tooltip-cnt.c24-travel-js-best-in-test-tooltip-cnt p:nth-of-type(2) a")
    @CacheLookup
    private WebElement hierErfahrenSieMehr3;

    @FindBy(css = "#c24-travel-js-searchform-box-element-wrapper div:nth-of-type(8) div.c24-travel-nowherecheaper-tooltip-cnt.c24-travel-js-nowherecheaper-tooltip-cnt a.c24-travel-tooltip-link-details")
    @CacheLookup
    private WebElement hierErfahrenSieMehr4;

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

    @FindBy(id = "c24-travel-hotel-category-element")
    @CacheLookup
    private WebElement hotelsterne;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a.c24-subnav-ele.c24-spacing")
    @CacheLookup
    private WebElement hotelsucheWeltweit1;

    @FindBy(css = "a.c24-subsubnav-sec-ele.c24-subproduct.c24-spacing")
    @CacheLookup
    private WebElement hotelsucheWeltweit2;

    @FindBy(id = "c24-travel-transfer-element")
    @CacheLookup
    private WebElement hoteltransfer;

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

    @FindBy(css = "a[title='Impressum']")
    @CacheLookup
    private WebElement impressum;

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

    @FindBy(css = "a[title='Urlaub Italien']")
    @CacheLookup
    private WebElement italienUrlaub;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(4) a")
    @CacheLookup
    private WebElement jetztAnmelden;

//    @FindBy(css = "a.c24-customer-login-opener")
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

    @FindBy(id = "c24-travel-child-age-1")
    @CacheLookup
    private WebElement kind11;

    @FindBy(id = "c24-travel-child-age-2")
    @CacheLookup
    private WebElement kind12;

    @FindBy(id = "c24-travel-child-age-3")
    @CacheLookup
    private WebElement kind13;

    @FindBy(id = "c24-travel-child-age-4")
    @CacheLookup
    private WebElement kind14;

    @FindBy(id = "c24-travel-layer-child-age-1")
    @CacheLookup
    private WebElement kind21;

    @FindBy(id = "c24-travel-layer-child-age-2")
    @CacheLookup
    private WebElement kind22;

    @FindBy(id = "c24-travel-layer-child-age-3")
    @CacheLookup
    private WebElement kind23;

    @FindBy(id = "c24-travel-layer-child-age-4")
    @CacheLookup
    private WebElement kind24;

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

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement lastMinute1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement lastMinute2;

    @FindBy(css = "a.product-button.product-btn-lastminute")
    @CacheLookup
    private WebElement lastMinutePPAb107;

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

    @FindBy(css = "a[title='Urlaub Malediven']")
    @CacheLookup
    private WebElement maledivenUrlaub;

    @FindBy(css = "a[href='/reisewelt/mallorca-strandguide']")
    @CacheLookup
    private WebElement mallorcastrandguide;

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

    @FindBy(css = "a[href='https://www.check24.de/unternehmen/ueber-uns/']")
    @CacheLookup
    private WebElement mehrErfahren;

    @FindBy(id = "multishare-option")
    @CacheLookup
    private WebElement mehrbettzimmer;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=overview&source=51&deviceoutput=desktop&product=package']")
    @CacheLookup
    private WebElement meinKonto;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=activitylist&source=51&deviceoutput=desktop&product=package']")
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

    @FindBy(css = "a.product-button.product-btn-sprite-rentalcar")
    @CacheLookup
    private WebElement mietwagenAb5Pro;

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

    @FindBy(id = "c24-travel-ocean-view-element")
    @CacheLookup
    private WebElement mitMeerblick;

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

    @FindBy(css = "a[title='Nachrichten']")
    @CacheLookup
    private WebElement news;

    @FindBy(css = "a[title='Nirgendwo-Günstiger-Garantie']")
    @CacheLookup
    private WebElement nirgendwognstigergarantie;

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

    @FindBy(id = "c24-travel-adultsonly-top")
    @CacheLookup
    private WebElement nurFrErwachsene;

    @FindBy(css = "a.c24-cookie-button")
    @CacheLookup
    private WebElement ok;

    private final String pageLoadedText = "Falls Sie doch noch Fragen haben, hilft Ihnen unser kompetenter Kundenservice gern weiter, egal ob zu Ihrer nächsten Frühbucher Pauschalreise, zum All Inclusive Urlaub oder zu aktuellen Last Minute Angeboten";

    private final String pageUrl = "/";

    @FindBy(css = "a[title='Partner']")
    @CacheLookup
    private WebElement partner;

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

    @FindBy(name = "info-tab-group")
    @CacheLookup
    private List<WebElement> pauschalreisen3;

    private final String pauschalreisenValue = "on";

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

    @FindBy(id = "c24-travel-pool-top")
    @CacheLookup
    private WebElement pool;

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

    @FindBy(css = "a.c24-mainnav-sec-ele.c24-header-hover.c24-current")
    @CacheLookup
    private WebElement reise;

    @FindBy(id = "c24-travel-search-button-element")
    @CacheLookup
    private WebElement reiseFinden;

    @FindBy(css = "a[title='Reise & Flug']")
    @CacheLookup
    private WebElement reiseFlug;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(8)")
    @CacheLookup
    private WebElement reiseGoldclub1;

    @FindBy(css = "#c24-pau li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(6) a.c24-subsubnav-sec-ele.c24-rsnmwa-goldclub")
    @CacheLookup
    private WebElement reiseGoldclub2;

    @FindBy(id = "c24-travel-js-fake-destination-input")
    @CacheLookup
    private WebElement reisedauer1;

    @FindBy(xpath ="//select[@id='c24-travel-travel-duration-element']")
    @CacheLookup
    public Select reisedauer2;

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> reisedauerEingebenTage1;

    @FindBy(id = "c24-travel-custom-duration")
    @CacheLookup
    private WebElement reisedauerEingebenTage2;

    private final String reisedauerEingebenTageValue = "custom";

    @FindBy(id = "c24-travel-traveller-roomcount-detail-select")
    @CacheLookup
    private WebElement reisende;

    @FindBy(name = "info-tab-group")
    @CacheLookup
    private List<WebElement> reiseveranstalter;

    private final String reiseveranstalterValue = "on";

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

    @FindBy(css = "a.product-button.product-btn-dictionary")
    @CacheLookup
    private WebElement reiseweltInsidertippsEmpfehlungen;

    @FindBy(id = "c24-travel-destination-element")
    @CacheLookup
    public WebElement reisezielOderHotel;

    @FindBy(css = "a[href='/reisen']")
    @CacheLookup
    private WebElement reiseziele;

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

    @FindBy(name = "info-tab-group")
    @CacheLookup
    private List<WebElement> service;

    private final String serviceValue = "on";

    @FindBy(css = "a[title='Service-Code']")
    @CacheLookup
    private WebElement servicecode;

    @FindBy(css = "a.c24-mainnav-sec-ele.c24-header-hover.last")
    @CacheLookup
    private WebElement shopping;

    @FindBy(css = "#c24-ask li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement sieSindSelbstProfiUndAuf;

    @FindBy(css = "a[title='Singlereisen']")
    @CacheLookup
    private WebElement singlereisen;

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

    @FindBy(css = "a[title='Urlaub Spanien']")
    @CacheLookup
    private WebElement spanienUrlaub;

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

    @FindBy(id = "c24-travel-greatsportsoffer-top")
    @CacheLookup
    private WebElement sportangebot;

    @FindBy(id = "c24-travel-return-date-element")
    @CacheLookup
    public WebElement sptesteRckreise;

    @FindBy(css = "a[href='https://urlaub.check24.de/statusinformation']")
    @CacheLookup
    private WebElement statusinformation;

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

    @FindBy(id = "studio-option")
    @CacheLookup
    private WebElement studio;

    @FindBy(id = "suite-option")
    @CacheLookup
    private WebElement suite;

    @FindBy(id = "superior-option")
    @CacheLookup
    private WebElement superiorzimmer;

    @FindBy(css = "a[title='Tablet-PCs']")
    @CacheLookup
    private WebElement tabletpcs;

    @FindBy(css = "a[title='Tablets']")
    @CacheLookup
    private WebElement tablets;

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> tage10;

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> tage58;

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> tage912;

    private final String tageValue10 = "10";

    private final String tageValue58 = "5-8";

    private final String tageValue912 = "9-12";

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

    @FindBy(css = "#c24-travel-js-searchform-box-element-wrapper div:nth-of-type(7) div.c24-travel-voucher-requirements-tooltip-cnt-flexible.c24-travel-js-voucher-requirements-tooltip-cnt-flexible a.c24-travel-js-conditions_link.c24-travel-tooltip-link-details")
    @CacheLookup
    private WebElement teilnahmebedingungen1;

    @FindBy(css = "#c24-travel-travel-search-form fieldset:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(12) div.c24-travel-voucher-requirements-tooltip-cnt-flexible.c24-travel-js-voucher-requirements-tooltip-cnt-flexible a.c24-travel-js-conditions_link.c24-travel-tooltip-link-details")
    @CacheLookup
    private WebElement teilnahmebedingungen2;

    @FindBy(css = "a[title='Urlaub Thailand']")
    @CacheLookup
    private WebElement thailandUrlaub;

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

    @FindBy(css = "a[title='Urlaub Türkei']")
    @CacheLookup
    private WebElement trkeiUrlaub;

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

    @FindBy(css = "#c24-content div:nth-of-type(2) div.c24-ads-sky-pos.c24-content-wrapper div:nth-of-type(5) div.provider-box a.more")
    @CacheLookup
    private WebElement undVieleMehr;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement unfallversicherung6MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement unfallversicherung6MonateGratis2;

    @FindBy(css = "a[title='Unternehmen']")
    @CacheLookup
    private WebElement unternehmen;

    @FindBy(css = "a[href='/reisen/spanien/mallorca']")
    @CacheLookup
    private WebElement urlaubAufMallorca;

    @FindBy(css = "a[title='Urlaub mit Kindern']")
    @CacheLookup
    private WebElement urlaubMitKindern;

    @FindBy(css = "a.js-mail-content")
    @CacheLookup
    private WebElement urlaubcheck24De1;

    @FindBy(css = "a.c24-contact-email-text")
    @CacheLookup
    private WebElement urlaubcheck24De2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(6)")
    @CacheLookup
    private WebElement urlaubsfinder1;

    @FindBy(css = "#c24-pau li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement urlaubsfinder2;

    @FindBy(css = "a.product-button.product-btn-hotelonly")
    @CacheLookup
    private WebElement urlaubshotelPPAb3;

    @FindBy(id = "c24-travel-touroperator-element")
    @CacheLookup
    private WebElement veranstalter;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement veranstaltungenEvents1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement veranstaltungenEvents2;

    @FindBy(id = "c24-travel-catering-element")
    @CacheLookup
    private WebElement verpflegung;

    @FindBy(css = "a[title='Versicherung Jubiläums Deals']")
    @CacheLookup
    private WebElement versicherungJubilumsDealsBisZu;

    @FindBy(css = "a[href='//www.check24.de/versicherungen/']")
    @CacheLookup
    private WebElement versicherungen;

    @FindBy(css = "#c24-mainnav-ele-ver a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement versicherungenKfzRechtsschutzUvm;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement versicherungjubilumsDealsbisZu12Monate1;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement versicherungjubilumsDealsbisZu12Monate2;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(2) a.c24-subnav-ele")
    @CacheLookup
    private WebElement versicherungscenter;

    @FindBy(css = "#c24-meinkonto div.c24-customer-layer.c24-header-hover-layer ul:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement versicherungscenterIhrDigitalerVersicherungsordner;

    @FindBy(css = "#c24-ver li:nth-of-type(6) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement versicherungscenterVersicherungenVerwaltenUndOptimieren;

    @FindBy(id = "villa-option")
    @CacheLookup
    private WebElement villa;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement waschmaschinen1;

    @FindBy(css = "#c24-sho li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement waschmaschinen2;

    @FindBy(id = "c24-cl-user-btn")
    @CacheLookup
    private WebElement weiter;

    @FindBy(css = "#c24-content div:nth-of-type(2) div.c24-ads-sky-pos.c24-content-wrapper div:nth-of-type(7) div:nth-of-type(3) div.flexy-grid.flexy-grid-2 div:nth-of-type(2) p:nth-of-type(4) span.link-cnt a.more")
    @CacheLookup
    private WebElement weitereVeranstalter;

    @FindBy(id = "c24-travel-wellness-top")
    @CacheLookup
    private WebElement wellness;

    @FindBy(css = "a[title='Wellnessurlaub']")
    @CacheLookup
    private WebElement wellnessurlaub;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement winterreifen1;

    @FindBy(css = "#c24-aut li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement winterreifen2;

    @FindBy(css = "a[title='Wischblatt']")
    @CacheLookup
    private WebElement wischblatt;

    @FindBy(id = "c24-travel-freewlan-top")
    @CacheLookup
    private WebElement wlanKostenlos;

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> woche1;

    private final String wocheValue1 = "1w";

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> wochen2;

    private final String wochenValue2 = "2w";

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

    @FindBy(id = "fake-c24-travel-roomtype-element")
    @CacheLookup
    private WebElement zimmer;

    @FindBy(name = "roomcount-selection")
    @CacheLookup
    private List<WebElement> zimmerMitJeZB13;

    @FindBy(name = "roomcount-selection")
    @CacheLookup
    private List<WebElement> zimmerMitJeZB2;

    @FindBy(id = "c24-travel-destination-layer-element")
    @CacheLookup
    private WebElement zimmerMitJeZB23;

    private final String zimmerMitJeZBValue2 = "2";

    private final String zimmerMitJeZBValue3 = "3";

    @FindBy(name = "roomcount-selection")
    @CacheLookup
    private List<WebElement> zimmerMitZB1;

    private final String zimmerMitZBValue1 = "1";

    @FindBy(css = "a[title='Zins Schnell-Check']")
    @CacheLookup
    private WebElement zinsSchnellcheck;

    @FindBy(css = "a[title='zu allen Kategorien']")
    @CacheLookup
    private WebElement zuAllenKategorien;

    @FindBy(css = "#c24-travel-js-searchform-box-element-wrapper div:nth-of-type(10) div.c24-travel-voucher-requirements-tooltip-cnt.c24-travel-js-voucher-requirements-tooltip-cnt a.c24-travel-tooltip-link-details.popup")
    @CacheLookup
    private WebElement zuDenDetailliertenEinlsebedingungen1;

    @FindBy(css = "#c24-travel-travel-search-form fieldset:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.c24-travel-voucher-requirements-tooltip-cnt.c24-travel-js-voucher-requirements-tooltip-cnt a.c24-travel-tooltip-link-details.popup")
    @CacheLookup
    private WebElement zuDenDetailliertenEinlsebedingungen2;

    @FindBy(css = "#c24-content div:nth-of-type(2) div.c24-ads-sky-pos.c24-content-wrapper div:nth-of-type(9) div.c24-hidden div:nth-of-type(1) a.tooltip-link-details.popup")
    @CacheLookup
    private WebElement zuDenDetailliertenEinlsebedingungen3;

    @FindBy(css = "#c24-content div:nth-of-type(2) div.c24-ads-sky-pos.c24-content-wrapper div:nth-of-type(9) div.c24-hidden div:nth-of-type(2) a.tooltip-link-details.popup")
    @CacheLookup
    private WebElement zuDenEinlsebedingungen;

    @FindBy(css = "a[title='Themenwelten Übersicht']")
    @CacheLookup
    private WebElement zuDenThemenwelten;

    @FindBy(id = "c24-travel-rail-n-fly-element")
    @CacheLookup
    private WebElement zugZumFlug;

    @FindBy(css = "a[title='CHECK24 Reiseratgeber']")
    @CacheLookup
    private WebElement zumReiseratgeber;

    @FindBy(css = "a[title='Ratgeber Buchen, Umbuchen und Stornieren']")
    @CacheLookup
    private WebElement zumThemaBuchung;

    @FindBy(css = "#c24-cl-form-user-login div:nth-of-type(2) div.c24-cl-content-top div:nth-of-type(5) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurck1;

    @FindBy(css = "#c24-cl-form-user-pwforget div:nth-of-type(2) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurck2;

    @FindBy(css = "#c24-page-container-header div.c24-page header div:nth-of-type(2) div:nth-of-type(4) div.c24-cl-content-top div:nth-of-type(3) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurckZurAnmeldung;

    //    Manual entry
    @FindBy(xpath = "//input[@id='c24-travel-duration-1']")
    @CacheLookup
    public WebElement selectDuration;

    //
    public TravelPage() {
    }

    public TravelPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public TravelPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public TravelPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Abmelden Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAbmeldenLink() {
        abmelden.click();
        return this;
    }

    /**
     * Click on Agb Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAgbLink() {
        agb.click();
        return this;
    }

    /**
     * Click on Aktuelle Reisenachrichten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAktuelleReisenachrichtenLink() {
        aktuelleReisenachrichten.click();
        return this;
    }

    /**
     * Click on Aktuelle Reiseweltartikel Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAktuelleReiseweltartikelLink() {
        aktuelleReiseweltartikel.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAllInclusive1Link() {
        allInclusive1.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAllInclusive2Link() {
        allInclusive2.click();
        return this;
    }

    /**
     * Click on All Inclusive P.p. Ab 146 7 Tage Inkl. Flug Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAllInclusivePPAb146Link() {
        allInclusivePPAb146.click();
        return this;
    }

    /**
     * Click on Alle Bewertungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAlleBewertungenLink() {
        alleBewertungen.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAlleKategorien1Link() {
        alleKategorien1.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAlleKategorien2Link() {
        alleKategorien2.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAlleKategorien3Link() {
        alleKategorien3.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAlleKategorien4Link() {
        alleKategorien4.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAlleKategorienLink() {
        alleKategorien.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAllnetFlatTarife1Link() {
        allnetFlatTarife1.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAllnetFlatTarife2Link() {
        allnetFlatTarife2.click();
        return this;
    }

    /**
     * Click on Anbieter Mit Prmie Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAnbieterMitPrmieLink() {
        anbieterMitPrmie.click();
        return this;
    }

    /**
     * Click on Anmelden Button.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAnmelden1Button() {
        anmelden1.click();
        return this;
    }

    /**
     * Click on Anmelden Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAnmelden1Link() {
        anmelden1.click();
        return this;
    }

//    /**
//     * Click on Anmelden Button.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage clickAnmelden2Button() {
//        anmelden2.click();
//        return this;
//    }
//
//    /**
//     * Click on Anmelden Link.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage clickAnmelden2Link() {
//        anmelden2.click();
//        return this;
//    }

    /**
     * Click on Anmelden Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAnmeldenLink() {
        anmelden.click();
        return this;
    }

    /**
     * Click on Anschlussfinanzierung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAnschlussfinanzierungLink() {
        anschlussfinanzierung.click();
        return this;
    }

    /**
     * Click on Auto Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutoLink() {
        auto.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutokredit1Link() {
        autokredit1.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutokredit2Link() {
        autokredit2.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutokredit3Link() {
        autokredit3.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutoreifen1Link() {
        autoreifen1.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutoreifen2Link() {
        autoreifen2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutoteile1Link() {
        autoteile1.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutoteile2Link() {
        autoteile2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickAutoteile3Link() {
        autoteile3.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBand1Link() {
        band1.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBand2Link() {
        band2.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBaufinanzierung1Link() {
        baufinanzierung1.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBaufinanzierung2Link() {
        baufinanzierung2.click();
        return this;
    }

    /**
     * Click on Baufinanzierungsrechner Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBaufinanzierungsrechnerLink() {
        baufinanzierungsrechner.click();
        return this;
    }

    /**
     * Click on Beauty Wellness Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBeautyWellnessLink() {
        beautyWellness.click();
        return this;
    }

    /**
     * Click on Beim Dsl Tarifvergleichexklusive Cashbackssichern Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBeimDslTarifvergleichexklusiveCashbackssichernLink() {
        beimDslTarifvergleichexklusiveCashbackssichern.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionangebote Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBer1MillionangeboteLink() {
        ber1Millionangebote.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionhotels Weltweit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBer1MillionhotelsWeltweitLink() {
        ber1MillionhotelsWeltweit.click();
        return this;
    }

    /**
     * Click on Bernehmen Button.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBernehmen1Button() {
        bernehmen1.click();
        return this;
    }

    /**
     * Click on Bernehmen Button.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBernehmen2Button() {
        bernehmen2.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBerufsunfhigkeitLink() {
        berufsunfhigkeit.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeitsversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBerufsunfhigkeitsversicherungLink() {
        berufsunfhigkeitsversicherung.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBewerbungsfotograf1Link() {
        bewerbungsfotograf1.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBewerbungsfotograf2Link() {
        bewerbungsfotograf2.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBilligflge1Link() {
        billigflge1.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBilligflge2Link() {
        billigflge2.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBrautstylist1Link() {
        brautstylist1.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBrautstylist2Link() {
        brautstylist2.click();
        return this;
    }

    /**
     * Click on Bremsbelag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBremsbelagLink() {
        bremsbelag.click();
        return this;
    }

    /**
     * Click on Bremsbelge Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBremsbelgeLink() {
        bremsbelge.click();
        return this;
    }

    /**
     * Click on Bremsscheibe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBremsscheibeLink() {
        bremsscheibe.click();
        return this;
    }

    /**
     * Click on Bremsscheiben Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickBremsscheibenLink() {
        bremsscheiben.click();
        return this;
    }

    /**
     * Click on Check24 Punkte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickCheck24PunkteLink() {
        check24Punkte.click();
        return this;
    }

    /**
     * Click on Check24 Reisekalender Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickCheck24ReisekalenderLink() {
        check24Reisekalender.click();
        return this;
    }

    /**
     * Click on Computer Konsole Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickComputerKonsoleLink() {
        computerKonsole.click();
        return this;
    }

    /**
     * Click on Cookies Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickCookiesLink() {
        cookies.click();
        return this;
    }

    /**
     * Click on Datenschutz Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDatenschutzLink() {
        datenschutz.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDatentarife1Link() {
        datentarife1.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDatentarife2Link() {
        datentarife2.click();
        return this;
    }

    /**
     * Click on Depot Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDepotLink() {
        depot.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDeutschNachhilfe1Link() {
        deutschNachhilfe1.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDeutschNachhilfe2Link() {
        deutschNachhilfe2.click();
        return this;
    }

    /**
     * Click on Deutschlands Besterkreditvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDeutschlandsBesterkreditvergleichLink() {
        deutschlandsBesterkreditvergleich.click();
        return this;
    }

    /**
     * Click on Deutschlands Gnstiger Onlinekredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDeutschlandsGnstigerOnlinekreditLink() {
        deutschlandsGnstigerOnlinekredit.click();
        return this;
    }

    /**
     * Click on Die Besten Tarife Mitund Ohne Smartphone Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDieBestenTarifeMitundOhneLink() {
        dieBestenTarifeMitundOhne.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDigitalkameras1Link() {
        digitalkameras1.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDigitalkameras2Link() {
        digitalkameras2.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDj1Link() {
        dj1.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDj2Link() {
        dj2.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDsl1Link() {
        dsl1.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDsl2Link() {
        dsl2.click();
        return this;
    }

    /**
     * Click on Dsl Handy Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslHandyLink() {
        dslHandy.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslservice1Link() {
        dslservice1.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslservice2Link() {
        dslservice2.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslspeedtest1Link() {
        dslspeedtest1.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslspeedtest2Link() {
        dslspeedtest2.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslverfgbarkeit1Link() {
        dslverfgbarkeit1.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslverfgbarkeit2Link() {
        dslverfgbarkeit2.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslvergleich1Link() {
        dslvergleich1.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickDslvergleich2Link() {
        dslvergleich2.click();
        return this;
    }

    /**
     * Click on Elektrische Zahnbrsten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickElektrischeZahnbrstenLink() {
        elektrischeZahnbrsten.click();
        return this;
    }

    /**
     * Click on Elektronik Haushalt Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickElektronikHaushaltLink() {
        elektronikHaushalt.click();
        return this;
    }

    /**
     * Click on Elektronik Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickElektronikLink() {
        elektronik.click();
        return this;
    }

    /**
     * Click on Elektrowerkzeug Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickElektrowerkzeugLink() {
        elektrowerkzeug.click();
        return this;
    }

    /**
     * Click on Energie Strom Gas Heizstrom Heizl Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickEnergieStromGasHeizstromHeizlLink() {
        energieStromGasHeizstromHeizl.click();
        return this;
    }

    /**
     * Click on Energiecenter Energievertrge Verwalten Und Optimieren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickEnergiecenterEnergievertrgeVerwaltenUndOptimierenLink() {
        energiecenterEnergievertrgeVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Energiecenter Ihre Wechselfristen Fr Strom Und Gasvertrge Nutzen Und Erneut Sparen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickEnergiecenterIhreWechselfristenFrStromLink() {
        energiecenterIhreWechselfristenFrStrom.click();
        return this;
    }

    /**
     * Click on Energiecenter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickEnergiecenterLink() {
        energiecenter.click();
        return this;
    }

    /**
     * Click on Englisch Nachhilfe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickEnglischNachhilfeLink() {
        englischNachhilfe.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickErnhrungsberater1Link() {
        ernhrungsberater1.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickErnhrungsberater2Link() {
        ernhrungsberater2.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickEventfotograf1Link() {
        eventfotograf1.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickEventfotograf2Link() {
        eventfotograf2.click();
        return this;
    }

    /**
     * Click on Familienfotograf Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFamilienfotografLink() {
        familienfotograf.click();
        return this;
    }

    /**
     * Click on Familienfreundliches Inselhotel Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFamilienfreundlichesInselhotelLink() {
        familienfreundlichesInselhotel.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFamilienurlaub1Link() {
        familienurlaub1.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFamilienurlaub2Link() {
        familienurlaub2.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFernseher1Link() {
        fernseher1.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFernseher2Link() {
        fernseher2.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFestgeld1Link() {
        festgeld1.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFestgeld2Link() {
        festgeld2.click();
        return this;
    }

    /**
     * Click on Festnetztelefone Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFestnetztelefoneLink() {
        festnetztelefone.click();
        return this;
    }

    /**
     * Click on Finanzierung Fr Kauf Und Bau Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFinanzierungFrKaufUndBauLink() {
        finanzierungFrKaufUndBau.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlge1Link() {
        flge1.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlge2Link() {
        flge2.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlge3Link() {
        flge3.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlgeLondon1Link() {
        flgeLondon1.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlgeLondon2Link() {
        flgeLondon2.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlgeMallorca1Link() {
        flgeMallorca1.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlgeMallorca2Link() {
        flgeMallorca2.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlgeNewYork1Link() {
        flgeNewYork1.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlgeNewYork2Link() {
        flgeNewYork2.click();
        return this;
    }

    /**
     * Click on Flug Und Hotel Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlugUndHotelLink() {
        flugUndHotel.click();
        return this;
    }

    /**
     * Click on Flugvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlugvergleichLink() {
        flugvergleich.click();
        return this;
    }

    /**
     * Click on Flugversptung Ihre Rechte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFlugversptungIhreRechteLink() {
        flugversptungIhreRechte.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFotoautomat1Link() {
        fotoautomat1.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFotoautomat2Link() {
        fotoautomat2.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFotografie1Link() {
        fotografie1.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFotografie2Link() {
        fotografie2.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFrhbucher1Link() {
        frhbucher1.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFrhbucher2Link() {
        frhbucher2.click();
        return this;
    }

    /**
     * Click on Frhbucher P.p. Ab 102 4 Tage Inkl. Flug Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickFrhbucherPPAb102Link() {
        frhbucherPPAb102.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGalaxyS9MitVertrag1Link() {
        galaxyS9MitVertrag1.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGalaxyS9MitVertrag2Link() {
        galaxyS9MitVertrag2.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGanzjahresreifen1Link() {
        ganzjahresreifen1.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGanzjahresreifen2Link() {
        ganzjahresreifen2.click();
        return this;
    }

    /**
     * Click on Garantiert Diegnstigstenpreise Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGarantiertDiegnstigstenpreiseLink() {
        garantiertDiegnstigstenpreise.click();
        return this;
    }

    /**
     * Click on Gartengerte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGartengerteLink() {
        gartengerte.click();
        return this;
    }

    /**
     * Click on Gasanbieter Wechseln Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGasanbieterWechselnLink() {
        gasanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGasvergleich1Link() {
        gasvergleich1.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGasvergleich2Link() {
        gasvergleich2.click();
        return this;
    }

    /**
     * Click on Gebudeversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGebudeversicherungLink() {
        gebudeversicherung.click();
        return this;
    }

    /**
     * Click on Gesangslehrer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGesangslehrerLink() {
        gesangslehrer.click();
        return this;
    }

    /**
     * Click on Gesellschaftsspiele Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGesellschaftsspieleLink() {
        gesellschaftsspiele.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGewerbegas1Link() {
        gewerbegas1.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGewerbegas2Link() {
        gewerbegas2.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGewerbestrom1Link() {
        gewerbestrom1.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGewerbestrom2Link() {
        gewerbestrom2.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGirokonto1Link() {
        girokonto1.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGirokonto2Link() {
        girokonto2.click();
        return this;
    }

    /**
     * Click on Gitarrenlehrer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGitarrenlehrerLink() {
        gitarrenlehrer.click();
        return this;
    }

    /**
     * Click on Gnstige Mietwagenangebote Weltweit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGnstigeMietwagenangeboteWeltweitLink() {
        gnstigeMietwagenangeboteWeltweit.click();
        return this;
    }

    /**
     * Click on Gran Canaria Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGranCanariaLink() {
        granCanaria.click();
        return this;
    }

    /**
     * Click on Grand Resort Hurghada Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGrandResortHurghadaLink() {
        grandResortHurghada.click();
        return this;
    }

    /**
     * Click on Griechenland Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGriechenlandLink() {
        griechenland.click();
        return this;
    }

    /**
     * Click on Gutscheine Guthaben Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGutscheineGuthabenLink() {
        gutscheineGuthaben.click();
        return this;
    }

    /**
     * Click on Gutscheine Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGutscheineLink() {
        gutscheine.click();
        return this;
    }

    /**
     * Click on Gypten Urlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickGyptenUrlaubLink() {
        gyptenUrlaub.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHaftpflichtversicherung1Link() {
        haftpflichtversicherung1.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHaftpflichtversicherung2Link() {
        haftpflichtversicherung2.click();
        return this;
    }

    /**
     * Click on Handy Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyLink() {
        handy.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyMitVertrag1Link() {
        handyMitVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyMitVertrag2Link() {
        handyMitVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyOhneVertrag1Link() {
        handyOhneVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyOhneVertrag2Link() {
        handyOhneVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Telefon Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyTelefonLink() {
        handyTelefon.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandybersicht1Link() {
        handybersicht1.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandybersicht2Link() {
        handybersicht2.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandytarifeNurSimkarte1Link() {
        handytarifeNurSimkarte1.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandytarifeNurSimkarte2Link() {
        handytarifeNurSimkarte2.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyversicherung1Link() {
        handyversicherung1.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyversicherung2Link() {
        handyversicherung2.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyvertragKndigen1Link() {
        handyvertragKndigen1.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHandyvertragKndigen2Link() {
        handyvertragKndigen2.click();
        return this;
    }

    /**
     * Click on Hausfinanzierung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHausfinanzierungLink() {
        hausfinanzierung.click();
        return this;
    }

    /**
     * Click on Haushalt Wohnen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHaushaltWohnenLink() {
        haushaltWohnen.click();
        return this;
    }

    /**
     * Click on Hausratversicherung6 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHausratversicherung6MonateGratis1Link() {
        hausratversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Hausratversicherung6 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHausratversicherung6MonateGratis2Link() {
        hausratversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Brille Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHeilpraktikerBrilleLink() {
        heilpraktikerBrille.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Und Brille Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHeilpraktikerUndBrilleLink() {
        heilpraktikerUndBrille.click();
        return this;
    }

    /**
     * Click on Heimwerken Garten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHeimwerkenGartenLink() {
        heimwerkenGarten.click();
        return this;
    }

    /**
     * Click on Heizl Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHeizlLink() {
        heizl.click();
        return this;
    }

    /**
     * Click on Heizlvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHeizlvergleichLink() {
        heizlvergleich.click();
        return this;
    }

    /**
     * Click on Heizstrom Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHeizstromLink() {
        heizstrom.click();
        return this;
    }

    /**
     * Click on Heizstromvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHeizstromvergleichLink() {
        heizstromvergleich.click();
        return this;
    }

    /**
     * Click on Hier Erfahren Sie Mehr Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierErfahrenSieMehr1Link() {
        hierErfahrenSieMehr1.click();
        return this;
    }

    /**
     * Click on Hier Erfahren Sie Mehr Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierErfahrenSieMehr2Link() {
        hierErfahrenSieMehr2.click();
        return this;
    }

    /**
     * Click on Hier Erfahren Sie Mehr Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierErfahrenSieMehr3Link() {
        hierErfahrenSieMehr3.click();
        return this;
    }

    /**
     * Click on Hier Erfahren Sie Mehr Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierErfahrenSieMehr4Link() {
        hierErfahrenSieMehr4.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierKontoAnlegen1Link() {
        hierKontoAnlegen1.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierKontoAnlegen2Link() {
        hierKontoAnlegen2.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierKontoAnlegen3Link() {
        hierKontoAnlegen3.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHierKontoAnlegen4Link() {
        hierKontoAnlegen4.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHochzeit1Link() {
        hochzeit1.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHochzeit2Link() {
        hochzeit2.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHochzeitsfotograf1Link() {
        hochzeitsfotograf1.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHochzeitsfotograf2Link() {
        hochzeitsfotograf2.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHochzeitssnger1Link() {
        hochzeitssnger1.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHochzeitssnger2Link() {
        hochzeitssnger2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotel1Link() {
        hotel1.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotel2Link() {
        hotel2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotel3Link() {
        hotel3.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotel4Link() {
        hotel4.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelBerlin1Link() {
        hotelBerlin1.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelBerlin2Link() {
        hotelBerlin2.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelMnchen1Link() {
        hotelMnchen1.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelMnchen2Link() {
        hotelMnchen2.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelParis1Link() {
        hotelParis1.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelParis2Link() {
        hotelParis2.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelRom1Link() {
        hotelRom1.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelRom2Link() {
        hotelRom2.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelsucheWeltweit1Link() {
        hotelsucheWeltweit1.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelsucheWeltweit2Link() {
        hotelsucheWeltweit2.click();
        return this;
    }

    /**
     * Click on Hotelvergleiche Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHotelvergleicheLink() {
        hotelvergleiche.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHundehaftpflicht1Link() {
        hundehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHundehaftpflicht2Link() {
        hundehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHundekrankenversicherung1Link() {
        hundekrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickHundekrankenversicherung2Link() {
        hundekrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Immobilienfinanzierung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickImmobilienfinanzierungLink() {
        immobilienfinanzierung.click();
        return this;
    }

    /**
     * Click on Impressum Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickImpressumLink() {
        impressum.click();
        return this;
    }

    /**
     * Click on Internet Dsl Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickInternetDslLink() {
        internetDsl.click();
        return this;
    }

    /**
     * Click on Internet Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickInternetLink() {
        internet.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickInternetanbieter1Link() {
        internetanbieter1.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickInternetanbieter2Link() {
        internetanbieter2.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickIphoneXMitVertrag1Link() {
        iphoneXMitVertrag1.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickIphoneXMitVertrag2Link() {
        iphoneXMitVertrag2.click();
        return this;
    }

    /**
     * Click on Italien Urlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickItalienUrlaubLink() {
        italienUrlaub.click();
        return this;
    }

//    /**
//     * Click on Jetzt Anmelden Link.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage clickJetztAnmeldenLink() {
//        jetztAnmelden.click();
//        return this;
//    }
//
//    /**
//     * Click on Jetzt Anmelden Link.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage clickJetztAnmeldenLink() {
//        jetztAnmelden.click();
//        return this;
//    }

    /**
     * Click on Jetzt Autoteile Reifenzum Besten Preis Sichern Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickJetztAutoteileReifenzumBestenLink() {
        jetztAutoteileReifenzumBesten.click();
        return this;
    }

    /**
     * Click on Jetzt Registrieren Button.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickJetztRegistrierenButton() {
        jetztRegistrieren.click();
        return this;
    }

    /**
     * Click on Jetzt Vorliegendesbaufinanzierungsangebotgratis Checken Lassen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickJetztVorliegendesbaufinanzierungsangebotgratisCheckenLassenLink() {
        jetztVorliegendesbaufinanzierungsangebotgratisCheckenLassen.click();
        return this;
    }

    /**
     * Click on Kaffeemaschinen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKaffeemaschinenLink() {
        kaffeemaschinen.click();
        return this;
    }

    /**
     * Click on Kaffeevollautomaten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKaffeevollautomatenLink() {
        kaffeevollautomaten.click();
        return this;
    }

    /**
     * Click on Kapitalbeschaffung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKapitalbeschaffungLink() {
        kapitalbeschaffung.click();
        return this;
    }

    /**
     * Click on Karriere Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKarriereLink() {
        karriere.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKfzversicherung1Link() {
        kfzversicherung1.click();
        return this;
    }

    /**
     * Click on Kfzversicherung1 Monat Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKfzversicherung1MonatGratis1Link() {
        kfzversicherung1MonatGratis1.click();
        return this;
    }

    /**
     * Click on Kfzversicherung1 Monat Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKfzversicherung1MonatGratis2Link() {
        kfzversicherung1MonatGratis2.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKfzversicherung2Link() {
        kfzversicherung2.click();
        return this;
    }

    /**
     * Click on Klavierlehrer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKlavierlehrerLink() {
        klavierlehrer.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKogas1Link() {
        kogas1.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKogas2Link() {
        kogas2.click();
        return this;
    }

    /**
     * Click on Kontakt Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKontaktLink() {
        kontakt.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKontoKredit1Link() {
        kontoKredit1.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKontoKredit2Link() {
        kontoKredit2.click();
        return this;
    }

    /**
     * Click on Kontomanager Finanzen Verwalten Und Optimieren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKontomanagerFinanzenVerwaltenUndOptimierenLink() {
        kontomanagerFinanzenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Kontomanager Ihre Finanzen An Einem Ort Verwalten Und Optimieren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKontomanagerIhreFinanzenAnEinemLink() {
        kontomanagerIhreFinanzenAnEinem.click();
        return this;
    }

    /**
     * Click on Kontomanager Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKontomanagerLink() {
        kontomanager.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKostrom1Link() {
        kostrom1.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKostrom2Link() {
        kostrom2.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz6 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKrankenhauszusatz6MonateGratis1Link() {
        krankenhauszusatz6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz6 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKrankenhauszusatz6MonateGratis2Link() {
        krankenhauszusatz6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKrankenkassen1Link() {
        krankenkassen1.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKrankenkassen2Link() {
        krankenkassen2.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKrankenzusatzversicherung1Link() {
        krankenzusatzversicherung1.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKrankenzusatzversicherung2Link() {
        krankenzusatzversicherung2.click();
        return this;
    }

    /**
     * Click on Kredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditLink() {
        kredit.click();
        return this;
    }

    /**
     * Click on Kreditcenter Ihre Aktuellen Kreditanfragen Und Kreditzusagen Auf Einen Blick Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditcenterIhreAktuellenKreditanfragenUndLink() {
        kreditcenterIhreAktuellenKreditanfragenUnd.click();
        return this;
    }

    /**
     * Click on Kreditcenter Kreditantrge Abschlsse Auf Einen Blick Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditcenterKreditantrgeAbschlsseAufLink() {
        kreditcenterKreditantrgeAbschlsseAuf.click();
        return this;
    }

    /**
     * Click on Kreditcenter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditcenterLink() {
        kreditcenter.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditkarte1Link() {
        kreditkarte1.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditkarte2Link() {
        kreditkarte2.click();
        return this;
    }

    /**
     * Click on Kreditrechner Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditrechnerLink() {
        kreditrechner.click();
        return this;
    }

    /**
     * Click on Kreditvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickKreditvergleichLink() {
        kreditvergleich.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLastMinute1Link() {
        lastMinute1.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLastMinute2Link() {
        lastMinute2.click();
        return this;
    }

    /**
     * Click on Last Minute P.p. Ab 107 4 Tage Inkl. Flug Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLastMinutePPAb107Link() {
        lastMinutePPAb107.click();
        return this;
    }

    /**
     * Click on Lego Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLegoLink() {
        lego.click();
        return this;
    }

    /**
     * Click on Leuchten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLeuchtenLink() {
        leuchten.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLfilter1Link() {
        lfilter1.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLfilter2Link() {
        lfilter2.click();
        return this;
    }

    /**
     * Click on Lte Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLteLink() {
        lte.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLuftfilter1Link() {
        luftfilter1.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickLuftfilter2Link() {
        luftfilter2.click();
        return this;
    }

    /**
     * Click on Malediven Urlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMaledivenUrlaubLink() {
        maledivenUrlaub.click();
        return this;
    }

    /**
     * Click on Mallorcastrandguide Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMallorcastrandguideLink() {
        mallorcastrandguide.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMatheNachhilfe1Link() {
        matheNachhilfe1.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMatheNachhilfe2Link() {
        matheNachhilfe2.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMbeltransport1Link() {
        mbeltransport1.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMbeltransport2Link() {
        mbeltransport2.click();
        return this;
    }

    /**
     * Click on Mehr Erfahren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMehrErfahrenLink() {
        mehrErfahren.click();
        return this;
    }

    /**
     * Click on Mehr... Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMehrLink() {
        mehr.click();
        return this;
    }

    /**
     * Click on Mein Konto Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMeinKontoLink() {
        meinKonto.click();
        return this;
    }

    /**
     * Click on Meine Aktivitten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMeineAktivittenLink() {
        meineAktivitten.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagen1Link() {
        mietwagen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagen2Link() {
        mietwagen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagen3Link() {
        mietwagen3.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagen4Link() {
        mietwagen4.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagen5Link() {
        mietwagen5.click();
        return this;
    }

    /**
     * Click on Mietwagen Ab 5 Pro Tag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenAb5ProLink() {
        mietwagenAb5Pro.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenDeutschland1Link() {
        mietwagenDeutschland1.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenDeutschland2Link() {
        mietwagenDeutschland2.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenGoldclub1Link() {
        mietwagenGoldclub1.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenGoldclub2Link() {
        mietwagenGoldclub2.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenMallorca1Link() {
        mietwagenMallorca1.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenMallorca2Link() {
        mietwagenMallorca2.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenRundreisen1Link() {
        mietwagenRundreisen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenRundreisen2Link() {
        mietwagenRundreisen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenSpanien1Link() {
        mietwagenSpanien1.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenSpanien2Link() {
        mietwagenSpanien2.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenUsa1Link() {
        mietwagenUsa1.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMietwagenUsa2Link() {
        mietwagenUsa2.click();
        return this;
    }

    /**
     * Click on Modernisierung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickModernisierungLink() {
        modernisierung.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMotorradversicherung1Link() {
        motorradversicherung1.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMotorradversicherung2Link() {
        motorradversicherung2.click();
        return this;
    }

    /**
     * Click on Musikunterricht Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickMusikunterrichtLink() {
        musikunterricht.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNachhilfe1Link() {
        nachhilfe1.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNachhilfe2Link() {
        nachhilfe2.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNachtspeicherheizung1Link() {
        nachtspeicherheizung1.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNachtspeicherheizung2Link() {
        nachtspeicherheizung2.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on Nirgendwognstigergarantie Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNirgendwognstigergarantieLink() {
        nirgendwognstigergarantie.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNotebooks1Link() {
        notebooks1.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNotebooks2Link() {
        notebooks2.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNurBis10101Link() {
        nurBis10101.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickNurBis10102Link() {
        nurBis10102.click();
        return this;
    }

    /**
     * Click on Ok Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickOkLink() {
        ok.click();
        return this;
    }

    /**
     * Click on Partner Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPartnerLink() {
        partner.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPasswortVergessen1Link() {
        passwortVergessen1.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPasswortVergessen2Link() {
        passwortVergessen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPauschalreisen1Link() {
        pauschalreisen1.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPauschalreisen2Link() {
        pauschalreisen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Zu Den Besten Preisen Buchen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPauschalreisenZuDenBestenPreisenLink() {
        pauschalreisenZuDenBestenPreisen.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPersonalTrainer1Link() {
        personalTrainer1.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPersonalTrainer2Link() {
        personalTrainer2.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPferdehaftpflicht1Link() {
        pferdehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPferdehaftpflicht2Link() {
        pferdehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Pflegeversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPflegeversicherungLink() {
        pflegeversicherung.click();
        return this;
    }

    /**
     * Click on Pflegezusatzversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPflegezusatzversicherungLink() {
        pflegezusatzversicherung.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrepaidUnd1monatstarife1Link() {
        prepaidUnd1monatstarife1.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrepaidUnd1monatstarife2Link() {
        prepaidUnd1monatstarife2.click();
        return this;
    }

    /**
     * Click on Presse Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPresseLink() {
        presse.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrivateKrankenversicherung1Link() {
        privateKrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrivateKrankenversicherung2Link() {
        privateKrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrivaterYogalehrer1Link() {
        privaterYogalehrer1.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrivaterYogalehrer2Link() {
        privaterYogalehrer2.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht12 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrivathaftpflicht12MonateGratis1Link() {
        privathaftpflicht12MonateGratis1.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht12 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickPrivathaftpflicht12MonateGratis2Link() {
        privathaftpflicht12MonateGratis2.click();
        return this;
    }

    /**
     * Click on Profis Fr Ihr Projekt Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickProfisFrIhrProjektLink() {
        profisFrIhrProjekt.click();
        return this;
    }

    /**
     * Click on Profis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickProfisLink() {
        profis.click();
        return this;
    }

    /**
     * Click on Rasierer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRasiererLink() {
        rasierer.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRatenkredit1Link() {
        ratenkredit1.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRatenkredit2Link() {
        ratenkredit2.click();
        return this;
    }

    /**
     * Click on Ratgeber Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRatgeberLink() {
        ratgeber.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung3 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRechtsschutzversicherung3MonateGratis1Link() {
        rechtsschutzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung3 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRechtsschutzversicherung3MonateGratis2Link() {
        rechtsschutzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Reifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReifenLink() {
        reifen.click();
        return this;
    }

    /**
     * Click on Reise Finden Button.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseFindenButton() {
        reiseFinden.click();
        return this;
    }

    /**
     * Click on Reise Flug Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseFlugLink() {
        reiseFlug.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseGoldclub1Link() {
        reiseGoldclub1.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseGoldclub2Link() {
        reiseGoldclub2.click();
        return this;
    }

    /**
     * Click on Reise Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseLink() {
        reise.click();
        return this;
    }

    /**
     * Click on Reisevergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReisevergleichLink() {
        reisevergleich.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseversicherung1Link() {
        reiseversicherung1.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseversicherung2Link() {
        reiseversicherung2.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseweltBestenlisten1Link() {
        reiseweltBestenlisten1.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseweltBestenlisten2Link() {
        reiseweltBestenlisten2.click();
        return this;
    }

    /**
     * Click on Reisewelt Insidertipps Empfehlungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReiseweltInsidertippsEmpfehlungenLink() {
        reiseweltInsidertippsEmpfehlungen.click();
        return this;
    }

    /**
     * Click on Reiseziele Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickReisezieleLink() {
        reiseziele.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRentenversicherung1Link() {
        rentenversicherung1.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRentenversicherung2Link() {
        rentenversicherung2.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung3 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRisikolebensversicherung3MonateGratis1Link() {
        risikolebensversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung3 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickRisikolebensversicherung3MonateGratis2Link() {
        risikolebensversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Scheibenwischer Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickScheibenwischerLink() {
        scheibenwischer.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSchutzbriefautomobilclub1Link() {
        schutzbriefautomobilclub1.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSchutzbriefautomobilclub2Link() {
        schutzbriefautomobilclub2.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSchutzbriefautomobilclub3Link() {
        schutzbriefautomobilclub3.click();
        return this;
    }

    /**
     * Click on Senden Button.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSendenButton() {
        senden.click();
        return this;
    }

    /**
     * Click on Servicecode Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickServicecodeLink() {
        servicecode.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickShoppingLink() {
        shopping.click();
        return this;
    }

    /**
     * Click on Sie Sind Selbst Profi Und Auf Der Suche Nach Neuen Kunden Jetzt Anmelden Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSieSindSelbstProfiUndAufLink() {
        sieSindSelbstProfiUndAuf.click();
        return this;
    }

    /**
     * Click on Singlereisen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSinglereisenLink() {
        singlereisen.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSmartphones1Link() {
        smartphones1.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSmartphones2Link() {
        smartphones2.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSommerreifen1Link() {
        sommerreifen1.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSommerreifen2Link() {
        sommerreifen2.click();
        return this;
    }

    /**
     * Click on Spanien Urlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSpanienUrlaubLink() {
        spanienUrlaub.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSpielwaren1Link() {
        spielwaren1.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSpielwaren2Link() {
        spielwaren2.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSportWellness1Link() {
        sportWellness1.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSportWellness2Link() {
        sportWellness2.click();
        return this;
    }

    /**
     * Click on Statusinformation Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStatusinformationLink() {
        statusinformation.click();
        return this;
    }

    /**
     * Click on Staubsauger Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStaubsaugerLink() {
        staubsauger.click();
        return this;
    }

    /**
     * Click on Stdtereisen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStdtereisenLink() {
        stdtereisen.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSterbegeldversicherung1Link() {
        sterbegeldversicherung1.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickSterbegeldversicherung2Link() {
        sterbegeldversicherung2.click();
        return this;
    }

    /**
     * Click on Strom Gas Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStromGasLink() {
        stromGas.click();
        return this;
    }

    /**
     * Click on Stromanbieter Wechseln Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStromanbieterWechselnLink() {
        stromanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Strompreise Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStrompreiseLink() {
        strompreise.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStromvergleich1Link() {
        stromvergleich1.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickStromvergleich2Link() {
        stromvergleich2.click();
        return this;
    }

    /**
     * Click on Tabletpcs Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTabletpcsLink() {
        tabletpcs.click();
        return this;
    }

    /**
     * Click on Tablets Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTabletsLink() {
        tablets.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTagesgeld1Link() {
        tagesgeld1.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTagesgeld2Link() {
        tagesgeld2.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTarifeFrJungeLeute1Link() {
        tarifeFrJungeLeute1.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTarifeFrJungeLeute2Link() {
        tarifeFrJungeLeute2.click();
        return this;
    }

    /**
     * Click on Teilnahmebedingungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTeilnahmebedingungen1Link() {
        teilnahmebedingungen1.click();
        return this;
    }

    /**
     * Click on Teilnahmebedingungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTeilnahmebedingungen2Link() {
        teilnahmebedingungen2.click();
        return this;
    }

    /**
     * Click on Thailand Urlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickThailandUrlaubLink() {
        thailandUrlaub.click();
        return this;
    }

    /**
     * Click on Tilgungsrechner Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTilgungsrechnerLink() {
        tilgungsrechner.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Gypten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTop10HotelsGyptenLink() {
        top10HotelsGypten.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Kanaren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTop10HotelsKanarenLink() {
        top10HotelsKanaren.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Mallorca Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTop10HotelsMallorcaLink() {
        top10HotelsMallorca.click();
        return this;
    }

    /**
     * Click on Trkei Urlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickTrkeiUrlaubLink() {
        trkeiUrlaub.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUmschuldung1Link() {
        umschuldung1.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUmschuldung2Link() {
        umschuldung2.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUmzugsunternehmen1Link() {
        umzugsunternehmen1.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUmzugsunternehmen2Link() {
        umzugsunternehmen2.click();
        return this;
    }

    /**
     * Click on Und Viele Mehr Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUndVieleMehrLink() {
        undVieleMehr.click();
        return this;
    }

    /**
     * Click on Unfallversicherung6 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUnfallversicherung6MonateGratis1Link() {
        unfallversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Unfallversicherung6 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUnfallversicherung6MonateGratis2Link() {
        unfallversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Unternehmen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUnternehmenLink() {
        unternehmen.click();
        return this;
    }

    /**
     * Click on Urlaub Auf Mallorca Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUrlaubAufMallorcaLink() {
        urlaubAufMallorca.click();
        return this;
    }

    /**
     * Click on Urlaub Mit Kindern Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUrlaubMitKindernLink() {
        urlaubMitKindern.click();
        return this;
    }

    /**
     * Click on Urlaubcheck24.de Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUrlaubcheck24De1Link() {
        urlaubcheck24De1.click();
        return this;
    }

    /**
     * Click on Urlaubcheck24.de Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUrlaubcheck24De2Link() {
        urlaubcheck24De2.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUrlaubsfinder1Link() {
        urlaubsfinder1.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUrlaubsfinder2Link() {
        urlaubsfinder2.click();
        return this;
    }

    /**
     * Click on Urlaubshotel P.p. Ab 3 Fr 1 Tag Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickUrlaubshotelPPAb3Link() {
        urlaubshotelPPAb3.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVeranstaltungenEvents1Link() {
        veranstaltungenEvents1.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVeranstaltungenEvents2Link() {
        veranstaltungenEvents2.click();
        return this;
    }

    /**
     * Click on Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungJubilumsDealsBisZuLink() {
        versicherungJubilumsDealsBisZu.click();
        return this;
    }

    /**
     * Click on Versicherungen Kfz Rechtsschutz Uvm. Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungenKfzRechtsschutzUvmLink() {
        versicherungenKfzRechtsschutzUvm.click();
        return this;
    }

    /**
     * Click on Versicherungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungenLink() {
        versicherungen.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Dealsbis Zu 12 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungjubilumsDealsbisZu12Monate1Link() {
        versicherungjubilumsDealsbisZu12Monate1.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Dealsbis Zu 12 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungjubilumsDealsbisZu12Monate2Link() {
        versicherungjubilumsDealsbisZu12Monate2.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Ihr Digitaler Versicherungsordner Vertrge Und Bedarf Richtig Prfen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungscenterIhrDigitalerVersicherungsordnerLink() {
        versicherungscenterIhrDigitalerVersicherungsordner.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungscenterLink() {
        versicherungscenter.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Versicherungen Verwalten Und Optimieren Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickVersicherungscenterVersicherungenVerwaltenUndOptimierenLink() {
        versicherungscenterVersicherungenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWaschmaschinen1Link() {
        waschmaschinen1.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWaschmaschinen2Link() {
        waschmaschinen2.click();
        return this;
    }

    /**
     * Click on Weiter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWeiterLink() {
        weiter.click();
        return this;
    }

    /**
     * Click on Weitere Veranstalter Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWeitereVeranstalterLink() {
        weitereVeranstalter.click();
        return this;
    }

    /**
     * Click on Wellnessurlaub Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWellnessurlaubLink() {
        wellnessurlaub.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWinterreifen1Link() {
        winterreifen1.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWinterreifen2Link() {
        winterreifen2.click();
        return this;
    }

    /**
     * Click on Wischblatt Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWischblattLink() {
        wischblatt.click();
        return this;
    }

    /**
     * Click on Wohngebudeversicherung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWohngebudeversicherungLink() {
        wohngebudeversicherung.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWrmepumpe1Link() {
        wrmepumpe1.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickWrmepumpe2Link() {
        wrmepumpe2.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung3 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZahnzusatzversicherung3MonateGratis1Link() {
        zahnzusatzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung3 Monate Gratis Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZahnzusatzversicherung3MonateGratis2Link() {
        zahnzusatzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Zins Schnellcheck Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZinsSchnellcheckLink() {
        zinsSchnellcheck.click();
        return this;
    }

    /**
     * Click on Zu Allen Kategorien Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZuAllenKategorienLink() {
        zuAllenKategorien.click();
        return this;
    }

    /**
     * Click on Zu Den Detaillierten Einlsebedingungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZuDenDetailliertenEinlsebedingungen1Link() {
        zuDenDetailliertenEinlsebedingungen1.click();
        return this;
    }

    /**
     * Click on Zu Den Detaillierten Einlsebedingungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZuDenDetailliertenEinlsebedingungen2Link() {
        zuDenDetailliertenEinlsebedingungen2.click();
        return this;
    }

    /**
     * Click on Zu Den Detaillierten Einlsebedingungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZuDenDetailliertenEinlsebedingungen3Link() {
        zuDenDetailliertenEinlsebedingungen3.click();
        return this;
    }

    /**
     * Click on Zu Den Einlsebedingungen Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZuDenEinlsebedingungenLink() {
        zuDenEinlsebedingungen.click();
        return this;
    }

    /**
     * Click on Zu Den Themenwelten Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZuDenThemenweltenLink() {
        zuDenThemenwelten.click();
        return this;
    }

    /**
     * Click on Zum Reiseratgeber Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZumReiseratgeberLink() {
        zumReiseratgeber.click();
        return this;
    }

    /**
     * Click on Zum Thema Buchung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZumThemaBuchungLink() {
        zumThemaBuchung.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZurck1Link() {
        zurck1.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZurck2Link() {
        zurck2.click();
        return this;
    }

    /**
     * Click on Zurck Zur Anmeldung Link.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage clickZurckZurAnmeldungLink() {
        zurckZurAnmeldung.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage fill() {
//        set089242411TextField1();
        setComputerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinenTextField();
        setEmailadresseIstNichtKorrekt1EmailField();
        setBitteGebenSieIhrPasswortEin1PasswordField();
        setEmailadresseIstNichtKorrekt2EmailField();
        setBitteGebenSieIhrPasswortEin2PasswordField();
        setEmailadresseIstNichtKorrekt3EmailField();
        setEmailadresseIstNichtKorrekt4EmailField();
        setBitteWhlenSieEinPasswortPasswordField();
        setBitteWiederholenSieIhrPasswortPasswordField();
        setReisedauer1DropDownListField();
        setReisezielOderHotelTextField();
        setAbflughafenTextField();
        setReisendeDropDownListField();
        setKind1DropDownListField1();
        setKind1DropDownListField2();
        setKind1DropDownListField3();
        setKind1DropDownListField4();
        setFrhesteHinreiseTextField();
        setSptesteRckreiseTextField();
        setBitteWhlenRadioButtonField();
        setExaktWieAngegebenRadioButtonField();
        setWocheRadioButtonField1();
        setWochenRadioButtonField2();
        setTageRadioButtonField58();
        setTageRadioButtonField912();
        setTageRadioButtonField10();
//        setReisedauerEingebenTage1TelField();
        setReisedauerEingebenTage2TelField();
//        setReisedauer2DropDownListField();
        setFlugCheckboxField();
        setHotelsterneDropDownListField();
        setGstebewertungDropDownListField();
        setVerpflegungDropDownListField();
        setZimmerDropDownListField();
        setEinzelzimmerCheckboxField();
        setDoppelzimmerCheckboxField();
        setFamilienzimmerCheckboxField();
        setDreibettzimmerCheckboxField();
        setMehrbettzimmerCheckboxField();
        setSuperiorzimmerCheckboxField();
        setDeluxezimmerCheckboxField();
        setStudioCheckboxField();
        setApartmentCheckboxField();
        setDuplexzimmerCheckboxField();
        setBungalowCheckboxField();
        setSuiteCheckboxField();
        setVillaCheckboxField();
        setMitMeerblickCheckboxField();
        setHoteltransferCheckboxField();
        setZugZumFlugCheckboxField();
        setVeranstalterDropDownListField();
        setClubCheckboxField();
        setDirekteStrandlageCheckboxField();
        setFamilienfreundlichCheckboxField();
        setSportangebotCheckboxField();
        setWlanKostenlosCheckboxField();
        setNurFrErwachseneCheckboxField();
        setPoolCheckboxField();
        setWellnessCheckboxField();
//        setPauschalreisen3RadioButtonField();
        setReiseveranstalterRadioButtonField();
        setAktuellesRadioButtonField();
        setServiceRadioButtonField();
        setKind2DropDownListField1();
        setKind2DropDownListField2();
        setKind2DropDownListField3();
        setKind2DropDownListField4();
        setZimmerMitZBRadioButtonField1();
        setZimmerMitJeZBRadioButtonField2();
//        setZimmerMitJeZB1TextField3();
        setZimmerMitJeZB2TextField3();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage fillAndSubmit() {
        fill();
        return submit();
    }

//    /**
//     * Set default value to 1 089 24 24 11 33 Hilfe Und Kontakt Ihre Persnliche Reiseberatung Text field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage set089242411TextField1() {
//        return set089242411TextField1(data.get("089_24_24_11_1"));
//    }
//
//    /**
//     * Set value to 1 089 24 24 11 33 Hilfe Und Kontakt Ihre Persnliche Reiseberatung Text field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage set089242411TextField1(String 089242411Value1) {
//        _0892424111.sendKeys(089242411Value1);
//        return this;
//    }

    /**
     * Set default value to Abflughafen Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setAbflughafenTextField() {
        return setAbflughafenTextField(data.get("ABFLUGHAFEN"));
    }

    /**
     * Set value to Abflughafen Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setAbflughafenTextField(String abflughafenValue) {
        abflughafen.sendKeys(abflughafenValue);
        return this;
    }

    /**
     * Set default value to Aktuelles Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setAktuellesRadioButtonField() {
        for (WebElement el : aktuelles) {
            if (el.getAttribute("value").equals(aktuellesValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set Apartment Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setApartmentCheckboxField() {
        if (!apartment.isSelected()) {
            apartment.click();
        }
        return this;
    }

    /**
     * Set default value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteGebenSieIhrPasswortEin1PasswordField() {
        return setBitteGebenSieIhrPasswortEin1PasswordField(data.get("BITTE_GEBEN_SIE_IHR_PASSWORT_EIN_1"));
    }

    /**
     * Set value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteGebenSieIhrPasswortEin1PasswordField(String bitteGebenSieIhrPasswortEin1Value) {
        bitteGebenSieIhrPasswortEin1.sendKeys(bitteGebenSieIhrPasswortEin1Value);
        return this;
    }

    /**
     * Set default value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteGebenSieIhrPasswortEin2PasswordField() {
        return setBitteGebenSieIhrPasswortEin2PasswordField(data.get("BITTE_GEBEN_SIE_IHR_PASSWORT_EIN_2"));
    }

    /**
     * Set value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteGebenSieIhrPasswortEin2PasswordField(String bitteGebenSieIhrPasswortEin2Value) {
        bitteGebenSieIhrPasswortEin2.sendKeys(bitteGebenSieIhrPasswortEin2Value);
        return this;
    }

    /**
     * Set default value to Bitte Whlen Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteWhlenRadioButtonField() {
        for (WebElement el : bitteWhlen) {
            if (el.getAttribute("value").equals(bitteWhlenValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Bitte Whlen Sie Ein Passwort Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteWhlenSieEinPasswortPasswordField() {
        return setBitteWhlenSieEinPasswortPasswordField(data.get("BITTE_WHLEN_SIE_EIN_PASSWORT"));
    }

    /**
     * Set value to Bitte Whlen Sie Ein Passwort Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteWhlenSieEinPasswortPasswordField(String bitteWhlenSieEinPasswortValue) {
        bitteWhlenSieEinPasswort.sendKeys(bitteWhlenSieEinPasswortValue);
        return this;
    }

    /**
     * Set default value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteWiederholenSieIhrPasswortPasswordField() {
        return setBitteWiederholenSieIhrPasswortPasswordField(data.get("BITTE_WIEDERHOLEN_SIE_IHR_PASSWORT"));
    }

    /**
     * Set value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBitteWiederholenSieIhrPasswortPasswordField(String bitteWiederholenSieIhrPasswortValue) {
        bitteWiederholenSieIhrPasswort.sendKeys(bitteWiederholenSieIhrPasswortValue);
        return this;
    }

    /**
     * Set Bungalow Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setBungalowCheckboxField() {
        if (!bungalow.isSelected()) {
            bungalow.click();
        }
        return this;
    }

    /**
     * Set Club Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setClubCheckboxField() {
        if (!club.isSelected()) {
            club.click();
        }
        return this;
    }

    /**
     * Set default value to Computer Konsolenotebookstablets Haushalt Wohnenkaffeemaschinenwaschmaschinen Beauty Wellnessrasiererelektrische Zahnbrsten Heimwerken Gartengartengerteelektrowerkzeug Spielwarengesellschaftsspielelego Autoteile Reifenautoteilereifen Alle Kategorien Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setComputerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinenTextField() {
        return setComputerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinenTextField(data.get("COMPUTER_KONSOLENOTEBOOKSTABLETS_HAUSHALT_WOHNENKAFFEEMASCHINENWASCHMASCHINEN"));
    }

    /**
     * Set value to Computer Konsolenotebookstablets Haushalt Wohnenkaffeemaschinenwaschmaschinen Beauty Wellnessrasiererelektrische Zahnbrsten Heimwerken Gartengartengerteelektrowerkzeug Spielwarengesellschaftsspielelego Autoteile Reifenautoteilereifen Alle Kategorien Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setComputerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinenTextField(String computerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinenValue) {
        computerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinen.sendKeys(computerKonsolenotebookstabletsHaushaltWohnenkaffeemaschinenwaschmaschinenValue);
        return this;
    }

    /**
     * Set Deluxezimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setDeluxezimmerCheckboxField() {
        if (!deluxezimmer.isSelected()) {
            deluxezimmer.click();
        }
        return this;
    }

    /**
     * Set Direkte Strandlage Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setDirekteStrandlageCheckboxField() {
        if (!direkteStrandlage.isSelected()) {
            direkteStrandlage.click();
        }
        return this;
    }

    /**
     * Set Doppelzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setDoppelzimmerCheckboxField() {
        if (!doppelzimmer.isSelected()) {
            doppelzimmer.click();
        }
        return this;
    }

    /**
     * Set Dreibettzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setDreibettzimmerCheckboxField() {
        if (!dreibettzimmer.isSelected()) {
            dreibettzimmer.click();
        }
        return this;
    }

    /**
     * Set Duplexzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setDuplexzimmerCheckboxField() {
        if (!duplexzimmer.isSelected()) {
            duplexzimmer.click();
        }
        return this;
    }

    /**
     * Set Einzelzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEinzelzimmerCheckboxField() {
        if (!einzelzimmer.isSelected()) {
            einzelzimmer.click();
        }
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt1EmailField() {
        return setEmailadresseIstNichtKorrekt1EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_1"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt1EmailField(String emailadresseIstNichtKorrekt1Value) {
        emailadresseIstNichtKorrekt1.sendKeys(emailadresseIstNichtKorrekt1Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt2EmailField() {
        return setEmailadresseIstNichtKorrekt2EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_2"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt2EmailField(String emailadresseIstNichtKorrekt2Value) {
        emailadresseIstNichtKorrekt2.sendKeys(emailadresseIstNichtKorrekt2Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt3EmailField() {
        return setEmailadresseIstNichtKorrekt3EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_3"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt3EmailField(String emailadresseIstNichtKorrekt3Value) {
        emailadresseIstNichtKorrekt3.sendKeys(emailadresseIstNichtKorrekt3Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt4EmailField() {
        return setEmailadresseIstNichtKorrekt4EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_4"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setEmailadresseIstNichtKorrekt4EmailField(String emailadresseIstNichtKorrekt4Value) {
        emailadresseIstNichtKorrekt4.sendKeys(emailadresseIstNichtKorrekt4Value);
        return this;
    }

    /**
     * Set default value to Exakt Wie Angegeben Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setExaktWieAngegebenRadioButtonField() {
        for (WebElement el : exaktWieAngegeben) {
            if (el.getAttribute("value").equals(exaktWieAngegebenValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set Familienfreundlich Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setFamilienfreundlichCheckboxField() {
        if (!familienfreundlich.isSelected()) {
            familienfreundlich.click();
        }
        return this;
    }

    /**
     * Set Familienzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setFamilienzimmerCheckboxField() {
        if (!familienzimmer.isSelected()) {
            familienzimmer.click();
        }
        return this;
    }

    /**
     * Set Flug Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setFlugCheckboxField() {
        if (!flug.isSelected()) {
            flug.click();
        }
        return this;
    }

    /**
     * Set default value to Frheste Hinreise Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setFrhesteHinreiseTextField() {
        return setFrhesteHinreiseTextField(data.get("FRHESTE_HINREISE"));
    }

    /**
     * Set value to Frheste Hinreise Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setFrhesteHinreiseTextField(String frhesteHinreiseValue) {
        frhesteHinreise.sendKeys(frhesteHinreiseValue);
        return this;
    }

    /**
     * Set default value to Gstebewertung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setGstebewertungDropDownListField() {
        return setGstebewertungDropDownListField(data.get("GSTEBEWERTUNG"));
    }

    /**
     * Set value to Gstebewertung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setGstebewertungDropDownListField(String gstebewertungValue) {
        new Select(gstebewertung).selectByVisibleText(gstebewertungValue);
        return this;
    }

    /**
     * Set default value to Hotelsterne Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setHotelsterneDropDownListField() {
        return setHotelsterneDropDownListField(data.get("HOTELSTERNE"));
    }

    /**
     * Set value to Hotelsterne Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setHotelsterneDropDownListField(String hotelsterneValue) {
        new Select(hotelsterne).selectByVisibleText(hotelsterneValue);
        return this;
    }

    /**
     * Set Hoteltransfer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setHoteltransferCheckboxField() {
        if (!hoteltransfer.isSelected()) {
            hoteltransfer.click();
        }
        return this;
    }

    /**
     * Set default value to 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField1() {
        return setKind1DropDownListField1(data.get("KIND_1_1"));
    }

    /**
     * Set value to 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField1(String kind1Value1) {
        new Select(kind11).selectByVisibleText(kind1Value1);
        return this;
    }

    /**
     * Set default value to 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField2() {
        return setKind1DropDownListField2(data.get("KIND_1_2"));
    }

    /**
     * Set value to 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField2(String kind1Value2) {
        new Select(kind12).selectByVisibleText(kind1Value2);
        return this;
    }

    /**
     * Set default value to 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField3() {
        return setKind1DropDownListField3(data.get("KIND_1_3"));
    }

    /**
     * Set value to 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField3(String kind1Value3) {
        new Select(kind13).selectByVisibleText(kind1Value3);
        return this;
    }

    /**
     * Set default value to 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField4() {
        return setKind1DropDownListField4(data.get("KIND_1_4"));
    }

    /**
     * Set value to 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind1DropDownListField4(String kind1Value4) {
        new Select(kind14).selectByVisibleText(kind1Value4);
        return this;
    }

    /**
     * Set default value to 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField1() {
        return setKind2DropDownListField1(data.get("KIND_2_1"));
    }

    /**
     * Set value to 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField1(String kind2Value1) {
        new Select(kind21).selectByVisibleText(kind2Value1);
        return this;
    }

    /**
     * Set default value to 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField2() {
        return setKind2DropDownListField2(data.get("KIND_2_2"));
    }

    /**
     * Set value to 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField2(String kind2Value2) {
        new Select(kind22).selectByVisibleText(kind2Value2);
        return this;
    }

    /**
     * Set default value to 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField3() {
        return setKind2DropDownListField3(data.get("KIND_2_3"));
    }

    /**
     * Set value to 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField3(String kind2Value3) {
        new Select(kind23).selectByVisibleText(kind2Value3);
        return this;
    }

    /**
     * Set default value to 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField4() {
        return setKind2DropDownListField4(data.get("KIND_2_4"));
    }

    /**
     * Set value to 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setKind2DropDownListField4(String kind2Value4) {
        new Select(kind24).selectByVisibleText(kind2Value4);
        return this;
    }

    /**
     * Set Mehrbettzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setMehrbettzimmerCheckboxField() {
        if (!mehrbettzimmer.isSelected()) {
            mehrbettzimmer.click();
        }
        return this;
    }

    /**
     * Set Mit Meerblick Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setMitMeerblickCheckboxField() {
        if (!mitMeerblick.isSelected()) {
            mitMeerblick.click();
        }
        return this;
    }

    /**
     * Set Nur Fr Erwachsene Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setNurFrErwachseneCheckboxField() {
        if (!nurFrErwachsene.isSelected()) {
            nurFrErwachsene.click();
        }
        return this;
    }

//    /**
//     * Set default value to Pauschalreisen Radio Button field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage setPauschalreisen3RadioButtonField() {
//        for (WebElement el : pauschalreisen3) {
//            if (el.getAttribute("value").equals(pauschalreisen3Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set Pool Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setPoolCheckboxField() {
        if (!pool.isSelected()) {
            pool.click();
        }
        return this;
    }

    /**
     * Set default value to Reisedauer Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisedauer1DropDownListField() {
        return setReisedauer1DropDownListField(data.get("REISEDAUER_1"));
    }

    /**
     * Set value to Reisedauer Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisedauer1DropDownListField(String reisedauer1Value) {
        reisedauer1.sendKeys(reisedauer1Value);
        return this;
    }

//    /**
//     * Set default value to Reisedauer Drop Down List field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage setReisedauer2DropDownListField() {
//        return setReisedauer2DropDownListField(data.get("REISEDAUER_2"));
//    }

//    /**
//     * Set value to Reisedauer Drop Down List field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage setReisedauer2DropDownListField(String reisedauer2Value) {
//        new Select(reisedauer2).selectByVisibleText(reisedauer2Value);
//        return this;
//    }

//    /**
//     * Set default value to Reisedauer Eingeben Tage Tel field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage setReisedauerEingebenTage1TelField() {
//        for (WebElement el : reisedauerEingebenTage1) {
//            if (el.getAttribute("value").equals(reisedauerEingebenTage1Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set default value to Reisedauer Eingeben Tage Tel field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisedauerEingebenTage2TelField() {
        return setReisedauerEingebenTage2TelField(data.get("REISEDAUER_EINGEBEN_TAGE_2"));
    }

    /**
     * Set value to Reisedauer Eingeben Tage Tel field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisedauerEingebenTage2TelField(String reisedauerEingebenTage2Value) {
        reisedauerEingebenTage2.sendKeys(reisedauerEingebenTage2Value);
        return this;
    }

    /**
     * Set default value to Reisende Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisendeDropDownListField() {
        return setReisendeDropDownListField(data.get("REISENDE"));
    }

    /**
     * Set value to Reisende Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisendeDropDownListField(String reisendeValue) {
        new Select(reisende).selectByVisibleText(reisendeValue);
        return this;
    }

    /**
     * Set default value to Reiseveranstalter Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReiseveranstalterRadioButtonField() {
        for (WebElement el : reiseveranstalter) {
            if (el.getAttribute("value").equals(reiseveranstalterValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Reiseziel Oder Hotel Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisezielOderHotelTextField() {
        return setReisezielOderHotelTextField(data.get("REISEZIEL_ODER_HOTEL"));
    }

    /**
     * Set value to Reiseziel Oder Hotel Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setReisezielOderHotelTextField(String reisezielOderHotelValue) {
        reisezielOderHotel.sendKeys(reisezielOderHotelValue);
        return this;
    }

    /**
     * Set default value to Service Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setServiceRadioButtonField() {
        for (WebElement el : service) {
            if (el.getAttribute("value").equals(serviceValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set Sportangebot Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setSportangebotCheckboxField() {
        if (!sportangebot.isSelected()) {
            sportangebot.click();
        }
        return this;
    }

    /**
     * Set default value to Spteste Rckreise Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setSptesteRckreiseTextField() {
        return setSptesteRckreiseTextField(data.get("SPTESTE_RCKREISE"));
    }

    /**
     * Set value to Spteste Rckreise Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setSptesteRckreiseTextField(String sptesteRckreiseValue) {
        sptesteRckreise.sendKeys(sptesteRckreiseValue);
        return this;
    }

    /**
     * Set Studio Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setStudioCheckboxField() {
        if (!studio.isSelected()) {
            studio.click();
        }
        return this;
    }

    /**
     * Set Suite Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setSuiteCheckboxField() {
        if (!suite.isSelected()) {
            suite.click();
        }
        return this;
    }

    /**
     * Set Superiorzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setSuperiorzimmerCheckboxField() {
        if (!superiorzimmer.isSelected()) {
            superiorzimmer.click();
        }
        return this;
    }

    /**
     * Set default value to 10 Tage Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setTageRadioButtonField10() {
        for (WebElement el : tage10) {
            if (el.getAttribute("value").equals(tageValue10)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to 58 Tage Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setTageRadioButtonField58() {
        for (WebElement el : tage58) {
            if (el.getAttribute("value").equals(tageValue58)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to 912 Tage Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setTageRadioButtonField912() {
        for (WebElement el : tage912) {
            if (el.getAttribute("value").equals(tageValue912)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Veranstalter Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setVeranstalterDropDownListField() {
        return setVeranstalterDropDownListField(data.get("VERANSTALTER"));
    }

    /**
     * Set value to Veranstalter Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setVeranstalterDropDownListField(String veranstalterValue) {
        new Select(veranstalter).selectByVisibleText(veranstalterValue);
        return this;
    }

    /**
     * Set default value to Verpflegung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setVerpflegungDropDownListField() {
        return setVerpflegungDropDownListField(data.get("VERPFLEGUNG"));
    }

    /**
     * Set value to Verpflegung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setVerpflegungDropDownListField(String verpflegungValue) {
        new Select(verpflegung).selectByVisibleText(verpflegungValue);
        return this;
    }

    /**
     * Set Villa Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setVillaCheckboxField() {
        if (!villa.isSelected()) {
            villa.click();
        }
        return this;
    }

    /**
     * Set Wellness Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setWellnessCheckboxField() {
        if (!wellness.isSelected()) {
            wellness.click();
        }
        return this;
    }

    /**
     * Set Wlan Kostenlos Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setWlanKostenlosCheckboxField() {
        if (!wlanKostenlos.isSelected()) {
            wlanKostenlos.click();
        }
        return this;
    }

    /**
     * Set default value to 1 Woche Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setWocheRadioButtonField1() {
        for (WebElement el : woche1) {
            if (el.getAttribute("value").equals(wocheValue1)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to 2 Wochen Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setWochenRadioButtonField2() {
        for (WebElement el : wochen2) {
            if (el.getAttribute("value").equals(wochenValue2)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Zimmer Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setZimmerDropDownListField() {
        return setZimmerDropDownListField(data.get("ZIMMER"));
    }

    /**
     * Set value to Zimmer Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setZimmerDropDownListField(String zimmerValue) {
        new Select(zimmer).selectByVisibleText(zimmerValue);
        return this;
    }

//    /**
//     * Set default value to 3 Zimmer Mit Je Z.b. Text field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage setZimmerMitJeZB1TextField3() {
//        for (WebElement el : zimmerMitJeZB13) {
//            if (el.getAttribute("value").equals(zimmerMitJeZB1Value3)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set default value to 3 Zimmer Mit Je Z.b. Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setZimmerMitJeZB2TextField3() {
        return setZimmerMitJeZB2TextField3(data.get("ZIMMER_MIT_JE_Z_B__2_3"));
    }

    /**
     * Set value to 3 Zimmer Mit Je Z.b. Text field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setZimmerMitJeZB2TextField3(String zimmerMitJeZB2Value3) {
        zimmerMitJeZB23.sendKeys(zimmerMitJeZB2Value3);
        return this;
    }

    /**
     * Set default value to 2 Zimmer Mit Je Z.b. Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setZimmerMitJeZBRadioButtonField2() {
        for (WebElement el : zimmerMitJeZB2) {
            if (el.getAttribute("value").equals(zimmerMitJeZBValue2)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to 1 Zimmer Mit Z.b. Radio Button field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setZimmerMitZBRadioButtonField1() {
        for (WebElement el : zimmerMitZB1) {
            if (el.getAttribute("value").equals(zimmerMitZBValue1)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set Zug Zum Flug Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage setZugZumFlugCheckboxField() {
        if (!zugZumFlug.isSelected()) {
            zugZumFlug.click();
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage submit() {
        clickJetztRegistrierenButton();
        return this;
    }

    /**
     * Unset Apartment Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetApartmentCheckboxField() {
        if (apartment.isSelected()) {
            apartment.click();
        }
        return this;
    }

    /**
     * Unset Bungalow Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetBungalowCheckboxField() {
        if (bungalow.isSelected()) {
            bungalow.click();
        }
        return this;
    }

    /**
     * Unset Club Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetClubCheckboxField() {
        if (club.isSelected()) {
            club.click();
        }
        return this;
    }

    /**
     * Unset Deluxezimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetDeluxezimmerCheckboxField() {
        if (deluxezimmer.isSelected()) {
            deluxezimmer.click();
        }
        return this;
    }

    /**
     * Unset Direkte Strandlage Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetDirekteStrandlageCheckboxField() {
        if (direkteStrandlage.isSelected()) {
            direkteStrandlage.click();
        }
        return this;
    }

    /**
     * Unset Doppelzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetDoppelzimmerCheckboxField() {
        if (doppelzimmer.isSelected()) {
            doppelzimmer.click();
        }
        return this;
    }

    /**
     * Unset Dreibettzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetDreibettzimmerCheckboxField() {
        if (dreibettzimmer.isSelected()) {
            dreibettzimmer.click();
        }
        return this;
    }

    /**
     * Unset Duplexzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetDuplexzimmerCheckboxField() {
        if (duplexzimmer.isSelected()) {
            duplexzimmer.click();
        }
        return this;
    }

    /**
     * Unset Einzelzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetEinzelzimmerCheckboxField() {
        if (einzelzimmer.isSelected()) {
            einzelzimmer.click();
        }
        return this;
    }

    /**
     * Unset Familienfreundlich Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetFamilienfreundlichCheckboxField() {
        if (familienfreundlich.isSelected()) {
            familienfreundlich.click();
        }
        return this;
    }

    /**
     * Unset Familienzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetFamilienzimmerCheckboxField() {
        if (familienzimmer.isSelected()) {
            familienzimmer.click();
        }
        return this;
    }

    /**
     * Unset Flug Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetFlugCheckboxField() {
        if (flug.isSelected()) {
            flug.click();
        }
        return this;
    }

    /**
     * Unset default value from Gstebewertung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetGstebewertungDropDownListField() {
        return unsetGstebewertungDropDownListField(data.get("GSTEBEWERTUNG"));
    }

    /**
     * Unset value from Gstebewertung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetGstebewertungDropDownListField(String gstebewertungValue) {
        new Select(gstebewertung).deselectByVisibleText(gstebewertungValue);
        return this;
    }

    /**
     * Unset default value from Hotelsterne Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetHotelsterneDropDownListField() {
        return unsetHotelsterneDropDownListField(data.get("HOTELSTERNE"));
    }

    /**
     * Unset value from Hotelsterne Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetHotelsterneDropDownListField(String hotelsterneValue) {
        new Select(hotelsterne).deselectByVisibleText(hotelsterneValue);
        return this;
    }

    /**
     * Unset Hoteltransfer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetHoteltransferCheckboxField() {
        if (hoteltransfer.isSelected()) {
            hoteltransfer.click();
        }
        return this;
    }

    /**
     * Unset default value from 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField1() {
        return unsetKind1DropDownListField1(data.get("KIND_1_1"));
    }

    /**
     * Unset value from 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField1(String kind1Value1) {
        new Select(kind11).deselectByVisibleText(kind1Value1);
        return this;
    }

    /**
     * Unset default value from 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField2() {
        return unsetKind1DropDownListField2(data.get("KIND_1_2"));
    }

    /**
     * Unset value from 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField2(String kind1Value2) {
        new Select(kind12).deselectByVisibleText(kind1Value2);
        return this;
    }

    /**
     * Unset default value from 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField3() {
        return unsetKind1DropDownListField3(data.get("KIND_1_3"));
    }

    /**
     * Unset value from 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField3(String kind1Value3) {
        new Select(kind13).deselectByVisibleText(kind1Value3);
        return this;
    }

    /**
     * Unset default value from 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField4() {
        return unsetKind1DropDownListField4(data.get("KIND_1_4"));
    }

    /**
     * Unset value from 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind1DropDownListField4(String kind1Value4) {
        new Select(kind14).deselectByVisibleText(kind1Value4);
        return this;
    }

    /**
     * Unset default value from 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField1() {
        return unsetKind2DropDownListField1(data.get("KIND_2_1"));
    }

    /**
     * Unset value from 1. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField1(String kind2Value1) {
        new Select(kind21).deselectByVisibleText(kind2Value1);
        return this;
    }

    /**
     * Unset default value from 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField2() {
        return unsetKind2DropDownListField2(data.get("KIND_2_2"));
    }

    /**
     * Unset value from 2. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField2(String kind2Value2) {
        new Select(kind22).deselectByVisibleText(kind2Value2);
        return this;
    }

    /**
     * Unset default value from 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField3() {
        return unsetKind2DropDownListField3(data.get("KIND_2_3"));
    }

    /**
     * Unset value from 3. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField3(String kind2Value3) {
        new Select(kind23).deselectByVisibleText(kind2Value3);
        return this;
    }

    /**
     * Unset default value from 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField4() {
        return unsetKind2DropDownListField4(data.get("KIND_2_4"));
    }

    /**
     * Unset value from 4. Kind Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetKind2DropDownListField4(String kind2Value4) {
        new Select(kind24).deselectByVisibleText(kind2Value4);
        return this;
    }

    /**
     * Unset Mehrbettzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetMehrbettzimmerCheckboxField() {
        if (mehrbettzimmer.isSelected()) {
            mehrbettzimmer.click();
        }
        return this;
    }

    /**
     * Unset Mit Meerblick Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetMitMeerblickCheckboxField() {
        if (mitMeerblick.isSelected()) {
            mitMeerblick.click();
        }
        return this;
    }

    /**
     * Unset Nur Fr Erwachsene Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetNurFrErwachseneCheckboxField() {
        if (nurFrErwachsene.isSelected()) {
            nurFrErwachsene.click();
        }
        return this;
    }

    /**
     * Unset Pool Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetPoolCheckboxField() {
        if (pool.isSelected()) {
            pool.click();
        }
        return this;
    }

//    /**
//     * Unset default value from Reisedauer Drop Down List field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage unsetReisedauer2DropDownListField() {
//        return unsetReisedauer2DropDownListField(data.get("REISEDAUER_2"));
//    }

//    /**
//     * Unset value from Reisedauer Drop Down List field.
//     *
//     * @return the TravelPage class instance.
//     */
//    public TravelPage unsetReisedauer2DropDownListField(String reisedauer2Value) {
//        new Select(reisedauer2).deselectByVisibleText(reisedauer2Value);
//        return this;
//    }

    /**
     * Unset default value from Reisende Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetReisendeDropDownListField() {
        return unsetReisendeDropDownListField(data.get("REISENDE"));
    }

    /**
     * Unset value from Reisende Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetReisendeDropDownListField(String reisendeValue) {
        new Select(reisende).deselectByVisibleText(reisendeValue);
        return this;
    }

    /**
     * Unset Sportangebot Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetSportangebotCheckboxField() {
        if (sportangebot.isSelected()) {
            sportangebot.click();
        }
        return this;
    }

    /**
     * Unset Studio Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetStudioCheckboxField() {
        if (studio.isSelected()) {
            studio.click();
        }
        return this;
    }

    /**
     * Unset Suite Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetSuiteCheckboxField() {
        if (suite.isSelected()) {
            suite.click();
        }
        return this;
    }

    /**
     * Unset Superiorzimmer Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetSuperiorzimmerCheckboxField() {
        if (superiorzimmer.isSelected()) {
            superiorzimmer.click();
        }
        return this;
    }

    /**
     * Unset default value from Veranstalter Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetVeranstalterDropDownListField() {
        return unsetVeranstalterDropDownListField(data.get("VERANSTALTER"));
    }

    /**
     * Unset value from Veranstalter Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetVeranstalterDropDownListField(String veranstalterValue) {
        new Select(veranstalter).deselectByVisibleText(veranstalterValue);
        return this;
    }

    /**
     * Unset default value from Verpflegung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetVerpflegungDropDownListField() {
        return unsetVerpflegungDropDownListField(data.get("VERPFLEGUNG"));
    }

    /**
     * Unset value from Verpflegung Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetVerpflegungDropDownListField(String verpflegungValue) {
        new Select(verpflegung).deselectByVisibleText(verpflegungValue);
        return this;
    }

    /**
     * Unset Villa Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetVillaCheckboxField() {
        if (villa.isSelected()) {
            villa.click();
        }
        return this;
    }

    /**
     * Unset Wellness Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetWellnessCheckboxField() {
        if (wellness.isSelected()) {
            wellness.click();
        }
        return this;
    }

    /**
     * Unset Wlan Kostenlos Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetWlanKostenlosCheckboxField() {
        if (wlanKostenlos.isSelected()) {
            wlanKostenlos.click();
        }
        return this;
    }

    /**
     * Unset default value from Zimmer Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetZimmerDropDownListField() {
        return unsetZimmerDropDownListField(data.get("ZIMMER"));
    }

    /**
     * Unset value from Zimmer Drop Down List field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetZimmerDropDownListField(String zimmerValue) {
        new Select(zimmer).deselectByVisibleText(zimmerValue);
        return this;
    }

    /**
     * Unset Zug Zum Flug Checkbox field.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage unsetZugZumFlugCheckboxField() {
        if (zugZumFlug.isSelected()) {
            zugZumFlug.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the TravelPage class instance.
     */
    public TravelPage verifyPageLoaded() {
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
     * @return the TravelPage class instance.
     */
    public TravelPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
