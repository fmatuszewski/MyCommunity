package org.code4freedom

import Classification
import Group

class Project {

    static constraints = {
    }
	static mapping = {
		longDescription  type: "text"
		justification    type: "text"
		officialComment  type: "text"
		authorComment    type: "text"
		residentsComment type: "text"
		
	}
	
	/**
	 *(Liczba) nr projektu,
	 */
	 int projectNumber
	 /**
	 *Nazwa projektu
	 */
	 String name 
	 /**
	 *Lokalizacja Ulica Rejon Ulic (dodatkowo
	 */
	 String location 
	 /**
	 *Klasyfikacja propozycji projektu (tematyka)
	 */
	 Classification classification
	 /**
	 *Potencjalni odbiorcy propozycji projektu
	 */
	 Group targetGroup 
	 /**
	 *Status Projektu (stan realizacji) (enum)
	 */
	 String status 
	 /**
	 *(String) Krótki opis
	 */
	 String shortDescription 
	 /**
	 *(text) Długi opis
	 */
	 String longDescription
	 /**
	 *Data Utworzenia Rekordu.
	 */
	 Date creationDate 
	 /**
	 *(text) Uzasadnienie
	 */
	 String justification 
	 /**
	 *(Liczba zmiennoprzecinkowa) Koszt realizacji po weryfikacji
	 */
	 Float implementationCost
	 /**
	 *(Liczba zmiennoprzecinkowa) Koszt utrzymania
	 */
	 Float upkeepYearlyCost
	 /**
	 *(String) Strona Zewnętrzna
	 */
	 String externalWebsite
	 /**
	 *(String) Strona Facebook.
	 */
	 String externalFacebook
	 /**
	 *(String) Link do filmu na You Tube
	 */
	 String externalMovie
	 /**
	 *(String) Email do projektodawcy kopiowany podczas tworzenia projektu z Gui lub importowany z pliku.
	 */
	 String externalEmail
	 /**
	 *Szerokość Geograficzna
	 */
	 Float longitude
	 /**
	 *Długość Geograficzna
	 */
	 Float latitude
	 /**
	 *(geoJson)Obrys Znacznik lub linia reprezentująca lokalizację
	 */
	 //contour 
	 /**
	 *(String) Link do folder ze zdjęciami projektu generowany jako generowany jakou {path_to_assets}/{id}
	 */
								  
	 /**
	 *(Liczba) liczba głosów w preselekcji,
	 */
	 Integer preselectionVotesNo
	 /**
	 *(Liczba) liczba głosów,
	 */
	 Integer selectionVotesNo
	 /**
	 *(String) urząd realizujący,
	 */
	 String office
	 /**
	 *(String) wydział realizujący,
	 */
	 String department
	 /**
	 *(text) uwagi miasta do projektu
	 */
	 String officialComment
	 /**
	 *(text) konsultacje z autorem,
	 */
	 String authorComment
	 /**
	 *(text) uwagi mieszkańców do realizacji.
	 */
	 String residentsComment
	 /**
	 *Data Modyfikacji Statusu projektu.
	 */
	 
	 
	
}
