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

public class FrontPage extends StartDriver {
    private Map<String, String> data;
//    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a.bx-pager-link.active")
    @CacheLookup
    private WebElement _1;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(10) a.bx-pager-link")
    @CacheLookup
    private WebElement _10;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(11) a.bx-pager-link")
    @CacheLookup
    private WebElement _11;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) a.bx-pager-link")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) a.bx-pager-link")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(4) a.bx-pager-link")
    @CacheLookup
    private WebElement _4;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(5) a.bx-pager-link")
    @CacheLookup
    private WebElement _5;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(6) a.bx-pager-link")
    @CacheLookup
    private WebElement _6;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(7) a.bx-pager-link")
    @CacheLookup
    private WebElement _7;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(9) a.bx-pager-link")
    @CacheLookup
    private WebElement _9;

    @FindBy(id = "c24-travel-airport-element")
    @CacheLookup
    private WebElement abflughafen;

    @FindBy(id = "dep_datetime_date")
    @CacheLookup
    private WebElement abholdatum;

    @FindBy(id = "dep_city")
    @CacheLookup
    private WebElement abholort;

    @FindBy(css = "a[title='Account & Credit']")
    @CacheLookup
    private WebElement accountCredit;

    @FindBy(css = "a[href='https://www.check24.de/kontomanager/?ref=c24konto']")
    @CacheLookup
    private WebElement accountManagersManageAndOptimize;

    @FindBy(css = "a[title='Affiliate Program']")
    @CacheLookup
    private WebElement affiliateProgram;

    @FindBy(css = "a[href='https://www.check24.de/gas/news/energieproduktion-die-zukunftsaussichten-fuer-ein-eigenes-lng-terminal-64926/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenDie11092018;

    @FindBy(css = "a[href='https://www.check24.de/kfz-versicherung/news/punktesammler-automarken-64972/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenDie26092018;

    @FindBy(css = "a[href='https://www.check24.de/kredit/news/dispo-mit-ratenkredit-abloesen-kann-bis-zu-700-euro-an-zinsen-sparen-64963/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenDispo25092018;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div.clearfix.c24-tab-news-content div:nth-of-type(2) div.c24-news-info-list.c24-row div:nth-of-type(1) a.c24-news-box")
    @CacheLookup
    private WebElement aktuelleNachrichtenFerienflieger126092018;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(6) div.c24-row div:nth-of-type(3) div:nth-of-type(2) div.c24-news-info-list.c24-row div:nth-of-type(1) a.c24-news-box")
    @CacheLookup
    private WebElement aktuelleNachrichtenFerienflieger226092018;

    @FindBy(css = "a[href='https://www.check24.de/girokonto/news/geld-abheben-und-einzahlen-bei-aldi-rewe-edeka-und-co-64967/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenGeld24092018;

    @FindBy(css = "a[href='/dsl/news/vodafone-ausbau-gigabit-kabelnetz-64941/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenGigabitanschlsse14092018;

    @FindBy(css = "a[href='/news/preisvergleich/onlineshopping-in-diesen-staedten-64796/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenIn07082018;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div.clearfix.c24-tab-news-content div:nth-of-type(2) div.c24-news-info-list.c24-row div:nth-of-type(2) a.c24-news-box")
    @CacheLookup
    private WebElement aktuelleNachrichtenMnchen126092018;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(6) div.c24-row div:nth-of-type(3) div:nth-of-type(2) div.c24-news-info-list.c24-row div:nth-of-type(2) a.c24-news-box")
    @CacheLookup
    private WebElement aktuelleNachrichtenMnchen226092018;

    @FindBy(css = "a[href='https://www.check24.de/strom-gas/news/energiewende-power-fuels-synthetischer-treibstoff-aus-strom-64959/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenPower21092018;

    @FindBy(css = "a[href='/dsl/news/gigabit-ausbau-anforderungen-64937/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenTelekommunikationsverbnde13092018;

    @FindBy(css = "a[href='/news/preisvergleich/bitkom-gaming-trends-2018-64838/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenZocken16082018;

    @FindBy(css = "a[href='https://www.check24.de/gesetzliche-krankenversicherung/news/continentale-studie-zufriedenheit-mit-gesetzlicher-krankenversicherung-erneut-gestiegen-64975/']")
    @CacheLookup
    private WebElement aktuelleNachrichtenZufriedenheit26092018;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement allInclusive1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement allInclusive2;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(11) div.c24-home-slide div.c24-aue-slidercontainer div:nth-of-type(1) ul.c24-aue-slider-list li:nth-of-type(4) a.c24-button")
    @CacheLookup
    private WebElement allSpareParts;

    @FindBy(css = "a[href='/vergleichen/auszeichnungen/?fp=aut']")
    @CacheLookup
    private WebElement alleAuszeichnungenAnsehen;

    @FindBy(css = "a[title='Customer reviews CHECK24']")
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

    @FindBy(id = "rentalcar_free_miles_unlimited")
    @CacheLookup
    private WebElement alleKilometerFrei;

    @FindBy(css = "a[title='All comparisons of CHECK24']")
    @CacheLookup
    private WebElement allgemein;

    @FindBy(css = "a[href='/handytarife/vergleich/?minutes_included=flatrate&tid2=sidenavi']")
    @CacheLookup
    private WebElement allnetFlatTarife1;

    @FindBy(css = "a[href='/handytarife/vergleich/?minutes_included=flatrate&tid2=topnavi']")
    @CacheLookup
    private WebElement allnetFlatTarife2;

    @FindBy(name = "customer_age")
    @CacheLookup
    private WebElement alterDesFahrers;

    @FindBy(css = "a[title='Anbieter mit Prämie']")
    @CacheLookup
    private WebElement anbieterMitPrmie;

    @FindBy(id = "dest_city-checkbox")
    @CacheLookup
    private WebElement anderenRckgabeortWhlen;

    @FindBy(id = "c24-cl-register-login")
    @CacheLookup
    private WebElement anmelden;

    @FindBy(id = "c24-cl-user-prefill-btn")
    @CacheLookup
    private WebElement anmelden1;

    @FindBy(id = "c24-cl-pw-btn")
    @CacheLookup
    private WebElement anmelden2;

    @FindBy(css = "a[title='Anschlussfinanzierung']")
    @CacheLookup
    private WebElement anschlussfinanzierung;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement autokredit1;

    @FindBy(css = "#c24-fin li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement autokredit2;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(2) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement autokredit3;

    @FindBy(css = "a[title='günstiger Autokredit']")
    @CacheLookup
    private WebElement autokredit4;

    @FindBy(css = "a[title='automobile']")
    @CacheLookup
    private WebElement automobile;

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

    @FindBy(css = "a[title='Autoversicherung']")
    @CacheLookup
    private WebElement autoversicherung;

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

    @FindBy(css = "a[title='Baufinanzierung Vergleich']")
    @CacheLookup
    private WebElement baufinanzierung3;

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

    @FindBy(css = "a[href='https://preisvergleich.check24.de/bodenstaubsauger/bosch-bgs5rcl-relaxxx-prosilence.html']")
    @CacheLookup
    private WebElement boschBgs5rclRelaxxxProsilBodenstaubsauger;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/kuechenmaschinen/bosch-mum4426.html']")
    @CacheLookup
    private WebElement boschMum4426Kchenmaschinen23Angebote;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/kopfhoerer/bose-quietcomfort-25-apple.html']")
    @CacheLookup
    private WebElement boseQuietcomfort25AppleHeadphone;

    @FindBy(css = "a[href='https://autoteile.check24.de/bremsen']")
    @CacheLookup
    private WebElement brakes;

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

    @FindBy(id = "rentalcar_type_convertible")
    @CacheLookup
    private WebElement cabrio;

    @FindBy(css = "a.c24-comparison-box.c24-rsnmwa")
    @CacheLookup
    private WebElement carHireSavingUpTo;

    @FindBy(css = "a.c24-subnav-ele.c24-subnav-ele-vw")
    @CacheLookup
    private WebElement carInsurance1MonatGratis;

    @FindBy(css = "a.c24-comparison-box.c24-verkfz")
    @CacheLookup
    private WebElement carInsuranceSavingsUpTo;

    @FindBy(css = "a[title='Job']")
    @CacheLookup
    private WebElement career;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/filme-und-serien/cars-3-evolution-dvd.html']")
    @CacheLookup
    private WebElement cars3EvolutionDvdFilme;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(11) div.c24-home-slide div.c24-aue-slidercontainer div:nth-of-type(1) div:nth-of-type(2) div.c24-bubble-container div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) p:nth-of-type(4) a")
    @CacheLookup
    private WebElement check24AutoteilePreisvergleich;

    @FindBy(css = "a[href='https://mietwagen.check24.de/beispielrechnung']")
    @CacheLookup
    private WebElement check24Mietwagenvergleich;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=points']")
    @CacheLookup
    private WebElement check24Points;

    @FindBy(css = "a[title='Companies']")
    @CacheLookup
    private WebElement companies;

    @FindBy(css = "a[title='Computer & Konsole']")
    @CacheLookup
    private WebElement computerKonsole;

    @FindBy(id = "c24-search-navi-sho")
    @CacheLookup
    private WebElement computerKonsoleNotebooksTabletsHaushalt;

    @FindBy(css = "a[title='Contact']")
    @CacheLookup
    private WebElement contact;

    @FindBy(css = "a[href='/unternehmen/kontakt/?sec=c24']")
    @CacheLookup
    private WebElement contactPage;

    @FindBy(css = "a[href='https://www.check24.de/unternehmen/cookiehinweis/']")
    @CacheLookup
    private WebElement cookies;

    @FindBy(css = "#c24-meinkonto div.c24-customer-layer.c24-header-hover-layer ul:nth-of-type(2) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement creditCenterYourCurrentCredit;

    @FindBy(css = "a.c24-comparison-box.c24-finrkr")
    @CacheLookup
    private WebElement creditComparisonSavingsUpTo;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=sidenavi']")
    @CacheLookup
    private WebElement datentarife1;

    @FindBy(css = "a[href='/handytarife/vergleich/?with_data_tariffs=all&minutes_included=all&sms_included=all&rnp=egal&data_included=8000&tid2=topnavi']")
    @CacheLookup
    private WebElement datentarife2;

    @FindBy(name = "data_included")
    @CacheLookup
    private WebElement datenvolumen1;

    @FindBy(name = "data_included")
    @CacheLookup
    private WebElement datenvolumen2;

    @FindBy(css = "a.c24-circle-flag")
    @CacheLookup
    private WebElement dealDesTages4990;

    @FindBy(css = "a[title='Depot']")
    @CacheLookup
    private WebElement depot;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) a.c24-vw-trigger")
    @CacheLookup
    private WebElement detailedConditions1;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(2) div.c24-bubble-container.c24-vw-bubble.c24-contrast-saving-hover div:nth-of-type(2) div:nth-of-type(2) a.c24-vw-trigger")
    @CacheLookup
    private WebElement detailedConditions2;

    @FindBy(css = "a[title='Detailed conditions of participation']")
    @CacheLookup
    private WebElement detailedConditions3;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) h4.c24-slider-headline span:nth-of-type(2) span:nth-of-type(2) span:nth-of-type(2) span:nth-of-type(2) a.c24-vw-trigger")
    @CacheLookup
    private WebElement detaillierteTeilnahmebedingungen1;

    @FindBy(css = "#c24-kfz-teaser div:nth-of-type(1) h3.c24-slider-headline span.c24-sp-teaser-hover.c24-sp-contrast-hover span:nth-of-type(2) span:nth-of-type(2) a.c24-vw-trigger")
    @CacheLookup
    private WebElement detaillierteTeilnahmebedingungen2;

    @FindBy(css = "#c24-kfz-teaser div:nth-of-type(1) div:nth-of-type(2) div.c24-bubble-container.c24-vw-bubble div:nth-of-type(2) div:nth-of-type(2) a.c24-vw-trigger")
    @CacheLookup
    private WebElement detaillierteTeilnahmebedingungen3;

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

    @FindBy(css = "a.c24-award-box.c24-finrkr")
    @CacheLookup
    private WebElement dieMeistentestsiege;

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

    @FindBy(css = "a[title='Compare DSL & mobile products']")
    @CacheLookup
    private WebElement dslHandy;

    @FindBy(css = "a[title='DSL & mobile phone']")
    @CacheLookup
    private WebElement dslMobilePhone;

    @FindBy(css = "a[title='DSL im Vergleich']")
    @CacheLookup
    private WebElement dslVergleich;

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

    @FindBy(css = "a[title='Electricity gas']")
    @CacheLookup
    private WebElement electricityGas;

    @FindBy(css = "a.c24-comparison-box.c24-nrgstr")
    @CacheLookup
    private WebElement electricitySavingsUpTo500;

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

    @FindBy(css = "a[href='mailto:energiefunktioniertgarantie@check24.de']")
    @CacheLookup
    private WebElement energiefunktioniertgarantiecheck24De;

    @FindBy(css = "#c24-meinkonto div.c24-customer-layer.c24-header-hover-layer ul:nth-of-type(2) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement energyCentersUseAndSave;

    @FindBy(css = "a[title='Englisch Nachhilfe']")
    @CacheLookup
    private WebElement englischNachhilfe;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(3) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement ernhrungsberater1;

    @FindBy(css = "#c24-ask li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement ernhrungsberater2;

    @FindBy(css = "a.c24-ei-trigger")
    @CacheLookup
    private WebElement erstinformation;

    @FindBy(css = "a[href='https://versicherungen.check24.de/datenschutz-agb/files/Erstinformation_CHECK24%20Vergleichsportal_fuer%20Versicherungsprodukt_GmbH.pdf']")
    @CacheLookup
    private WebElement erstinformationAlsPdf;

    @FindBy(name = "OKZ")
    @CacheLookup
    private WebElement erstinformationCheck24IstImmerFr;

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

    @FindBy(id = "rentalcar_fuel_policy_fair")
    @CacheLookup
    private WebElement faireTankregelung;

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

    @FindBy(css = "a[href='https://autoteile.check24.de/filter']")
    @CacheLookup
    private WebElement filter;

    @FindBy(css = "a[title='Finanzierung für Kauf und Bau']")
    @CacheLookup
    private WebElement finanzierungFrKaufUndBau;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/smartwatches/fitbit-versa-pfirsich-aluminium-rosegold.html']")
    @CacheLookup
    private WebElement fitbitVersaPfirsichaluminiSmartwatch10;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement flge1;

    @FindBy(css = "#c24-flu li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement flge2;

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

    @FindBy(css = "a[title='flights']")
    @CacheLookup
    private WebElement flights;

    @FindBy(css = "a[href='//flug.check24.de/produkte']")
    @CacheLookup
    private WebElement flug;

    @FindBy(css = "#c24-flu li:nth-of-type(1) a.c24-subnav-sec-ele")
    @CacheLookup
    private WebElement flugvergleich1;

    @FindBy(css = "a[href='https://flug.check24.de']")
    @CacheLookup
    private WebElement flugvergleich2;

    @FindBy(css = "a[title='Flugverspätung - Ihre Rechte']")
    @CacheLookup
    private WebElement flugversptungIhreRechte;

    @FindBy(css = "a.all.c24-meinkonto-login-link")
    @CacheLookup
    private WebElement forRegistration;

    @FindBy(id = "c24-search-header")
    @CacheLookup
    private WebElement forTheBestBestComparisonExperience;

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

    @FindBy(id = "c24-travel-departure-date-element")
    @CacheLookup
    private WebElement frhesteHinreise;

    @FindBy(css = "a[href='https://urlaub.check24.de/suche/hotel?airport=BRE,CGN,CSO,DRS,DTM,DUS,ERF,FDH,FKB,FMM,FMO,FRA,GWT,HAJ,HAM,HHN,KSF,LBC,LEJ,MUC,NRN,NUE,PAD,RLG,SCN,STR,SXF,TXL&adult=2&departureDate=2018-10-03&returnDate=2018-11-28&travelDuration=5-8&hotelCategory=-&pageArea=package&areaId=552&recommendation=-&sorting=categoryDistribution&order=asc&offerSort=price&offerSortOrder=asc&areaSort=topregion&areaSortOrder=asc']")
    @CacheLookup
    private WebElement fuerteventuraSpanien;

    @FindBy(css = "a[href='/handyvertrag/samsung-galaxy-s9/?tid2=sidenavi']")
    @CacheLookup
    private WebElement galaxyS9MitVertrag1;

    @FindBy(css = "a[href='/handyvertrag/samsung-galaxy-s9/?tid2=topnavi']")
    @CacheLookup
    private WebElement galaxyS9MitVertrag2;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement ganzjahresreifen1;

    @FindBy(css = "#c24-aut li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement ganzjahresreifen2;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(4) div.c24-home-slide div.c24-teaser-slider-nrgstr.js-teaser-slider div:nth-of-type(1) div:nth-of-type(2) div.c24-hover-box div:nth-of-type(2) span:nth-of-type(2) a")
    @CacheLookup
    private WebElement garantiebedingungen1;

    @FindBy(css = "a[href='https://www.check24.de/strom-gas/garantiebedingungen/']")
    @CacheLookup
    private WebElement garantiebedingungen2;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(4) div.c24-home-slide div.c24-teaser-slider-nrgstr.js-teaser-slider div:nth-of-type(1) div:nth-of-type(5) div.c24-hover-box div:nth-of-type(2) a")
    @CacheLookup
    private WebElement garantiebedingungen3;

    @FindBy(css = "#tooltip02 div:nth-of-type(2) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement garantiebedingungen4;

    @FindBy(css = "a[href='https://www.check24.de/dsl/garantiebedingungen/']")
    @CacheLookup
    private WebElement garantiebedingungen5;

    @FindBy(css = "a[href='https://www.check24.de/dsl-handy/funktioniertgarantiebedingungen/']")
    @CacheLookup
    private WebElement garantiebedingungen6;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(4) a")
    @CacheLookup
    private WebElement garantiertDiegnstigstenpreise;

    @FindBy(css = "a[title='Gartengeräte']")
    @CacheLookup
    private WebElement gartengerte;

    @FindBy(css = "a[title='Gasanbieter im Vergleich']")
    @CacheLookup
    private WebElement gasanbieter;

    @FindBy(css = "a[title='Gasanbieter wechseln']")
    @CacheLookup
    private WebElement gasanbieterWechseln;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement gasvergleich1;

    @FindBy(css = "#c24-nrg li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement gasvergleich2;

    @FindBy(css = "a[title='TÜV-geprüfter und kostenloser Gasvergleich']")
    @CacheLookup
    private WebElement gasvergleich3;

    @FindBy(css = "a[title='Gebäudeversicherung']")
    @CacheLookup
    private WebElement gebudeversicherung;

    @FindBy(id = "rentalcar_type_suv")
    @CacheLookup
    private WebElement gelndeSuv;

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

    @FindBy(css = "a[title='Girokonto Vergleich']")
    @CacheLookup
    private WebElement girokonto3;

    @FindBy(css = "a[title='Gitarrenlehrer']")
    @CacheLookup
    private WebElement gitarrenlehrer;

    @FindBy(css = "a[href='https://mietwagen.check24.de/mietwagen']")
    @CacheLookup
    private WebElement gnstigeMietwagenangeboteWeltweit;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement haftpflichtversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement haftpflichtversicherung2;

    @FindBy(css = "a[href='/haftpflichtversicherung/']")
    @CacheLookup
    private WebElement haftpflichtversicherung3;

    @FindBy(css = "a[title='Handy']")
    @CacheLookup
    private WebElement handy1;

    @FindBy(name = "hwprop_model")
    @CacheLookup
    private WebElement handy2;

    @FindBy(css = "#c24-mainnav-ele-mof div.c24-subnav.c24-subnav-mof div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement handyMitVertrag1;

    @FindBy(css = "a[href='/handyvertrag/?tid2=topnavi']")
    @CacheLookup
    private WebElement handyMitVertrag2;

    @FindBy(css = "#c24-mainnav-ele-mof div.c24-subnav.c24-subnav-mof div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(5)")
    @CacheLookup
    private WebElement handyOhneVertrag1;

    @FindBy(css = "#c24-tel li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement handyOhneVertrag2;

    @FindBy(css = "a[href='/handytarife/']")
    @CacheLookup
    private WebElement handyTarifvergleich;

    @FindBy(css = "a[title='Handy & Telefon']")
    @CacheLookup
    private WebElement handyTelefon;

    @FindBy(css = "a[href='https://www.check24.de/handyvertrag/vergleich/?tid2=sidenavi']")
    @CacheLookup
    private WebElement handybersicht1;

    @FindBy(css = "a[href='/handyvertrag/vergleich/?tid2=topnavi']")
    @CacheLookup
    private WebElement handybersicht2;

    @FindBy(css = "a[href='/handyvertrag/']")
    @CacheLookup
    private WebElement handysMitVertrag;

    @FindBy(css = "a[href='/handytarife/?tid2=sidenavi']")
    @CacheLookup
    private WebElement handytarifeNurSimkarte1;

    @FindBy(css = "a[href='/handytarife/?tid2=topnavi']")
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

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(1) div.c24-hover-box div:nth-of-type(2) div.clearfix a:nth-of-type(1)")
    @CacheLookup
    private WebElement hausrat;

    @FindBy(css = "a[href='/hausratversicherung/']")
    @CacheLookup
    private WebElement hausratversicherung;

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

    @FindBy(css = "a[href='https://www.check24.de/kredit/gsl/tuev/']")
    @CacheLookup
    private WebElement hier1;

    @FindBy(css = "a[href='https://www.check24.de/strom-gas/zertifikate-auszeichnungen/']")
    @CacheLookup
    private WebElement hier2;

    @FindBy(css = "a[href='https://mietwagen.check24.de/auszeichnungen']")
    @CacheLookup
    private WebElement hier3;

    @FindBy(css = "a[href='https://www.check24.de/dsl/testsieger/']")
    @CacheLookup
    private WebElement hier4;

    @FindBy(css = "a[title='CHECK24 Auszeichnungen']")
    @CacheLookup
    private WebElement hierErfahrenSieMehr1;

    @FindBy(css = "a[href=' https://urlaub.check24.de/special/auszeichnungen']")
    @CacheLookup
    private WebElement hierErfahrenSieMehr2;

    @FindBy(css = "a[href='https://urlaub.check24.de/nirgendwoguenstiger_popup']")
    @CacheLookup
    private WebElement hierErfahrenSieMehr3;

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

    @FindBy(css = "a[title='hotel']")
    @CacheLookup
    private WebElement hotel;

    @FindBy(css = "#c24-mainnav-ele-hot a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement hotel1;

    @FindBy(css = "#c24-mainnav-ele-hot div.c24-subnav.c24-subnav-hot div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement hotel2;

    @FindBy(css = "#c24-hot li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement hotel3;

    @FindBy(css = "a[href='//hotel.check24.de/produkte']")
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

    @FindBy(css = "a[title='Hotelvergleich']")
    @CacheLookup
    private WebElement hotelvergleich;

    @FindBy(css = "a[title='Hotelvergleiche']")
    @CacheLookup
    private WebElement hotelvergleiche;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/tablet-pcs/huawei-mediapad-m2-100.html']")
    @CacheLookup
    private WebElement huaweiMediapadM2100Tablet;

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

    @FindBy(css = "a[href='https://urlaub.check24.de/suche/hotel?airport=BRE,CGN,CSO,DRS,DTM,DUS,ERF,FDH,FKB,FMM,FMO,FRA,GWT,HAJ,HAM,HHN,KSF,LBC,LEJ,MUC,NRN,NUE,PAD,RLG,SCN,STR,SXF,TXL&adult=2&departureDate=2018-10-03&returnDate=2018-11-28&travelDuration=5-8&hotelCategory=-&pageArea=package&areaId=673&recommendation=-&sorting=categoryDistribution&order=asc&offerSort=price&offerSortOrder=asc&areaSort=topregion&areaSortOrder=asc']")
    @CacheLookup
    private WebElement hurghadaSafagaGypten;

    @FindBy(css = "a[title='Immobilienfinanzierung']")
    @CacheLookup
    private WebElement immobilienfinanzierung;

    @FindBy(name = "minutes_included")
    @CacheLookup
    private WebElement inklusivminuten1;

    @FindBy(name = "minutes_included")
    @CacheLookup
    private WebElement inklusivminuten2;

    @FindBy(css = "a.c24-travel-travelfinder-btn.c24-travel-js-travelfinder-spinner.c24-travel-primary-cta-button")
    @CacheLookup
    private WebElement inspirationStarten;

    @FindBy(css = "a[title='Insurance']")
    @CacheLookup
    private WebElement insurance;

    @FindBy(css = "#c24-meinkonto div.c24-customer-layer.c24-header-hover-layer ul:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement insuranceCenterYourDigitalInsurance;

    @FindBy(css = "a[title='Versicherungen']")
    @CacheLookup
    private WebElement insuranceMotorVehicleLegalProtection;

    @FindBy(css = "a[title='Internet']")
    @CacheLookup
    private WebElement internet;

    @FindBy(css = "a[title='Internet & DSL']")
    @CacheLookup
    private WebElement internetDsl;

    @FindBy(css = "a[href='/dsl-handy/internetanbieter/']")
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

    @FindBy(name = "activeForm")
    @CacheLookup
    private List<WebElement> ja1;

    @FindBy(name = "young_tariff")
    @CacheLookup
    private List<WebElement> ja2;

    @FindBy(name = "activeForm")
    @CacheLookup
    private List<WebElement> ja3;

    @FindBy(name = "young_tariff")
    @CacheLookup
    private List<WebElement> ja4;

    private final String jaValue = "all";
//
//    private final String jaValue = "device";
//
//    private final String jaValue = "all";
//
//    private final String jaValue = "device";

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(4) a")
    @CacheLookup
    private WebElement jetztAnmelden;

//    @FindBy(css = "#c24-cl-form-user-register div.c24-cl-content-top div:nth-of-type(3) div:nth-of-type(4) a.c24-customer-login-opener")
//    @CacheLookup
//    private WebElement jetztAnmelden;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(3) a")
    @CacheLookup
    private WebElement jetztAutoteileReifenzumBesten;

    @FindBy(css = "a.btn-default.app-promo-download.app-promo-download-lnk")
    @CacheLookup
    private WebElement jetztHerunterladen;

    @FindBy(css = "#c24-cl-form-user-register div.c24-cl-content-top input.c24-button[type='submit']")
    @CacheLookup
    private WebElement jetztRegistrieren;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(5) div.c24-home-slide div.mf-content landingpage-filter:nth-of-type(1) form div.button-row button.c24-btn-primary.c24-btn-block")
    @CacheLookup
    private WebElement jetztVergleichen1;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(5) div.c24-home-slide div.mf-content landingpage-filter:nth-of-type(2) form div.button-row button.c24-btn-primary.c24-btn-block")
    @CacheLookup
    private WebElement jetztVergleichen2;

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

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(4) div.c24-hover-box div:nth-of-type(2) div.clearfix a.c24-button.c24-button-vw")
    @CacheLookup
    private WebElement kfzversicherung;

    @FindBy(css = "#c24-aut li:nth-of-type(3) a.c24-subnav-sec-ele")
    @CacheLookup
    private WebElement kfzversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kfzversicherung1MonatGratis;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(1) li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kfzversicherung2;

    @FindBy(css = "a[title='Kfz-Versicherungsvergleich']")
    @CacheLookup
    private WebElement kfzversicherungsvergleich;

    @FindBy(css = "a[title='Kühlschränke']")
    @CacheLookup
    private WebElement khlschrank;

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

    @FindBy(id = "rentalcar_category_economy")
    @CacheLookup
    private WebElement kleinwagen;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement kogas1;

    @FindBy(css = "#c24-nrg li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement kogas2;

    @FindBy(id = "rentalcar_type_wagon")
    @CacheLookup
    private WebElement kombi;

    @FindBy(id = "rentalcar_category_compact")
    @CacheLookup
    private WebElement kompaktklasse;

    @FindBy(css = "a[title='Konto & Kredit']")
    @CacheLookup
    private WebElement kontoKredit1;

    @FindBy(css = "a[title='Compare Account & Credit Products']")
    @CacheLookup
    private WebElement kontoKredit2;

    @FindBy(css = "a[href='https://www.check24.de/kontomanager/?ref=c24burger']")
    @CacheLookup
    private WebElement kontomanager;

    @FindBy(css = "a[href='https://www.check24.de/kontomanager/?ref=c24navi']")
    @CacheLookup
    private WebElement kontomanagerFinanzenVerwaltenUndOptimieren;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement kostrom1;

    @FindBy(css = "#c24-nrg li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement kostrom2;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(1) div.c24-hover-box div:nth-of-type(2) div.clearfix a:nth-of-type(2)")
    @CacheLookup
    private WebElement krankenhauszusatz;

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

    @FindBy(css = "#c24-fin li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kredit;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(3) a.c24-subnav-ele")
    @CacheLookup
    private WebElement kreditcenter;

    @FindBy(css = "#c24-fin li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kreditcenterKreditantrgeAbschlsseAuf;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement kreditkarte1;

    @FindBy(css = "#c24-fin li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement kreditkarte2;

    @FindBy(css = "a[title='Top Kreditkarten im Vergleich']")
    @CacheLookup
    private WebElement kreditkarte3;

    @FindBy(css = "a[title='Kreditrechner']")
    @CacheLookup
    private WebElement kreditrechner;

    @FindBy(css = "a[title='Kreditvergleich']")
    @CacheLookup
    private WebElement kreditvergleich1;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(3) div.c24-row div:nth-of-type(1) p a:nth-of-type(1)")
    @CacheLookup
    private WebElement kreditvergleich2;

    @FindBy(id = "c24-button-rkr")
    @CacheLookup
    private WebElement kreditvergleichStarten;

    @FindBy(css = "a[href='https://urlaub.check24.de/suche/hotel?airport=BRE,CGN,CSO,DRS,DTM,DUS,ERF,FDH,FKB,FMM,FMO,FRA,GWT,HAJ,HAM,HHN,KSF,LBC,LEJ,MUC,NRN,NUE,PAD,RLG,SCN,STR,SXF,TXL&adult=2&departureDate=2018-10-03&returnDate=2018-11-28&travelDuration=5-8&hotelCategory=-&pageArea=package&areaId=603&recommendation=-&sorting=categoryDistribution&order=asc&offerSort=price&offerSortOrder=asc&areaSort=topregion&areaSortOrder=asc']")
    @CacheLookup
    private WebElement kretaGriechenland;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/kaffeekapselmaschinen/krups-xn900t-nespresso-vertuoplus-titan.html']")
    @CacheLookup
    private WebElement krupsXn900tNespressoVertu;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement lastMinute1;

    @FindBy(css = "#c24-pau li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement lastMinute2;

    @FindBy(css = "a[href='/unternehmen/ueber-uns/']")
    @CacheLookup
    private WebElement learnMore;

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

    @FindBy(id = "c24-meinkonto-anmelden")
    @CacheLookup
    private WebElement logIn1;

    @FindBy(css = "a.c24-button.c24-customer-login-opener")
    @CacheLookup
    private WebElement logIn2;

    @FindBy(css = "a[title='LTE']")
    @CacheLookup
    private WebElement lte;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement luftfilter1;

    @FindBy(css = "#c24-aut li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement luftfilter2;

    @FindBy(css = "a[href='https://urlaub.check24.de/suche/hotel?airport=BRE,CGN,CSO,DRS,DTM,DUS,ERF,FDH,FKB,FMM,FMO,FRA,GWT,HAJ,HAM,HHN,KSF,LBC,LEJ,MUC,NRN,NUE,PAD,RLG,SCN,STR,SXF,TXL&adult=2&departureDate=2018-10-03&returnDate=2018-11-28&travelDuration=5-8&hotelCategory=-&pageArea=package&areaId=546&recommendation=-&sorting=percentagefit&order=asc&offerSort=price&offerSortOrder=asc&areaSort=topregion&areaSortOrder=asc']")
    @CacheLookup
    private WebElement mallorcaSpanien;

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

    @FindBy(css = "a[href='//kredit.check24.de/popup/garantiebedingungen/']")
    @CacheLookup
    private WebElement mehrAnzeigen;

    @FindBy(css = "a[href='/vergleichen/auszeichnungen/?fp=ask']")
    @CacheLookup
    private WebElement mehrErfahren;

    @FindBy(css = "#c24-mainnav-ele-mwa a.c24-mainnav-ele-title")
    @CacheLookup
    private WebElement mietwagen1;

    @FindBy(css = "#c24-mainnav-ele-mwa div.c24-subnav.c24-subnav-mwa div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement mietwagen2;

    @FindBy(css = "#c24-mwa li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagen3;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement mietwagen4;

    @FindBy(css = "a[href='//mietwagen.check24.de/produkte']")
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

    @FindBy(css = "a[title='Mietwagenvergleich']")
    @CacheLookup
    private WebElement mietwagenVergleich;

    @FindBy(id = "rentalcar_category_standard")
    @CacheLookup
    private WebElement mittelklasse;

    @FindBy(css = "a.c24-comparison-box.c24-telmof")
    @CacheLookup
    private WebElement mobilePhoneWithContractSavings;

    @FindBy(css = "a[title='Modernisierung']")
    @CacheLookup
    private WebElement modernisierung;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/bestseller.html']")
    @CacheLookup
    private WebElement more1;

    @FindBy(css = "#c24-lastseen div:nth-of-type(1) h5.c24-flex-title a")
    @CacheLookup
    private WebElement more2;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement motorradversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement motorradversicherung2;

    @FindBy(css = "a[title='Musikunterricht']")
    @CacheLookup
    private WebElement musikunterricht;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=overview']")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=activitylist']")
    @CacheLookup
    private WebElement myActivities;

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

    @FindBy(name = "activeForm")
    @CacheLookup
    private List<WebElement> nein1;

    @FindBy(name = "young_tariff")
    @CacheLookup
    private List<WebElement> nein2;

    @FindBy(name = "activeForm")
    @CacheLookup
    private List<WebElement> nein3;

    @FindBy(name = "young_tariff")
    @CacheLookup
    private List<WebElement> nein4;

    private final String neinValue = "no";
//
//    private final String neinValue = "sim";
//
//    private final String neinValue = "sim";
//
//    private final String neinValue = "no";

    @FindBy(css = "a[title='news']")
    @CacheLookup
    private WebElement news;

    @FindBy(css = "a.bx-next")
    @CacheLookup
    private WebElement next;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/konsolen/nintendo-classic-mini-snes.html']")
    @CacheLookup
    private WebElement nintendoClassicMiniSnesKonsole;

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

    @FindBy(id = "rentalcar_availability_airport")
    @CacheLookup
    private WebElement nurStationen;

    @FindBy(id = "rentalcar_category_premium")
    @CacheLookup
    private WebElement oberklasse;

    @FindBy(id = "rentalcar_insurance_without_insurance_excess")
    @CacheLookup
    private WebElement ohneSelbstbeteiligung;

    @FindBy(css = "a.c24-cookie-button")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "a.c24-comparison-box.c24-rsnpau")
    @CacheLookup
    private WebElement packageHolidaysSaveUpTo;

    private final String pageLoadedText = "Daher haben alle CHECK24-Kunden nach Ihrem Abschluss die Möglichkeit, uns über das unabhängige Portal eKomi zu bewerten";

    private final String pageUrl = "/";

    @FindBy(css = "a[title='partner']")
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

    @FindBy(css = "a[href='https://preisvergleich.check24.de/babyphones/philips-avent-scd585-26.html']")
    @CacheLookup
    private WebElement philipsAventScd58526Babyphones8;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/elektrische-zahnbuersten/philips-sonicare-hx9362-67-diamondclean-pink.html']")
    @CacheLookup
    private WebElement philipsSonicareHx936267;

    @FindBy(name = "phone")
    @CacheLookup
    private WebElement pleaseEnterAValidMobileNumber;

    @FindBy(name = "c24api_zipcode")
    @CacheLookup
    private WebElement postleitzahl;

    @FindBy(id = "rentalcar_insurance_rating_premium")
    @CacheLookup
    private WebElement premiumSchutz;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?select_contract=-1&data_included=0&minutes_included=all&tid2=sidenavi']")
    @CacheLookup
    private WebElement prepaidUnd1monatstarife1;

    @FindBy(css = "a[href='/handytarife/vergleich/?select_contract=-1&data_included=0&minutes_included=all&tid2=topnavi']")
    @CacheLookup
    private WebElement prepaidUnd1monatstarife2;

    @FindBy(css = "a[title='Press']")
    @CacheLookup
    private WebElement press;

    @FindBy(css = "a.bx-prev")
    @CacheLookup
    private WebElement prev;

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

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(2) div.c24-hover-box div:nth-of-type(2) div.clearfix a.c24-button.c24-button-vw")
    @CacheLookup
    private WebElement privathaftpflicht;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement privathaftpflicht12MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement privathaftpflicht12MonateGratis2;

    @FindBy(css = "a[title='professionals']")
    @CacheLookup
    private WebElement professionals;

    @FindBy(id = "c24-button-ask")
    @CacheLookup
    private WebElement profiFinden;

    @FindBy(css = "a[title='Profis für Ihr Projekt']")
    @CacheLookup
    private WebElement profisFrIhrProjekt;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/handwerkzeug/proxxon-drehmomentschluessel-micro-click-30-s.html']")
    @CacheLookup
    private WebElement proxxonDrehmomentschlsselMHandwerkzeug6;

    @FindBy(css = "a[title='Rasierer']")
    @CacheLookup
    private WebElement rasierer;

    @FindBy(css = "#c24-mainnav-ele-fin div.c24-subnav.c24-subnav-fin div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement ratenkredit1;

    @FindBy(css = "#c24-fin li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement ratenkredit2;

    @FindBy(css = "a[title='Ratenkredite vergleichen']")
    @CacheLookup
    private WebElement ratenkredit3;

    @FindBy(css = "a[title='Ratgeber']")
    @CacheLookup
    private WebElement ratgeber;

    @FindBy(id = "dest_datetime_date")
    @CacheLookup
    private WebElement rckgabedatum;

    @FindBy(id = "dest_city")
    @CacheLookup
    private WebElement rckgabeort;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(3) div.c24-hover-box div:nth-of-type(2) div.clearfix a:nth-of-type(1)")
    @CacheLookup
    private WebElement rechtsschutz;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(2) div.c24-row div:nth-of-type(1) p a:nth-of-type(4)")
    @CacheLookup
    private WebElement rechtsschutzversicherung;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement rechtsschutzversicherung3MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement rechtsschutzversicherung3MonateGratis2;

    @FindBy(css = "a[title='Reifen']")
    @CacheLookup
    private WebElement reifen;

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

    @FindBy(id = "c24-travel-travel-duration-element")
    @CacheLookup
    private WebElement reisedauer2;

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> reisedauerEingebenTage1;

    @FindBy(id = "c24-travel-custom-duration")
    @CacheLookup
    private WebElement reisedauerEingebenTage2;

    private final String reisedauerEingebenTageValue = "custom";

    @FindBy(css = "a[title='Compare travel products']")
    @CacheLookup
    private WebElement reisen;

    @FindBy(id = "c24-travel-traveller-roomcount-detail-select")
    @CacheLookup
    private WebElement reisende;

    @FindBy(css = "#c24-pau li:nth-of-type(1) a.c24-subnav-sec-ele")
    @CacheLookup
    private WebElement reisevergleich1;

    @FindBy(css = "a[href='https://urlaub.check24.de']")
    @CacheLookup
    private WebElement reisevergleich2;

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

    @FindBy(id = "c24-travel-destination-element")
    @CacheLookup
    private WebElement reisezielOderHotel;

    @FindBy(css = "a[title='rental car']")
    @CacheLookup
    private WebElement rentalCar;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(5)")
    @CacheLookup
    private WebElement rentenversicherung1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement rentenversicherung2;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(3) div.c24-hover-box div:nth-of-type(2) div.clearfix a:nth-of-type(2)")
    @CacheLookup
    private WebElement risikoleben;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(2) div.c24-row div:nth-of-type(1) p a:nth-of-type(6)")
    @CacheLookup
    private WebElement risikolebensversicherung;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement risikolebensversicherung3MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement risikolebensversicherung3MonateGratis2;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/wasserkocher/russell-hobbs-20460-56-buckingham.html']")
    @CacheLookup
    private WebElement russellHobbs2046056BuckinWasserkocher;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/smartphones/samsung-galaxy-a6-2018-dual-sim-lavender1.html']")
    @CacheLookup
    private WebElement samsungGalaxyA62018Dua;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/ultra-hd-fernseher/samsung-ue40nu7199.html']")
    @CacheLookup
    private WebElement samsungUe40nu7199Ultrahdfernseher11Angebote;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(11) div.c24-home-slide div.c24-aue-slidercontainer div:nth-of-type(1) ul.c24-aue-slider-list li:nth-of-type(1) a.c24-button")
    @CacheLookup
    private WebElement scheibenwischer;

//    @FindBy(css = "a[title='Scheibenwischer']")
//    @CacheLookup
//    private WebElement scheibenwischer;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement schutzbriefautomobilclub1;

    @FindBy(css = "#c24-ver li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(3) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement schutzbriefautomobilclub2;

    @FindBy(css = "#c24-aut li:nth-of-type(3) ul:nth-of-type(1) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement schutzbriefautomobilclub3;

    @FindBy(id = "btn-promo-sms")
    @CacheLookup
    private WebElement sendLinkToMyMobile;

    @FindBy(id = "c24-cl-pw-forget-btn")
    @CacheLookup
    private WebElement senden;

    @FindBy(css = "a.c24-mainnav-sec-ele.c24-header-hover.last")
    @CacheLookup
    private WebElement shopping1;

    @FindBy(css = "a[title='Compare shopping products']")
    @CacheLookup
    private WebElement shopping2;

    @FindBy(css = "a[href='//preisvergleich.check24.de']")
    @CacheLookup
    private WebElement shopping3;

    @FindBy(css = "a[href='https://urlaub.check24.de/suche/hotel?airport=BRE,CGN,CSO,DRS,DTM,DUS,ERF,FDH,FKB,FMM,FMO,FRA,GWT,HAJ,HAM,HHN,KSF,LBC,LEJ,MUC,NRN,NUE,PAD,RLG,SCN,STR,SXF,TXL&adult=2&departureDate=2018-10-03&returnDate=2018-11-28&travelDuration=5-8&hotelCategory=-&pageArea=package&areaId=586&recommendation=-&sorting=percentagefit&order=asc&offerSort=price&offerSortOrder=asc&areaSort=topregion&areaSortOrder=asc']")
    @CacheLookup
    private WebElement sideAlanyaTrkei;

    @FindBy(css = "#c24-ask li:nth-of-type(5) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement sieSindSelbstProfiUndAuf;

    @FindBy(css = "#c24-customer-salutation a.c24-meinkonto-reflink")
    @CacheLookup
    private WebElement signIn;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(css = "a[href='//preisvergleich.check24.de/smartphones/']")
    @CacheLookup
    private WebElement smartphone;

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

    @FindBy(css = "a[href='https://preisvergleich.check24.de/kompaktkameras/sony-cyber-shot-dsc-rx100-vi.html']")
    @CacheLookup
    private WebElement sonyCybershotDscrx100ViKompaktkamera;

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

    @FindBy(id = "c24-travel-return-date-element")
    @CacheLookup
    private WebElement sptesteRckreise;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/register.html']")
    @CacheLookup
    private WebElement startHere1;

    @FindBy(css = "a.c24-meinkonto-reflink.c24-customer-register-opener")
    @CacheLookup
    private WebElement startHere2;

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

    @FindBy(css = "a[title='Compare electricity & gas products']")
    @CacheLookup
    private WebElement stromGas;

    @FindBy(css = "a[title='Stromanbieter im Vergleich']")
    @CacheLookup
    private WebElement stromanbieter;

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

    @FindBy(css = "a[title='TÜV-geprüfter und kostenloser Stromvergleich']")
    @CacheLookup
    private WebElement stromvergleich3;

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

    @FindBy(css = "a[title=' Tagesgeld Vergleich']")
    @CacheLookup
    private WebElement tagesgeld3;

    @FindBy(css = "a[href='https://www.check24.de/handytarife/vergleich/?young_tariff=all&tid2=sidenavi']")
    @CacheLookup
    private WebElement tarifeFrJungeLeute1;

    @FindBy(css = "a[href='/handytarife/vergleich/?young_tariff=all&tid2=topnavi']")
    @CacheLookup
    private WebElement tarifeFrJungeLeute2;

    @FindBy(id = "c24-button-kfz")
    @CacheLookup
    private WebElement tarifeVergleichen1;

    @FindBy(id = "c24-button-dsl")
    @CacheLookup
    private WebElement tarifeVergleichen2;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/dampfbuegeleisen/tefal-fv4944-ultragliss-anti-calc.html']")
    @CacheLookup
    private WebElement tefalFv4944UltraglissAnti;

    @FindBy(css = "a.c24-travel-js-conditions_link.c24-travel-tooltip-link-details")
    @CacheLookup
    private WebElement teilnahmebedingungen;

    @FindBy(css = "a[title='Terms and Conditions Privacy policy Imprint']")
    @CacheLookup
    private WebElement termsAndConditionsPrivacyPolicy;

    @FindBy(css = "#c24-slider div.bx-wrapper div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(8) a.bx-pager-link")
    @CacheLookup
    private WebElement th8;

    @FindBy(css = "a[title='Tilgungsrechner']")
    @CacheLookup
    private WebElement tilgungsrechner;

    @FindBy(css = "a.c24-button.c24-button-vw.c24-button-vw-main")
    @CacheLookup
    private WebElement toTheJubileeDeals;

    @FindBy(css = "a[title='Top 10 Hotels Ägypten']")
    @CacheLookup
    private WebElement top10HotelsGypten;

    @FindBy(css = "a[title='Top 10 Hotels Kanaren']")
    @CacheLookup
    private WebElement top10HotelsKanaren;

    @FindBy(css = "a[title='Top 10 Hotels Mallorca']")
    @CacheLookup
    private WebElement top10HotelsMallorca;

    @FindBy(css = "a[title='travel']")
    @CacheLookup
    private WebElement travel;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/convertibles/trekstor-primebook-c13-wifi.html']")
    @CacheLookup
    private WebElement trekstorPrimebookC13WifiConvertible;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(2) div.c24-home-slide div div:nth-of-type(1) div:nth-of-type(4) div.c24-hover-box div:nth-of-type(2) div.c24-siegel-wrapper a")
    @CacheLookup
    private WebElement tuevsuedDepszert1;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(4) div.c24-home-slide div.c24-teaser-slider-nrgstr.js-teaser-slider div:nth-of-type(1) div:nth-of-type(3) div.c24-hover-box div:nth-of-type(2) div.c24-siegel-wrapper a")
    @CacheLookup
    private WebElement tuevsuedDepszert2;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(8) div.c24-home-slide div.c24-mietwagen-container div:nth-of-type(1) div:nth-of-type(4) div.c24-hover-box div:nth-of-type(2) div.c24-siegel-wrapper a")
    @CacheLookup
    private WebElement tuevsuedDepszert3;

    @FindBy(css = "#c24-dsl-teaser div:nth-of-type(1) div:nth-of-type(3) div.c24-hover-box div:nth-of-type(2) div.c24-siegel-wrapper a")
    @CacheLookup
    private WebElement tuevsuedDepszert4;

    @FindBy(id = "dep_datetime_time")
    @CacheLookup
    private WebElement uhrzeit1;

    @FindBy(id = "dest_datetime_time")
    @CacheLookup
    private WebElement uhrzeit2;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/bluetooth-lautsprecher/ultimate-ears-ue-megaboom-bluetooth-lautsprecher-schwarz.html']")
    @CacheLookup
    private WebElement ultimateEarsUeMegaboomBlu;

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

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(1) div.c24-hover-box div:nth-of-type(2) div.clearfix a:nth-of-type(3)")
    @CacheLookup
    private WebElement unfall;

    @FindBy(css = "#c24-container-3 div.c24-row.clearfix div.c24-grid-flex-content.c24-section-news-container.clearfix div.c24-tab-group.c24-tab-group-js.c24-tab-group-flex div:nth-of-type(2) div:nth-of-type(2) div.c24-row div:nth-of-type(1) p a:nth-of-type(5)")
    @CacheLookup
    private WebElement unfallversicherung;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(3)")
    @CacheLookup
    private WebElement unfallversicherung6MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(3) ul.c24-subsubnav-sec.clearfix li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement unfallversicherung6MonateGratis2;

    @FindBy(css = "#c24-mainnav-ele-rsn div.c24-subnav.c24-subnav-rsn div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(6)")
    @CacheLookup
    private WebElement urlaubsfinder1;

    @FindBy(css = "#c24-pau li:nth-of-type(2) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement urlaubsfinder2;

    @FindBy(css = "a.c24-travel-travelfinder-navi-link")
    @CacheLookup
    private WebElement urlaubsfinder3;

    @FindBy(css = "a.c24-travel-travel-package-navi-link.c24-travel-active")
    @CacheLookup
    private WebElement urlaubsreisen;

    @FindBy(id = "rentalcar_type_van")
    @CacheLookup
    private WebElement van;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(10) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement vaudeNewWashOffTuvalu;

    @FindBy(css = "a[href='https://preisvergleich.check24.de/puppenhaeuser/vdp-riesengrosses-puppenhaus.html']")
    @CacheLookup
    private WebElement vdpRiesengroesPuppenhausPuppenhuser;

    @FindBy(css = "#c24-mainnav-ele-ask div.c24-subnav.c24-subnav-ask div.c24-subnav-wrapper div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement veranstaltungenEvents1;

    @FindBy(css = "#c24-ask li:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement veranstaltungenEvents2;

    @FindBy(css = "input.c24-input-evo.c24-stromcon-input.c24-ls-nrgstr-c24api_totalconsumption")
    @CacheLookup
    private WebElement verbrauch;

    @FindBy(id = "c24-button-str")
    @CacheLookup
    private WebElement vergleichen1;

    @FindBy(id = "c24-button-mwa")
    @CacheLookup
    private WebElement vergleichen2;

    @FindBy(css = "a[title='Versicherung Jubiläums Deals']")
    @CacheLookup
    private WebElement versicherungJubilumsDealsBisZu;

    @FindBy(css = "a[title='compare insurances']")
    @CacheLookup
    private WebElement versicherungen;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement versicherungjubilumsDealsBisZu121;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement versicherungjubilumsDealsBisZu122;

    @FindBy(css = "#c24-mainnav-ele-ver div.c24-subnav.c24-subnav-ver div.c24-subnav-wrapper div:nth-of-type(2) div:nth-of-type(2) a.c24-subnav-ele")
    @CacheLookup
    private WebElement versicherungscenter;

    @FindBy(css = "#c24-ver li:nth-of-type(6) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement versicherungscenterVersicherungenVerwaltenUndOptimieren;

    @FindBy(css = "a[title='Versicherungsvergleich']")
    @CacheLookup
    private WebElement versicherungsvergleich;

    @FindBy(name = "select_contract")
    @CacheLookup
    private WebElement vertragslaufzeit;

    @FindBy(css = "a[title='Vouchers']")
    @CacheLookup
    private WebElement vouchers;

    @FindBy(css = "a[href='https://kundenbereich.check24.de/user/account.html?o=cs_codes']")
    @CacheLookup
    private WebElement vouchersCredit;

    @FindBy(css = "#c24-mainnav-ele-sho div.c24-subnav.c24-subnav-sho div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement waschmaschinen1;

    @FindBy(css = "#c24-sho li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(2) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement waschmaschinen2;

    @FindBy(id = "c24-cl-user-btn")
    @CacheLookup
    private WebElement weiter;

    @FindBy(css = "a[href='https://www.check24.de/mobilfunk/auszeichnungen/']")
    @CacheLookup
    private WebElement weitereInformationenFindenSieHier;

    @FindBy(id = "c24-webask-service")
    @CacheLookup
    private WebElement welchenProfiSuchenSieZBDj;

    @FindBy(id = "c24-rkr-credit-amount")
    @CacheLookup
    private WebElement wieViel;

    @FindBy(css = "#c24-mainnav-ele-aut div.c24-subnav.c24-subnav-aut div.c24-subnav-wrapper div:nth-of-type(2) div.c24-navi-links a:nth-of-type(1)")
    @CacheLookup
    private WebElement winterreifen1;

    @FindBy(css = "#c24-aut li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(1) a.c24-subsubnav-sec-ele")
    @CacheLookup
    private WebElement winterreifen2;

    @FindBy(id = "rentalcar_snowtires")
    @CacheLookup
    private WebElement winterreifen3;

    @FindBy(css = "a[title='Wischblatt']")
    @CacheLookup
    private WebElement wischblatt;

    @FindBy(id = "c24-webask-plz")
    @CacheLookup
    private WebElement woSuchenSie;

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> woche1;

    private final String wocheValue1 = "1w";

    @FindBy(name = "durations")
    @CacheLookup
    private List<WebElement> wochen2;

    private final String wochenValue2 = "2w";

    @FindBy(name = "vz")
    @CacheLookup
    private WebElement wofr;

    @FindBy(css = "a[title='Wohngebäudeversicherung']")
    @CacheLookup
    private WebElement wohngebudeversicherung;

    @FindBy(css = "#c24-mainnav-ele-nrg div.c24-subnav.c24-subnav-nrg div.c24-subnav-wrapper div:nth-of-type(1) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement wrmepumpe1;

    @FindBy(css = "#c24-nrg li:nth-of-type(1) ul.c24-subsubnav-sec.clearfix li:nth-of-type(5) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement wrmepumpe2;

    @FindBy(css = "a[href='http://www.vermittlerregister.info']")
    @CacheLookup
    private WebElement wwwVermittlerregisterInfo;

    @FindBy(css = "#c24-slider-bx div:nth-of-type(1) div.c24-home-slide div div.c24-teaser-slider-content div:nth-of-type(1) div.c24-vw-wrapper.clearfix div:nth-of-type(3) div.c24-hover-box div:nth-of-type(2) div.clearfix a:nth-of-type(3)")
    @CacheLookup
    private WebElement zahnzusatz;

    @FindBy(css = "#c24-mainnav-ele-vor div.c24-subnav.c24-subnav-vor div.c24-subnav-wrapper div:nth-of-type(1) div.c24-navi-links a:nth-of-type(4)")
    @CacheLookup
    private WebElement zahnzusatzversicherung3MonateGratis1;

    @FindBy(css = "#c24-ver li:nth-of-type(4) ul.c24-subsubnav-sec.clearfix li:nth-of-type(4) a.c24-subsubnav-sec-ele.c24-subproduct")
    @CacheLookup
    private WebElement zahnzusatzversicherung3MonateGratis2;

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

    @FindBy(css = "a.c24-travel-tooltip-link-details.popup")
    @CacheLookup
    private WebElement zuDenDetailliertenEinlsebedingungen;

    @FindBy(css = "a.c24-shopping-slider-btn.c24-button")
    @CacheLookup
    private WebElement zuDenTopdeals;

    @FindBy(css = "a.c24-button-xxxl")
    @CacheLookup
    private WebElement zumAngebot;

    @FindBy(css = "#c24-cl-form-user-login div:nth-of-type(2) div.c24-cl-content-top div:nth-of-type(5) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurck1;

    @FindBy(css = "#c24-cl-form-user-pwforget div:nth-of-type(2) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurck2;

    @FindBy(css = "#c24-page-container-header div.c24-page header div:nth-of-type(2) div:nth-of-type(4) div.c24-cl-content-top div:nth-of-type(3) a.c24-cl-pw-back.c24-cl-back-link.c24-cl-back-event")
    @CacheLookup
    private WebElement zurckZurAnmeldung;

    @FindBy(id = "rentalcar_additional_drivers")
    @CacheLookup
    private WebElement zusatzfahrerInklusive;

    public FrontPage() {
    }

    public FrontPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public FrontPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public FrontPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Account Credit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAccountCreditLink() {
        accountCredit.click();
        return this;
    }

    /**
     * Click on Account Managers Manage And Optimize Your Finances In One Place Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAccountManagersManageAndOptimizeLink() {
        accountManagersManageAndOptimize.click();
        return this;
    }

    /**
     * Click on Affiliate Program Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAffiliateProgramLink() {
        affiliateProgram.click();
        return this;
    }

    /**
     * Click on 11.09.2018 Aktuelle Nachrichten Die Zukunftsaussichten Fr Ein Eigenes Lngterminal Verflssigtes Erdgas Knnte Ein Rohstoff Sein Der In Der Zukunft Mehr Und Mehr An Bedeutung Gewinnt. Deshalb Spricht Sich Inzwischen Sogar Die Bundesregierung Fr Den Ausbau Der Infrastruktur Zum Transport Des Gases In Deutschland Aus. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenDieLink11092018() {
        aktuelleNachrichtenDie11092018.click();
        return this;
    }

    /**
     * Click on 26.09.2018 Aktuelle Nachrichten Die Automarken Mit Den Fleiigsten Punktesammlern Fahrer Bestimmter Automarken Drcken Besonders Gern Aufs Gaspedal. Doch Vorsicht Punkte In Flensburg Knnen Einfluss Auf Die Hhe Der Kfzversicherungsprmie Haben. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenDieLink26092018() {
        aktuelleNachrichtenDie26092018.click();
        return this;
    }

    /**
     * Click on 25.09.2018 Aktuelle Nachrichten Dispo Mit Ratenkredit Ablsen Kann Bis Zu 700 Euro An Zinsen Sparen Viele Bankkunden Rgern Sich Ber Hohe Dispozinsen. Zurecht. Wir Zeigen Wieso Kunden Statt Des Dispokredits Einen Ratenkredit Nutzen Sollten. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenDispoLink25092018() {
        aktuelleNachrichtenDispo25092018.click();
        return this;
    }

    /**
     * Click on 26.09.2018 Aktuelle Nachrichten Ferienflieger Azur Air Deutschland Stellt Betrieb Ein Die Deutsche Azur Air Hat Am Mittwoch Verkndet Dass Sie Mit Sofortiger Wirkung Den Betrieb Einstellt. Betroffene Passagiere Werden Auf Andere Airlines Umgebucht. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenFerienflieger1Link26092018() {
        aktuelleNachrichtenFerienflieger126092018.click();
        return this;
    }

    /**
     * Click on 26.09.2018 Aktuelle Nachrichten Ferienflieger Azur Air Deutschland Stellt Betrieb Ein Die Deutsche Azur Air Hat Am Mittwoch Verkndet Dass Sie Mit Sofortiger Wirkung Den Betrieb Einstellt. Betroffene Passagiere Werden Auf Andere Airlines Umgebucht. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenFerienflieger2Link26092018() {
        aktuelleNachrichtenFerienflieger226092018.click();
        return this;
    }

    /**
     * Click on 24.09.2018 Aktuelle Nachrichten Geld Abheben Und Einzahlen Bei Aldi Rewe Edeka Und Co Bei Supermrkten Drogerien Baumrkten Und Sogar Tankstellen Lsst Sich Kostenlos Geld Abheben. Welche Geschfte Das Anbieten Und Welche Bedingungen Dabei Gelten. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenGeldLink24092018() {
        aktuelleNachrichtenGeld24092018.click();
        return this;
    }

    /**
     * Click on 14.09.2018 Aktuelle Nachrichten Gigabitanschlsse Fr 12 Millionen Menschen Bis Ende 2018 Vodafone Will Noch Diesen Monat Mit Dem Deutschlandweiten Ausbau Seines Kabelnetzes Auf Gigabitgeschwindigkeiten Beginnen. Die Ersten Gigabitstdte Sollen In Bayern Liegen. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenGigabitanschlsseLink14092018() {
        aktuelleNachrichtenGigabitanschlsse14092018.click();
        return this;
    }

    /**
     * Click on 07.08.2018 Aktuelle Nachrichten In Diesen Stdten Wohnen Die Meisten Onlineshopper Der Internethandel Boomt Weiter Doch In Welchen Deutschen Metropolen Sitzen Die Meisten Onlinekunden Und In Welchen Stdten Die Spendabelsten Eine Check24studie Gibt Antworten. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenInLink07082018() {
        aktuelleNachrichtenIn07082018.click();
        return this;
    }

    /**
     * Click on 26.09.2018 Aktuelle Nachrichten Mnchen Versptungen Durch Vollsperrung Von Terminal 2 Die Bundespolizei Hat Am Mittwochnachmittag Die Abfertigung Im Terminal 2 Sowie Des Dazugehrigen Satelliten Zeitweise Gesperrt. Es Kommt Zu Verzgerungen Im Flugverkehr. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenMnchen1Link26092018() {
        aktuelleNachrichtenMnchen126092018.click();
        return this;
    }

    /**
     * Click on 26.09.2018 Aktuelle Nachrichten Mnchen Versptungen Durch Vollsperrung Von Terminal 2 Die Bundespolizei Hat Am Mittwochnachmittag Die Abfertigung Im Terminal 2 Sowie Des Dazugehrigen Satelliten Zeitweise Gesperrt. Es Kommt Zu Verzgerungen Im Flugverkehr. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenMnchen2Link26092018() {
        aktuelleNachrichtenMnchen226092018.click();
        return this;
    }

    /**
     * Click on 21.09.2018 Aktuelle Nachrichten Power Fuels Synthetischer Treibstoff Aus Strom Mithilfe Neuer Technologien Soll Aus Berschssigem Windstrom Nun Power Fuels Hergestellt Werden Ein Synthetischer Kraftstoff Der Dabei Helfen Soll Den Energiebedarf Klimaneutral Decken Zu Lassen Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenPowerLink21092018() {
        aktuelleNachrichtenPower21092018.click();
        return this;
    }

    /**
     * Click on 13.09.2018 Aktuelle Nachrichten Telekommunikationsverbnde Formulieren Forderungskatalog Fnf Telekommunikationsverbnde Haben Gemeinsam Ihre Anforderungen An Politik Und Wirtschaft Fr Einen Erfolgreichen Gigabitausbau In Deutschland Formuliert. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenTelekommunikationsverbndeLink13092018() {
        aktuelleNachrichtenTelekommunikationsverbnde13092018.click();
        return this;
    }

    /**
     * Click on 16.08.2018 Aktuelle Nachrichten Zocken Auf Einem Neuen Level Das Sind Die Gamingtrends 2018 Die Zahl Der Gamer Nimmt Zu Sie Setzen Vor Allem Auf Konsolen Und Sind Kauffreudiger Der Gamingmarkt Erfhrt Laut Bitkom Einen Starken Wachstumstrend. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenZockenLink16082018() {
        aktuelleNachrichtenZocken16082018.click();
        return this;
    }

    /**
     * Click on 26.09.2018 Aktuelle Nachrichten Zufriedenheit Mit Gesetzlicher Krankenversicherung Erneut Gestiegen Die Continentalestudie 2018 Hat Ergeben Gesetzlich Versicherte Sind Mit Dem Deutschen Gesundheitssystem Zufriedener Als Je Zuvor. Dies Betrifft Sowohl Die Angebotenen Leistungen Als Auch Den Preis. Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAktuelleNachrichtenZufriedenheitLink26092018() {
        aktuelleNachrichtenZufriedenheit26092018.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAllInclusive1Link() {
        allInclusive1.click();
        return this;
    }

    /**
     * Click on All Inclusive Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAllInclusive2Link() {
        allInclusive2.click();
        return this;
    }

    /**
     * Click on All Spare Parts Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAllSparePartsLink() {
        allSpareParts.click();
        return this;
    }

    /**
     * Click on Alle Auszeichnungen Ansehen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAlleAuszeichnungenAnsehenLink() {
        alleAuszeichnungenAnsehen.click();
        return this;
    }

    /**
     * Click on Alle Bewertungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAlleBewertungenLink() {
        alleBewertungen.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAlleKategorien1Link() {
        alleKategorien1.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAlleKategorien2Link() {
        alleKategorien2.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAlleKategorien3Link() {
        alleKategorien3.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAlleKategorien4Link() {
        alleKategorien4.click();
        return this;
    }

    /**
     * Click on Alle Kategorien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAlleKategorienLink() {
        alleKategorien.click();
        return this;
    }

    /**
     * Click on Allgemein Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAllgemeinLink() {
        allgemein.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAllnetFlatTarife1Link() {
        allnetFlatTarife1.click();
        return this;
    }

    /**
     * Click on Allnet Flat Tarife Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAllnetFlatTarife2Link() {
        allnetFlatTarife2.click();
        return this;
    }

    /**
     * Click on Anbieter Mit Prmie Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAnbieterMitPrmieLink() {
        anbieterMitPrmie.click();
        return this;
    }

    /**
     * Click on Anmelden Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAnmelden1Button() {
        anmelden1.click();
        return this;
    }

    /**
     * Click on Anmelden Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAnmelden2Button() {
        anmelden2.click();
        return this;
    }

    /**
     * Click on Anmelden Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAnmeldenLink() {
        anmelden.click();
        return this;
    }

    /**
     * Click on Anschlussfinanzierung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAnschlussfinanzierungLink() {
        anschlussfinanzierung.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutokredit1Link() {
        autokredit1.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutokredit2Link() {
        autokredit2.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutokredit3Link() {
        autokredit3.click();
        return this;
    }

    /**
     * Click on Autokredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutokredit4Link() {
        autokredit4.click();
        return this;
    }

    /**
     * Click on Automobile Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutomobileLink() {
        automobile.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutoreifen1Link() {
        autoreifen1.click();
        return this;
    }

    /**
     * Click on Autoreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutoreifen2Link() {
        autoreifen2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutoteile1Link() {
        autoteile1.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutoteile2Link() {
        autoteile2.click();
        return this;
    }

    /**
     * Click on Autoteile Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutoteile3Link() {
        autoteile3.click();
        return this;
    }

    /**
     * Click on Autoversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickAutoversicherungLink() {
        autoversicherung.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBand1Link() {
        band1.click();
        return this;
    }

    /**
     * Click on Band Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBand2Link() {
        band2.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBaufinanzierung1Link() {
        baufinanzierung1.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBaufinanzierung2Link() {
        baufinanzierung2.click();
        return this;
    }

    /**
     * Click on Baufinanzierung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBaufinanzierung3Link() {
        baufinanzierung3.click();
        return this;
    }

    /**
     * Click on Baufinanzierungsrechner Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBaufinanzierungsrechnerLink() {
        baufinanzierungsrechner.click();
        return this;
    }

    /**
     * Click on Beauty Wellness Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBeautyWellnessLink() {
        beautyWellness.click();
        return this;
    }

    /**
     * Click on Beim Dsl Tarifvergleichexklusive Cashbackssichern Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBeimDslTarifvergleichexklusiveCashbackssichernLink() {
        beimDslTarifvergleichexklusiveCashbackssichern.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionangebote Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBer1MillionangeboteLink() {
        ber1Millionangebote.click();
        return this;
    }

    /**
     * Click on Ber 1 Millionhotels Weltweit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBer1MillionhotelsWeltweitLink() {
        ber1MillionhotelsWeltweit.click();
        return this;
    }

    /**
     * Click on Bernehmen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBernehmen1Button() {
        bernehmen1.click();
        return this;
    }

    /**
     * Click on Bernehmen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBernehmen2Button() {
        bernehmen2.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBerufsunfhigkeitLink() {
        berufsunfhigkeit.click();
        return this;
    }

    /**
     * Click on Berufsunfhigkeitsversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBerufsunfhigkeitsversicherungLink() {
        berufsunfhigkeitsversicherung.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBewerbungsfotograf1Link() {
        bewerbungsfotograf1.click();
        return this;
    }

    /**
     * Click on Bewerbungsfotograf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBewerbungsfotograf2Link() {
        bewerbungsfotograf2.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBilligflge1Link() {
        billigflge1.click();
        return this;
    }

    /**
     * Click on Billigflge Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBilligflge2Link() {
        billigflge2.click();
        return this;
    }

    /**
     * Click on Bosch Bgs5rcl Relaxxx Prosil... Bodenstaubsauger 13 Angebote 15599 35682 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBoschBgs5rclRelaxxxProsilBodenstaubsaugerLink() {
        boschBgs5rclRelaxxxProsilBodenstaubsauger.click();
        return this;
    }

    /**
     * Click on Bosch Mum4426 Kchenmaschinen 23 Angebote 6999 10994 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBoschMum4426Kchenmaschinen23AngeboteLink() {
        boschMum4426Kchenmaschinen23Angebote.click();
        return this;
    }

    /**
     * Click on Bose Quietcomfort 25 Apple Headphone 2 Angebote 18100 22979 For Price Comparison Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBoseQuietcomfort25AppleHeadphoneLink() {
        boseQuietcomfort25AppleHeadphone.click();
        return this;
    }

    /**
     * Click on Brakes Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBrakesLink() {
        brakes.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBrautstylist1Link() {
        brautstylist1.click();
        return this;
    }

    /**
     * Click on Brautstylist Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBrautstylist2Link() {
        brautstylist2.click();
        return this;
    }

    /**
     * Click on Bremsbelag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBremsbelagLink() {
        bremsbelag.click();
        return this;
    }

    /**
     * Click on Bremsbelge Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBremsbelgeLink() {
        bremsbelge.click();
        return this;
    }

    /**
     * Click on Bremsscheibe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBremsscheibeLink() {
        bremsscheibe.click();
        return this;
    }

    /**
     * Click on Bremsscheiben Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickBremsscheibenLink() {
        bremsscheiben.click();
        return this;
    }

    /**
     * Click on Car Hire Saving Up To 50 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCarHireSavingUpToLink() {
        carHireSavingUpTo.click();
        return this;
    }

    /**
     * Click on Car Insurance 1 Monat Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCarInsurance1MonatGratisLink() {
        carInsurance1MonatGratis.click();
        return this;
    }

    /**
     * Click on Car Insurance Savings Up To 850 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCarInsuranceSavingsUpToLink() {
        carInsuranceSavingsUpTo.click();
        return this;
    }

    /**
     * Click on Career Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCareerLink() {
        career.click();
        return this;
    }

    /**
     * Click on Cars 3 Evolution Dvd Filme Serien 9 Angebote 349 2398 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCars3EvolutionDvdFilmeLink() {
        cars3EvolutionDvdFilme.click();
        return this;
    }

    /**
     * Click on Check24 Autoteile Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCheck24AutoteilePreisvergleichLink() {
        check24AutoteilePreisvergleich.click();
        return this;
    }

    /**
     * Click on Check24 Mietwagenvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCheck24MietwagenvergleichLink() {
        check24Mietwagenvergleich.click();
        return this;
    }

    /**
     * Click on Check24 Points Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCheck24PointsLink() {
        check24Points.click();
        return this;
    }

    /**
     * Click on Companies Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCompaniesLink() {
        companies.click();
        return this;
    }

    /**
     * Click on Computer Konsole Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickComputerKonsoleLink() {
        computerKonsole.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Page Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickContactPageLink() {
        contactPage.click();
        return this;
    }

    /**
     * Click on Cookies Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCookiesLink() {
        cookies.click();
        return this;
    }

    /**
     * Click on Credit Center Your Current Credit Inquiries And Loan Commitments At A Glance Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCreditCenterYourCurrentCreditLink() {
        creditCenterYourCurrentCredit.click();
        return this;
    }

    /**
     * Click on Credit Comparison Savings Up To 2000 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickCreditComparisonSavingsUpToLink() {
        creditComparisonSavingsUpTo.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDatentarife1Link() {
        datentarife1.click();
        return this;
    }

    /**
     * Click on Datentarife Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDatentarife2Link() {
        datentarife2.click();
        return this;
    }

    /**
     * Click on Deal Des Tages 4990 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDealDesTages4990Link() {
        dealDesTages4990.click();
        return this;
    }

    /**
     * Click on Depot Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDepotLink() {
        depot.click();
        return this;
    }

    /**
     * Click on Detailed Conditions Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDetailedConditions1Link() {
        detailedConditions1.click();
        return this;
    }

    /**
     * Click on Detailed Conditions Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDetailedConditions2Link() {
        detailedConditions2.click();
        return this;
    }

    /**
     * Click on Detailed Conditions Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDetailedConditions3Link() {
        detailedConditions3.click();
        return this;
    }

    /**
     * Click on Detaillierte Teilnahmebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDetaillierteTeilnahmebedingungen1Link() {
        detaillierteTeilnahmebedingungen1.click();
        return this;
    }

    /**
     * Click on Detaillierte Teilnahmebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDetaillierteTeilnahmebedingungen2Link() {
        detaillierteTeilnahmebedingungen2.click();
        return this;
    }

    /**
     * Click on Detaillierte Teilnahmebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDetaillierteTeilnahmebedingungen3Link() {
        detaillierteTeilnahmebedingungen3.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDeutschNachhilfe1Link() {
        deutschNachhilfe1.click();
        return this;
    }

    /**
     * Click on Deutsch Nachhilfe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDeutschNachhilfe2Link() {
        deutschNachhilfe2.click();
        return this;
    }

    /**
     * Click on Deutschlands Besterkreditvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDeutschlandsBesterkreditvergleichLink() {
        deutschlandsBesterkreditvergleich.click();
        return this;
    }

    /**
     * Click on Deutschlands Gnstiger Onlinekredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDeutschlandsGnstigerOnlinekreditLink() {
        deutschlandsGnstigerOnlinekredit.click();
        return this;
    }

    /**
     * Click on Die Besten Tarife Mitund Ohne Smartphone Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDieBestenTarifeMitundOhneLink() {
        dieBestenTarifeMitundOhne.click();
        return this;
    }

    /**
     * Click on Die Meistentestsiege Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDieMeistentestsiegeLink() {
        dieMeistentestsiege.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDigitalkameras1Link() {
        digitalkameras1.click();
        return this;
    }

    /**
     * Click on Digitalkameras Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDigitalkameras2Link() {
        digitalkameras2.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDj1Link() {
        dj1.click();
        return this;
    }

    /**
     * Click on Dj Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDj2Link() {
        dj2.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDsl1Link() {
        dsl1.click();
        return this;
    }

    /**
     * Click on Dsl Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDsl2Link() {
        dsl2.click();
        return this;
    }

    /**
     * Click on Dsl Handy Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslHandyLink() {
        dslHandy.click();
        return this;
    }

    /**
     * Click on Dsl Mobile Phone Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslMobilePhoneLink() {
        dslMobilePhone.click();
        return this;
    }

    /**
     * Click on Dsl Vergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslVergleichLink() {
        dslVergleich.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslservice1Link() {
        dslservice1.click();
        return this;
    }

    /**
     * Click on Dslservice Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslservice2Link() {
        dslservice2.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslspeedtest1Link() {
        dslspeedtest1.click();
        return this;
    }

    /**
     * Click on Dslspeedtest Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslspeedtest2Link() {
        dslspeedtest2.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslverfgbarkeit1Link() {
        dslverfgbarkeit1.click();
        return this;
    }

    /**
     * Click on Dslverfgbarkeit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslverfgbarkeit2Link() {
        dslverfgbarkeit2.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslvergleich1Link() {
        dslvergleich1.click();
        return this;
    }

    /**
     * Click on Dslvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickDslvergleich2Link() {
        dslvergleich2.click();
        return this;
    }

    /**
     * Click on Electricity Gas Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickElectricityGasLink() {
        electricityGas.click();
        return this;
    }

    /**
     * Click on Electricity Savings Up To 500 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickElectricitySavingsUpTo500Link() {
        electricitySavingsUpTo500.click();
        return this;
    }

    /**
     * Click on Elektrische Zahnbrsten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickElektrischeZahnbrstenLink() {
        elektrischeZahnbrsten.click();
        return this;
    }

    /**
     * Click on Elektronik Haushalt Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickElektronikHaushaltLink() {
        elektronikHaushalt.click();
        return this;
    }

    /**
     * Click on Elektronik Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickElektronikLink() {
        elektronik.click();
        return this;
    }

    /**
     * Click on Elektrowerkzeug Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickElektrowerkzeugLink() {
        elektrowerkzeug.click();
        return this;
    }

    /**
     * Click on Energie Strom Gas Heizstrom Heizl Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEnergieStromGasHeizstromHeizlLink() {
        energieStromGasHeizstromHeizl.click();
        return this;
    }

    /**
     * Click on Energiecenter Energievertrge Verwalten Und Optimieren Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEnergiecenterEnergievertrgeVerwaltenUndOptimierenLink() {
        energiecenterEnergievertrgeVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Energiecenter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEnergiecenterLink() {
        energiecenter.click();
        return this;
    }

    /**
     * Click on Energiefunktioniertgarantiecheck24.de Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEnergiefunktioniertgarantiecheck24DeLink() {
        energiefunktioniertgarantiecheck24De.click();
        return this;
    }

    /**
     * Click on Energy Centers Use And Save Your Change Periods For Electricity And Gas Contracts Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEnergyCentersUseAndSaveLink() {
        energyCentersUseAndSave.click();
        return this;
    }

    /**
     * Click on Englisch Nachhilfe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEnglischNachhilfeLink() {
        englischNachhilfe.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickErnhrungsberater1Link() {
        ernhrungsberater1.click();
        return this;
    }

    /**
     * Click on Ernhrungsberater Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickErnhrungsberater2Link() {
        ernhrungsberater2.click();
        return this;
    }

    /**
     * Click on Erstinformation Als Pdf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickErstinformationAlsPdfLink() {
        erstinformationAlsPdf.click();
        return this;
    }

    /**
     * Click on Erstinformation Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickErstinformationLink() {
        erstinformation.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEventfotograf1Link() {
        eventfotograf1.click();
        return this;
    }

    /**
     * Click on Eventfotograf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickEventfotograf2Link() {
        eventfotograf2.click();
        return this;
    }

    /**
     * Click on Familienfotograf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFamilienfotografLink() {
        familienfotograf.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFamilienurlaub1Link() {
        familienurlaub1.click();
        return this;
    }

    /**
     * Click on Familienurlaub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFamilienurlaub2Link() {
        familienurlaub2.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFernseher1Link() {
        fernseher1.click();
        return this;
    }

    /**
     * Click on Fernseher Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFernseher2Link() {
        fernseher2.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFestgeld1Link() {
        festgeld1.click();
        return this;
    }

    /**
     * Click on Festgeld Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFestgeld2Link() {
        festgeld2.click();
        return this;
    }

    /**
     * Click on Festnetztelefone Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFestnetztelefoneLink() {
        festnetztelefone.click();
        return this;
    }

    /**
     * Click on Filter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFilterLink() {
        filter.click();
        return this;
    }

    /**
     * Click on Finanzierung Fr Kauf Und Bau Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFinanzierungFrKaufUndBauLink() {
        finanzierungFrKaufUndBau.click();
        return this;
    }

    /**
     * Click on Fitbit Versa Pfirsichalumini... Smartwatch 10 Angebote 18190 20797 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFitbitVersaPfirsichaluminiSmartwatch10Link() {
        fitbitVersaPfirsichaluminiSmartwatch10.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlge1Link() {
        flge1.click();
        return this;
    }

    /**
     * Click on Flge Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlge2Link() {
        flge2.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlgeLondon1Link() {
        flgeLondon1.click();
        return this;
    }

    /**
     * Click on Flge London Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlgeLondon2Link() {
        flgeLondon2.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlgeMallorca1Link() {
        flgeMallorca1.click();
        return this;
    }

    /**
     * Click on Flge Mallorca Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlgeMallorca2Link() {
        flgeMallorca2.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlgeNewYork1Link() {
        flgeNewYork1.click();
        return this;
    }

    /**
     * Click on Flge New York Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlgeNewYork2Link() {
        flgeNewYork2.click();
        return this;
    }

    /**
     * Click on Flights Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlightsLink() {
        flights.click();
        return this;
    }

    /**
     * Click on Flug Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlugLink() {
        flug.click();
        return this;
    }

    /**
     * Click on Flugvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlugvergleich1Link() {
        flugvergleich1.click();
        return this;
    }

    /**
     * Click on Flugvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlugvergleich2Link() {
        flugvergleich2.click();
        return this;
    }

    /**
     * Click on Flugversptung Ihre Rechte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFlugversptungIhreRechteLink() {
        flugversptungIhreRechte.click();
        return this;
    }

    /**
     * Click on For Registration Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickForRegistrationLink() {
        forRegistration.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFotoautomat1Link() {
        fotoautomat1.click();
        return this;
    }

    /**
     * Click on Fotoautomat Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFotoautomat2Link() {
        fotoautomat2.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFotografie1Link() {
        fotografie1.click();
        return this;
    }

    /**
     * Click on Fotografie Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFotografie2Link() {
        fotografie2.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFrhbucher1Link() {
        frhbucher1.click();
        return this;
    }

    /**
     * Click on Frhbucher Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFrhbucher2Link() {
        frhbucher2.click();
        return this;
    }

    /**
     * Click on Fuerteventura Spanien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickFuerteventuraSpanienLink() {
        fuerteventuraSpanien.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGalaxyS9MitVertrag1Link() {
        galaxyS9MitVertrag1.click();
        return this;
    }

    /**
     * Click on Galaxy S9 Mit Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGalaxyS9MitVertrag2Link() {
        galaxyS9MitVertrag2.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGanzjahresreifen1Link() {
        ganzjahresreifen1.click();
        return this;
    }

    /**
     * Click on Ganzjahresreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGanzjahresreifen2Link() {
        ganzjahresreifen2.click();
        return this;
    }

    /**
     * Click on Garantiebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGarantiebedingungen1Link() {
        garantiebedingungen1.click();
        return this;
    }

    /**
     * Click on Garantiebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGarantiebedingungen2Link() {
        garantiebedingungen2.click();
        return this;
    }

    /**
     * Click on Garantiebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGarantiebedingungen3Link() {
        garantiebedingungen3.click();
        return this;
    }

    /**
     * Click on Garantiebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGarantiebedingungen4Link() {
        garantiebedingungen4.click();
        return this;
    }

    /**
     * Click on Garantiebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGarantiebedingungen5Link() {
        garantiebedingungen5.click();
        return this;
    }

    /**
     * Click on Garantiebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGarantiebedingungen6Link() {
        garantiebedingungen6.click();
        return this;
    }

    /**
     * Click on Garantiert Diegnstigstenpreise Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGarantiertDiegnstigstenpreiseLink() {
        garantiertDiegnstigstenpreise.click();
        return this;
    }

    /**
     * Click on Gartengerte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGartengerteLink() {
        gartengerte.click();
        return this;
    }

    /**
     * Click on Gasanbieter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGasanbieterLink() {
        gasanbieter.click();
        return this;
    }

    /**
     * Click on Gasanbieter Wechseln Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGasanbieterWechselnLink() {
        gasanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGasvergleich1Link() {
        gasvergleich1.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGasvergleich2Link() {
        gasvergleich2.click();
        return this;
    }

    /**
     * Click on Gasvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGasvergleich3Link() {
        gasvergleich3.click();
        return this;
    }

    /**
     * Click on Gebudeversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGebudeversicherungLink() {
        gebudeversicherung.click();
        return this;
    }

    /**
     * Click on Gesangslehrer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGesangslehrerLink() {
        gesangslehrer.click();
        return this;
    }

    /**
     * Click on Gesellschaftsspiele Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGesellschaftsspieleLink() {
        gesellschaftsspiele.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGewerbegas1Link() {
        gewerbegas1.click();
        return this;
    }

    /**
     * Click on Gewerbegas Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGewerbegas2Link() {
        gewerbegas2.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGewerbestrom1Link() {
        gewerbestrom1.click();
        return this;
    }

    /**
     * Click on Gewerbestrom Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGewerbestrom2Link() {
        gewerbestrom2.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGirokonto1Link() {
        girokonto1.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGirokonto2Link() {
        girokonto2.click();
        return this;
    }

    /**
     * Click on Girokonto Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGirokonto3Link() {
        girokonto3.click();
        return this;
    }

    /**
     * Click on Gitarrenlehrer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGitarrenlehrerLink() {
        gitarrenlehrer.click();
        return this;
    }

    /**
     * Click on Gnstige Mietwagenangebote Weltweit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickGnstigeMietwagenangeboteWeltweitLink() {
        gnstigeMietwagenangeboteWeltweit.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHaftpflichtversicherung1Link() {
        haftpflichtversicherung1.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHaftpflichtversicherung2Link() {
        haftpflichtversicherung2.click();
        return this;
    }

    /**
     * Click on Haftpflichtversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHaftpflichtversicherung3Link() {
        haftpflichtversicherung3.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyMitVertrag1Link() {
        handyMitVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Mit Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyMitVertrag2Link() {
        handyMitVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyOhneVertrag1Link() {
        handyOhneVertrag1.click();
        return this;
    }

    /**
     * Click on Handy Ohne Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyOhneVertrag2Link() {
        handyOhneVertrag2.click();
        return this;
    }

    /**
     * Click on Handy Tarifvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyTarifvergleichLink() {
        handyTarifvergleich.click();
        return this;
    }

    /**
     * Click on Handy Telefon Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyTelefonLink() {
        handyTelefon.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandybersicht1Link() {
        handybersicht1.click();
        return this;
    }

    /**
     * Click on Handybersicht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandybersicht2Link() {
        handybersicht2.click();
        return this;
    }

    /**
     * Click on Handys Mit Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandysMitVertragLink() {
        handysMitVertrag.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandytarifeNurSimkarte1Link() {
        handytarifeNurSimkarte1.click();
        return this;
    }

    /**
     * Click on Handytarife Nur Simkarte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandytarifeNurSimkarte2Link() {
        handytarifeNurSimkarte2.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyversicherung1Link() {
        handyversicherung1.click();
        return this;
    }

    /**
     * Click on Handyversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyversicherung2Link() {
        handyversicherung2.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyvertragKndigen1Link() {
        handyvertragKndigen1.click();
        return this;
    }

    /**
     * Click on Handyvertrag Kndigen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHandyvertragKndigen2Link() {
        handyvertragKndigen2.click();
        return this;
    }

    /**
     * Click on Hausfinanzierung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHausfinanzierungLink() {
        hausfinanzierung.click();
        return this;
    }

    /**
     * Click on Haushalt Wohnen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHaushaltWohnenLink() {
        haushaltWohnen.click();
        return this;
    }

    /**
     * Click on Hausrat Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHausratLink() {
        hausrat.click();
        return this;
    }

    /**
     * Click on Hausratversicherung 6 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHausratversicherung6MonateGratis1Link() {
        hausratversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Hausratversicherung 6 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHausratversicherung6MonateGratis2Link() {
        hausratversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Hausratversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHausratversicherungLink() {
        hausratversicherung.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Brille Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHeilpraktikerBrilleLink() {
        heilpraktikerBrille.click();
        return this;
    }

    /**
     * Click on Heilpraktiker Und Brille Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHeilpraktikerUndBrilleLink() {
        heilpraktikerUndBrille.click();
        return this;
    }

    /**
     * Click on Heimwerken Garten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHeimwerkenGartenLink() {
        heimwerkenGarten.click();
        return this;
    }

    /**
     * Click on Heizl Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHeizlLink() {
        heizl.click();
        return this;
    }

    /**
     * Click on Heizlvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHeizlvergleichLink() {
        heizlvergleich.click();
        return this;
    }

    /**
     * Click on Heizstrom Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHeizstromLink() {
        heizstrom.click();
        return this;
    }

    /**
     * Click on Heizstromvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHeizstromvergleichLink() {
        heizstromvergleich.click();
        return this;
    }

    /**
     * Click on Hier Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHier1Link() {
        hier1.click();
        return this;
    }

    /**
     * Click on Hier Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHier2Link() {
        hier2.click();
        return this;
    }

    /**
     * Click on Hier Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHier3Link() {
        hier3.click();
        return this;
    }

    /**
     * Click on Hier Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHier4Link() {
        hier4.click();
        return this;
    }

    /**
     * Click on Hier Erfahren Sie Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHierErfahrenSieMehr1Link() {
        hierErfahrenSieMehr1.click();
        return this;
    }

    /**
     * Click on Hier Erfahren Sie Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHierErfahrenSieMehr2Link() {
        hierErfahrenSieMehr2.click();
        return this;
    }

    /**
     * Click on Hier Erfahren Sie Mehr Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHierErfahrenSieMehr3Link() {
        hierErfahrenSieMehr3.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHierKontoAnlegen1Link() {
        hierKontoAnlegen1.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHierKontoAnlegen2Link() {
        hierKontoAnlegen2.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHierKontoAnlegen3Link() {
        hierKontoAnlegen3.click();
        return this;
    }

    /**
     * Click on Hier Konto Anlegen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHierKontoAnlegen4Link() {
        hierKontoAnlegen4.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHochzeit1Link() {
        hochzeit1.click();
        return this;
    }

    /**
     * Click on Hochzeit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHochzeit2Link() {
        hochzeit2.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHochzeitsfotograf1Link() {
        hochzeitsfotograf1.click();
        return this;
    }

    /**
     * Click on Hochzeitsfotograf Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHochzeitsfotograf2Link() {
        hochzeitsfotograf2.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHochzeitssnger1Link() {
        hochzeitssnger1.click();
        return this;
    }

    /**
     * Click on Hochzeitssnger Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHochzeitssnger2Link() {
        hochzeitssnger2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotel1Link() {
        hotel1.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotel2Link() {
        hotel2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotel3Link() {
        hotel3.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotel4Link() {
        hotel4.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelBerlin1Link() {
        hotelBerlin1.click();
        return this;
    }

    /**
     * Click on Hotel Berlin Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelBerlin2Link() {
        hotelBerlin2.click();
        return this;
    }

    /**
     * Click on Hotel Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelLink() {
        hotel.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelMnchen1Link() {
        hotelMnchen1.click();
        return this;
    }

    /**
     * Click on Hotel Mnchen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelMnchen2Link() {
        hotelMnchen2.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelParis1Link() {
        hotelParis1.click();
        return this;
    }

    /**
     * Click on Hotel Paris Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelParis2Link() {
        hotelParis2.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelRom1Link() {
        hotelRom1.click();
        return this;
    }

    /**
     * Click on Hotel Rom Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelRom2Link() {
        hotelRom2.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelsucheWeltweit1Link() {
        hotelsucheWeltweit1.click();
        return this;
    }

    /**
     * Click on Hotelsuche Weltweit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelsucheWeltweit2Link() {
        hotelsucheWeltweit2.click();
        return this;
    }

    /**
     * Click on Hotelvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelvergleichLink() {
        hotelvergleich.click();
        return this;
    }

    /**
     * Click on Hotelvergleiche Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHotelvergleicheLink() {
        hotelvergleiche.click();
        return this;
    }

    /**
     * Click on Huawei Mediapad M2 10.0 Tablet Pc 3 Angebote 19490 23040 For Price Comparison Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHuaweiMediapadM2100TabletLink() {
        huaweiMediapadM2100Tablet.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHundehaftpflicht1Link() {
        hundehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Hundehaftpflicht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHundehaftpflicht2Link() {
        hundehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHundekrankenversicherung1Link() {
        hundekrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Hundekrankenversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHundekrankenversicherung2Link() {
        hundekrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Hurghada Safaga Gypten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickHurghadaSafagaGyptenLink() {
        hurghadaSafagaGypten.click();
        return this;
    }

    /**
     * Click on Immobilienfinanzierung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickImmobilienfinanzierungLink() {
        immobilienfinanzierung.click();
        return this;
    }

    /**
     * Click on Inspiration Starten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInspirationStartenLink() {
        inspirationStarten.click();
        return this;
    }

    /**
     * Click on Insurance Center Your Digital Insurance Folder Check Requirements And Contracts Correctly Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInsuranceCenterYourDigitalInsuranceLink() {
        insuranceCenterYourDigitalInsurance.click();
        return this;
    }

    /**
     * Click on Insurance Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInsuranceLink() {
        insurance.click();
        return this;
    }

    /**
     * Click on Insurance Motor Vehicle Legal Protection And Much More. Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInsuranceMotorVehicleLegalProtectionLink() {
        insuranceMotorVehicleLegalProtection.click();
        return this;
    }

    /**
     * Click on Internet Dsl Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInternetDslLink() {
        internetDsl.click();
        return this;
    }

    /**
     * Click on Internet Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInternetLink() {
        internet.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInternetanbieter1Link() {
        internetanbieter1.click();
        return this;
    }

    /**
     * Click on Internetanbieter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickInternetanbieter2Link() {
        internetanbieter2.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickIphoneXMitVertrag1Link() {
        iphoneXMitVertrag1.click();
        return this;
    }

    /**
     * Click on Iphone X Mit Vertrag Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickIphoneXMitVertrag2Link() {
        iphoneXMitVertrag2.click();
        return this;
    }

    /**
     * Click on Jetzt Anmelden Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickJetztAnmeldenLink() {
        jetztAnmelden.click();
        return this;
    }

//    /**
//     * Click on Jetzt Anmelden Link.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage clickJetztAnmeldenLink() {
//        jetztAnmelden.click();
//        return this;
//    }

    /**
     * Click on Jetzt Autoteile Reifenzum Besten Preis Sichern Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickJetztAutoteileReifenzumBestenLink() {
        jetztAutoteileReifenzumBesten.click();
        return this;
    }

    /**
     * Click on Jetzt Herunterladen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickJetztHerunterladenLink() {
        jetztHerunterladen.click();
        return this;
    }

    /**
     * Click on Jetzt Registrieren Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickJetztRegistrierenButton() {
        jetztRegistrieren.click();
        return this;
    }

    /**
     * Click on Jetzt Vergleichen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickJetztVergleichen1Button() {
        jetztVergleichen1.click();
        return this;
    }

    /**
     * Click on Jetzt Vergleichen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickJetztVergleichen2Button() {
        jetztVergleichen2.click();
        return this;
    }

    /**
     * Click on Jetzt Vorliegendesbaufinanzierungsangebotgratis Checken Lassen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickJetztVorliegendesbaufinanzierungsangebotgratisCheckenLassenLink() {
        jetztVorliegendesbaufinanzierungsangebotgratisCheckenLassen.click();
        return this;
    }

    /**
     * Click on Kaffeemaschinen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKaffeemaschinenLink() {
        kaffeemaschinen.click();
        return this;
    }

    /**
     * Click on Kaffeevollautomaten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKaffeevollautomatenLink() {
        kaffeevollautomaten.click();
        return this;
    }

    /**
     * Click on Kapitalbeschaffung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKapitalbeschaffungLink() {
        kapitalbeschaffung.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKfzversicherung1Link() {
        kfzversicherung1.click();
        return this;
    }

    /**
     * Click on Kfzversicherung 1 Monat Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKfzversicherung1MonatGratisLink() {
        kfzversicherung1MonatGratis.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKfzversicherung2Link() {
        kfzversicherung2.click();
        return this;
    }

    /**
     * Click on Kfzversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKfzversicherungLink() {
        kfzversicherung.click();
        return this;
    }

    /**
     * Click on Kfzversicherungsvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKfzversicherungsvergleichLink() {
        kfzversicherungsvergleich.click();
        return this;
    }

    /**
     * Click on Khlschrank Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKhlschrankLink() {
        khlschrank.click();
        return this;
    }

    /**
     * Click on Klavierlehrer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKlavierlehrerLink() {
        klavierlehrer.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKogas1Link() {
        kogas1.click();
        return this;
    }

    /**
     * Click on Kogas Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKogas2Link() {
        kogas2.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKontoKredit1Link() {
        kontoKredit1.click();
        return this;
    }

    /**
     * Click on Konto Kredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKontoKredit2Link() {
        kontoKredit2.click();
        return this;
    }

    /**
     * Click on Kontomanager Finanzen Verwalten Und Optimieren Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKontomanagerFinanzenVerwaltenUndOptimierenLink() {
        kontomanagerFinanzenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Kontomanager Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKontomanagerLink() {
        kontomanager.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKostrom1Link() {
        kostrom1.click();
        return this;
    }

    /**
     * Click on Kostrom Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKostrom2Link() {
        kostrom2.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz 6 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrankenhauszusatz6MonateGratis1Link() {
        krankenhauszusatz6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz 6 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrankenhauszusatz6MonateGratis2Link() {
        krankenhauszusatz6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Krankenhauszusatz Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrankenhauszusatzLink() {
        krankenhauszusatz.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrankenkassen1Link() {
        krankenkassen1.click();
        return this;
    }

    /**
     * Click on Krankenkassen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrankenkassen2Link() {
        krankenkassen2.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrankenzusatzversicherung1Link() {
        krankenzusatzversicherung1.click();
        return this;
    }

    /**
     * Click on Krankenzusatzversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrankenzusatzversicherung2Link() {
        krankenzusatzversicherung2.click();
        return this;
    }

    /**
     * Click on Kredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditLink() {
        kredit.click();
        return this;
    }

    /**
     * Click on Kreditcenter Kreditantrge Abschlsse Auf Einen Blick Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditcenterKreditantrgeAbschlsseAufLink() {
        kreditcenterKreditantrgeAbschlsseAuf.click();
        return this;
    }

    /**
     * Click on Kreditcenter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditcenterLink() {
        kreditcenter.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditkarte1Link() {
        kreditkarte1.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditkarte2Link() {
        kreditkarte2.click();
        return this;
    }

    /**
     * Click on Kreditkarte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditkarte3Link() {
        kreditkarte3.click();
        return this;
    }

    /**
     * Click on Kreditrechner Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditrechnerLink() {
        kreditrechner.click();
        return this;
    }

    /**
     * Click on Kreditvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditvergleich1Link() {
        kreditvergleich1.click();
        return this;
    }

    /**
     * Click on Kreditvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditvergleich2Link() {
        kreditvergleich2.click();
        return this;
    }

    /**
     * Click on Kreditvergleich Starten Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKreditvergleichStartenButton() {
        kreditvergleichStarten.click();
        return this;
    }

    /**
     * Click on Kreta Griechenland Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKretaGriechenlandLink() {
        kretaGriechenland.click();
        return this;
    }

    /**
     * Click on Krups Xn900t Nespresso Vertu ... Capsule Coffee Makers 10 Angebote 13990 21632 For Price Comparison Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickKrupsXn900tNespressoVertuLink() {
        krupsXn900tNespressoVertu.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLastMinute1Link() {
        lastMinute1.click();
        return this;
    }

    /**
     * Click on Last Minute Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLastMinute2Link() {
        lastMinute2.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLearnMoreLink() {
        learnMore.click();
        return this;
    }

    /**
     * Click on Lego Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLegoLink() {
        lego.click();
        return this;
    }

    /**
     * Click on Leuchten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLeuchtenLink() {
        leuchten.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLfilter1Link() {
        lfilter1.click();
        return this;
    }

    /**
     * Click on Lfilter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLfilter2Link() {
        lfilter2.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink1() {
        _1.click();
        return this;
    }

    /**
     * Click on 10 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink10() {
        _10.click();
        return this;
    }

    /**
     * Click on 11 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink11() {
        _11.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on 4 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink4() {
        _4.click();
        return this;
    }

    /**
     * Click on 5 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink5() {
        _5.click();
        return this;
    }

    /**
     * Click on 6 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink6() {
        _6.click();
        return this;
    }

    /**
     * Click on 7 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink7() {
        _7.click();
        return this;
    }

    /**
     * Click on 9 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLink9() {
        _9.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLogIn1Link() {
        logIn1.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLogIn2Link() {
        logIn2.click();
        return this;
    }

    /**
     * Click on Lte Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLteLink() {
        lte.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLuftfilter1Link() {
        luftfilter1.click();
        return this;
    }

    /**
     * Click on Luftfilter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickLuftfilter2Link() {
        luftfilter2.click();
        return this;
    }

    /**
     * Click on Mallorca Spanien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMallorcaSpanienLink() {
        mallorcaSpanien.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMatheNachhilfe1Link() {
        matheNachhilfe1.click();
        return this;
    }

    /**
     * Click on Mathe Nachhilfe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMatheNachhilfe2Link() {
        matheNachhilfe2.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMbeltransport1Link() {
        mbeltransport1.click();
        return this;
    }

    /**
     * Click on Mbeltransport Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMbeltransport2Link() {
        mbeltransport2.click();
        return this;
    }

    /**
     * Click on Mehr Anzeigen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMehrAnzeigenLink() {
        mehrAnzeigen.click();
        return this;
    }

    /**
     * Click on Mehr Erfahren Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMehrErfahrenLink() {
        mehrErfahren.click();
        return this;
    }

    /**
     * Click on Mehr... Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMehrLink() {
        mehr.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagen1Link() {
        mietwagen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagen2Link() {
        mietwagen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagen3Link() {
        mietwagen3.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagen4Link() {
        mietwagen4.click();
        return this;
    }

    /**
     * Click on Mietwagen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagen5Link() {
        mietwagen5.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenDeutschland1Link() {
        mietwagenDeutschland1.click();
        return this;
    }

    /**
     * Click on Mietwagen Deutschland Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenDeutschland2Link() {
        mietwagenDeutschland2.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenGoldclub1Link() {
        mietwagenGoldclub1.click();
        return this;
    }

    /**
     * Click on Mietwagen Goldclub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenGoldclub2Link() {
        mietwagenGoldclub2.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenMallorca1Link() {
        mietwagenMallorca1.click();
        return this;
    }

    /**
     * Click on Mietwagen Mallorca Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenMallorca2Link() {
        mietwagenMallorca2.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenRundreisen1Link() {
        mietwagenRundreisen1.click();
        return this;
    }

    /**
     * Click on Mietwagen Rundreisen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenRundreisen2Link() {
        mietwagenRundreisen2.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenSpanien1Link() {
        mietwagenSpanien1.click();
        return this;
    }

    /**
     * Click on Mietwagen Spanien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenSpanien2Link() {
        mietwagenSpanien2.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenUsa1Link() {
        mietwagenUsa1.click();
        return this;
    }

    /**
     * Click on Mietwagen Usa Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenUsa2Link() {
        mietwagenUsa2.click();
        return this;
    }

    /**
     * Click on Mietwagen Vergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMietwagenVergleichLink() {
        mietwagenVergleich.click();
        return this;
    }

    /**
     * Click on Mobile Phone With Contract Savings Up To 500 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMobilePhoneWithContractSavingsLink() {
        mobilePhoneWithContractSavings.click();
        return this;
    }

    /**
     * Click on Modernisierung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickModernisierungLink() {
        modernisierung.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMore1Link() {
        more1.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMore2Link() {
        more2.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMotorradversicherung1Link() {
        motorradversicherung1.click();
        return this;
    }

    /**
     * Click on Motorradversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMotorradversicherung2Link() {
        motorradversicherung2.click();
        return this;
    }

    /**
     * Click on Musikunterricht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMusikunterrichtLink() {
        musikunterricht.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Activities Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickMyActivitiesLink() {
        myActivities.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNachhilfe1Link() {
        nachhilfe1.click();
        return this;
    }

    /**
     * Click on Nachhilfe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNachhilfe2Link() {
        nachhilfe2.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNachtspeicherheizung1Link() {
        nachtspeicherheizung1.click();
        return this;
    }

    /**
     * Click on Nachtspeicherheizung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNachtspeicherheizung2Link() {
        nachtspeicherheizung2.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNextLink() {
        next.click();
        return this;
    }

    /**
     * Click on Nintendo Classic Mini Snes Konsole 19 Angebote 7499 9990 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNintendoClassicMiniSnesKonsoleLink() {
        nintendoClassicMiniSnesKonsole.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNotebooks1Link() {
        notebooks1.click();
        return this;
    }

    /**
     * Click on Notebooks Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNotebooks2Link() {
        notebooks2.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNurBis10101Link() {
        nurBis10101.click();
        return this;
    }

    /**
     * Click on Nur Bis 10.10. Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickNurBis10102Link() {
        nurBis10102.click();
        return this;
    }

    /**
     * Click on Ok Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickOkLink() {
        ok.click();
        return this;
    }

    /**
     * Click on Package Holidays Save Up To 50 Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPackageHolidaysSaveUpToLink() {
        packageHolidaysSaveUpTo.click();
        return this;
    }

    /**
     * Click on Partner Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPartnerLink() {
        partner.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPasswortVergessen1Link() {
        passwortVergessen1.click();
        return this;
    }

    /**
     * Click on Passwort Vergessen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPasswortVergessen2Link() {
        passwortVergessen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPauschalreisen1Link() {
        pauschalreisen1.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPauschalreisen2Link() {
        pauschalreisen2.click();
        return this;
    }

    /**
     * Click on Pauschalreisen Zu Den Besten Preisen Buchen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPauschalreisenZuDenBestenPreisenLink() {
        pauschalreisenZuDenBestenPreisen.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPersonalTrainer1Link() {
        personalTrainer1.click();
        return this;
    }

    /**
     * Click on Personal Trainer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPersonalTrainer2Link() {
        personalTrainer2.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPferdehaftpflicht1Link() {
        pferdehaftpflicht1.click();
        return this;
    }

    /**
     * Click on Pferdehaftpflicht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPferdehaftpflicht2Link() {
        pferdehaftpflicht2.click();
        return this;
    }

    /**
     * Click on Pflegeversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPflegeversicherungLink() {
        pflegeversicherung.click();
        return this;
    }

    /**
     * Click on Pflegezusatzversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPflegezusatzversicherungLink() {
        pflegezusatzversicherung.click();
        return this;
    }

    /**
     * Click on Philips Avent Scd58526 Babyphones 8 Angebote 12599 16999 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPhilipsAventScd58526Babyphones8Link() {
        philipsAventScd58526Babyphones8.click();
        return this;
    }

    /**
     * Click on Philips Sonicare Hx9362 67 Di ... Electric Toothbrush 5 Angebote 14089 17868 For Price Comparison Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPhilipsSonicareHx936267Link() {
        philipsSonicareHx936267.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrepaidUnd1monatstarife1Link() {
        prepaidUnd1monatstarife1.click();
        return this;
    }

    /**
     * Click on Prepaid Und 1monatstarife Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrepaidUnd1monatstarife2Link() {
        prepaidUnd1monatstarife2.click();
        return this;
    }

    /**
     * Click on Press Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPressLink() {
        press.click();
        return this;
    }

    /**
     * Click on Prev Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrevLink() {
        prev.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrivateKrankenversicherung1Link() {
        privateKrankenversicherung1.click();
        return this;
    }

    /**
     * Click on Private Krankenversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrivateKrankenversicherung2Link() {
        privateKrankenversicherung2.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrivaterYogalehrer1Link() {
        privaterYogalehrer1.click();
        return this;
    }

    /**
     * Click on Privater Yogalehrer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrivaterYogalehrer2Link() {
        privaterYogalehrer2.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht 12 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrivathaftpflicht12MonateGratis1Link() {
        privathaftpflicht12MonateGratis1.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht 12 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrivathaftpflicht12MonateGratis2Link() {
        privathaftpflicht12MonateGratis2.click();
        return this;
    }

    /**
     * Click on Privathaftpflicht Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickPrivathaftpflichtLink() {
        privathaftpflicht.click();
        return this;
    }

    /**
     * Click on Professionals Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickProfessionalsLink() {
        professionals.click();
        return this;
    }

    /**
     * Click on Profi Finden Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickProfiFindenLink() {
        profiFinden.click();
        return this;
    }

    /**
     * Click on Profis Fr Ihr Projekt Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickProfisFrIhrProjektLink() {
        profisFrIhrProjekt.click();
        return this;
    }

    /**
     * Click on Proxxon Drehmomentschlssel M... Handwerkzeug 6 Angebote 5295 9779 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickProxxonDrehmomentschlsselMHandwerkzeug6Link() {
        proxxonDrehmomentschlsselMHandwerkzeug6.click();
        return this;
    }

    /**
     * Click on Rasierer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRasiererLink() {
        rasierer.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRatenkredit1Link() {
        ratenkredit1.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRatenkredit2Link() {
        ratenkredit2.click();
        return this;
    }

    /**
     * Click on Ratenkredit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRatenkredit3Link() {
        ratenkredit3.click();
        return this;
    }

    /**
     * Click on Ratgeber Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRatgeberLink() {
        ratgeber.click();
        return this;
    }

    /**
     * Click on Rechtsschutz Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRechtsschutzLink() {
        rechtsschutz.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung 3 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRechtsschutzversicherung3MonateGratis1Link() {
        rechtsschutzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung 3 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRechtsschutzversicherung3MonateGratis2Link() {
        rechtsschutzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Rechtsschutzversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRechtsschutzversicherungLink() {
        rechtsschutzversicherung.click();
        return this;
    }

    /**
     * Click on Reifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReifenLink() {
        reifen.click();
        return this;
    }

    /**
     * Click on Reise Finden Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseFindenButton() {
        reiseFinden.click();
        return this;
    }

    /**
     * Click on Reise Flug Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseFlugLink() {
        reiseFlug.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseGoldclub1Link() {
        reiseGoldclub1.click();
        return this;
    }

    /**
     * Click on Reise Goldclub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseGoldclub2Link() {
        reiseGoldclub2.click();
        return this;
    }

    /**
     * Click on Reisen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReisenLink() {
        reisen.click();
        return this;
    }

    /**
     * Click on Reisevergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReisevergleich1Link() {
        reisevergleich1.click();
        return this;
    }

    /**
     * Click on Reisevergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReisevergleich2Link() {
        reisevergleich2.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseversicherung1Link() {
        reiseversicherung1.click();
        return this;
    }

    /**
     * Click on Reiseversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseversicherung2Link() {
        reiseversicherung2.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseweltBestenlisten1Link() {
        reiseweltBestenlisten1.click();
        return this;
    }

    /**
     * Click on Reisewelt Bestenlisten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickReiseweltBestenlisten2Link() {
        reiseweltBestenlisten2.click();
        return this;
    }

    /**
     * Click on Rental Car Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRentalCarLink() {
        rentalCar.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRentenversicherung1Link() {
        rentenversicherung1.click();
        return this;
    }

    /**
     * Click on Rentenversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRentenversicherung2Link() {
        rentenversicherung2.click();
        return this;
    }

    /**
     * Click on Risikoleben Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRisikolebenLink() {
        risikoleben.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung 3 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRisikolebensversicherung3MonateGratis1Link() {
        risikolebensversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung 3 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRisikolebensversicherung3MonateGratis2Link() {
        risikolebensversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Risikolebensversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRisikolebensversicherungLink() {
        risikolebensversicherung.click();
        return this;
    }

    /**
     * Click on Russell Hobbs 2046056 Buckin... Wasserkocher 10 Angebote 3490 5859 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickRussellHobbs2046056BuckinWasserkocherLink() {
        russellHobbs2046056BuckinWasserkocher.click();
        return this;
    }

    /**
     * Click on Samsung Galaxy A6 2018 Dua... Smartphone 24 Angebote 26399 42995 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSamsungGalaxyA62018DuaLink() {
        samsungGalaxyA62018Dua.click();
        return this;
    }

    /**
     * Click on Samsung Ue40nu7199 Ultrahdfernseher 11 Angebote 42990 58973 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSamsungUe40nu7199Ultrahdfernseher11AngeboteLink() {
        samsungUe40nu7199Ultrahdfernseher11Angebote.click();
        return this;
    }

    /**
     * Click on Scheibenwischer Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickScheibenwischerLink() {
        scheibenwischer.click();
        return this;
    }

//    /**
//     * Click on Scheibenwischer Link.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage clickScheibenwischerLink() {
//        scheibenwischer.click();
//        return this;
//    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSchutzbriefautomobilclub1Link() {
        schutzbriefautomobilclub1.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSchutzbriefautomobilclub2Link() {
        schutzbriefautomobilclub2.click();
        return this;
    }

    /**
     * Click on Schutzbriefautomobilclub Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSchutzbriefautomobilclub3Link() {
        schutzbriefautomobilclub3.click();
        return this;
    }

    /**
     * Click on Send Link To My Mobile Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSendLinkToMyMobileButton() {
        sendLinkToMyMobile.click();
        return this;
    }

    /**
     * Click on Senden Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSendenButton() {
        senden.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickShopping1Link() {
        shopping1.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickShopping2Link() {
        shopping2.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickShopping3Link() {
        shopping3.click();
        return this;
    }

    /**
     * Click on Side Alanya Trkei Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSideAlanyaTrkeiLink() {
        sideAlanyaTrkei.click();
        return this;
    }

    /**
     * Click on Sie Sind Selbst Profi Und Auf Der Suche Nach Neuen Kunden Jetzt Anmelden Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSieSindSelbstProfiUndAufLink() {
        sieSindSelbstProfiUndAuf.click();
        return this;
    }

    /**
     * Click on Sign In Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSignInLink() {
        signIn.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Smartphone Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSmartphoneLink() {
        smartphone.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSmartphones1Link() {
        smartphones1.click();
        return this;
    }

    /**
     * Click on Smartphones Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSmartphones2Link() {
        smartphones2.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSommerreifen1Link() {
        sommerreifen1.click();
        return this;
    }

    /**
     * Click on Sommerreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSommerreifen2Link() {
        sommerreifen2.click();
        return this;
    }

    /**
     * Click on Sony Cybershot Dscrx100 Vi Kompaktkamera 6 Angebote 129800 130399 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSonyCybershotDscrx100ViKompaktkameraLink() {
        sonyCybershotDscrx100ViKompaktkamera.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSpielwaren1Link() {
        spielwaren1.click();
        return this;
    }

    /**
     * Click on Spielwaren Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSpielwaren2Link() {
        spielwaren2.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSportWellness1Link() {
        sportWellness1.click();
        return this;
    }

    /**
     * Click on Sport Wellness Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSportWellness2Link() {
        sportWellness2.click();
        return this;
    }

    /**
     * Click on Start Here. Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStartHere1Link() {
        startHere1.click();
        return this;
    }

    /**
     * Click on Start Here. Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStartHere2Link() {
        startHere2.click();
        return this;
    }

    /**
     * Click on Staubsauger Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStaubsaugerLink() {
        staubsauger.click();
        return this;
    }

    /**
     * Click on Stdtereisen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStdtereisenLink() {
        stdtereisen.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSterbegeldversicherung1Link() {
        sterbegeldversicherung1.click();
        return this;
    }

    /**
     * Click on Sterbegeldversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickSterbegeldversicherung2Link() {
        sterbegeldversicherung2.click();
        return this;
    }

    /**
     * Click on Strom Gas Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStromGasLink() {
        stromGas.click();
        return this;
    }

    /**
     * Click on Stromanbieter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStromanbieterLink() {
        stromanbieter.click();
        return this;
    }

    /**
     * Click on Stromanbieter Wechseln Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStromanbieterWechselnLink() {
        stromanbieterWechseln.click();
        return this;
    }

    /**
     * Click on Strompreise Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStrompreiseLink() {
        strompreise.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStromvergleich1Link() {
        stromvergleich1.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStromvergleich2Link() {
        stromvergleich2.click();
        return this;
    }

    /**
     * Click on Stromvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickStromvergleich3Link() {
        stromvergleich3.click();
        return this;
    }

    /**
     * Click on Tabletpcs Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTabletpcsLink() {
        tabletpcs.click();
        return this;
    }

    /**
     * Click on Tablets Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTabletsLink() {
        tablets.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTagesgeld1Link() {
        tagesgeld1.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTagesgeld2Link() {
        tagesgeld2.click();
        return this;
    }

    /**
     * Click on Tagesgeld Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTagesgeld3Link() {
        tagesgeld3.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTarifeFrJungeLeute1Link() {
        tarifeFrJungeLeute1.click();
        return this;
    }

    /**
     * Click on Tarife Fr Junge Leute Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTarifeFrJungeLeute2Link() {
        tarifeFrJungeLeute2.click();
        return this;
    }

    /**
     * Click on Tarife Vergleichen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTarifeVergleichen1Button() {
        tarifeVergleichen1.click();
        return this;
    }

    /**
     * Click on Tarife Vergleichen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTarifeVergleichen2Button() {
        tarifeVergleichen2.click();
        return this;
    }

    /**
     * Click on Tefal Fv4944 Ultragliss Anti ... Steam Iron 13 Angebote 4498 6924 For Price Comparison Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTefalFv4944UltraglissAntiLink() {
        tefalFv4944UltraglissAnti.click();
        return this;
    }

    /**
     * Click on Teilnahmebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTeilnahmebedingungenLink() {
        teilnahmebedingungen.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Privacy Policy Imprint Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTermsAndConditionsPrivacyPolicyLink() {
        termsAndConditionsPrivacyPolicy.click();
        return this;
    }

    /**
     * Click on 8th Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickThLink8() {
        th8.click();
        return this;
    }

    /**
     * Click on Tilgungsrechner Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTilgungsrechnerLink() {
        tilgungsrechner.click();
        return this;
    }

    /**
     * Click on To The Jubilee Deals Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickToTheJubileeDealsLink() {
        toTheJubileeDeals.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Gypten Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTop10HotelsGyptenLink() {
        top10HotelsGypten.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Kanaren Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTop10HotelsKanarenLink() {
        top10HotelsKanaren.click();
        return this;
    }

    /**
     * Click on Top 10 Hotels Mallorca Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTop10HotelsMallorcaLink() {
        top10HotelsMallorca.click();
        return this;
    }

    /**
     * Click on Travel Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTravelLink() {
        travel.click();
        return this;
    }

    /**
     * Click on Trekstor Primebook C13 Wifi Convertible 6 Angebote 31499 37110 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTrekstorPrimebookC13WifiConvertibleLink() {
        trekstorPrimebookC13WifiConvertible.click();
        return this;
    }

    /**
     * Click on Tuevsued.depszert Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTuevsuedDepszert1Link() {
        tuevsuedDepszert1.click();
        return this;
    }

    /**
     * Click on Tuevsued.depszert Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTuevsuedDepszert2Link() {
        tuevsuedDepszert2.click();
        return this;
    }

    /**
     * Click on Tuevsued.depszert Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTuevsuedDepszert3Link() {
        tuevsuedDepszert3.click();
        return this;
    }

    /**
     * Click on Tuevsued.depszert Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickTuevsuedDepszert4Link() {
        tuevsuedDepszert4.click();
        return this;
    }

    /**
     * Click on Ultimate Ears Ue Megaboom Blu... Bluetoothlautsprecher 16 Angebote 12090 22399 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUltimateEarsUeMegaboomBluLink() {
        ultimateEarsUeMegaboomBlu.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUmschuldung1Link() {
        umschuldung1.click();
        return this;
    }

    /**
     * Click on Umschuldung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUmschuldung2Link() {
        umschuldung2.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUmzugsunternehmen1Link() {
        umzugsunternehmen1.click();
        return this;
    }

    /**
     * Click on Umzugsunternehmen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUmzugsunternehmen2Link() {
        umzugsunternehmen2.click();
        return this;
    }

    /**
     * Click on Unfall Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUnfallLink() {
        unfall.click();
        return this;
    }

    /**
     * Click on Unfallversicherung 6 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUnfallversicherung6MonateGratis1Link() {
        unfallversicherung6MonateGratis1.click();
        return this;
    }

    /**
     * Click on Unfallversicherung 6 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUnfallversicherung6MonateGratis2Link() {
        unfallversicherung6MonateGratis2.click();
        return this;
    }

    /**
     * Click on Unfallversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUnfallversicherungLink() {
        unfallversicherung.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUrlaubsfinder1Link() {
        urlaubsfinder1.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUrlaubsfinder2Link() {
        urlaubsfinder2.click();
        return this;
    }

    /**
     * Click on Urlaubsfinder Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUrlaubsfinder3Link() {
        urlaubsfinder3.click();
        return this;
    }

    /**
     * Click on Urlaubsreisen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickUrlaubsreisenLink() {
        urlaubsreisen.click();
        return this;
    }

    /**
     * Click on Vaude New Wash Off Tuvalu M Reisetasche 60 Cm Schwarz Reisetaschen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVaudeNewWashOffTuvaluLink() {
        vaudeNewWashOffTuvalu.click();
        return this;
    }

    /**
     * Click on Vdp Riesengroes Puppenhaus Puppenhuser 1 Angebote 6995 6995 Zum Preisvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVdpRiesengroesPuppenhausPuppenhuserLink() {
        vdpRiesengroesPuppenhausPuppenhuser.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVeranstaltungenEvents1Link() {
        veranstaltungenEvents1.click();
        return this;
    }

    /**
     * Click on Veranstaltungen Events Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVeranstaltungenEvents2Link() {
        veranstaltungenEvents2.click();
        return this;
    }

    /**
     * Click on Vergleichen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVergleichen1Button() {
        vergleichen1.click();
        return this;
    }

    /**
     * Click on Vergleichen Button.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVergleichen2Button() {
        vergleichen2.click();
        return this;
    }

    /**
     * Click on Versicherung Jubilums Deals Bis Zu 12 Monate Gratis Sichern Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVersicherungJubilumsDealsBisZuLink() {
        versicherungJubilumsDealsBisZu.click();
        return this;
    }

    /**
     * Click on Versicherungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVersicherungenLink() {
        versicherungen.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Deals Bis Zu 12 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVersicherungjubilumsDealsBisZu121Link() {
        versicherungjubilumsDealsBisZu121.click();
        return this;
    }

    /**
     * Click on Versicherungjubilums Deals Bis Zu 12 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVersicherungjubilumsDealsBisZu122Link() {
        versicherungjubilumsDealsBisZu122.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVersicherungscenterLink() {
        versicherungscenter.click();
        return this;
    }

    /**
     * Click on Versicherungscenter Versicherungen Verwalten Und Optimieren Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVersicherungscenterVersicherungenVerwaltenUndOptimierenLink() {
        versicherungscenterVersicherungenVerwaltenUndOptimieren.click();
        return this;
    }

    /**
     * Click on Versicherungsvergleich Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVersicherungsvergleichLink() {
        versicherungsvergleich.click();
        return this;
    }

    /**
     * Click on Vouchers Credit Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVouchersCreditLink() {
        vouchersCredit.click();
        return this;
    }

    /**
     * Click on Vouchers Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickVouchersLink() {
        vouchers.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWaschmaschinen1Link() {
        waschmaschinen1.click();
        return this;
    }

    /**
     * Click on Waschmaschinen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWaschmaschinen2Link() {
        waschmaschinen2.click();
        return this;
    }

    /**
     * Click on Weiter Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWeiterLink() {
        weiter.click();
        return this;
    }

    /**
     * Click on Weitere Informationen Finden Sie Hier Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWeitereInformationenFindenSieHierLink() {
        weitereInformationenFindenSieHier.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWinterreifen1Link() {
        winterreifen1.click();
        return this;
    }

    /**
     * Click on Winterreifen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWinterreifen2Link() {
        winterreifen2.click();
        return this;
    }

    /**
     * Click on Wischblatt Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWischblattLink() {
        wischblatt.click();
        return this;
    }

    /**
     * Click on Wohngebudeversicherung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWohngebudeversicherungLink() {
        wohngebudeversicherung.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWrmepumpe1Link() {
        wrmepumpe1.click();
        return this;
    }

    /**
     * Click on Wrmepumpe Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWrmepumpe2Link() {
        wrmepumpe2.click();
        return this;
    }

    /**
     * Click on Www.vermittlerregister.info Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickWwwVermittlerregisterInfoLink() {
        wwwVermittlerregisterInfo.click();
        return this;
    }

    /**
     * Click on Zahnzusatz Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZahnzusatzLink() {
        zahnzusatz.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung 3 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZahnzusatzversicherung3MonateGratis1Link() {
        zahnzusatzversicherung3MonateGratis1.click();
        return this;
    }

    /**
     * Click on Zahnzusatzversicherung 3 Monate Gratis Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZahnzusatzversicherung3MonateGratis2Link() {
        zahnzusatzversicherung3MonateGratis2.click();
        return this;
    }

    /**
     * Click on Zins Schnellcheck Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZinsSchnellcheckLink() {
        zinsSchnellcheck.click();
        return this;
    }

    /**
     * Click on Zu Allen Kategorien Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZuAllenKategorienLink() {
        zuAllenKategorien.click();
        return this;
    }

    /**
     * Click on Zu Den Detaillierten Einlsebedingungen Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZuDenDetailliertenEinlsebedingungenLink() {
        zuDenDetailliertenEinlsebedingungen.click();
        return this;
    }

    /**
     * Click on Zu Den Topdeals Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZuDenTopdealsLink() {
        zuDenTopdeals.click();
        return this;
    }

    /**
     * Click on Zum Angebot Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZumAngebotLink() {
        zumAngebot.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZurck1Link() {
        zurck1.click();
        return this;
    }

    /**
     * Click on Zurck Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZurck2Link() {
        zurck2.click();
        return this;
    }

    /**
     * Click on Zurck Zur Anmeldung Link.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage clickZurckZurAnmeldungLink() {
        zurckZurAnmeldung.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage fill() {
        setForTheBestBestComparisonExperienceTextField();
        setComputerKonsoleNotebooksTabletsHaushaltTextField();
        setEmailadresseIstNichtKorrekt1EmailField();
        setBitteGebenSieIhrPasswortEin1PasswordField();
        setEmailadresseIstNichtKorrekt2EmailField();
        setBitteGebenSieIhrPasswortEin2PasswordField();
        setEmailadresseIstNichtKorrekt3EmailField();
        setEmailadresseIstNichtKorrekt4EmailField();
        setBitteWhlenSieEinPasswortPasswordField();
        setBitteWiederholenSieIhrPasswortPasswordField();
        setWieVielTextField();
        setWofrDropDownListField();
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
        setReisedauer2DropDownListField();
        setPostleitzahlTextField();
        setVerbrauchTextField();
//        setJa1RadioButtonField();
//        setNein1RadioButtonField();
        setDatenvolumen1DropDownListField();
        setInklusivminuten1DropDownListField();
        setHandy2DropDownListField();
//        setJa2RadioButtonField();
//        setNein2RadioButtonField();
//        setJa3RadioButtonField();
//        setNein3RadioButtonField();
        setDatenvolumen2DropDownListField();
        setInklusivminuten2DropDownListField();
        setVertragslaufzeitDropDownListField();
//        setJa4RadioButtonField();
//        setNein4RadioButtonField();
        setErstinformationCheck24IstImmerFrTextField();
        setWoSuchenSieTelField();
        setWelchenProfiSuchenSieZBDjTextField();
        setAbholortTextField();
        setNurStationenCheckboxField();
        setAnderenRckgabeortWhlenCheckboxField();
        setRckgabeortTextField();
        setAlterDesFahrersDropDownListField();
        setAbholdatumTextField();
        setUhrzeit1DropDownListField();
        setRckgabedatumTextField();
        setUhrzeit2DropDownListField();
        setOhneSelbstbeteiligungCheckboxField();
        setPremiumSchutzCheckboxField();
        setFaireTankregelungCheckboxField();
        setAlleKilometerFreiCheckboxField();
        setWinterreifen3CheckboxField();
        setZusatzfahrerInklusiveCheckboxField();
        setKleinwagenCheckboxField();
        setKompaktklasseCheckboxField();
        setMittelklasseCheckboxField();
        setOberklasseCheckboxField();
        setKombiCheckboxField();
        setGelndeSuvCheckboxField();
        setVanCheckboxField();
        setCabrioCheckboxField();
        setPleaseEnterAValidMobileNumberTextField();
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
     * @return the FrontPage class instance.
     */
    public FrontPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Abflughafen Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAbflughafenTextField() {
        return setAbflughafenTextField(data.get("ABFLUGHAFEN"));
    }

    /**
     * Set value to Abflughafen Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAbflughafenTextField(String abflughafenValue) {
        abflughafen.sendKeys(abflughafenValue);
        return this;
    }

    /**
     * Set default value to Abholdatum Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAbholdatumTextField() {
        return setAbholdatumTextField(data.get("ABHOLDATUM"));
    }

    /**
     * Set value to Abholdatum Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAbholdatumTextField(String abholdatumValue) {
        abholdatum.sendKeys(abholdatumValue);
        return this;
    }

    /**
     * Set default value to Abholort Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAbholortTextField() {
        return setAbholortTextField(data.get("ABHOLORT"));
    }

    /**
     * Set value to Abholort Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAbholortTextField(String abholortValue) {
        abholort.sendKeys(abholortValue);
        return this;
    }

    /**
     * Set Alle Kilometer Frei Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAlleKilometerFreiCheckboxField() {
        if (!alleKilometerFrei.isSelected()) {
            alleKilometerFrei.click();
        }
        return this;
    }

    /**
     * Set default value to Alter Des Fahrers Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAlterDesFahrersDropDownListField() {
        return setAlterDesFahrersDropDownListField(data.get("ALTER_DES_FAHRERS"));
    }

    /**
     * Set value to Alter Des Fahrers Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAlterDesFahrersDropDownListField(String alterDesFahrersValue) {
        new Select(alterDesFahrers).selectByVisibleText(alterDesFahrersValue);
        return this;
    }

    /**
     * Set Anderen Rckgabeort Whlen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setAnderenRckgabeortWhlenCheckboxField() {
        if (!anderenRckgabeortWhlen.isSelected()) {
            anderenRckgabeortWhlen.click();
        }
        return this;
    }

    /**
     * Set default value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteGebenSieIhrPasswortEin1PasswordField() {
        return setBitteGebenSieIhrPasswortEin1PasswordField(data.get("BITTE_GEBEN_SIE_IHR_PASSWORT_EIN_1"));
    }

    /**
     * Set value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteGebenSieIhrPasswortEin1PasswordField(String bitteGebenSieIhrPasswortEin1Value) {
        bitteGebenSieIhrPasswortEin1.sendKeys(bitteGebenSieIhrPasswortEin1Value);
        return this;
    }

    /**
     * Set default value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteGebenSieIhrPasswortEin2PasswordField() {
        return setBitteGebenSieIhrPasswortEin2PasswordField(data.get("BITTE_GEBEN_SIE_IHR_PASSWORT_EIN_2"));
    }

    /**
     * Set value to Bitte Geben Sie Ihr Passwort Ein Password field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteGebenSieIhrPasswortEin2PasswordField(String bitteGebenSieIhrPasswortEin2Value) {
        bitteGebenSieIhrPasswortEin2.sendKeys(bitteGebenSieIhrPasswortEin2Value);
        return this;
    }

    /**
     * Set default value to Bitte Whlen Radio Button field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteWhlenRadioButtonField() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteWhlenSieEinPasswortPasswordField() {
        return setBitteWhlenSieEinPasswortPasswordField(data.get("BITTE_WHLEN_SIE_EIN_PASSWORT"));
    }

    /**
     * Set value to Bitte Whlen Sie Ein Passwort Password field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteWhlenSieEinPasswortPasswordField(String bitteWhlenSieEinPasswortValue) {
        bitteWhlenSieEinPasswort.sendKeys(bitteWhlenSieEinPasswortValue);
        return this;
    }

    /**
     * Set default value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteWiederholenSieIhrPasswortPasswordField() {
        return setBitteWiederholenSieIhrPasswortPasswordField(data.get("BITTE_WIEDERHOLEN_SIE_IHR_PASSWORT"));
    }

    /**
     * Set value to Bitte Wiederholen Sie Ihr Passwort Password field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setBitteWiederholenSieIhrPasswortPasswordField(String bitteWiederholenSieIhrPasswortValue) {
        bitteWiederholenSieIhrPasswort.sendKeys(bitteWiederholenSieIhrPasswortValue);
        return this;
    }

    /**
     * Set Cabrio Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setCabrioCheckboxField() {
        if (!cabrio.isSelected()) {
            cabrio.click();
        }
        return this;
    }

    /**
     * Set default value to Computer Konsole Notebooks Tablets Haushalt Wohnen Kaffeemaschinen Waschmaschinen Beauty Wellness Rasierer Elektrische Zahnbrsten Heimwerken Garten Gartengerte Elektrowerkzeug Spielwaren Gesellschaftsspiele Lego Autoteile Reifen Autoteile Reifen Alle Kategorien Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setComputerKonsoleNotebooksTabletsHaushaltTextField() {
        return setComputerKonsoleNotebooksTabletsHaushaltTextField(data.get("COMPUTER_KONSOLE_NOTEBOOKS_TABLETS_HAUSHALT"));
    }

    /**
     * Set value to Computer Konsole Notebooks Tablets Haushalt Wohnen Kaffeemaschinen Waschmaschinen Beauty Wellness Rasierer Elektrische Zahnbrsten Heimwerken Garten Gartengerte Elektrowerkzeug Spielwaren Gesellschaftsspiele Lego Autoteile Reifen Autoteile Reifen Alle Kategorien Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setComputerKonsoleNotebooksTabletsHaushaltTextField(String computerKonsoleNotebooksTabletsHaushaltValue) {
        computerKonsoleNotebooksTabletsHaushalt.sendKeys(computerKonsoleNotebooksTabletsHaushaltValue);
        return this;
    }

    /**
     * Set default value to Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setDatenvolumen1DropDownListField() {
        return setDatenvolumen1DropDownListField(data.get("DATENVOLUMEN_1"));
    }

    /**
     * Set value to Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setDatenvolumen1DropDownListField(String datenvolumen1Value) {
        new Select(datenvolumen1).selectByVisibleText(datenvolumen1Value);
        return this;
    }

    /**
     * Set default value to Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setDatenvolumen2DropDownListField() {
        return setDatenvolumen2DropDownListField(data.get("DATENVOLUMEN_2"));
    }

    /**
     * Set value to Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setDatenvolumen2DropDownListField(String datenvolumen2Value) {
        new Select(datenvolumen2).selectByVisibleText(datenvolumen2Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt1EmailField() {
        return setEmailadresseIstNichtKorrekt1EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_1"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt1EmailField(String emailadresseIstNichtKorrekt1Value) {
        emailadresseIstNichtKorrekt1.sendKeys(emailadresseIstNichtKorrekt1Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt2EmailField() {
        return setEmailadresseIstNichtKorrekt2EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_2"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt2EmailField(String emailadresseIstNichtKorrekt2Value) {
        emailadresseIstNichtKorrekt2.sendKeys(emailadresseIstNichtKorrekt2Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt3EmailField() {
        return setEmailadresseIstNichtKorrekt3EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_3"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt3EmailField(String emailadresseIstNichtKorrekt3Value) {
        emailadresseIstNichtKorrekt3.sendKeys(emailadresseIstNichtKorrekt3Value);
        return this;
    }

    /**
     * Set default value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt4EmailField() {
        return setEmailadresseIstNichtKorrekt4EmailField(data.get("EMAILADRESSE_IST_NICHT_KORREKT_4"));
    }

    /**
     * Set value to Emailadresse Ist Nicht Korrekt Email field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setEmailadresseIstNichtKorrekt4EmailField(String emailadresseIstNichtKorrekt4Value) {
        emailadresseIstNichtKorrekt4.sendKeys(emailadresseIstNichtKorrekt4Value);
        return this;
    }

    /**
     * Set default value to Erstinformation Check24 Ist Immer Fr Sie Da Ihr Unabhngiger Versicherungsmakler Und Vielfacher Testsieger Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setErstinformationCheck24IstImmerFrTextField() {
        return setErstinformationCheck24IstImmerFrTextField(data.get("ERSTINFORMATION_CHECK24_IST_IMMER_FR"));
    }

    /**
     * Set value to Erstinformation Check24 Ist Immer Fr Sie Da Ihr Unabhngiger Versicherungsmakler Und Vielfacher Testsieger Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setErstinformationCheck24IstImmerFrTextField(String erstinformationCheck24IstImmerFrValue) {
        erstinformationCheck24IstImmerFr.sendKeys(erstinformationCheck24IstImmerFrValue);
        return this;
    }

    /**
     * Set default value to Exakt Wie Angegeben Radio Button field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setExaktWieAngegebenRadioButtonField() {
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
     * Set Faire Tankregelung Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setFaireTankregelungCheckboxField() {
        if (!faireTankregelung.isSelected()) {
            faireTankregelung.click();
        }
        return this;
    }

    /**
     * Set default value to For The Best Best Comparison Experience Please Sign Up Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setForTheBestBestComparisonExperienceTextField() {
        return setForTheBestBestComparisonExperienceTextField(data.get("FOR_THE_BEST_BEST_COMPARISON_EXPERIENCE"));
    }

    /**
     * Set value to For The Best Best Comparison Experience Please Sign Up Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setForTheBestBestComparisonExperienceTextField(String forTheBestBestComparisonExperienceValue) {
        forTheBestBestComparisonExperience.sendKeys(forTheBestBestComparisonExperienceValue);
        return this;
    }

    /**
     * Set default value to Frheste Hinreise Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setFrhesteHinreiseTextField() {
        return setFrhesteHinreiseTextField(data.get("FRHESTE_HINREISE"));
    }

    /**
     * Set value to Frheste Hinreise Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setFrhesteHinreiseTextField(String frhesteHinreiseValue) {
        frhesteHinreise.sendKeys(frhesteHinreiseValue);
        return this;
    }

    /**
     * Set Gelnde Suv Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setGelndeSuvCheckboxField() {
        if (!gelndeSuv.isSelected()) {
            gelndeSuv.click();
        }
        return this;
    }

    /**
     * Set default value to Handy Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setHandy1DropDownListField() {
        return setHandy1DropDownListField(data.get("HANDY_1"));
    }

    /**
     * Set value to Handy Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setHandy1DropDownListField(String handy1Value) {
        handy1.click();
        return this;
    }

    /**
     * Set default value to Handy Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setHandy2DropDownListField() {
        return setHandy2DropDownListField(data.get("HANDY_2"));
    }

    /**
     * Set value to Handy Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setHandy2DropDownListField(String handy2Value) {
        new Select(handy2).selectByVisibleText(handy2Value);
        return this;
    }

    /**
     * Set default value to Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setInklusivminuten1DropDownListField() {
        return setInklusivminuten1DropDownListField(data.get("INKLUSIVMINUTEN_1"));
    }

    /**
     * Set value to Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setInklusivminuten1DropDownListField(String inklusivminuten1Value) {
        new Select(inklusivminuten1).selectByVisibleText(inklusivminuten1Value);
        return this;
    }

    /**
     * Set default value to Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setInklusivminuten2DropDownListField() {
        return setInklusivminuten2DropDownListField(data.get("INKLUSIVMINUTEN_2"));
    }

    /**
     * Set value to Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setInklusivminuten2DropDownListField(String inklusivminuten2Value) {
        new Select(inklusivminuten2).selectByVisibleText(inklusivminuten2Value);
        return this;
    }

//    /**
//     * Set default value to Ja Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setJa1RadioButtonField() {
//        for (WebElement el : ja1) {
//            if (el.getAttribute("value").equals(ja1Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Set default value to Ja Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setJa2RadioButtonField() {
//        for (WebElement el : ja2) {
//            if (el.getAttribute("value").equals(ja2Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Set default value to Ja Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setJa3RadioButtonField() {
//        for (WebElement el : ja3) {
//            if (el.getAttribute("value").equals(ja3Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Set default value to Ja Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setJa4RadioButtonField() {
//        for (WebElement el : ja4) {
//            if (el.getAttribute("value").equals(ja4Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set default value to 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField1() {
        return setKind1DropDownListField1(data.get("KIND_1_1"));
    }

    /**
     * Set value to 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField1(String kind1Value1) {
        new Select(kind11).selectByVisibleText(kind1Value1);
        return this;
    }

    /**
     * Set default value to 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField2() {
        return setKind1DropDownListField2(data.get("KIND_1_2"));
    }

    /**
     * Set value to 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField2(String kind1Value2) {
        new Select(kind12).selectByVisibleText(kind1Value2);
        return this;
    }

    /**
     * Set default value to 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField3() {
        return setKind1DropDownListField3(data.get("KIND_1_3"));
    }

    /**
     * Set value to 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField3(String kind1Value3) {
        new Select(kind13).selectByVisibleText(kind1Value3);
        return this;
    }

    /**
     * Set default value to 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField4() {
        return setKind1DropDownListField4(data.get("KIND_1_4"));
    }

    /**
     * Set value to 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind1DropDownListField4(String kind1Value4) {
        new Select(kind14).selectByVisibleText(kind1Value4);
        return this;
    }

    /**
     * Set default value to 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField1() {
        return setKind2DropDownListField1(data.get("KIND_2_1"));
    }

    /**
     * Set value to 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField1(String kind2Value1) {
        new Select(kind21).selectByVisibleText(kind2Value1);
        return this;
    }

    /**
     * Set default value to 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField2() {
        return setKind2DropDownListField2(data.get("KIND_2_2"));
    }

    /**
     * Set value to 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField2(String kind2Value2) {
        new Select(kind22).selectByVisibleText(kind2Value2);
        return this;
    }

    /**
     * Set default value to 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField3() {
        return setKind2DropDownListField3(data.get("KIND_2_3"));
    }

    /**
     * Set value to 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField3(String kind2Value3) {
        new Select(kind23).selectByVisibleText(kind2Value3);
        return this;
    }

    /**
     * Set default value to 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField4() {
        return setKind2DropDownListField4(data.get("KIND_2_4"));
    }

    /**
     * Set value to 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKind2DropDownListField4(String kind2Value4) {
        new Select(kind24).selectByVisibleText(kind2Value4);
        return this;
    }

    /**
     * Set Kleinwagen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKleinwagenCheckboxField() {
        if (!kleinwagen.isSelected()) {
            kleinwagen.click();
        }
        return this;
    }

    /**
     * Set Kombi Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKombiCheckboxField() {
        if (!kombi.isSelected()) {
            kombi.click();
        }
        return this;
    }

    /**
     * Set Kompaktklasse Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setKompaktklasseCheckboxField() {
        if (!kompaktklasse.isSelected()) {
            kompaktklasse.click();
        }
        return this;
    }

    /**
     * Set Mittelklasse Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setMittelklasseCheckboxField() {
        if (!mittelklasse.isSelected()) {
            mittelklasse.click();
        }
        return this;
    }

//    /**
//     * Set default value to Nein Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setNein1RadioButtonField() {
//        for (WebElement el : nein1) {
//            if (el.getAttribute("value").equals(nein1Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Set default value to Nein Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setNein2RadioButtonField() {
//        for (WebElement el : nein2) {
//            if (el.getAttribute("value").equals(nein2Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Set default value to Nein Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setNein3RadioButtonField() {
//        for (WebElement el : nein3) {
//            if (el.getAttribute("value").equals(nein3Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Set default value to Nein Radio Button field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setNein4RadioButtonField() {
//        for (WebElement el : nein4) {
//            if (el.getAttribute("value").equals(nein4Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set Nur Stationen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setNurStationenCheckboxField() {
        if (!nurStationen.isSelected()) {
            nurStationen.click();
        }
        return this;
    }

    /**
     * Set Oberklasse Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setOberklasseCheckboxField() {
        if (!oberklasse.isSelected()) {
            oberklasse.click();
        }
        return this;
    }

    /**
     * Set Ohne Selbstbeteiligung Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setOhneSelbstbeteiligungCheckboxField() {
        if (!ohneSelbstbeteiligung.isSelected()) {
            ohneSelbstbeteiligung.click();
        }
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Mobile Number Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setPleaseEnterAValidMobileNumberTextField() {
        return setPleaseEnterAValidMobileNumberTextField(data.get("PLEASE_ENTER_A_VALID_MOBILE_NUMBER"));
    }

    /**
     * Set value to Please Enter A Valid Mobile Number Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setPleaseEnterAValidMobileNumberTextField(String pleaseEnterAValidMobileNumberValue) {
        pleaseEnterAValidMobileNumber.sendKeys(pleaseEnterAValidMobileNumberValue);
        return this;
    }

    /**
     * Set default value to Postleitzahl Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setPostleitzahlTextField() {
        return setPostleitzahlTextField(data.get("POSTLEITZAHL"));
    }

    /**
     * Set value to Postleitzahl Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setPostleitzahlTextField(String postleitzahlValue) {
        postleitzahl.sendKeys(postleitzahlValue);
        return this;
    }

    /**
     * Set Premium Schutz Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setPremiumSchutzCheckboxField() {
        if (!premiumSchutz.isSelected()) {
            premiumSchutz.click();
        }
        return this;
    }

    /**
     * Set default value to Rckgabedatum Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setRckgabedatumTextField() {
        return setRckgabedatumTextField(data.get("RCKGABEDATUM"));
    }

    /**
     * Set value to Rckgabedatum Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setRckgabedatumTextField(String rckgabedatumValue) {
        rckgabedatum.sendKeys(rckgabedatumValue);
        return this;
    }

    /**
     * Set default value to Rckgabeort Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setRckgabeortTextField() {
        return setRckgabeortTextField(data.get("RCKGABEORT"));
    }

    /**
     * Set value to Rckgabeort Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setRckgabeortTextField(String rckgabeortValue) {
        rckgabeort.sendKeys(rckgabeortValue);
        return this;
    }

    /**
     * Set default value to Reisedauer Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisedauer1DropDownListField() {
        return setReisedauer1DropDownListField(data.get("REISEDAUER_1"));
    }

    /**
     * Set value to Reisedauer Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisedauer1DropDownListField(String reisedauer1Value) {
        reisedauer1.sendKeys(reisedauer1Value);
        return this;
    }

    /**
     * Set default value to Reisedauer Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisedauer2DropDownListField() {
        return setReisedauer2DropDownListField(data.get("REISEDAUER_2"));
    }

    /**
     * Set value to Reisedauer Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisedauer2DropDownListField(String reisedauer2Value) {
        new Select(reisedauer2).selectByVisibleText(reisedauer2Value);
        return this;
    }

//    /**
//     * Set default value to Reisedauer Eingeben Tage Tel field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setReisedauerEingebenTage1TelField() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage setReisedauerEingebenTage2TelField() {
        return setReisedauerEingebenTage2TelField(data.get("REISEDAUER_EINGEBEN_TAGE_2"));
    }

    /**
     * Set value to Reisedauer Eingeben Tage Tel field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisedauerEingebenTage2TelField(String reisedauerEingebenTage2Value) {
        reisedauerEingebenTage2.sendKeys(reisedauerEingebenTage2Value);
        return this;
    }

    /**
     * Set default value to Reisende Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisendeDropDownListField() {
        return setReisendeDropDownListField(data.get("REISENDE"));
    }

    /**
     * Set value to Reisende Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisendeDropDownListField(String reisendeValue) {
        new Select(reisende).selectByVisibleText(reisendeValue);
        return this;
    }

    /**
     * Set default value to Reiseziel Oder Hotel Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisezielOderHotelTextField() {
        return setReisezielOderHotelTextField(data.get("REISEZIEL_ODER_HOTEL"));
    }

    /**
     * Set value to Reiseziel Oder Hotel Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setReisezielOderHotelTextField(String reisezielOderHotelValue) {
        reisezielOderHotel.sendKeys(reisezielOderHotelValue);
        return this;
    }

    /**
     * Set default value to Spteste Rckreise Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setSptesteRckreiseTextField() {
        return setSptesteRckreiseTextField(data.get("SPTESTE_RCKREISE"));
    }

    /**
     * Set value to Spteste Rckreise Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setSptesteRckreiseTextField(String sptesteRckreiseValue) {
        sptesteRckreise.sendKeys(sptesteRckreiseValue);
        return this;
    }

    /**
     * Set default value to 10 Tage Radio Button field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setTageRadioButtonField10() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage setTageRadioButtonField58() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage setTageRadioButtonField912() {
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
     * Set default value to Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setUhrzeit1DropDownListField() {
        return setUhrzeit1DropDownListField(data.get("UHRZEIT_1"));
    }

    /**
     * Set value to Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setUhrzeit1DropDownListField(String uhrzeit1Value) {
        new Select(uhrzeit1).selectByVisibleText(uhrzeit1Value);
        return this;
    }

    /**
     * Set default value to Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setUhrzeit2DropDownListField() {
        return setUhrzeit2DropDownListField(data.get("UHRZEIT_2"));
    }

    /**
     * Set value to Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setUhrzeit2DropDownListField(String uhrzeit2Value) {
        new Select(uhrzeit2).selectByVisibleText(uhrzeit2Value);
        return this;
    }

    /**
     * Set Van Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setVanCheckboxField() {
        if (!van.isSelected()) {
            van.click();
        }
        return this;
    }

    /**
     * Set default value to Verbrauch Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setVerbrauchTextField() {
        return setVerbrauchTextField(data.get("VERBRAUCH"));
    }

    /**
     * Set value to Verbrauch Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setVerbrauchTextField(String verbrauchValue) {
        verbrauch.sendKeys(verbrauchValue);
        return this;
    }

    /**
     * Set default value to Vertragslaufzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setVertragslaufzeitDropDownListField() {
        return setVertragslaufzeitDropDownListField(data.get("VERTRAGSLAUFZEIT"));
    }

    /**
     * Set value to Vertragslaufzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setVertragslaufzeitDropDownListField(String vertragslaufzeitValue) {
        new Select(vertragslaufzeit).selectByVisibleText(vertragslaufzeitValue);
        return this;
    }

    /**
     * Set default value to Welchen Profi Suchen Sie Z.b. Dj Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWelchenProfiSuchenSieZBDjTextField() {
        return setWelchenProfiSuchenSieZBDjTextField(data.get("WELCHEN_PROFI_SUCHEN_SIE_Z_B__DJ"));
    }

    /**
     * Set value to Welchen Profi Suchen Sie Z.b. Dj Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWelchenProfiSuchenSieZBDjTextField(String welchenProfiSuchenSieZBDjValue) {
        welchenProfiSuchenSieZBDj.sendKeys(welchenProfiSuchenSieZBDjValue);
        return this;
    }

    /**
     * Set default value to Wie Viel Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWieVielTextField() {
        return setWieVielTextField(data.get("WIE_VIEL"));
    }

    /**
     * Set value to Wie Viel Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWieVielTextField(String wieVielValue) {
        wieViel.sendKeys(wieVielValue);
        return this;
    }

    /**
     * Set Winterreifen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWinterreifen3CheckboxField() {
        if (!winterreifen3.isSelected()) {
            winterreifen3.click();
        }
        return this;
    }

    /**
     * Set default value to Wo Suchen Sie Tel field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWoSuchenSieTelField() {
        return setWoSuchenSieTelField(data.get("WO_SUCHEN_SIE"));
    }

    /**
     * Set value to Wo Suchen Sie Tel field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWoSuchenSieTelField(String woSuchenSieValue) {
        woSuchenSie.sendKeys(woSuchenSieValue);
        return this;
    }

    /**
     * Set default value to 1 Woche Radio Button field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWocheRadioButtonField1() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage setWochenRadioButtonField2() {
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
     * Set default value to Wofr Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWofrDropDownListField() {
        return setWofrDropDownListField(data.get("WOFR"));
    }

    /**
     * Set value to Wofr Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setWofrDropDownListField(String wofrValue) {
        new Select(wofr).selectByVisibleText(wofrValue);
        return this;
    }

//    /**
//     * Set default value to 3 Zimmer Mit Je Z.b. Text field.
//     *
//     * @return the FrontPage class instance.
//     */
//    public FrontPage setZimmerMitJeZB1TextField3() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage setZimmerMitJeZB2TextField3() {
        return setZimmerMitJeZB2TextField3(data.get("ZIMMER_MIT_JE_Z_B__2_3"));
    }

    /**
     * Set value to 3 Zimmer Mit Je Z.b. Text field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setZimmerMitJeZB2TextField3(String zimmerMitJeZB2Value3) {
        zimmerMitJeZB23.sendKeys(zimmerMitJeZB2Value3);
        return this;
    }

    /**
     * Set default value to 2 Zimmer Mit Je Z.b. Radio Button field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setZimmerMitJeZBRadioButtonField2() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage setZimmerMitZBRadioButtonField1() {
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
     * Set Zusatzfahrer Inklusive Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage setZusatzfahrerInklusiveCheckboxField() {
        if (!zusatzfahrerInklusive.isSelected()) {
            zusatzfahrerInklusive.click();
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage submit() {
        clickJetztRegistrierenButton();
        return this;
    }

    /**
     * Unset Alle Kilometer Frei Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetAlleKilometerFreiCheckboxField() {
        if (alleKilometerFrei.isSelected()) {
            alleKilometerFrei.click();
        }
        return this;
    }

    /**
     * Unset default value from Alter Des Fahrers Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetAlterDesFahrersDropDownListField() {
        return unsetAlterDesFahrersDropDownListField(data.get("ALTER_DES_FAHRERS"));
    }

    /**
     * Unset value from Alter Des Fahrers Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetAlterDesFahrersDropDownListField(String alterDesFahrersValue) {
        new Select(alterDesFahrers).deselectByVisibleText(alterDesFahrersValue);
        return this;
    }

    /**
     * Unset Anderen Rckgabeort Whlen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetAnderenRckgabeortWhlenCheckboxField() {
        if (anderenRckgabeortWhlen.isSelected()) {
            anderenRckgabeortWhlen.click();
        }
        return this;
    }

    /**
     * Unset Cabrio Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetCabrioCheckboxField() {
        if (cabrio.isSelected()) {
            cabrio.click();
        }
        return this;
    }

    /**
     * Unset default value from Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetDatenvolumen1DropDownListField() {
        return unsetDatenvolumen1DropDownListField(data.get("DATENVOLUMEN_1"));
    }

    /**
     * Unset value from Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetDatenvolumen1DropDownListField(String datenvolumen1Value) {
        new Select(datenvolumen1).deselectByVisibleText(datenvolumen1Value);
        return this;
    }

    /**
     * Unset default value from Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetDatenvolumen2DropDownListField() {
        return unsetDatenvolumen2DropDownListField(data.get("DATENVOLUMEN_2"));
    }

    /**
     * Unset value from Datenvolumen Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetDatenvolumen2DropDownListField(String datenvolumen2Value) {
        new Select(datenvolumen2).deselectByVisibleText(datenvolumen2Value);
        return this;
    }

    /**
     * Unset Faire Tankregelung Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetFaireTankregelungCheckboxField() {
        if (faireTankregelung.isSelected()) {
            faireTankregelung.click();
        }
        return this;
    }

    /**
     * Unset Gelnde Suv Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetGelndeSuvCheckboxField() {
        if (gelndeSuv.isSelected()) {
            gelndeSuv.click();
        }
        return this;
    }

    /**
     * Unset default value from Handy Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetHandy2DropDownListField() {
        return unsetHandy2DropDownListField(data.get("HANDY_2"));
    }

    /**
     * Unset value from Handy Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetHandy2DropDownListField(String handy2Value) {
        new Select(handy2).deselectByVisibleText(handy2Value);
        return this;
    }

    /**
     * Unset default value from Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetInklusivminuten1DropDownListField() {
        return unsetInklusivminuten1DropDownListField(data.get("INKLUSIVMINUTEN_1"));
    }

    /**
     * Unset value from Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetInklusivminuten1DropDownListField(String inklusivminuten1Value) {
        new Select(inklusivminuten1).deselectByVisibleText(inklusivminuten1Value);
        return this;
    }

    /**
     * Unset default value from Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetInklusivminuten2DropDownListField() {
        return unsetInklusivminuten2DropDownListField(data.get("INKLUSIVMINUTEN_2"));
    }

    /**
     * Unset value from Inklusivminuten Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetInklusivminuten2DropDownListField(String inklusivminuten2Value) {
        new Select(inklusivminuten2).deselectByVisibleText(inklusivminuten2Value);
        return this;
    }

    /**
     * Unset default value from 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField1() {
        return unsetKind1DropDownListField1(data.get("KIND_1_1"));
    }

    /**
     * Unset value from 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField1(String kind1Value1) {
        new Select(kind11).deselectByVisibleText(kind1Value1);
        return this;
    }

    /**
     * Unset default value from 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField2() {
        return unsetKind1DropDownListField2(data.get("KIND_1_2"));
    }

    /**
     * Unset value from 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField2(String kind1Value2) {
        new Select(kind12).deselectByVisibleText(kind1Value2);
        return this;
    }

    /**
     * Unset default value from 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField3() {
        return unsetKind1DropDownListField3(data.get("KIND_1_3"));
    }

    /**
     * Unset value from 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField3(String kind1Value3) {
        new Select(kind13).deselectByVisibleText(kind1Value3);
        return this;
    }

    /**
     * Unset default value from 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField4() {
        return unsetKind1DropDownListField4(data.get("KIND_1_4"));
    }

    /**
     * Unset value from 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind1DropDownListField4(String kind1Value4) {
        new Select(kind14).deselectByVisibleText(kind1Value4);
        return this;
    }

    /**
     * Unset default value from 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField1() {
        return unsetKind2DropDownListField1(data.get("KIND_2_1"));
    }

    /**
     * Unset value from 1. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField1(String kind2Value1) {
        new Select(kind21).deselectByVisibleText(kind2Value1);
        return this;
    }

    /**
     * Unset default value from 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField2() {
        return unsetKind2DropDownListField2(data.get("KIND_2_2"));
    }

    /**
     * Unset value from 2. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField2(String kind2Value2) {
        new Select(kind22).deselectByVisibleText(kind2Value2);
        return this;
    }

    /**
     * Unset default value from 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField3() {
        return unsetKind2DropDownListField3(data.get("KIND_2_3"));
    }

    /**
     * Unset value from 3. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField3(String kind2Value3) {
        new Select(kind23).deselectByVisibleText(kind2Value3);
        return this;
    }

    /**
     * Unset default value from 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField4() {
        return unsetKind2DropDownListField4(data.get("KIND_2_4"));
    }

    /**
     * Unset value from 4. Kind Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKind2DropDownListField4(String kind2Value4) {
        new Select(kind24).deselectByVisibleText(kind2Value4);
        return this;
    }

    /**
     * Unset Kleinwagen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKleinwagenCheckboxField() {
        if (kleinwagen.isSelected()) {
            kleinwagen.click();
        }
        return this;
    }

    /**
     * Unset Kombi Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKombiCheckboxField() {
        if (kombi.isSelected()) {
            kombi.click();
        }
        return this;
    }

    /**
     * Unset Kompaktklasse Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetKompaktklasseCheckboxField() {
        if (kompaktklasse.isSelected()) {
            kompaktklasse.click();
        }
        return this;
    }

    /**
     * Unset Mittelklasse Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetMittelklasseCheckboxField() {
        if (mittelklasse.isSelected()) {
            mittelklasse.click();
        }
        return this;
    }

    /**
     * Unset Nur Stationen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetNurStationenCheckboxField() {
        if (nurStationen.isSelected()) {
            nurStationen.click();
        }
        return this;
    }

    /**
     * Unset Oberklasse Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetOberklasseCheckboxField() {
        if (oberklasse.isSelected()) {
            oberklasse.click();
        }
        return this;
    }

    /**
     * Unset Ohne Selbstbeteiligung Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetOhneSelbstbeteiligungCheckboxField() {
        if (ohneSelbstbeteiligung.isSelected()) {
            ohneSelbstbeteiligung.click();
        }
        return this;
    }

    /**
     * Unset Premium Schutz Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetPremiumSchutzCheckboxField() {
        if (premiumSchutz.isSelected()) {
            premiumSchutz.click();
        }
        return this;
    }

    /**
     * Unset default value from Reisedauer Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetReisedauer2DropDownListField() {
        return unsetReisedauer2DropDownListField(data.get("REISEDAUER_2"));
    }

    /**
     * Unset value from Reisedauer Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetReisedauer2DropDownListField(String reisedauer2Value) {
        new Select(reisedauer2).deselectByVisibleText(reisedauer2Value);
        return this;
    }

    /**
     * Unset default value from Reisende Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetReisendeDropDownListField() {
        return unsetReisendeDropDownListField(data.get("REISENDE"));
    }

    /**
     * Unset value from Reisende Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetReisendeDropDownListField(String reisendeValue) {
        new Select(reisende).deselectByVisibleText(reisendeValue);
        return this;
    }

    /**
     * Unset default value from Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetUhrzeit1DropDownListField() {
        return unsetUhrzeit1DropDownListField(data.get("UHRZEIT_1"));
    }

    /**
     * Unset value from Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetUhrzeit1DropDownListField(String uhrzeit1Value) {
        new Select(uhrzeit1).deselectByVisibleText(uhrzeit1Value);
        return this;
    }

    /**
     * Unset default value from Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetUhrzeit2DropDownListField() {
        return unsetUhrzeit2DropDownListField(data.get("UHRZEIT_2"));
    }

    /**
     * Unset value from Uhrzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetUhrzeit2DropDownListField(String uhrzeit2Value) {
        new Select(uhrzeit2).deselectByVisibleText(uhrzeit2Value);
        return this;
    }

    /**
     * Unset Van Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetVanCheckboxField() {
        if (van.isSelected()) {
            van.click();
        }
        return this;
    }

    /**
     * Unset default value from Vertragslaufzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetVertragslaufzeitDropDownListField() {
        return unsetVertragslaufzeitDropDownListField(data.get("VERTRAGSLAUFZEIT"));
    }

    /**
     * Unset value from Vertragslaufzeit Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetVertragslaufzeitDropDownListField(String vertragslaufzeitValue) {
        new Select(vertragslaufzeit).deselectByVisibleText(vertragslaufzeitValue);
        return this;
    }

    /**
     * Unset Winterreifen Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetWinterreifen3CheckboxField() {
        if (winterreifen3.isSelected()) {
            winterreifen3.click();
        }
        return this;
    }

    /**
     * Unset default value from Wofr Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetWofrDropDownListField() {
        return unsetWofrDropDownListField(data.get("WOFR"));
    }

    /**
     * Unset value from Wofr Drop Down List field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetWofrDropDownListField(String wofrValue) {
        new Select(wofr).deselectByVisibleText(wofrValue);
        return this;
    }

    /**
     * Unset Zusatzfahrer Inklusive Checkbox field.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage unsetZusatzfahrerInklusiveCheckboxField() {
        if (zusatzfahrerInklusive.isSelected()) {
            zusatzfahrerInklusive.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the FrontPage class instance.
     */
    public FrontPage verifyPageLoaded() {
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
     * @return the FrontPage class instance.
     */
    public FrontPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
